/*
Lassen Sie eine beliebige Anzahl von Zahlen addieren, bis die Zahl 0 eingegeben wird.Danach wird die Gesamtsumme und der Durchschnitt 
ausgegeben in Java mit keine Bibliotek. Z.B. der erste Zahl ist 1.5, die nexte 3, die nexte 1.5 und die letzte 0. Dann muss geht die 
Summe von diesem Zahlen und dann - Durchschnitt
*/
public class ZahlenAddierenProgramm {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        double summe = 0;
        int anzahl = 0;

        System.out.println("Geben Sie die Zahlen ein (Ende mit 0):");

        while (true) {
            double zahl = scanner.nextDouble();

            if (zahl == 0) {
                break;
            }

            summe += zahl;
            anzahl++;
        }

        double durchschnitt = summe / anzahl;

        System.out.println("Summe: " + summe);
        System.out.println("Durchschnitt: " + durchschnitt);
    }
}
