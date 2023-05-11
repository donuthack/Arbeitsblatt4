/*
Das Produkr zweiner ganzer Zahlen ist mithilfe der Addition zu berechnen. Beachten Sie, dass die Zahlen auch 0 oder negativ sein können 
*/
public class ProduktProgramm {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Multiplikator: ");
        int zahl1 = scanner.nextInt();

        System.out.print("Multiplikand: ");
        int zahl2 = scanner.nextInt();

        int produkt = 0;

        if (zahl1 != 0 && zahl2 != 0) {
            int faktor1 = Math.abs(zahl1);
            int faktor2 = Math.abs(zahl2);

            for (int i = 0; i < faktor2; i++) {
                produkt += faktor1;
            }

            if ((zahl1 < 0 && zahl2 > 0) || (zahl1 > 0 && zahl2 < 0)) {
                produkt = -produkt;
            }
        }

        System.out.println("Das Produkt ist " + produkt);
    }
}
