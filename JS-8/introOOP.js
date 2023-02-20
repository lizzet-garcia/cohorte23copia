//PROTOTIPOS

let persona = {
    nombre : "Juan", //atributos del objeto
    apellido : "Perez",
    nombreCompleto : function (){ // tambien puede tener functions o metodos
        return 'el nombre es ' + this.nombre + '' + this.apellido  //this es una palabra reservada
    }
}
console.log(persona);
console.log(persona.nombre);
console.log(persona.nombreCompleto());
