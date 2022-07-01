// Exercícios da página 46 - usando o enquanto (while!)

function Chamada(chamada, tipo) {
    console.log(chamada);
    let ArrayDeChamada = [];  

    if (tipo === "number") {
        for (let index = 0; index < chamada.length; index++) {
            ArrayDeChamada[index] = parseInt(prompt(chamada[index])); 
        }
    }

    if (tipo === "string") {
        for (let index = 0; index < chamada.length; index++) {
            ArrayDeChamada[index] = prompt(chamada[index]); 
        }
    }
   
    return ArrayDeChamada; 
}  

// Seguindo a lista do 46 de A até L
Ex44 = () => {
    let ArrayDeValores = Chamada(["Digite o número que será usado para fazer a tabuáda!"], "number");
    let Contador = 1;

    console.log(`A Tabuada do Valor ${ArrayDeValores[0]} é:`)

    while (Contador <= 10) {
        console.log(`${ArrayDeValores[0]} * ${Contador} = ${ArrayDeValores[0] * Contador}`)
        Contador += 1; 
    }
}; 

Ex45 = () => {
    let numero = 1;
    let Contador = 1; 
    while (Contador <= 100) {
        console.log(`${numero} + ${Contador} = ${numero + Contador}`);
        numero = numero + Contador; 
        Contador += 1;  
    }
}; 

Ex46 = () => {
    let numero = 0;
    let Contador = 2; 
    while (Contador <= 500) {
        console.log(`${numero} + ${Contador} = ${numero + Contador}`);
        numero = numero + Contador; 
        Contador += 2;  
    }
}; 

Ex47 = () => {
    let Contador = 0;
    while (Contador <= 20) {
        Contador % 2 != 0 ? console.log(`O número é ${Contador} ímpar`) : null; 
        Contador += 1;  
    }
}; 

Ex48 = () => {
    const NumeroTres = 3;
    let Contador = 0; 
     
    while(Contador <= 15) {
        
        // Contador == 0 ? console.log(`O Número ${NumeroTres} elevador a ${Contador} = 1`) : null; 
        // Contador == 1 ? console.log(`O Número ${NumeroTres} elevador a ${Contador} = ${NumeroTres}`) : null;
        console.log(`O Número ${NumeroTres} elevado a ${Contador} = ${Math.pow(NumeroTres, Contador)}`); 
        Contador += 1; 
    }
};

Ex49 = () => {
    let ArrayGeral = Chamada(["Digite um valor qualquer, para saber seu expoente","Digite o valor do expoente que deseja saber"], "number"); 
    let Contador = 1; 
    let encap = 1; 

    while (Contador <= ArrayGeral[1]) { 
        encap *= ArrayGeral[0]; 
        Contador == ArrayGeral[1] ? console.log(`O valor digitado ${ArrayGeral[0]} elevado ao expoente ${ArrayGeral[1]} é igual a = ${encap}`) : null;    
        Contador += 1; 
    }
};

Ex50 = () => {
    let Celsius = 10; 
    let Fahrenheit = null;
    while (Celsius <= 100) {
        Fahrenheit = (9*Celsius + 160)/5
        console.log(`O valor de ${Celsius} Celsius em Fahrenheit, equivale a = ${Fahrenheit}`);
        Celsius += 10;
    }
}

Ex51 = () => {
    let Contador = 1; 
    let soma = null;
    let numb;  
    while(Contador <= 10) {
        numb = parseInt(prompt(`Digite o ${Contador}º número`))
        soma += numb; 
        Contador == 10 ? console.log(`A somatória dos 10 números digitados será de: ${soma}. E a média aritmética dos valores digitados é de ${soma / 10}` ) : null;
        Contador += 1; 
    }
};

Ex52 = () => {
    let Contador = 50; 
    let soma = null;
    let numb;  
    while(Contador <= 70) {

        Contador%2==0 ? soma+=Contador : null; 
        Contador == 70 ? console.log(`A somatória dos valores pares entre 50 e 70 é de: ${soma}. E a média aritmética dos valores digitados é de ${soma / 10}` ) : null;
        Contador += 1; 
    }
};

