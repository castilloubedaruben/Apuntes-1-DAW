package und4.Ejercicios.UND1;

import java.util.Scanner;

public class pt1ShushiO {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int totalPedidos, totalArroz, contador=0;
        double totalAgua;
        final int PRECIOMAKI = 8, PRECIONIGIRI=10, PRECIOSASHIMI=12;
        final int GASTOARROZMAKI=120, GASTOARROZNIGIRI=50, GASTOARROZSASHIMI=0;
        final double GASTOAGUAMAKI=0.10, GASTOAGUANIGIRI=0.05, GASTOAGUASASHIMI=0.02;
        String tipoPlatoElegido;
        int numeroUnidadesPedidas, precioPedido, totalArrozPedidoGastado;
        double totalAguaPedidoGastada;
        


        System.out.println("Indique el numero de pedidos");
        totalPedidos=scanner1.nextInt();
        System.out.println("Indique cantidad de arroz");
        totalArroz=scanner1.nextInt();
        System.out.println("Indique cantidad litros de agua");
        totalAgua=scanner1.nextDouble();

        System.out.println("Numero de pedidos: " + totalPedidos + "\nStock de arroz(g): " + totalArroz + "\nStock de agua(L): " + totalAgua);

        System.out.println("Elige un plato: Maki, Nigiri, Sashimi");
        tipoPlatoElegido=scanner1.nextLine();
        System.out.println("Elige numero de unidades");
        numeroUnidadesPedidas=scanner1.nextInt();

        if (tipoPlatoElegido.equals("maki")) {
            precioPedido=numeroUnidadesPedidas*PRECIOMAKI;
            totalArrozPedidoGastado=numeroUnidadesPedidas*GASTOARROZMAKI;
            totalAguaPedidoGastada=numeroUnidadesPedidas*GASTOAGUAMAKI;
            contador++;
        } else if (tipoPlatoElegido.equals("nigiri")) {
            precioPedido=numeroUnidadesPedidas*PRECIONIGIRI;
            totalArrozPedidoGastado=numeroUnidadesPedidas*GASTOARROZNIGIRI;
            totalAguaPedidoGastada=numeroUnidadesPedidas*GASTOAGUANIGIRI;
            contador++;
        } else {
            precioPedido=numeroUnidadesPedidas*PRECIOSASHIMI;
            totalArrozPedidoGastado=numeroUnidadesPedidas*GASTOARROZSASHIMI;
            totalAguaPedidoGastada=numeroUnidadesPedidas*GASTOAGUASASHIMI;
            contador++;
        }
        System.out.println("---- Pedido " +contador+ "----\nTipo de plato:" + tipoPlatoElegido +"\nUnidades:" + numeroUnidadesPedidas +);
    }
}
