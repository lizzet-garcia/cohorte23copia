
//OTRA FORMA DE ACCEDER AL ATRIBUTO

//superclase object

class Persona {

    constructor(nombre, apellido) {
        this._nombre = nombre; // "_" diferencia, este se refiere al metodo de la clase
        this._apellido = apellido;  // sin el guion bajo es solo el nombre del metodo

    }
    set nombre(nombre) { //metodo set accede al nombre
        this._nombre = nombre;
    }
    get nombre() { //metodo get obtiene el nombre
        return this._nombre;
    }

    set apellido(apellido) {
        this._apellido = apellido;
    }
    get apellido() {
        return this._apellido;
    }

    nombreCompleto() {
        return this._nombre + ' ' + this._apellido;
    }

    //sobreescribir el metodo de la clase padre object
    toString() {
        return this.nombreCompleto();
    }
}

//subclase
//EXTENDS HACE LA HERENCIA
class Empleado extends Persona {
    constructor(nombre, apellido, departamento) {
        super(nombre, apellido)
        this._departamento = departamento;
    }
    set departamento(departamento) {
        this._departamento = departamento;
    }
    get departamento() {
        return this._departamento;
    }
    //sobreescritura redefinir un metodo en una subclase
    nombreCompleto() {
        return super.nombreCompleto() + '' + this._departamento;
    }
}

let persona1 = new Persona('Maria', 'Sanchez');
console.log(persona1.nombreCompleto());

console.log(persona1.toString()); //metodo toString en clase padre. POLIMORFISMO

let empleado1 = new Empleado('Maria', 'Perez', 'Sistemas');
console.log(empleado1);
console.log(empleado1.nombreCompleto());

console.log(empleado1.toString()); //metodo toString en clase hija. POLIMORFIRSMO: reutilizar el metodo













/*
//crear el objeto
let Persona3 = new Persona ('Jhonny', 'Deep');

Persona3.nombre = 'Juan'  //  (reasignando pra que diga Juan)
console.log(Persona3.nombre);

persona3.apellido = 'Jimenez';  //reasignando pra que diga Jimenez
console.log(persona3._apellido)
*/