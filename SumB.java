/*
Lassen Sie den Rechner die Summe der folgenden Zahlen bis zu einem Grenzwert g berechnen und geben Sie die Anzahl der benötigten Glieder aus.
Der Formular: 1-2+3-4+5-...+(2n+1)-2n..
*/

import java.util.Scanner;

public class SumB {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Geben Sie den Grenzwert ein: ");
        int grenzwert = scanner.nextInt();
        int g = 1;

        int i;

        System.out.print("Rechenweg: " + g);

        for (i = 2; g < grenzwert; i++)

        {

            if(i%2 == 0)

            {

                System.out.print(" - " + i);

                g -= i;

            }

            else

            {

                System.out.print(" + " + i);

                g += i;

            }

        }

        System.out.println("\nSumme: " + g + "; Glieder: " + (i-1));
    }
}
