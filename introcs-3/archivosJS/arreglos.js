let miVariable = 34;

let miArreglo = []; //declaracion literal
let miArreglo01 = new Array(); // por instancia

let miArreglo02 = [31,32,33,34]
console.log("dato de miArreglo en el indice 0 - "+ miArreglo02[0]);
console.log("dato de miArreglo en el indice 1 - "+ miArreglo02[1]);
console.log("dato de miArreglo en el indice 2 - "+ miArreglo02[2]);
console.log("dato de miArreglo en el indice 3 - "+ miArreglo02[3]);
console.log("el tamaño o numero de elementos del arreglo es: " + miArreglo02.length);

let miArreglo03 = ["Hola","que","tal"];
console.log (miArreglo03[0]);
console.log (miArreglo03[1]);
console.log (miArreglo03[2]);
console.log("el tamaño del miArreglo03 es : " + miArreglo03.length);

let miArreglo04 = [{nombre:"Hugo"}, {apellido:"Fernandez"}, {edad:"23"}];
console.log(" elemento del arreglo de tipo objeto miArreglo04 " + miArreglo04[0].nombre);
console.log(" elemento del arreglo de tipo objeto miArreglo04 " + miArreglo04[1].apellido);
console.log(" elemento del arreglo de tipo objeto miArreglo04 " + miArreglo04[2].edad);

let nuevoArreglo00 = [3,6,1,4];
console.log("Orden de mi arregloNuevo con sort(): " + nuevoArreglo00.sort());
console.log("orden de mi arregloNuevo metodo pop(): " + nuevoArreglo00.pop());
console.log("orden de mi arregloNuevo metodo pop(): " + nuevoArreglo00.push());
console.log("orden de mi arregloNuevo metodo pop(): " + nuevoArreglo00.reverse());