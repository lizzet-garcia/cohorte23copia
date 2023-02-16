let listaNombres = ["Maria", "Antony", "Joy", "Juan"]
console.log(listaNombres);
 //.1

listaNombres.push ("Lizzet");
console.log( "con mi nombre " + listaNombres);
//.2

console.log(listaNombres.includes("Maria"))
//.3

let listaNombres2 = ["Maria", "Antony", "Joy", "Juan"]
let masNombres = ["Maria", "Pedro", "Juan"]


function nuevaLista (valor1, valor2){
    let listaRepetida = [];
    for (let i=0; i< valor1.length; i++ ){

    }

}




//.4


//. ejercicio 2
console.log (false || (true && false)); 
console.log (true || (11 + 12));
console.log((31 + 22) || true);
console.log(true && (1 + 7));
console.log(false && (3 + 4));
console.log((1 + 2) && true);
console.log ((32 * 4) >= 129);
console.log(false !== !true);
console.log(true === 4);
console.log(false === (847 === '847'));
console.log(false === (887 == '887'));
console.log((!true || (!(100 / 5) === 20) || ((328 / 4) === 82)) || false);

//.. ejercicio 3
function RangoNumeros(num) {
    if (num >= 0 && num <= 25) {
        return num + ' is between 0 and 25';
    } else if (num >= 26 && num <= 100) {
        return num + ' is between 26 and 100';
    } else if (num > 100) {
        return num + ' is greater than 100';
    } else if (num < 0) {
        return num + ' is less than 0';
    } else {
        return 'Please enter a valid number';
    }
}


console.log(RangoNumeros(25));   // '25 is between 0 and 25'
console.log(RangoNumeros(75));   // '75 is between 26 and 100'
console.log(RangoNumeros(125));  // '125 is greater than 100'
console.log(RangoNumeros(-25));  // '-25 is less than 0'