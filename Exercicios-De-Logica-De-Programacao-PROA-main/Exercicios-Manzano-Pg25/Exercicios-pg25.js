// Todos os exercícios estão em Arrow Functions, então basta que elas sejam chamadas para que o
// você consiga inserir os valores e obter o resultado
// A chamada da função sempre vai se encontrar logo a baixo, basta que tire o comentário 🔥

Ex7AeB = () => {
    class temperatura {
        // Caso não seja enviado o parâmetro do celsius ou do Fahrenheit eles receberam 0 como default
        constructor(celsius=0, fahrenheit=0) {
            this.celsius = celsius; 
            this.fahrenheit = fahrenheit; 
        }   

        ConversaoParaFahrenheit() {
            console.log(this.celsius);             
            this.fahrenheit = (9 * this.celsius + 160) / 5 ;  
            return alert(`A conversão de ${this.celsius} ºCelsius para Fahrenheit será de ${this.fahrenheit}ºF`)
        }

        ConversaoParaCelsius() {
            this.celsius = (this.fahrenheit - 32) * (5/9) ;  
            return alert(`A conversão de ${this.fahrenheit} ºF para Celsius será de ${this.celsius}ºC`)
        }
    }

    const respostas = parseInt(prompt('Digite [1] - se deseja converter Celsius para Fahrenheit, Digite [2] - se deseja converter Fahrenheit para Celsius'))
    if (respostas === 1) {
        let celsius = parseInt(prompt('Digite a temperatura em Celsius que será convertida para Fahrenheit'))
        let objetoUm = new temperatura(celsius);
        objetoUm.ConversaoParaFahrenheit()

    } else {
        let Fahrenheit = parseInt(prompt('Digite a temperatura em Fahrenheit que será convertida para Celsius'))
        let objetoUm = new temperatura(0, Fahrenheit);
        objetoUm.ConversaoParaCelsius(); 
        Ex7AeB ()
    }
}


// Quando queiser testar
// Ex7AeB () 

Ex7C = () => {
    // Calculo de volume da lata de óleo
    let volume = null,
    PI = 3.14, 
    raio = parseInt(prompt('Digite o valor do RAIO da lata de óleo')), 
    altura = parseInt(prompt('Digite a altura da lata de óleo'))

    volume = PI * (raio*raio) * altura 
    alert('O volume da Lata de óleo é de: ' + volume + ' cm^3') ;
}

// Quando queiser testar
// Ex7B () 

Ex7D = () => {

    const Automovel = function() {
        const distanciaPercorrida = function(tempo, velocidadeMedia)  { return (tempo * velocidadeMedia)} ;
        const litrosGastos = function(distancia, quilometrosPorLitro) { return (distancia * quilometrosPorLitro)}; 
        this.quilometrosPorLitro = 12; 
        this.velocidadeMedia = parseInt(prompt('Digite a velocidade média percorrida durante o trajeto'));            
        this.tempoGasto = parseInt(prompt('Digite o tempo que demorou o trajeto'));
        this.distancia = distanciaPercorrida(this.tempoGasto, this.velocidadeMedia); 
        this.litrosGastos = litrosGastos(this.distancia, this.quilometrosPorLitro); 
        this.exibirInformacoes = function () {
            return alert(`A velocidade média percorrida é de ${this.velocidadeMedia} A distância total percorrida, foi de ${this.distancia}. A quantidade de litros
            gastos foi de ${this.litrosGastos} e o tempo percorrido foi de ${this.tempoGasto}`) ; 
        }
    }

    let ViagemUm = new Automovel;
    console.log(ViagemUm); 
    ViagemUm.exibirInformacoes()
    
}

// Ex7D()

Ex7E = () => {
    // Calculo de prestação em atraso   
    // Exercício resolvido com objeto literal, não é das opções mais adequadas, já que objetos literais são mais limitados do que funções
    let prestacaoUm = {
        valor: parseInt(prompt('Digite o valor da prestação')), 
        taxa: parseFloat(prompt('Digite o valor taxa mensal')),
        tempo: parseInt(prompt('Digite o tempo em meses de atraso')), 
        prestacaoTotal: function () { return alert(`O total da prestação será de R$ ${ this.valor + (this.valor * this.taxa/100) * this.tempo},00 `)} 
    }
    prestacaoUm.prestacaoTotal()
}

// Ex7E(); 

