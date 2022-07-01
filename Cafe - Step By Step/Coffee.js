window.onload = () => {
const OpenSideContentBuy = document.getElementById('Botao-Shop')
const SideContentBuy = document.getElementById ('Card-Itens-Container')
// Estou colocando aqui na parte superior para que a varável fique em ESCOPO GLOBAL, e passe posteiormente para validação e mudança de propriedade 

// capiturando o cmapo de pesquisa por meio da ID e o botão de pesquisa
const AtivandoPesquisa = document.getElementById ('Botao-Pesquisa')
const FormPesquisaInicial = document.getElementById('Form-Pesquisa')

/*BOTÃO DE COMRPA EM QUESTÃO!*/ 
const BotaoCompra = document.getElementById('Botao-Check')

    OpenSideContentBuy.addEventListener('click', () => {
        SideContentBuy.classList.toggle('ativo')
        NavBar.classList.remove('ativo')
        FormPesquisaInicial.classList.remove('Show-Form-Pesquisa')

        
    })

    // Adicionando uma função para a icone de pesquisa + apresentação do campo de pesquisa ao clique do usuário
    AtivandoPesquisa.addEventListener ('click' , () => {
        // Então, para que a barra de pesquisa não fique embaixo do campo de compra, eu preciso validar se ele está exposto ou não
        // como seria muito estático validar pelo nome da classe, eu busquei a quantidade de classes que ele pode ter 
        // levando em consideração que ele SEMPRE TERÁ PELO MENOS UMA CLASSE, sendo a segunda a responvável por fazer o campo aparecer  
        // Peguei esses valores a partir do ~ ClassList: DOMtokenListe ~ que me permite a leitura e alteração das classes atribuidas ao elemento  
        FormPesquisaInicial.classList.toggle('Show-Form-Pesquisa')
        NavBar.classList.remove('ativo')
        SideContentBuy.classList.remove('ativo')
        
    })

    /*CRIANDO A ATIVAÇÃO DOS BOTÕES DE PRODUTO*/
    // estamos repuperando um produto específoco a partir do seu parâmetro de quando a função é chamada
    AtivandoProduto = (op) => {
        CriandoProduto(op)
    }

    function CriandoProduto(op) {
        const ValoresRecuperado = RecuperandoValoresDoProdutoMenu(op); 

        console.log (ValoresRecuperado)

        let Estrutura = {
            EstruturaGeral: `<div name="${ValoresRecuperado.NumeroDoProduto}" class="Card-Itens"> 
            <span class="fas fa-times"  id="Deletar-Elemento" onclick="DeletarElemento(${ValoresRecuperado.NumeroDoProduto})"></span>
            <img src="${ValoresRecuperado.ImagemProduto}" alt=""></img>
            <div class="Conteudo">
            <h3> ${ValoresRecuperado.NomeDoProduto} </h3>
            <div class="preco-produto"> ${ValoresRecuperado.Preso} </div>
                </div>
            </div>`, 
        }

        const Container = document.createElement('section'); 
        // Container.classList.add('Card-Itens')

        BotaoCompra.before(Container)

        Container.innerHTML = Estrutura.EstruturaGeral; 
        
        return Estrutura
    }

    function RecuperandoValoresDoProdutoMenu (op) {
        const OpProdutos = document.querySelectorAll('.Menu-Cafes-Itens').item(op)
        console.dir (OpProdutos)
        /* o queryselectorall irá selecionar todos os elementos com a mesma DIV,
        ele retorna uma NodeList(número de elementos com o mesmo valor de atributo class) */        
        
        let ProdutosMenu = {
            ImagemProduto: OpProdutos.children.item(0).src, 
            NomeDoProduto: OpProdutos.children.item(1).textContent,
            Preso: OpProdutos.children.item(2).textContent,
            NumeroDoProduto: OpProdutos.attributes[0].textContent
        }
       
        // Consegui pegar o número do PRODUTO! DALE
        console.log(ProdutosMenu.NumeroDoProduto)

        return ProdutosMenu
    }

    DeletarElemento = (NumeroDoElemento) => {
        // Pegando o NODELIST dos elementos, funciona basicamente como um ARRAY, o método de chamada dele é diferente, normalmnete eu usaria ' (valor) '
        let ListaDeElementos = document.getElementsByName(NumeroDoElemento)
        ElementoSelecionado = ListaDeElementos[0]
        console.log (ListaDeElementos)
        ElementoSelecionado.remove()
    }

        
    /* Ativando o botão de hamburguer mobile! */
    let NavBar = document.getElementById('menu')    
    document.getElementById('Botao-Menu').onclick = () => {
        NavBar.classList.toggle('ativo')
        FormPesquisaInicial.classList.remove('Show-Form-Pesquisa')
        SideContentBuy.classList.remove('ativo')
    } 
}


