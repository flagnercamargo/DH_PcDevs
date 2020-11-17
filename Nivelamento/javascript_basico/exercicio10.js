//Pode subir?

//Um parque de diversão te contratou para criar um código
//para ajudar os usuários a saber se eles podem ir em uns dos brinquedos.
//As regras são:

// - Ser maior que 1,50m ou ter 21 anos ou mais.

// Diante disso, crie condições que supra essa necessidade,
// exiba a seguinte mensagem caso o usuário possa usar o brinquedo:
// “Você pode subir”. 
// Caso ele não possa:
// “Desculpe, você não atende os requisitos para usar o brinquedo”.

// Vale dizer que para esse exercício você terá duas variáveis: usuarioAltura e usuarioIdade

var usuarioAltura = 170
var usuarioIdade = 21

if(usuarioAltura > 150 || usuarioIdade >= 21){
    console.log("Você pode subir")
}else{
    console.log("Desculpe, você não atende os requisitos para usar o brinquedo")
}