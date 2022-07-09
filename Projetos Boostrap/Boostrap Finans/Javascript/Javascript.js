const Modal = document.createElement('div');
Modal.setAttribute('Class', 'Modal-Infos');

Modal.innerHTML = "<div> <h3> Modal de saber mais <h3></div>"

const containerPai = document.querySelector('#cont_saiba_mais'); 


document.querySelector('#saiba_mais').addEventListener('click', ()=> {
    containerPai.appendChild(Modal); 
})
