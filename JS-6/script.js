/* 
¿Que encontramos en el arbol del DOM?
-NODE: unidad mas basica dentro del documento. puede ser un texto
una etiqueta, un comentario,etc.
<title> NODO
MANIPULACION DOM // NODO HIJO DE TITLE
</>title>

-DOCUMENT: Tambien es un nodo, del tipo docuemento,
es el nodo raiz a partir de cual se generan los demas nodos.

-ELEMENT: Son todos aquellos definidos por etiquetas, <div>,<img>,<h1>

-ATTRIBUTES: Nodos que dan informacion asociada al tipo de etiqueta.

-COMENTARIO: Comentarios y otros elementos que estan dentro del HTML, son considerados Nodos.

*/

/*como leer nodos de mi Document Object Model (DOM)

Metodos tradicionales (que se usan en versionas antiguas de JS)
-document.getElementById (botonSuma)
-document.getElementsByTagName (<button>)
-document.getElementsByClassName (botones)
*/
/* 
var elementoID = document.getElementById("botonSuma");
console.log(elementoID);

var elementoEtiqueta = document.getElementsByTagName("button")
console.log(elementoEtiqueta);
console.log("este es el primer elemento de mi coleccion de botones: ",
elementoEtiqueta[0]);


var elementoClassName = document.getElementsByClassName("botones");
console.log(elementoClassName);

/*
Metodos recientes
-document.querySelector (#botonSuma)
-document.querySelectorALL (.botones)



var unElemento = document.querySelector("#input1");
console.log(unElemento);

var variosElementos = document.querySelectorALL(".botones");
console.log(variosElementos);

*/

/*Creacion de Nodos

- document.createElement(tipoNodo)


*/


/* CONSTRUIR CALCULADORA */

var input1 = document.getElementById("input1");
var input2 = document.getElementById("input2");

var botonSuma = document.getElementById("botonSuma");
var botonResta = document.getElementById("botonResta");
var botonMultiplicacion = document.getElementById("botonMultiplicacion");
var botonDivision = document.getElementById("botonDivision");

var resultado = document.getElementById("resultado");

/* creacion de etiqueta imagen*/
var imagenPerrito = document.createElement("img");

 /* creamos atributos a la etiqueta */
 imagenPerrito.src = "https://www.petdarling.com/wp-content/uploads/2021/01/cachorros.jpg";
 imagenPerrito.alt = "perrito"
 imagenPerrito.style.width = "150px"
 imagenPerrito.style.borderRadius="100px"

/*poner elementos o nodos en el html*/
document.body.append(imagenPerrito);

/* actualizar nodos */
//*1er paso:identificar el nodo que quiero cambiar para tomarlo (getElement o QuerySelector y modificarlo con un inner.HTML)*//

var resultadoQueCambia = document.getElementById("resultado")
resultadoQueCambia.innerHTML = "salu2"