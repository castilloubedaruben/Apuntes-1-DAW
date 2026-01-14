//@ts-check

// function findUser(users, name) {
// let result = null
// for (let i = 0; i < users.length; i++) {
// if (users[i].name === name) {
// result = users[i]
// }
// }
// return result
// }

/**
 * 
 * @param {string[]} arrayUsers 
 * @param {string} nombre 
 * @returns {null|string} 
 */
function buscarUsuario(arrayUsers, nombre) {
    let resultadoBusqueda = null
    for (let i = 0; i < arrayUsers.length; i++) {
        if (arrayUsers[i].nombre === nombre) {
            resultadoBusqueda = arrayUsers[i]
        }
    }
    return resultadoBusqueda
}