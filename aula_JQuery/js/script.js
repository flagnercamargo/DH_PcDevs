function envio() {
    var nome = $("#nome").val(); // em JQuery equivale ao: document.getElementsById('nome').value;
    var cidade = $("#cidade").val();

    $.ajax({
        method: "POST",
        url: "http://localhost:3000/usuarios",
        data: {
            "id": (Math.floor(Math.random() * 1000) + 1),
            "nome": nome,
            "cidade": cidade
        },
        success: function () {
            alert('Dados salvos com sucesso.')
        },
        error: function () {
            alert('Não foi possível cadastrar os dados.')
        }
    });
}

// $(".alert") // pegando o elemento pela classe
// $("#alerta") // pegando o elemento pelo id

// // document.getElementById("alerta").innerText = "Olá JQuery"
// $("#alerta").text("Olá JQuery");
// $("#alerta").removeClass("alert-primary");
// $("#alerta").addClass("alert-warning");
