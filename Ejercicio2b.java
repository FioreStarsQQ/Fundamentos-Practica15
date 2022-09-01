/*
EJERCICIO 2:  Encontrar el Máximo Común Divisor
(MCD) entre 2 enteros positivos
POR: Fiorela Clariza Quispe Quispe
*/
import java.util.*;

public class Ejercicio2b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m, n, menor, mayor, r;
        System.out.print("Ingrese un número: ");
        m = scan.nextInt();
        System.out.print("Ingrese un número: ");
        n = scan.nextInt();
        menor = Math.min(m, n);
        mayor = Math.max(m, n);
        do {
            r = mayor % menor;
            mayor = menor;
            menor = r;
        } while (menor != 0);
        System.out.println("El MCD es: " + mayor);
        scan.close();
    }
}