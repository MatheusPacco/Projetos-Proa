import React from 'react';
import './App.css';
import logo from './img/logo.png';
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faMagnifyingGlass } from "@fortawesome/free-solid-svg-icons";


class Cabecalho extends React.Component{
  render(){
    return(
      <header className='cabecalho'>
        <h1 className='logo'>
          
          <a className="logoImg" href='index.html' title='Loja de Informática'>
              <img src={logo} alt='Logo nodeshop' />
              Loja de Informática
          </a>
        </h1>

        <form className='formulario'>
          <input type="text" name="pesquisa" id="pesquisa" className='inputForm' placeholder="Faça uma busca"/>
          <button className='botao'>
          <FontAwesomeIcon icon={faMagnifyingGlass} />
          </button>
        </form>
      </header>
    )
  }
}


export default Cabecalho;

