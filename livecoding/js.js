let miArreglo = ["David", "Juan", "Pedro"]
const lista = document.querySelector("ul");

const fragment = document.createDocumentFragment();



function imprimir (array){
    array.forEach((a) => {
        const li = document.createElement("li");
        li.textContent = a;
        fragment.appendChild(li);
      });
      lista.appendChild(fragment);
}

imprimir(miArreglo)