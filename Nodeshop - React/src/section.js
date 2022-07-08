import React from 'react';
import './App.css';

class Section extends React.Component{
    render(){
        return(
            <section className='newsletter'>
                <h3 className='tittleNewsletter'>Newsletter</h3>
                <p>Receba nossas promoções por email</p>
                <form method='post' className='formularioNew'>
                    <input type='text' placeholder='Seu nome' />
                    <input type='email' placeholder='Seu email' />
                    <button className='btnCadastrar'>Cadastrar</button>
                </form>
            </section>
        )
    }
}

export default Section;
