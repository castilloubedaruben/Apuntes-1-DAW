//@ts-check

// function getAverage(numbers) {
// let total = 0
// for (let i = 0; i < numbers.length; i++) {
// total += numbers[i]
// }
// return total / numbers.length
// }

/**
 * 
 * @param {number[]} arrayNumeros 
 * @returns 
 */
function promedio(arrayNumeros) {
    let totalSumaArray = 0
    for (let i = 0; i < arrayNumeros.length; i++) {
        totalSumaArray += arrayNumeros[i]
    }
    return totalSumaArray / arrayNumeros.length
}

