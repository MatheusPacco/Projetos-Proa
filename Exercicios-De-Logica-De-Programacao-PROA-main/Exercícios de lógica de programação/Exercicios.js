window.onload = () =>{

    var Valor = null; 

    function EntradaDeValores(Chamada, tipo) {
        console.log("CHAMADO");
        let Resultado = []; 
        /*A variável vai se tornar umoutro array que vai armazenas o valores em ordem de chamada da função
        de forma que eu consiga exportar esse array de resultados e utiliza-los dps*/

        if (tipo === "Texto") {
            for (let index = 0; index < Chamada.length; index++) {
                Resultado[index] = prompt(Chamada[index]);    
            }

            return Resultado
        }

        if (tipo === "Numero") {
            for (let index = 0; index < Chamada.length; index++) {
                Resultado[index] = parseInt(prompt(Chamada[index]));     
            }

            return Resultado
        }

        // console.log(Resultado);
        return alert("Valores de entrada na função inválidos!")
    }

    Ex = () => {
    Valor = parseInt(prompt("Digite o número que desejar!"))

    if (Valor < 10) {
       return alert ("O valor" + Valor + " é menor que 10!")
    } 

    if (Valor === 10) { return alert ("MANO O VALOR É IGUAL O CABEÇA") } 

    return alert (`O valor ${Valor} é maior que 10`)
    }

    Ex2 = () => {
    Valor = parseInt(prompt("Digite o número que desejar!"))
    
    if (Valor < 0) {  alert ("O valor é negativo!"); }
    if (Valor === 0) { return alert ("O valor é NEUTRO!"); }

    return alert(`O valor digitado, ${Valor}, é positivo`); 
    }

    Ex3 = () => {
    Valor = parseInt(prompt("Digite o número de maçãs que irá comprar"))

    if (Valor < 6) {
        let ValorTotal = Valor * 1.30
        alert ("Você irá pagar R$1.30 por Maçã. O total a pagar será: " +ValorTotal+",00")
    } else {
        let ValorTotal = Valor * 1
        alert ("Você irá pagar R$1.00 por Maçã. O total a pagar será: " +ValorTotal+",00")
    }

    }
    
    Ex4 = () => {
    let Valor1 = parseInt(prompt("Digite a primeira nota do aluno"))
    let Valor2 = parseInt(prompt("Digite a primeira nota do aluno"))

    const Final = (Valor1 + Valor2)/2  
    if (Final >= 6) { return alert ("Parabéns você passou de ano")} 

    return alert (`Sua média foi ${Final}, portanto você não irá passar de ano!`)
    }

    Ex5 = () => {
    Valor = parseInt(prompt("Digite seu ano de nascimento"))

    Valor = 2022 - Valor
    if (Valor >= 18) { return alert("Parabéns você já pode votar")}
    return alert ("Você ainda não pode votar!")
    }

    Ex6 = () => {
    let Valor1 = parseInt(prompt("Digite o primeiro valor"))
    let Valor2 = parseInt(prompt("Digite o segundo valor")) 
    
    if (Valor1 > Valor2) {return alert("O maior valor é o: " + Valor1) }

    return alert("O maior valor é o: " + Valor2)
    }

    Ex7 = () => {
    let Valor1 = parseInt(prompt("Digite o primeiro valor"))
    let Valor2 = parseInt(prompt("Digite o segundo valor")) 
    
    if (Valor1 > Valor2) {return alert(`${Valor2},${Valor1}`) }

    return alert(`${Valor1},${Valor2}`)
    }

    EX8 = () => {
    let Hcomeco = parseInt(prompt("Digite o horário de começo da partida"))
    let Hfim = parseInt(prompt("Digite o horário de fim da partida")) 
    // Quando atribuimos NULL para uma variável, queremos dize que seu valor é zero, ou seja, 
    // representa a ausencia intencional de valor
    // quando colocamos Undefined, seria o mesmo que dizer que essa variável não existe em seu escopo
    // Eles são parecidos mas não idênticos!

    let HTotais = null; 
        
    if (Hcomeco === Hfim) { return alert("O total de horas de partida de xadrez foi de 24H"); }

    if (Hcomeco <= 12) {
        if (Hcomeco >= Hfim ) {
            HTotais = (12 - Hcomeco) + 12 + Hfim
            return alert (`O total de horas da partida de xadrez foi de ${(HTotais)}H`);
        }
    } 

    if (Hcomeco >= 13 & Hcomeco <= 24 ) {
        if (Hcomeco > Hfim) {
            HTotais = (24 - Hcomeco) + Hfim 
            return alert (`O total de horas da partida de xadrez foi de ${(HTotais)}H`);
        } 
    }

    return alert(`O total de horas da partida de xadrez foi de ${(Hfim - Hcomeco)}H`)  //Dentro da mesmas 24 horas
    }

    EX9 = () => {
    Valor = parseInt(prompt("Digite o total de horas trabalhadas no mês"));
    let ValorHora = parseInt(prompt("Digite quanto você ganha por hora"));
    let SalarioTotal = null; 

    if (Valor > 40) {
        let HorasExtras =  Valor - 40
        SalarioTotal += HorasExtras * (ValorHora * 1.5)
        SalarioTotal += 40 * ValorHora

        return alert(`O seu salário ao fim do mês será de ${SalarioTotal}`)
        }
    return alert (`O seu salário ao fim do mês será de ${ValorHora*Valor}`); 
    }

    EX10 = () => {
        Valor = parseInt(prompt("Digite o seu salário fixo"))
        let Vendas = parseInt(prompt("Digite o quanto você vendeu"))
        let VendasTotais = null;  

        if (Vendas > 1500) {
           VendasTotais = Vendas - 1500
           VendasTotais = VendasTotais *1.05
           VendasTotais += (1500 * 1.03) + Valor
           return alert (`Seu salário total, somado ao seu total de vendas com os acréscimos, foi de: R$${VendasTotais}`)
        }

        return alert (`Seu salário total somado com seu número de venda foi de: R$${VendasTotais = 1500 + Valor} `)
    }

    EX11 = () => {
    let Saldo,Debito,Credito; 

    Saldo = parseFloat(prompt("Digite seu Saldo"));
    Debito = parseFloat(prompt("Digite seu Débito"));
    Credito = parseFloat(prompt("Digite seu Crédito"));

    let SaldoAtual = Saldo - Debito + Credito; 

    if (SaldoAtual >= 0) {
        return alert("Parabéns amigo, seu saldo está positivo!")
    }

    return alert("Seu saldo é negativo amigão")

    }

    EX12 = () => {
    let QtdAtual, QtdMaxima, QtdMinima,QtdMedia; 
    QtdAtual =parseInt(prompt("Digite seu estoque atual")); 

    QtdMedia = (QtdMaxima + QtdMinima) /2; 
        
    if (QtdAtual >= QtdMedia) {
        return alert ("Não efetuar a compra de estoque")
    }

    return alert("Efetuar compra")
    }
    // NUMBER <- transforma a variável em um número
    // Ele retorno um NaN ~ Não é um número
    EX29 = () => {
        Numb1 = Number(prompt("Digite o valor o primerio número"))
        Numb2 = Number(prompt("Digite o segundo valor"))
        Numb3 = Number(prompt("Digite o terceiro valor"))

        if (Numb1 > Numb2 && Numb2 > Numb3)  {
            return alert(`O número: ${Numb1} é o maior número. E a ordem crescente é de: ${Numb3},${Numb2},${Numb1}. A soma dos dois maiores é de ${Numb1 + Numb2}`)
        }

        if (Numb1 > Numb3 && Numb3 > Numb2)  {
            return alert(`O número: ${Numb1} é o maior número. E a ordem crescente é de: ${Numb2},${Numb3},${Numb1}. A soma dos dois maiores é de ${Numb1 + Numb3}`)
        }

        if (Numb2 > Numb1 && Numb1 > Numb3) {
            return alert(`O número: ${Numb2} é o maior número. E a ordem crescente é de: ${Numb3},${Numb1},${Numb2}. A soma dos dois maiores é de ${Numb2 + Numb1}`)
        }

        if (Numb2 > Numb3 && Numb3 > Numb1) {
            return alert(`O número: ${Numb2} é o maior número. E a ordem crescente é de: ${Numb1},${Numb3},${Numb2}. A soma dos dois maiores é de ${Numb2 + Numb3}`)
        }
        
        if (Numb3 > Numb1 && Numb1 > Numb2) {
            return alert(`O número: ${Numb3} é o maior número. E a ordem crescente é de: ${Numb2},${Numb1},${Numb3}. A soma dos dois maiores é de ${Numb3 + Numb1}`)
        }
        
        if (Numb3 > Numb2 && Numb2 > Numb1) {
            return alert(`O número: ${Numb3} é o maior número. E a ordem crescente é de: ${Numb1},${Numb2},${Numb3}. A soma dos dois maiores é de ${Numb3 + Numb2}`)
        }
    }

    EX31 = ()=> {
    let LadoA = parseFloat(prompt("Digite um lado do triângulo")) 
    let LadoB = parseFloat(prompt("Digite o segundo lado do triângulo"))
    let LadoC = parseFloat(prompt("Digite o terceiro lado do triângulo"))

    if (LadoB + LadoC > LadoA && LadoA + LadoC > LadoB && LadoA + LadoB > LadoC ) { return alert ("Isso é um triângulo") }
    return alert("Isso não forma um triângulo")
    }

    EX35 = () => {
        let Op = Number(prompt("[1] - Para abastecimento com Alcool ; [2] - Para abastecimento com Gasolina")) 
        let Preco =  Number(prompt("Digite o valor do combustível")) 
        let ValorAPagar = null; 

        if (Op === 1) {
            let Alcool = Number(prompt("Digite a quantidade álcool abastecido"))

            if (Alcool >= 21) {
                ValorAPagar = Alcool * (Preco * 0.95)
                return alert("O valor a pagar será de: R$" + ValorAPagar.toFixed(2))
            }
            else {
                ValorAPagar = Alcool * Preco * 0.97
                return alert("O valor a pagar será de: R$" + ValorAPagar.toFixed(2))
            }
        }

        if (Op === 2) {
            let Gasolina = Number(prompt("Digite a quantidade gasolina abastecido"))

            if (Gasolina >= 21) {
                ValorAPagar = Gasolina * (Preco * 0.94)
                return alert("O valor a pagar será de: R$" + ValorAPagar.toFixed(2))
            }
            else {
                ValorAPagar = Gasolina * Preco * 0.96
                return alert("O valor a pagar será de: R$" + ValorAPagar.toFixed(2))
            }
        } 
        
    }

    EX36 = () => {
    
    let HomemUm, HomemDois, MulherUm, MulherDois; 

    HomemUm = Number(prompt("Digite a idade do primerio homem"))
    HomemDois = Number(prompt("Digite a idade do segundo homem"))
    MulherUm = Number(prompt("Digite a idade da primeira mulher"))
    MulherDois = Number(prompt("Digite a idade da primeira mulher"))

    let soma = null;
    let produto = null;  

    if (HomemUm > HomemDois && MulherUm >MulherDois) {
        soma = HomemUm + MulherDois 
        produto = HomemDois * MulherUm

        return alert(`A soma da idade do homem mais velho com a mulher mais nova é: ${soma}. E o produto do homem mais novo com a mulher com mais idade é de ${produto}`)
    }

    if (HomemUm > HomemDois && MulherDois > MulherUm) {
        soma = HomemUm + MulherUm 
        produto = HomemDois * MulherDois

        return alert(`A soma da idade do homem mais velho com a mulher mais nova é: ${soma}. E o produto do homem mais novo com a mulher com mais idade é de ${produto}`)
    }
    if (HomemDois > HomemUm && MulherUm > MulherDois) {
        soma = HomemDois + MulherDois 
        produto = HomemUm * MulherUm

        return alert(`A soma da idade do homem mais velho com a mulher mais nova é: ${soma}. E o produto do homem mais novo com a mulher com mais idade é de ${produto}`)
    }
    if (HomemDois > HomemUm &&  MulherDois > MulherUm) {
        soma = HomemDois + MulherUm
        produto = HomemUm * MulherDois

        return alert(`A soma da idade do homem mais velho com a mulher mais nova é: ${soma}. E o produto do homem mais novo com a mulher com mais idade é de ${produto}`)
    }




    }

    EX37 = () => {
    let QtdKg,PrecoTotal,TotalMaca,TotalMorango = null; 

    let KgMacas = Number(prompt("Digite a quantidade maças adquiridas"))  
    let KgMorango = Number(prompt("Digite a quantidade morangos  adquiridos"))  
    
    PrecoTotal = PrecosFrutas(KgMacas, KgMorango)
    QtdKg = KgMacas + KgMorango

    if (QtdKg > 8 || PrecoTotal > 25) {
        PrecoTotal = PrecoTotal * 0.90
        return alert ("O preço que você irá pagar com desconto de 10% será de R$" + PrecoTotal)
    } 

    return alert ("O preço que você irá pagar sem descontos será de R$" + PrecoTotal)
    }

    PrecosFrutas = (maca,morangos) => {
        const PrecoMorango = 2.50;
        const PrecoMaca = 1.80;

        if (maca > 5) {
            TotalMaca = maca * 1.50
        } else {
            TotalMaca = maca * PrecoMaca
        }

        if (morangos > 5) {
            TotalMorango = morangos * 2.20
        } else{
            TotalMorango = morangos * PrecoMorango
        }
        

        return PrecoTotal = TotalMaca + TotalMorango
    }

    EX38 = () => {
    let CodigoArmazenado = [1234, 9999]

    let codigo = parseInt(prompt("Digite o código de barra!"))
    
    if (codigo === CodigoArmazenado[0]) {
        let senha = parseInt(prompt("Agora, digite a senha!"))

        if (senha === CodigoArmazenado[1]) {
            return alert("Acesso permitido")
        } 
    }

    return alert("Acesso NEGADO")
    }

    EX40 = () => {
        let NomeDoProduto,Quantidade,Preco,Total; 
        NomeDoProduto = prompt("Digite o nome do produto!"); 
        Quantidade = parseInt(prompt("Digite a quantidade do produto comprada")); 
        Preco = parseInt(prompt("Digite o preço do produto comprada")); 

        if (Quantidade <= 5 && Quantidade > 0)  {
            Total = (Quantidade * Preco) * 0.98
            return alert(`O preço do produto ${NomeDoProduto} será de: R$${Total}`)
        }

        if (Quantidade > 5 && Quantidade <= 10 ) {
            Total = (Quantidade * Preco) * 0.97
            return alert(`O preço do produto ${NomeDoProduto} será de: R$${Total}`)
        }

        if (Quantidade > 10) {
            Total = (Quantidade * Preco) * 0.95
            return alert(`O preço do produto ${NomeDoProduto} será de: R$${Total}`)
        }

        return alert("Você digitou um valor inválido");
    }

    // EX41 = () => {
    //     let MediaDeAproveitamento, MediaDosExercicios, Nota1, Nota2, Nota3; 
    //     Nota1 = parseInt(prompt("Digite a primeira nota"))
    //     Nota2 = parseInt(prompt("Digite a segunda nota"))
    //     Nota3 = parseInt(prompt("Digite a terceira nota"))
    //     MediaDosExercicios = parseInt(prompt("Digite a média dos exercícios"))

    //     MediaDeAproveitamento = (Nota1 + (Nota2 * 2) + (Nota3 * 3) + MediaDosExercicios)/7

    //     if (MediaDeAproveitamento >= 9) { return alert("parabéns sua nota é A")}
    //     if (MediaDeAproveitamento >= 7.5 && MediaDeAproveitamento < 9) { return alert("parabéns sua nota é B")}
    //     if (MediaDeAproveitamento >= 6 && MediaDeAproveitamento < 7.5) { return alert("parabéns sua nota é C")}
    //     // if (MediaDeAproveitamento < 6) { return alert("parabéns sua nota é D")}
    //     return alert("parabéns sua nota é D")
    // }

    EX41 = () => {
        const ArrayDeNotas = EntradaDeValores(["Digite a primeira Nota","Digite a Segunda Nota","Digite a Terceira Nota","Digite a média dos exercícios"], "Numero")

        let MediaDeAproveitamento = (ArrayDeNotas[0] + (ArrayDeNotas[1] * 2) + (ArrayDeNotas[2] * 3) + ArrayDeNotas[3])/7

        if (MediaDeAproveitamento >= 9) { return alert("parabéns sua nota é A")}
        if (MediaDeAproveitamento >= 7.5 && MediaDeAproveitamento < 9) { return alert("parabéns sua nota é B")}
        if (MediaDeAproveitamento >= 6 && MediaDeAproveitamento < 7.5) { return alert("parabéns sua nota é C")}
        // if (MediaDeAproveitamento < 6) { return alert("parabéns sua nota é D")}
        return alert("parabéns sua nota é D")
    }

    EX42 = () =>{
        let Idade, AnosDeTrabalho; 
        Idade = parseInt(prompt("Digite a sua idade"))
        AnosDeTrabalho = parseInt(prompt("Digite o seus anos de trabalho"))

        if (Idade >= 65) { return alert("Você tem a idade miníma para se aposentar!")}
        if (AnosDeTrabalho >= 30) { return alert("Você tem a quantiade de anos de trabalho o suficiente para aposentar!")}
        if (Idade >= 60 && AnosDeTrabalho >= 25) { return alert("Você tem a idade e os anos de trabalho o suficiente para se aposentar!")}        

        return alert("Você não tem a idade nem os anos minímos para se aposentar")
        
    }

   
}
