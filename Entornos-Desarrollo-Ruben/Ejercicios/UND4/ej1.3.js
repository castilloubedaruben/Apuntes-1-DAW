// function calc(x,y){
// let t=0
// for(let i=0;i<x.length;i++){
// if(x[i]>y){
// t=t+x[i]
// }
// }
// return t
// }


function calculoArray(primerArray, numeroUsuario) {
    let resultado = 0
    for (let i = 0; i < primerArray.length; i++) {
        if (primerArray[i] > numeroUsuario) {
            resultado = resultado + primerArray[i]
        }
    }
    return resultado
}
