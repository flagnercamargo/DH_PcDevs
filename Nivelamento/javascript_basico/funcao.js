function exibirNomeDeCarros(){
  var listaDeCarros = [ "Fox", "Uno", "Gol", "Astra", "Fiesta"]
    for (var i=0; i < listaDeCarros.length ; i++){
      console.log("Nome do Carro é: " + listaDeCarros[i])
    }
}

// Autonomia
// Os engenheiros de uma montadora estão projetando o computador de bordo de um carro.
// Eles precisam de uma função que possa calcular a autonomia atual do automóvel,
// em outras palavras, quantos quilômetros ele consegue andar com a quantidade 
// de combustível atual. A autonomia pode ser obtida multiplicando a quantidade
// de combustível pelo rendimento. Será que você consegue ajudá-los?

// Escreva uma função chamada autonomia:

function autonomia(quantidadeDeCombustivel, rendimento){
  return quantidadeDeCombustivel * rendimento;
}


// A lavanderia DigitalLaundry lava roupa por quilo.
// Ela cobra dos seus clientes R$ 5,00 por cada quilo
// de roupa suja. Atualmente, eles usam um caderninho
// e uma calculadora para descobrir o valor que cada
// cliente tem a pagar. Precisamos automatizar essa empresa!

// Escreva uma função calculaValorDevido

function calculaValorDevido(pesoDaRoupaSuja) {
  var valorDoKilo = 5.00
  return pesoDaRoupaSuja * valorDoKilo;
}

// Depois de nossa consultoria, a lavanderia DigitalLaundry
// percebeu que poderia deixar a sua cobrança mais sofisticada
// e justa. Ela decidiu cobrar R$10,00 fixo, a título de taxa
// de serviço (independente da quantidade de roupa), mais
// R$ 3,00 por quilo de roupa suja. Reescreva a função calculaValorDevido

function calculaValorDevido(pesoDeRoupaSuja){
  var taxaFixa = 10.00;
  var valorDoKilo = 3.00;
  var preco = pesoDeRoupaSuja * valorDoKilo;
  return preco + taxaFixa;
}
