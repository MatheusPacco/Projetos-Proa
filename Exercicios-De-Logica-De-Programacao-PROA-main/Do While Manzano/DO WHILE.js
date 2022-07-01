//  Exercícios da página 50 de A - J

ExA = () => {
    let contador = 15; 
    do {
        console.log(`O quadrado do valor ${contador} é: ${contador * contador}`);
        contador += 1;  
    } while (contador <= 200);
}

// ExA()

ExB = () => {
    
    let contador = 1;
    let acumulador = null; 

    do {

    contador%2 ==0 ? acumulador += contador : null;
    contador += 1; 
    } while (contador <= 500);

    console.log(`A soma de todos os valores pares de 1 até 500 é: ${acumulador}`);
}

// ExB()

ExC = () => {
    let contador = 1;

    do {
        contador % 4 == 0 ? console.log(`O valor ${contador} é divisível por 4`) : null;
        contador += 1; 
    } while (contador <= 200);
}

// ExC()

ExD = () => {
    let grao = 1; 
    let total = 1; 
    let contador = 1; 

    do {
        grao = grao*2
        total += grao 
        contador += 1; 
    } while (contador <= 64);

    console.log("O total de grãos de será de" + total);
}

// ExD()

ExE = ()=> {
    let valor = []; 
    let acumulador = 1; 
    let acumuladorDois = null; 
    let contador1 = 1; 
    let contador2 = 1;  

    do {
        valor[contador1] = parseInt(prompt("Digite um valor")); 
        contador2 = valor[contador1];

        do {
            acumulador = acumulador * contador2; 
            console.log(acumulador);
            if (contador2 == 1) {
                acumuladorDois += acumulador; 
                acumulador = 1; 
            }
            contador2 = contador2 - 1 ; 

        } while (contador2 >= 1);
        
        contador1 += 1;

    } while (contador1 <= 15);

    console.log(acumuladorDois);
}

// ExE(); 


ExF = ()=> {
    let Valores = []; 
    const Resultados = { 
        SomaTotal: 0, 
        MediaAritmetica: 0, 
        TotalDeValoresLidos: 0,
    }
    
    let i = 0; 

    do {
       
        Valores[i] = parseInt(prompt("Digite um valor")); 
        Resultados.SomaTotal += Valores[i]
        i++; 
        console.log(Valores);
    } while ( Valores[i - 1] > 0);

    Resultados.MediaAritmetica = Resultados.SomaTotal / Valores.length
    Resultados.TotalDeValoresLidos = Valores.length

    console.log(Resultados);

    console.log(`O Somatório total foi de: ${Resultados.SomaTotal}`);
    console.log(`A média aritmética foi de: ${Resultados.MediaAritmetica}`);
    console.log(`A quantidade de valores lidos foi de: ${Resultados.TotalDeValoresLidos}`);
}

// ExF(); 

ExG = () => {
    let contador = 1; 
    let Objeto = {
        ArrayDeValores: [], 
        SomatorioTotal: null 
    } 

    do {
    
        if (contador %2 != 0) { Objeto.SomatorioTotal += FatorandoOsValores(contador) }
        contador++  

    } while (contador <= 10);

    console.log("O somatório total dos valores ímpares lidos de 1 até 10 é de:" + Objeto.SomatorioTotal); 
}

function FatorandoOsValores (contador) {
    let Acumulador = 1; 
    let AcumuladorFinal = null; 

    do {
        Acumulador = Acumulador * contador; 

        if (contador == 1) {
            AcumuladorFinal += Acumulador; 
        }
        contador-- 

    } while (contador >= 1);
     
    return AcumuladorFinal; 
}

// ExG()

ExH = () => {
    let AreaResidencial = [];
    let i = 0;  
    let opcao = "";
    let AreaTotalDosComodos = null; 
    console.log(opcao); 

    do {
        
    let NomeDoComodo = prompt("Digite a área da residência em questão! "); 
    AreaResidencial[i] = new Object();  
    AreaResidencial[i].largura = parseInt(prompt("Digite o tamanho a Largura em metros dessa área"))
    AreaResidencial[i].comprimento = parseInt(prompt("Digite o tamanho o comprimento em metros dessa área"))

    alert(`A área da casa chamada de ${NomeDoComodo}, tem uma largura de ${AreaResidencial[i].largura} Metros e um comprimento de ${AreaResidencial[i].comprimento} Metros`);

    AreaTotalDosComodos += AreaResidencial[i].largura * AreaResidencial[i].comprimento;  
    
    i++

    opcao = prompt("Deseja cadatras mais áreas da sua casa? SIM ou NÃO ?")

    } while (opcao.toUpperCase() != "NÃO");

    alert("O somatório das áreas dos comodos da casa é igual a: " + AreaTotalDosComodos + "Metros Quadrados");

    console.log(AreaResidencial);
}

// ExH()

ExI = () => {
    let Valores = 1; 
    let MenorValor = null; 
    let MaiorValor = null;  

    do {
        Valores = parseInt(prompt("Digite um valor inteiro")); 

        if (Valores > MaiorValor) {
            MaiorValor = Valores; 
        } else if (MenorValor > Valores) {
            MenorValor = Valores; 
        }

    } while (Valores >= 0);

    console.log (`O maior valor é ${MaiorValor} e o menor valor é${MenorValor}`)
; }

// ExI()

ExJ = () => {
    let valorUm, valorDois;
    let contador = 0;   
    valorUm = parseInt(prompt("Digite o valor que será divido"))
    valorDois = parseInt(prompt("Digite o divisor"))
    let sub = valorUm

    do {
        sub -= valorDois
        contador++
        console.log(sub);
    } while (sub >= 0);

    sub < 0 ? console.log (`O quociente da divisão é equivalente a ${contador - 1}`) : null; 
    sub == 0 ? console.log (`O quociente da divisão é equivalente a ${contador}`) : null; 
}

ExJ();