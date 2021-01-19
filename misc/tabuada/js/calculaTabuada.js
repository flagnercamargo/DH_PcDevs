let resultado = document.querySelector("#resultado");

function calcularTabuada() {
    let numero = document.querySelector("#numero");
    numero = Number(numero.value);

    if ( numero <1 || numero >10 ) {
        alert("Você digitou um número não permitido.")
        limparResultado();
    }
    else {
        let msg = "";

        for ( var i=0; i<=10; i++ ) {
            msg += `${numero} x ${i} = ${numero * i} <br>`
        }
        resultado.innerHTML = msg;
    }
}

function limparResultado() {
    resultado.innerHTML = "";
    numero.focus();
    numero.value = "";
}