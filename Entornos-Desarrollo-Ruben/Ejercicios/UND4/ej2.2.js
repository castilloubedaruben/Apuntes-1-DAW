// function g(a, b) {
// let r = []
// for (let i = 0; i < a.length; i++) {
// if (a[i] > b) {
// r.push(a[i])
// }
// }
// return r
// }

/**
 * 
 * @param {number} primerArray 
 * @param {number} valorAComparar 
 * @returns {Array}
 */
function creacionNuevoArray(primerArray, valorAComparar) {
    let nuevoArray = [];
    for (let i = 0; i < primerArray.length; i++) {
        if (primerArray[i] > valorAComparar) {
            nuevoArray.push(primerArray[i]);
        }
    }
    return nuevoArray;
}
