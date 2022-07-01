// 1º A primeira etapa é pegar as informações contidas nos elementos HTML
// 2º Essas informações serão inseridas em variáveis objetos para que possam ser recuperadas e utilizadas em outras funções
// 3º Criar um elemento para encapsular os produtos dentro da caixa de compras
//   3.1º  Retirar a notificação de compras vazias
//      3.2º Usar uma função para criar um elemento com todas as informações já atribuidas, na tela do usuário
//            3.3º será necessário já ter criado uma CLASS para que se possa estilizar os elementos na Lista
// 4º EXTRA:
//  4.1º quando adicionar um produto abrir a lista de compras
//  4.2º notificar quantos produtos estão no carrinho de compra! 
// SÓ VAMO!!! 

    // PEgando todos os produtos pela class, que é comum a todos, para servir como um ARRAY que servirá de parâmetro para o FOREACH
    // O forEach adiciona ou ativa um função para cada um dos elementos array.Neste caso, fiz uso dos Produtosgerais como parâmetro que se espera receber
    const produtosGeral = document.querySelectorAll(".swiper-slide"); 
    const InfoProdutos = {}; 
    const NofificaCompraVazia = document.querySelector("#Carrinho-Vazio"); 
    const BtnCompraProduto = document.querySelector('#btn-comprar-produtos'); 
    
    produtosGeral.forEach((produtosGeral) => {
        produtosGeral.addEventListener('click', Event=> {
            console.dir(produtosGeral);
            console.log(produtosGeral.children.item(1).textContent);

            // Atribuindo as informações a um objeto
            // getNamedItem permite que, dentro de uma lista array dos attributos, você consiga pegar um propriedade a partir do nome!

             
            InfoProdutos.img = produtosGeral.children.item(0).attributes.getNamedItem('src').textContent;
            InfoProdutos.nome = produtosGeral.children.item(1).textContent;
            InfoProdutos.preco = produtosGeral.children.item(2).textContent.trim();
            InfoProdutos.ClassName = produtosGeral.attributes.getNamedItem('name').textContent; 
            

            // a função nativa trim retira os espaços da string

            // console.log(InfoProdutos); pra testagem
            NofificaCompraVazia.style.display = "none"; 
            CriandoElemento(InfoProdutos.ClassName)
        })
    });

    CriandoElemento = function(ClassName) {
        const ContainerDoProduto = document.createElement('div');

        //atribuindo uma class para a div geral
        ContainerDoProduto.setAttribute('class', 'Container-Produto-Listado');
        ContainerDoProduto.setAttribute('name', `${ClassName}`);

        let ConteudoProduto = `<img src="${InfoProdutos.img}">
                               <div class="container-interno-produto">
                                <h3>${InfoProdutos.nome}</h3>
                                <p>${InfoProdutos.preco}</p>
                               </div>
                               <i class="fas fa-trash" onclick="DeletarElemento('${ClassName}')"></i>`; 

        ContainerDoProduto.innerHTML = ConteudoProduto; 
        BtnCompraProduto.before(ContainerDoProduto);
    }

    function DeletarElemento(ElementClass) {
    const TodosOsProdutos = document.querySelector('#carrinho-modal') 
    TodosOsProdutos.children.item(1).children.namedItem(ElementClass).remove(); 

    let QuantidadeDeProdutos = document.querySelector('#Before-Botao').children.length

    if (QuantidadeDeProdutos < 2) {
        NofificaCompraVazia.style.display = "flex";
    }

   
    }


    

