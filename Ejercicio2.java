
/*
EJERCICIO 2:  Encontrar el Máximo Común Divisor
(MCD) entre 2 enteros positivos
POR: Fiorela Clariza Quispe Quispe
*/
import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m, n, menor, mcd = 1, i = 1;
        do {
            System.out.print("Ingrese un número: ");
            m = scan.nextInt();
            System.out.print("Ingrese un número: ");
        n = scan.nextInt();
        } while (m<0 || n<0);
        menor = Math.min(m, n);
        while (i <= menor) {
            if (m % i == 0 && n % i == 0)
                mcd = i;
            i++;
        }
        System.out.println("El MCD es: " + mcd);
        scan.close();
    }
}