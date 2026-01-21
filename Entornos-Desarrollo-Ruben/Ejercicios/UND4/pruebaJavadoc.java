// 17. Revertir una cadena
// Crea una función llamada revertirCadena que reciba una cadena de texto
// y devuelva la misma cadena con los caracteres en orden inverso.

package und4.Ejercicios.und3;

public class pruebaJavadoc {
    /**
     * Método que invierte una cadena de texto que le pases
     * <p>Esto es un ejemplo para generar documentacion en html</p>
     * @param texto Texto que quieres invertir
     * @return ejemplo cambiado 
     */
    public static String revertirCadenaTexto(String texto) {
        String textoRevertido="";
        texto=texto.trim();

        for (int i = texto.length()-1; i >= 0; i--) {
            char letra=texto.charAt(i);
            textoRevertido+=letra;
        }
        return textoRevertido ;
    }
    public static void main(String[] args) {
        String cadenaInvertir="Hola Ruben";
        System.out.println(revertirCadenaTexto(cadenaInvertir));
    }
}