function limparParcial(){
    var numero1 = document.getElementById('num1').value = "";
    var numero2 = document.getElementById('num2').value = "";
    var operacao = document.getElementById('operacao').value = "";
}
function limpar(){
    var numero1 = document.getElementById('num1').value = "";
    var numero2 = document.getElementById('num2').value = "";
    var operacao = document.getElementById('operacao').value = "";
    var operacao = document.getElementById('resultado').value = "";
}
function calcular(){
    var numero1 = document.getElementById('num1').value;
    var numero2 = document.getElementById('num2').value;
    var operacao = document.getElementById('operacao').value;
    var resultado;

    if(numero1 == ''){
        alert("Favor digitar um número válido para operação (num1)");
        return false;
    }
    if(numero2 == ''){
        alert("Favor digitar um número válido para operação (num1)");
        return false;
    }

    numero1 = parseFloat(numero1);
    numero2 = parseFloat(numero2);

    switch(operacao){
        case 'sub': resultado = numero1 - numero2;
            break;
        case 'adi': resultado = numero1 + numero2;
            break;
        case 'mul': resultado = numero1 * numero2;
            break;
        case 'div':
            if(numero2 == 0){
                alert("Não é possível dividir um número por 0.");
                return false;
            } else {
            resultado = numero1 / numero2;
            }
            break;
        default: alert("Escolha uma operação válida.");
            return false;
    }
    //alert(resultado);    
    document.getElementById('resultado').value = resultado;
    limparParcial();
}

/*
//CTRL+SHIFT+U
function somar(numero1, numero2){

    var resultado = numero1 + numero2;

    console.log("O resultado da soma é: "+resultado);

}

function boasVindas(){
    alert("Seja bem-vindo, você pressionou o botão cinza");
}

function boasVindasLog(){
    console.log('O elemento ganhou o foco');
}

function boasVindas(){
    alert("Seja bem-vindo, você pressionou o botão cinza");
}
*/