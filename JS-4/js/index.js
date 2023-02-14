//objetos
// let miArray = new Array (); 

//Declaracion de variable normal
let miVariable = 5;

//Arreglo dimensional
let miArray = [2,3,4,5,6,];
console.log("miArray" + myArray[0]);
console.log("miArray" + myArray[1]);

//Matriz: arreglo multidimensional
let miArray1 = [
[1,2,3],
[4,5,6],
[7,8,9]

];
console.log("miArray1" + miArray1[0][1]);
console.log("miArray1" + miArray1[0][2]);
console.log("miArray1" + miArray1[2][1]);
console.log("miArray1" + miArray1[1][2]);
console.log("miArray1" + miArray1[1][0]);

console.log("todo el indice " + miArray1[0]);
console.log("todo el indice " + miArray1[1]);
console.log("todo el indice " + miArray1[2]);

//Bucle FOR necesita 3 parametros; el inicio, el rango, y el ultimo que incrementa la variable
for(let i=0; i < 10; i++){
console.log("imprimiendo i" + i);
}
//..

let miArray2 = [2,3,4,5,6,];
for(let i=0; i <= 5; i++) {
    console.log("imprimiendo miArray2 " + miArray2[i]);
}

//..
let miArray3 = [
    [1,2,3],
    [4,5,6],
    [7,8,9]
    
    ];

    for(let i = 0; i < 3; i++ ){
for(let j = 0; j < 3; j++ ){
console.log("Imprimiendo la matriz " + miArray3[i][j]);
}
    }

//..

let miArray4 = [
    [1,2,3],
    [4,5,6],
    [7,8,9]
    
    ];

    let matrizR = [
        [],[],[]
    ]

    for(let i = 0; i < 3; i++ ){
for(let j = 0; j < 3; j++ ){
 matrizR[i][j] = miArray4[i][j] * miArray4[i][j];

}
    }
    console.log(matrizR);


/*WHILE solo necesita una prueba logica, se va a ejecutar mientras se cumpla una condicion, 
let variable inicion
while (condicion){

}

*/

let contador = 0;
while(contador < 10){
    console.log(contador);
    contador++;
}