Ex7F = () => {
    let TrocaDeValores = {
        valorA: parseInt(prompt('Digite o valorA' )), 
        valorB: parseFloat(prompt('Digite o valor B')),    
        reservado: null, 
        trocaDeValores: function () { this.reservado = this.valorA;  
        this.valorA = this.valorB; 
        this.valorB = this.reservado;
        
        return alert(`Agora o valor A é ${this.valorA} e o valor B é ${this.valorB}`)

        } 
    }
    TrocaDeValores.trocaDeValores()
}; 


// Ex7F()

Ex7G = () =>{
    const Valores = Array()
    for (let i = 0; i < 4; i++) {
        Valores[i] = parseFloat(prompt(`Digite o ${i} º valor`));
    }

    Valores.forEach(valor => {
        Valores[0] === valor ? false : document.write(`${Valores[0] + valor}, `);   
    });

    document.write (`${Valores[1] + Valores[2]}, `)
    document.write (`${Valores[1] + Valores[3]}`)
    document.write ('<br></br>')
    
    Valores.forEach(valor => {
        Valores[0] === valor ? false : document.write(`${Valores[0] * valor}, `);   
    });
    document.write (`${Valores[1] * Valores[2]}, `)
    document.write (`${Valores[1] * Valores[3]}`)
}

// Ex7G();

Ex7H = () => {
    const RetanguloQualquer = function() {
        this.comprimento = parseInt(prompt('Digite o valor do comprimento')); 
        this.largura = parseInt(prompt('Digite o valor da largura'));
        this.altura = parseInt(prompt('Digite o valor da altura')); 

        this.CalculoDeVolume = function() {
            return alert(`O volume do retangulo é igual a ${this.comprimento * this.largura * this.altura}`)
        }; 
    }

    let RetanguloUm = new RetanguloQualquer(); 
    RetanguloUm.CalculoDeVolume() 
}

// Ex7H()

Ex7I = () => {  

    const ValorA = parseInt(prompt('Digite o primerio valor')); 
    const valorB = parseInt(prompt('Digite o segundo valor')); 

    let resultado = (ValorA * ValorA) - (valorB * valorB) 
    alert(`O resultado da subtração do quadradro do valor A com o quadrado do valor B é de ${resultado}`); 
} ; 

// Ex7I (); 

ExJ = () => {
    let Dolar = parseInt(prompt('Digite o valor em Dólar que deseja transformar em Real'))
    let cotacaoDoReal = parseFloat(prompt('Digite o valor da cotação do dólar'))

    alert(`Com base na cotação atual do Real de R$ ${cotacaoDoReal}, 00, você conseguiria R$ ${Dolar * cotacaoDoReal},00`)
}

// ExJ(); 


ExK = () => {
    let Real = parseInt(prompt('Digite o valor em real que deseja transformar em dólar'))
    let cotacaoDoDolar = parseFloat(prompt('Digite o valor da cotação do dólar'))

    alert(`Com base na cotação atual do dólar de ${cotacaoDoDolar}, você conseguiria $ ${Real / cotacaoDoDolar},00`)
} 

// ExK(); 

Exi = () => {
    const Valores = Array()
    let acumulador = null; 
    for (let index = 1; index <= 3; index++) {
        Valores[index] = parseInt(prompt(`Digite o ${index} valor`)); 
        acumulador += Valores[index] * Valores[index]; 
        console.log(Valores[index])
    }

    alert("A soma do quadrado do 3 valores é de: " + acumulador);
}

// Exi()

Exm = () => {
    const Valores = Array()
    let acumulador = null; 
    for (let index = 1; index <= 3; index++) {
        Valores[index] = parseInt(prompt(`Digite o ${index} valor`)); 
        acumulador += Valores[index]
        console.log(Valores[index])
    }
    
    alert("O quadrado da soma dos três valores é: " + acumulador * acumulador);
}

// Exm()

//pg 26 - Exercícios Extras 

Ex1A = () => {
    const Valores = Array(); 
    let produto = null, 
    soma = null; 

    for (let index = 1; index <= 4 ; index++) {
        Valores[index] = parseInt(prompt(`Digite o ${index}º valor`));
    }

    produto = Valores[1] * Valores[3]; 
    soma = Valores[2] + Valores[4]; 
    alert(`O produto do primerio com o terceiro valor é de ${produto} e a soma do segundo com o quarto é de ${soma}`)
}

