// los === son muy importantes porque si solo pongo uno, solo estoy asignando, y yo necesito comparar estrictamente.

let diaDeLaSemana = parseInt(prompt("Escribe un numero"));
if (diaDeLaSemana === 1) {
    document.write("Lunes");
} else if (diaDeLaSemana === 2) {
    document.write("Martes");
} else if (diaDeLaSemana === 3) {
    document.write("Miercoles");
} else if (diaDeLaSemana === 4) {
    document.write("Jueves");
} else if (diaDeLaSemana === 5) {
    document.write("Viernes");
} else if (diaDeLaSemana === 6) {
    document.write("Sabado");
} else if (diaDeLaSemana === 7) {
    document.write("Domingo");
} else {
    document.write("Numero de dia Invalido");
}



