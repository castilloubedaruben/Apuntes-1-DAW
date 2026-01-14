// function f(a,b,c){
// let r=0
// if(a>0){
// if(b>0){
// r=a+b
// }else{
// r=a-c
// }
// }else{
// if(c>0){
// r=b+c
// }else{
// r=0
// }
// }
// return r
// }

function suma(numero1, numero2, numero3) {
    let resultado = 0
    if (numero1 > 0) {
        if (numero2 > 0) {
            resultado = numero1 + numero2
        } else {
            resultado = numero1 - numero3
        }
    } else {
        if (numero3 > 0) {
            resultado = numero2 + numero3
        } else {
            resultado = 0
        }
    }
    return resultado
}
