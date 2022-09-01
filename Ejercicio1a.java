/*
EJERCICIO 1:  Generar la tabla de precios de telas:
POR: Fiorela Clariza Quispe Quispe
*/

public class Ejercicio1a {
    public static void main(String[] args) {
        for (int i = 10; i <= 20; i++) {
            
            for (int j = 5; j <= 25; j += 5) {
                if (j == 5) {
                    System.out.print(i + "\t");
                    int operacion = j * 19 * i;
                    System.out.print(operacion + "\t");
                    continue;
                }
                if (i == 10) {
                    System.out.print(j + "\t");
                    continue;
                }
                int operacion = j * 19 * i;
                System.out.print(operacion + "\t");
            }
            System.out.println(i);

        }

    }
}