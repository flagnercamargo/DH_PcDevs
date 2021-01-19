let resultado = document.querySelector(".resultado");

function converterBase() {
    let numero = document.querySelector("#numero");
    let numeroDecimal = Number(numero.value);
    base = selecionarBase();
    let numeroConvertido = numeroDecimal.toString(base);
    resultado.innerHTML = `${numeroDecimal} na base 10 equivale a ${numeroConvertido} na base ${base}.`;
}

function selecionarBase() {
    let base = getRadioValor("tipo-base");
    if (base == "Octal") {
        return 8;
    }
    else if (base == "Hexadecimal") {
        return 16;
    }
    else if (base == "Binária") {
        return 2;
    }
    else {
        return null;
    }
}

function getRadioValor(name) {
    let radios = document.getElementsByName(name);
    for (var i=0; i<radios.length; i++) {
        if (radios[i].checked) {
            return radios[i].value;
        }
    }
    return null;
}

function limparResultado() {
    resultado.innerHTML = "";
    numero.value = "";
    numero.focus();
}
