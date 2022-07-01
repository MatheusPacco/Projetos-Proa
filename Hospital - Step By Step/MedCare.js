window.onload = () => {
    document.getElementById('menu-mobile').addEventListener('click', Ativo = () =>{
        document.querySelector('#links-mobile').classList.toggle('ativo')
    })

    let SelecionandoOsCampos = document.querySelectorAll('.valores')    
    /* tempo que durará a animação*/
    let timer = 10000; 

    // forEach ativa uma função para cada um dos vetores selecionandos 
    SelecionandoOsCampos.forEach((SelecionandoOsCampos) => {
        let ValorInicial = 0; 
        /* O data-val está na TAG h3, então faz sentido pegar dessa forma
        vale lembrar que GETAttribute é um método de LEITURA, diferente do SETattribute que 
        permite a modificação de uma determinado valor*/ 

        const valorfinal = parseInt(SelecionandoOsCampos.getAttribute('data-val')); 
        let duracao = Math.floor(timer / valorfinal);  // esse método está atribuindo a quantidade de ms (milissegundos) por valor total

        let Contador = setInterval(function () {
            ValorInicial += 1; 
            SelecionandoOsCampos.textContent = ValorInicial; 
            if (ValorInicial == valorfinal ) {
                clearInterval(Contador); 
                SelecionandoOsCampos.textContent += "+"; 
            }
        }, duracao)
    })

    window.addEventListener('scroll', () => {
        const AlturaDoScrol = window.scrollY; 
        /*distância de um elemento a partir do TOPO*/ 
        const AlturaComBaseNoTop = document.getElementById('dados').offsetTop

        console.dir(AlturaComBaseNoTop)
        // console.log (AlturaComBaseNoTop)

        if (AlturaDoScrol > AlturaComBaseNoTop) {
             
        }
    })

} /*FIM DO LOAD DA PÁGINA!*/  