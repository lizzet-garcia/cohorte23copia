let peopleBank = ["sofia", "david", "juan"];
console.log("las personas esperando son: " + peopleBank);

peopleBank.push("Sara", "Agustin");
console.log("con las otras personas: " + peopleBank);

peopleBank.splice(2, 0, "Renata");
console.log("la fila es: " + peopleBank)

peopleBank.push("Elena");
console.log("con las otras personas: " + peopleBank);

//ejercicio 2
for (var i = 1; i <= 5; i++) {
    var fila = "";
    for (var j = 1; j <= i; j++) {
        fila = fila + "* ";
    }
    console.log(fila);
}

//ejercicio 3 
let xValue = 100;
while(xValue => 0){
    console.log(xValue);
    xValue= xValue-0.5
}

var yValue = 1;
while (yValue <= 100) {
    if (yValue % 2 !== 0) {
        console.log(yValue);
    }
    yValue++;
}

