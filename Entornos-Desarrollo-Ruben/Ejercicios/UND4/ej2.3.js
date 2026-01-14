// function h(x) {
// let t = 0
// for (let i = 0; i < x.length; i++) {
// t = t + x[i]
// }
// return t / x.length
// }

/**
 * 
 * @param {number} arrayNumerosAleatorios 
 * @returns 
 */
function promedioArray(arrayNumerosAleatorios) {
    let sumaTotalNumeroArray = 0
    for (let i = 0; i < arrayNumerosAleatorios.length; i++) {
        sumaTotalNumeroArray+= arrayNumerosAleatorios[i]
    }
    return sumaTotalNumeroArray / arrayNumerosAleatorios.length
}