//prueba efectiva

//const indexTest = require ("../calculadora"); ecma5

import { indexTest } from "../calculadora"; //ecma 6
test('test suma', () => {
    // second 
const r = indexTest.suma(1,2);
expect (r).toBe(3);
})

test.todo('test resta'); 
test.todo('test multi');
test.todo ('test divide');