// Ex1A()

Ex1B = () => {
    //calculo de novo salário
    let salarioMensal = parseInt(prompt('Digite o valor do seu salário mensal')), 
    percentualDeReajuste = parseFloat(prompt('Digite o valor do percentual de reajuste salarial')), 
    novoSalario = null; 

    alert(`O resultado do seu reajuste salarial é de ${(salarioMensal*percentualDeReajuste) + salarioMensal}`)
}

// Ex1B(); 

Ex1C = () => {
    let CandidatoA = parseInt(prompt('Digite a quantidade de votos que o candidato A recebeu')), 
    CandidatoB =  parseInt(prompt('Digite a quantidade de votos que o candidato B recebeu')),
    CandidatoC =  parseInt(prompt('Digite a quantidade de votos que o candidato C recebeu')),
    votosBrancos = parseInt(prompt('Digite a quantidade de votos brancos')),
    votosNulos =  parseInt(prompt('Digite a quantidade de votos nulos')); 
    quantidadeTotalDeEleitores = CandidatoA + CandidatoB + CandidatoC + votosBrancos + votosNulos; 

    // 1º Dizer o percentual de voto de cada candidato com base no nº de eleitores
    document.write (`O percentual de votos que o candidato A recebeu foi de: ${((CandidatoA *100) / quantidadeTotalDeEleitores).toFixed(2)}% <br>`)
    document.write (`O percentual de votos que o candidato B recebeu foi de: ${((CandidatoB *100) / quantidadeTotalDeEleitores).toFixed(2)}% <br>`)
    document.write (`O percentual de votos que o candidato C recebeu foi de: ${((CandidatoC *100) / quantidadeTotalDeEleitores).toFixed(2)}% <br>`)
    document.write (`O percentual de votos em branco foi de: ${((votosBrancos*100) / quantidadeTotalDeEleitores).toFixed(2)}% <br>`)
    document.write (`O percentual de votos nulos foi de: ${((votosNulos*100) / quantidadeTotalDeEleitores).toFixed(2)}% <br>`)
}

// Ex1C();

// Página 41 do A até o L

Ex4A = () => {
    let ValorA = parseInt(prompt('Digite o primeiro valor')), 
    ValorB = parseInt(prompt('Digite o segundo valor')); 

    if (ValorA > ValorB) {
        alert(`A diferença entre A e B é de ${ValorA - ValorB}`)
    } else {
        alert(`A diferença entre B e A é de ${ValorB - ValorA}`)
    }
}

// Ex4A(); 

Ex4B = () => {
    let valorQualquer = parseInt(prompt('Digite algum valor, seja ele positivo ou negativo')); 

    valorQualquer < 0 ? alert('O modulo do valor em questão é de: ' + (valorQualquer * -1)) : null; 
}

// Ex4B()

Ex4C_D = () =>  {
    const Notas = Array();
    let notaTotal = null,
    media = null;  
    
    for (let index = 1; index <= 4; index++) {
        Notas[index] = parseInt(prompt(`Digite a ${index}º nota que você tirou`)); 
        notaTotal += Notas[index]; 
    }

    media = notaTotal / 4; 

    if (media >= 7) { return alert('parabéns você foi aprovado')} else {
        let notaDeExame = parseInt(prompt('Diigte a nota do exame de recuperação'));
        notaTotal += notaDeExame; 

        media = notaTotal / 5; 
        
        media >= 5 ? alert('Parabéns você conseguiu passar!') : alert('infelizmente você não consegiu passar!'); 
    }
}

// Ex4C_D(); 

Ex4E = () =>  {
    let a = parseFloat(prompt("Valor de A: ")), 
    b = parseFloat(prompt("Valor de B: ")), 
    c = parseFloat(prompt("Valor de C: ")), 
    x1, x2, delta; 

    delta = (b * b) - (4 * a * c);

    if(delta < 0) {
        alert(`Essa equação não possui valores reais!`)

    }else if(delta == 0){
        x1 = -b / (2 * A)
        alert(`X = ${x1}`)
    } else {
        alert(delta)
        x1 = -b + Math.sqrt(delta) / (2 * a)
        x2 = -b - Math.sqrt(delta) / (2 * a)

        alert(`X1 = ${x1} e X2 = ${x2}`)
    }
}

