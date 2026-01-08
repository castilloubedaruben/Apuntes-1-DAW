// Calculadora de Peso en la Luna
// Pide el peso del usuario y calcula cuánto pesaría en la Luna (aproximadamente el 16.5% de su peso en la Tierra).

// let pesoEnLaTierra = prompt("Introduzca su peso: ")
// pesoEnLaTierra = Number(pesoEnLaTierra)

// let pesoEnLaLuna = pesoEnLaTierra * 0.165 // 16.5 / 100 = 0.165

// console.log("En la Luna pesarías: " + pesoEnLaLuna + "kg")

import java.util.Scanner;

public class PesoLuna {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Introduce tu peso");
        int peso = scanner1.nextInt();
        System.out.println("Tu peso es: " + peso);
        scanner1.close();

        final double PESOENLUNA = (peso * 0.165);

        System.out.println("Tu peso en la luna es de " + PESOENLUNA);
    }
}