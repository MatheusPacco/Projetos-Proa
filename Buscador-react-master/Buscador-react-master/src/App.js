import { useState } from 'react';
import { FiSearch } from 'react-icons/fi';
import { GiCompass } from 'react-icons/gi'; 
  
import './estiloGeral.css'
import api from './services/api';


function App() {

  const [input, setInput] = useState('')
  const [cep, setCep] = useState({}); 
  // Isso aqui define o valor default do NOSSO INPUT dentro da aplicação

  async function chamadaDeCep(){

    if (input === '') {
      alert('Preencha algum cep')
      return ;
    }

    // try é oq você quer fazer mais pode dar errado...por isso recorremos a uma
    // ação de erro até que a aplicação funcione

    try {
      const response = await api.get(`${input}/json`);
      setCep(response.data)
      setInput('')
    }

    catch{
      alert('Erro ao buscar...')
      setInput('')

    }
  }


  return (
    <div className="container">
          
      <h1 className="title"> Buscador CPF  
      <GiCompass color='white' />
      </h1>
      <div className="containerInput">
        <div className='forms-input'>
          <input className="input-Entrada" 
          type="text"
          placeholder="Digite o seu CEP" 
          value={input}
          onChange={(e) => setInput(e.target.value)}
          // pegando tudo que está sendo digitado e passando pro setInput

          />

    
          <button className="ButtonSearch" onClick={chamadaDeCep}>
            Procurar <FiSearch color="black" />
          </button>


        </div>
  {/* MAIN é a classe semântica para o assunto principal da página */}
        {Object.keys(cep).length > 0 && (
          <main className='main'>
             <h2> Cep: {cep.cep} </h2>
             <span> {cep.logradouro} </span>
             <span> {cep.complemento} </span>
             <span> {cep.bairro} </span>
             <span> {cep.localidade} - {cep.uf} </span>
         </main>
        )}
     
      </div>
    </div>
  );
}

export default App;
