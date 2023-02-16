//. "texto" como arreglo y como objeto
let texto = "Hola Mundo";
let mensaje = "El texto tiene " + texto.length + " caracteres";
console.log(mensaje);

// usar el FOR para recorrer todo el arreglo, aqui estamos concatenando un espacio.
//trim quita el espacio en blanco al principio y al final de una cadena de caracteres
let texto2 = "Hola Mundo";
let mensaje2 = " ";

for (let index = 0; index < texto2.length; index++) {
    mensaje2 += texto2[index] + " ";
    
}
mensaje2 = mensaje2.trim()
console.log(mensaje2);

//. toUpperCase manipula y pasa a mayuscula
let texto3 = "Hola Mundo";
let mensaje3 = texto3.toUpperCase();
console.log(mensaje3);

//. substr copia partes de una cadena de texto
let texto4 = "Hola Mundo";
let palabra = texto4.substr(5);
console.log(palabra);

//. substring tambien copia partes de la cadena, pero hay que indicarle que indices, y el primero elemento no lo agrega.
let texto5 = "Hola Mundo";
let palabra1 = texto5.substring(5,7); //. omite el indice 5, solo muestra 6 y 7
console.log(palabra1);

//. split divide una cadena en un arreglo de subcadenas
let texto6 = "Hola Mundo";
let palabra2 = texto6.split(" ");
console.log(palabra2[0] + "/" + palabra2 [1]); // el 0 y el 1 son arreglos
 
//. includes permite hacer la busqueda de un caracter, si existe es true
let texto7 = "Hola mundo";
if (texto7.includes("l")) {
    console.log("--- L");
}else {
console.log("este caracter no esta");
}

