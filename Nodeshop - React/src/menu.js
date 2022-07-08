import React from 'react';
import './App.css';
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faMagnifyingGlass } from "@fortawesome/free-solid-svg-icons";
import { faArrowCircleUp } from "@fortawesome/free-solid-svg-icons";


class Menu extends React.Component{
    render(){
        return(
            <nav className='menu'>
                <ul>
                    <li className='list-item'><a href='#home'>Home</a></li>
                    <li className='list-item'><a href='#home'>Produto</a></li>
                    <li className='list-item'><a href='#home'>Seriços</a></li>
                    <li className='list-item'><a href='#home'>Contatos</a></li>
                </ul>

                <div className='social-icons'>
                    <a href='#' className='btn-linkedin'><FontAwesomeIcon icon={faArrowCircleUp} /></a>
                    <a href='#' className='btn-github'><FontAwesomeIcon icon={faArrowCircleUp} /></a>
                    <a href='#' className='btn-google'><FontAwesomeIcon icon={faArrowCircleUp} /></a>
                </div>
            </nav>
        )
    }
}

export default Menu;




