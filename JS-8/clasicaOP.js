// CLASICA
// definir abstraccion como una clase
class OperacionesAritmeticas {
    numero0 = 0;
    numero1 = 1;

constructor (valor0, valor1){
this.numero0 = valor0;
this.numero1 = valor1;
}

// sin el constructor declarado:
/*
sumar(a + b){
    return a +b 
}

*/
    sumar(){
        return this.numero0 + this.numero1;

    }
}

//con el constructor declarado
let obj4 = new OperacionesAritmeticas(8,6);
console.log(obj4.sumar());


//forma 1
let obj3 = new OperacionesAritmeticas();
obj3.numero0 = 8;
obj3.numero1 = 5;
console.log(obj3.sumar(obj3.numero0,obj3.numero1));

//forma2
let obj2 = new OperacionesAritmeticas();
console.log(obj2.sumar(5,6));

//forma3
// Instancia:
//declaracion de el objeto
let obj1
//Crear el objeto
obj1 = new OperacionesAritmeticas(); //palabra reservada new permite crear el objeto
//Invocacion
console.log(obj1.numero0);

