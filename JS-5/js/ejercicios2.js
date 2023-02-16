//1 reducir
if (GPAacumulativo > 2.0) {
    if (unidadesTotales >= 120) {
        console.log("puede graduarse")
    }
}


// respuesta 1, solo esta reducido pero la variable no la declare
if (GPAacumulado > 2.0 && unidadesTotales >= 120) {
    console.log("puede graduarse")
}

//2 reducir
if (Calificacion >= 75) {
    console.log("eres elegible")
}
if (progCalificacion >= 75) {
    console.log("elegible")
}

// respuesta 2 solo esta reducida pero la variable no la declare

if (Calif >= 75 || proCalif >= 75) {
    console.log("elegible")
}

// 3 respuesta
let texto = "Hola Mundo"
let mensaje = ".";

for (let index = 0; index < texto.length; index++) {
    mensaje += texto[index] + ".";
    
}

console.log(mensaje);

// otra solucion:
let texto2 = "Hola Mundo";
let palabras = texto2.split(" "); // dividir en palabras
for (let i = 0; i < palabras.length; i++) {
  palabras[i] = palabras[i].split("").join("."); // agregar puntos a cada palabra
}
texto2 = palabras.join(" "); // unir las palabras en un solo string
console.log(texto2);
