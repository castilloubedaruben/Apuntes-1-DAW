//@ts-check

// function k(a, b, c) {
// if (a === b || a === c || b === c) {
// return false
// }
// if (a > b && a > c) {
// return a
// }
// if (b > a && b > c) {
// return b
// }
// return c
// }


/**
 * 
 * @param {number} primerValor 
 * @param {number} segundoValor 
 * @param {number} tercerValor 
 * @returns 
 */
function compararValores(primerValor, segundoValor, tercerValor) {
    if (primerValor === segundoValor || primerValor === tercerValor || segundoValor === tercerValor) {
        return false
    } else if (primerValor > segundoValor && primerValor > tercerValor) {
        return primerValor
    } else if (segundoValor > primerValor && segundoValor > tercerValor) {
        return segundoValor
    } else {
        return tercerValor
    }
}

let resultado=compararValores(10,8,9)
console.log(resultado); 

