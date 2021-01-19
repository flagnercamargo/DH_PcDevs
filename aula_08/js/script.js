console.log("Olá, tudo bem?");

var num1 = 20;
var num2 = 10;

var soma = num1 + num2;
var subt = num1 - num2;
var mult = num1 * num2;
var divi = num1 / num2;

console.log ("A soma é: " + soma + ".");
console.log ("A subtração é: " + subt + ".");
console.log ("A multiplicação é: " + mult + ".");
console.log ("A divisão é: " + divi + ".");

var idade = 18;

if (idade >= 18) {
    console.log ("Você é maior de idade!")
}else {
    console.log ("Você é menor de idade!")
}

/*
Operadores lógicos:
<
>
=
!=
&&
||
! mod
% resto da divisão
*/

// Saber se o número é par ou ímpar:
num = 4
if (num % 2 == 0){
    console.log ("Este número é par.");
}else { 
    console.log ("Este número é ímpar.");
}

// A mesma condição, mas numa Condição Ternária:
var num2 = 5;
(num2 % 2) == 0 ? console.log ("Este número é par.") : console.log ("Este número é ímpar.");

// Outro exemplo de Operador Ternário:
var idade = 15;
var mensagem = idade >= 18 ? "Seja bem-vindo!" : "Fora daqui!";
console.log (mensagem);

// Estrutura Switch Case
var mes = "mai";
var estacao;
switch (mes) {
    case "jan": case "fev": case "mar": estacao = "verão";
        break;
    case "abr": case "mai": case "jun": estacao = "outono";
        break;
    case "jul": case "ago": case "set": estacao = "inverno";
        break;
    case "out": case "nov": case "dez": estacao = "primavera";
        break;
    default: estacao = "indefinida"
        break;
}
console.log("No mês de " + mes + " estamos na estação: " + estacao + ".");

// Mesmo caso, outra forma de fazer, com if else
var mes = `nov`;
var estacao;
if (mes == `jan` || mes == `fev` || mes == `mar`) {
    estacao = `verão`;
  } else if (mes == `abr` || mes == `mai` || mes == `jun`) {
      estacao = `outono`;
  } else if (mes == `jul` || mes == `ago` || mes == `set`) {
      estacao = `inverno`;
  } else if (mes == `out` || mes == `nov` || mes == `dez`) {
      estacao = `primavera`;
  } else {
      estacao = `indefinida`;
  }
  console.log(`No mês de ${mes} estamos na estação: ${estacao}.`);

// Repetição com While

var numAluno = 1;
while (numAluno <= 3) {
    console.log("Aluno:" + numAluno + ".")
    numAluno++;
}

// Tabuada com While

var multi = 7;
var numTab = 1;
console.log("A tabuada do " + multi + " é:");
while (numTab <= 10) {    
    console.log(multi + "*" + numTab + "=" + (multi * numTab)); 
    numTab++;
}

// mesma Tabuada com For

var multi = 7;
console.log("A tabuada do " + multi + " é:");
for (numTab = 1 ; numTab <= 10 ; numTab++) {
    console.log(multi + "*" + numTab + "=" + (multi * numTab));
}

// um programa que escreva na tela todos os números pares entre 0 e 100

console.log("Os números pares são: ");
for (var num = 0 ; num <= 100 ; num++) {    
    if(num % 2 == 0){
        console.log(num);
    }
}

// um programa que escreva na tela todos os números ímpares entre 100 e 200

console.log("Os números ímpares são: ");
for (var num = 100 ; num <= 200 ; num++) {    
    if(num % 2 !== 0){
        console.log(num);
    }
}

// calcular um número fatorial (exemplo: fatorial de 5 5*4*3*2*1)

var valor = 5;
if (acumula = 1) {
    for(var x = valor ; x > 1; x--) {
        acumula = acumula * x;
    }
    console.log(`O resultado do Fatorial de ${valor} é: ${acumula}`);
}

// Repetição com For e Lista

var nomeAluno = ["Paulo","André","Antônio","Carlos"];
for (var i = 0 ;i < nomeAluno.length ; i++ ) {
    console.log("Aluno: " + nomeAluno[i] + ".")
}