Ex4F = () => {
    let valorA = parseInt(prompt('Digite o valor de A: ')), 
    ValorB = parseInt(prompt('Digite o valor de B: ')), 
    ValorC = parseInt(prompt('Digite o valor de C: '));
    
    if (valorA > ValorB && ValorB > ValorC)  {
        return alert(`O número: ${valorA} é o maior número. E a ordem crescente é de: ${ValorC},${ValorB},${valorA}. A soma dos dois maiores é de ${valorA + ValorB}`)
    }

    if (valorA > ValorC && ValorC > ValorB)  {
        return alert(`O número: ${valorA} é o maior número. E a ordem crescente é de: ${ValorB},${ValorC},${valorA}. A soma dos dois maiores é de ${valorA + ValorC}`)
    }

    if (ValorB > valorA && valorA > ValorC) {
        return alert(`O número: ${ValorB} é o maior número. E a ordem crescente é de: ${ValorC},${valorA},${ValorB}. A soma dos dois maiores é de ${ValorB + valorA}`)
    }

    if (ValorB > ValorC && ValorC > valorA) {
        return alert(`O número: ${ValorB} é o maior número. E a ordem crescente é de: ${valorA},${ValorC},${ValorB}. A soma dos dois maiores é de ${ValorB + ValorC}`)
    }
    
    if (ValorC > valorA && valorA > ValorB) {
        return alert(`O número: ${ValorC} é o maior número. E a ordem crescente é de: ${ValorB},${valorA},${ValorC}. A soma dos dois maiores é de ${ValorC + valorA}`)
    }
    
    if (ValorC > ValorB && ValorB > valorA) {
        return alert(`O número: ${ValorC} é o maior número. E a ordem crescente é de: ${valorA},${ValorB},${ValorC}. A soma dos dois maiores é de ${ValorC + ValorB}`)
    }
}

// Ex4F(); 

Ex4G = () => {
    const Valores = Array(); 

    for (let index = 1; index <= 4; index++) {
        Valores[index] = parseInt(prompt("Digite o "+ index + "º valor"))

        if (Valores[index] % 2 === 0 && Valores[index] % 3 === 0) { alert('O número: ' + Valores[index] + ' é divisível por 2 e por 3') }
    }
}

// Ex4G(); 

Ex4H = () => {
    const Valores = Array(); 
    let maior = null, 
    menor = null; 

    for (let index = 1; index <= 5; index++) {
        Valores[index] = parseInt(prompt("Digite o "+ index + "º valor"))

        if (Valores[index] > maior) {
            maior = Valores[index]; 
        }

        if (menor > Valores[index]) {
            menor = Valores[index]
        }

        if (menor == null) { menor = Valores[1] }
    }

    alert(`O maior valor é ${maior} e o menor valor é ${menor}`);
}

// Ex4H();

Ex4I = () => {
    const valorQualquer = parseInt(prompt('Digite qualquer valor, e será retornado se ele é ímpar ou par'))

    valorQualquer % 2 === 0 ? alert('O valor em questão é par') : alert('O valor em questão é ímpar'); 
}

// Ex4I();

Ex4J = () => {
    const valorQualquer = parseInt(prompt('Digite qualquer valor, e ele será validado com base em uma faixa de 1 a 9'))

    if (valorQualquer >= 1 && valorQualquer <= 9) { alert('O valor informado está dentro da faixa de 1 e 9') } 
    else { alert('O valor está fora da faixa de 1 e 9') }
}

// Ex4J();

Ex4K = () => {
    const valorQualquer = parseFloat(prompt('Digite qualquer valor ele será exposto se for maior do que 3'));

    valorQualquer > 3 ? alert('O valor indormado é maior que três') : alert('O valor informado é menor do que três'); 
}

// Ex4K()

Ex4L = () => {
    
    let pessoaFactory = function(nome, sexo) {
        return {
            nome, 
            sexo, 
            chamada: function() {
                if (this.sexo === 'Homem') {
                    return alert(`Bem vindo Sr ${this.nome}`)
                } else {
                    return alert(`Bem vindo Sra ${this.nome}`)
                }
            }
        }
    }

    const Nome = prompt('Digite o seu nome') ,
    Sexo = prompt('Digite se você é Homem ou Mulher'); 

    let PessoaUm = new pessoaFactory(Nome,Sexo); 
    console.log(PessoaUm);
    console.log(PessoaUm.chamada());
}

// Ex4L(); 
