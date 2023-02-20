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

//construimos funciones de calculadora
function suma (){
    let valor1 = parseInt(input1.value); //pido numero1 entero
    let valor2 = parseInt(input2.value); //pido num2 entero
    let suma = valor1 + valor2; // calculo suma
    resultado.innerHTML = suma; //pongo el resultado en su lugar

}

function resta (){
    let valor1 = parseInt(input1.value); //pido numero1 entero
    let valor2 = parseInt(input2.value); //pido num2 entero
    let resta = valor1 - valor2; // calculo 
    resultado.innerHTML = resta; //pongo el resultado en su lugar
}
function multiplicacion (){
    let valor1 = parseInt(input1.value); //pido numero1 entero
    let valor2 = parseInt(input2.value); //pido num2 entero
    let multiplicacion = valor1 * valor2; // calculo 
    resultado.innerHTML = multiplicacion; //pongo el resultado en su lugar
}
function division (){
    let valor1 = parseInt(input1.value); //pido numero1 entero
    let valor2 = parseInt(input2.value); //pido num2 entero
    let division = valor1 / valor2; // calculo 
    resultado.innerHTML = division; //pongo el resultado en su lugar
}

//EVENTO
/*como se crea evento que no esta en HTML: (addEventListener)
-node.addEventListener("evento a escuchar", lo que quiero que haga)
  -node (nodo donde aterrizo el evento)
  -addEventListener (palabra reservada para usar el evento)
  -evento a escuchar (click, mousover,etc)
   -lo que quiero que haga (la llamada de la funcion)

*/
botonSuma.addEventListener("click", suma);
botonResta.addEventListener("click", resta);
botonMultiplicacion.addEventListener("click", multiplicacion);
botonDivision.addEventListener("click", division);


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

/*
Manipulacion del DOM

-Metodos para acceder a elementos
document.getElementById
document.getElementByTagName
document.getElementByClassName

-Metodos para crear elementos
document.createElement(etiqueta)
document.creatTextNode(texto)

-Metodos para insertar elementos
(parentElement).append
(parentElement).insertBefore
(parentElement).insertAdjacentElement

-Metodos para modificar elementos
(node).outerHTML (para leer o referenciar el elemento)
(node).innerHTML (para modificar el elemento)
*/ 

/*evento: (pero se hizo tambien en el html en el boton suma)
primer paso: definir con que interactuar y almacenar en variable
 const textoAModificar = document.querySelector("#h1") 
*/

/*creo una funcion que cambia de color segun el color que le paso como parametro
function cambiarColor(color){
    textoAModificar.style.color=color;
}

*/