var listaDeCarros = [ "Fox", "Uno", "Gol", "Astra", "Fiesta"]

for (i=0; i < listaDeCarros.length ; i++){
    console.log("Nome do Carro: " + listaDeCarros[i])
}

var listaDeLucro = [100, 30, 300, -10, 600, 10]
var lucroTotal = 0;

for (i=0; i < listaDeLucro.length ; i++){
    lucroTotal = lucroTotal + listaDeLucro[i]
}

var listaDeGanhos = [10, 30, -10, -5, -1, 40]
var totalNegativos = 0

for (i=0; i < listaDeGanhos.length ; i++){
    if (listaDeGanhos[i] < 0){
        totalNegativos++
    }
}

var listaDeFrutas = [ "Uva", "Banana",  "Manga", "Cajá", "Pinha"]
var busca = "Cajá"

for (i=0; i < listaDeFrutas.length; i++){
    if (listaDeFrutas[i] == busca){
        console.log("Sim, temos a fruta " + busca + " disponível")
        }
}