Ex53 = () => {
    let Opcao = undefined; 

    while (Opcao != "N") {

        let Comodo = prompt("Digite o nome do cômodo")
        let ArrayGeral = Chamada(["Digite a Largura","Digite o Comprimento"], "number"); 
        console.log(`A Área do cômodo ${Comodo} é de ${ArrayGeral[0] * ArrayGeral[1]} Metros Quadrados`);

        Opcao = prompt("Vai querer continuar, se [S] = SIM, [N] = NÂO"); 
        Opcao = Opcao.toUpperCase(); 
    }
}; 

Ex54 = () => {
   let valor = 1; 
   let maior = 0; 
   let menor = 0; 

   while (valor >= 0) {
    valor = parseInt(prompt("Digite um valor!"))
    
    if (valor > maior) {
        maior = valor; 
    } else if (menor > valor) {
        menor = valor; 
    }
    
    valor < 0 ? console.log(`O maior valor digitado foi ${maior} e o menor valor digitado foi o ${menor}`) : null; 
     
   }
}; 

//COMEÇO EXERCÍCIOS DA PÁGINA 50, USANDO O LAÇO DE REPETIÇÃO DE FOR

EX55 = () => {
    for (let index = 15; index <= 200; index++){
        console.log(`O quadrado do valor ${index} é ${index * index}`);
    }
};

EX56 = () =>{
    let soma = null; 
    for (let index = 0; index <= 500; index += 2) {
        soma += index
        index === 500 ? console.log("A soma total dos 500 números pares equivale a: " + soma) : null;
    }
};

EX57 = () => {
    let ValorDeBase = 4; 
    for (let index = 1; index <= 200; index++) {
        index % 4 == 0 ? console.log(`O valor ${index} é divisível por 4`) : null; 
    }
};

EX58 = () => {
    let grao = 1;
    let total = null; 
    for (let index = 1; index < 64; index++) {
        grao = grao * 2
        total += grao 
        console.log("O total de grãos de será de" + total);
    } 
}; 

ExL58 = () => {
    let valor = []; 
    let acumulador = 1; 
    let acumuladorDois = 0; 

    for (let index = 0; index < 15; index++) {
        valor[index] = parseInt(prompt("Digite um valor"))

        for (let zindex = valor[index]; zindex >= 1; zindex--) {
            acumulador = acumulador * zindex;
            console.log(acumulador);
            
            if (zindex == 1) {
                acumuladorDois += acumulador; 
                acumulador = 1; 
            }
        }
    }
    alert(`A soma total dos fatoriais foi de ${acumuladorDois}`);
}

EX60 = () => {
    let soma = null;
    let media = null; 
    let TotaldeValoresLido = null; 

    for (let index = 1; index >= 0; index = index) {
        index = parseInt(prompt("Digite um valor"));
        soma += index;
        TotaldeValoresLido += 1; 
        media = soma / TotaldeValoresLido;
        
        index < 0 ? console.log(`A quantidade de números digitados foi de ${TotaldeValoresLido} A soma de todos os números lidos é de ${soma} A média dos valores lidos é de ${media}`) : null; 
    }
}

EX61 = () => {
    let valor = []; 
    let acumulador = 1; 
    let acumuladorDois = 0; 

    for (let index = 1; index <= 5; index++) {
        if (index % 2 != 0) {
            valor.push(index) 
        }
    }

    for (let zindex = 0; zindex <= valor.length; zindex++) {
        console.log(valor[zindex]);
        
        //agora iremos fazer o somatório dos fatores 
        for (let yindex = valor[zindex]; yindex >= 1; yindex--) {
            acumulador = acumulador * yindex;
            console.log("Valor do acumulador " + acumulador);
            
            if (yindex == 1) {
                acumuladorDois += acumulador; 
                console.log("Valor do acumulo das somas" + acumuladorDois);
                acumulador = 1; 
            }
        }
    }
    alert("A soma fatorial de todos os número ímpares de 1 até 10 é: " + acumuladorDois);
}
