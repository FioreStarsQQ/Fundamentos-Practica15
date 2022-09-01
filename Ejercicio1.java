/*
EJERCICIO 1:  Generar la tabla de precios de telas...
POR: Fiorela Clariza Quispe Quispe
*/
public class Ejercicio1 {
    public static void main(String[] args) {
        for (int fila = 10; fila <= 20; fila++) {
            if (fila == 11) 
                System.out.print("\n");
            for (int columna = 5; columna <= 25; columna += 5) {
                if (fila == 10) {
                    System.out.print("\t" + columna);
                    continue;
                }
                if (columna == 5) {
                    System.out.print(fila + "\t");
                    int operacion = columna * 19 * fila;
                    System.out.print(operacion + "\t");
                    continue;
                }
                int operacion = columna * 19 * fila;
                System.out.print(operacion + "\t");
            }
            System.out.println("\t");
        }
    }
}