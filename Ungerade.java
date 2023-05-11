/*
Lassen Sie den Computer die ungeraden Zahlen zwischen zwei einzugebenden Werten ausdrucken
*/
public class UngeradeZahlenProgramm {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Geben Sie den Startwert ein: ");
        int startwert = scanner.nextInt();

        System.out.print("Geben Sie den Endwert ein: ");
        int endwert = scanner.nextInt();

        System.out.println("Ungerade Zahlen zwischen " + startwert + " und " + endwert);

        // Überprüfung und Ausgabe der ungeraden Zahlen
        for (int zahl = startwert + 1; zahl < endwert; zahl++) {
            if (zahl % 2 != 0) {
                System.out.println(zahl);
            }
        }
    }
}
