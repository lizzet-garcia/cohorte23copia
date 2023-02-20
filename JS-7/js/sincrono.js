/*Proceso secuencial: ejecuta la primera linea y luego la de abajo. es secuencial y bloqueante.*/
alert("cohorte23");
console.log("hola buen dia");
alert("dia del gato");
console.log("adios");

//funcion asincrona: hace una ejecucion de callback, despues de los 1000 milisegundos se entrego el resultado de la funcion.
/*
setTimeout(
function(){
    console.log("hola mundo, con retraso")
}, 1000 //mil milisegundos
) 
console.log("sorpresa")
*/

//la misma funcion de arriba con funcion flecha (mas simple)
const myCallback = () => console.log("hola mundo con retraso");
setTimeout(myCallback);
console.log("sorpresa")

