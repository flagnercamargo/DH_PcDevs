//Queremos um código que oriente o usuário de acordo com
//o saldo da conta bancária. Para isso precisamos de uma
//variável saldo que guarda um número decimal(float),
//e imprime uma mensagem de acordo com a situação
//financeira. Se o saldo for maior que 0 (zero) imprima
//“Seu saldo está positivo! Gostaria de fazer um investimento?”,
//agora, se o saldo for menor que zero(0) imprima
//“Seu saldo está negativo! Gostaria de fazer um empréstimo?”

var nome = "João"
var saldo = 17.00
if (saldo > 0) {
    console.log("Olá, " + nome + ".")
    console.log("Seu saldo está positivo! Gostaria de fazer um investimento?")
}
if (saldo < 0) {
    console.log("Olá, " + nome + ".")
    console.log("Seu saldo está negativo! Gostaria de fazer um empréstimo?")
}
