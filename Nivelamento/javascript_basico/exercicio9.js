//Posso comprar esse produto?

//Queremos criar um código que ajude o usuário a saber
//se ele pode comprar um produto ou não.
//Para acontecer a venda, a quantidade do produto no estoque
//tem que ser maior que zero e o produto está ativo.

//Para escrever este código, teremos duas variáveis 
//já definidas: produtoQtd, produtoAtivo.

// Faça uma condição que supra a necessidade acima,
//se o usuário puder comprar o produto exiba a seguinte mensagem
// “Você pode finalizar essa compra”. 
//Caso contrário exiba “Produto não está disponível para compra”

var produtoQtd = 3
var produtoAtivo = true

if(produtoQtd > 0 && produtoAtivo){
    console.log("Você pode finalizar essa compra")
}else{
    console.log("Produto não está disponível para compra")
}
