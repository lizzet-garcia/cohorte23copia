let lista = [12,5,80,34,7];
//console.log (lista.length);

for(let i = 0; i < lista.length; i++ ){
    console.log(lista[i]);
   
}
console.log(lista);
 //..
let lista2 = [12,5,80,34,7];
let listaNueva = lista.slice (1, 4);
console.log (listaNueva);

//.. join agrega un elemento entre elementos
let lista3 = [12,5,80,34,7];
let msj = lista3.join ("-");
console.log (msj);

//.. push agrega elementos al final del arreglo original
let lista4 = [12,5,80,34,7];
lista4.push(100);
console.log(lista4);

//.. concat agrega elementos al final
let lista5 = [12,5,80,34,7];
let masE = lista5.concat(100,200,300);
console.log(masE);

//.. el pop quita el ultimo elemento
let lista6 = [12,5,80,34,7];
lista6.pop();
console.log(lista6);

//.. shift elimina el primero de la lista
let lista7 = [12,5,80,34,7];
lista7.shift();
console.log(lista7);

//.. splice agregar o remover un elemento en cualquier ubicacion del arreglo
let lista8 = [12,5,80,34,7];
let remover = lista8.splice (1,2);
console.log(remover);

console.log(lista8);

lista8.splice(2,0, 100,200,300);
console.log(lista8)

//.. reverse acomoda los objetos en sentido contrario
let lista9 = [12,5,80,34,7];
lista9.reverse();
console.log(lista9);

//..sort los ordena respecto al primer digito
let lista10 = [12,5,80,34,7];
lista10.sort();
console.log(lista10);

//..
let lista11 = [12,5,80,34,7];
lista11.sort (
    function(valor1,valor2){
        return valor1 > valor2; 
    }
);
console.log(lista11);
