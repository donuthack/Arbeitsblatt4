/*
Lassen Sie alle Teiler einer einzulesenden ganzen Zahl ausgeben.Benutzen Sie auch hier eine Division mit ganzzahligem Ergebnis. Beispiel: 8 hat die Teiler 1, 2, 4, 8 in Java und ohne Bibliotek
*/
public class TeilerProgramm {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Geben Sie eine ganze Zahl ein: ");
        int zahl = scanner.nextInt();

        System.out.println("Teiler von " + zahl + ":");

        for (int teiler = 1; teiler <= zahl; teiler++) {
            if (zahl % teiler == 0) {
                System.out.println(teiler);
            }
        }
    }
}
