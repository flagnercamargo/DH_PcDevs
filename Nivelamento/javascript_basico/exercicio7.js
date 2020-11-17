// Precisamos criar um código que ajude um petshop a dizer
// se o pet está com o peso ideal. E para isso eles deixaram
// para você as informações que ele usam para fazer essa classificação:

// - Abaixo de 4kg = Abaixo do Peso
// - Maior que 10kg = Acima do Peso
// - Se tiver entre esses dois valores =  Peso normal.

// Utilizando o ELSE IF e crie o código para suprir
// essa necessidade e imprimindo as mensagens de acordo
// com a lista acima!

var petPeso = 7

if(petPeso < 4 ){
    console.log('Abaixo do Peso')
} else if(petPeso > 10){
    console.log('Acima do Peso')
} else {
    console.log('Peso normal')
}