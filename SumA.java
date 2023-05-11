/*
Lassen Sie den Rechner die Summe der folgenden Zahlen bis zu einem Grenzwert g berechnen und geben Sie die Anzahl der benötigten Glieder aus.
Z.B. Berechnung der Summe 1+2+3+4.. bus zum Grenzwert. Grenzwert:16
Nach 6 Gliedern ist 16 erreicht. Die Summe ist 21.
*/
public class SumA {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Geben Sie den Grenzwert ein: ");
        int grenzwert = scanner.nextInt();

        int summe = 0;
        int glieder = 0;

        while (summe <= grenzwert) {
            glieder++;
            summe += glieder;
        }

        System.out.println("Nach " + glieder + " Gliedern ist " + grenzwert + " erreicht.");
        System.out.println("Die Summe ist " + summe + ".");
    }
}
