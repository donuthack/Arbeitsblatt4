/*
Schreiben Sie ein Programm, dass die Seitenläge  eines Quadrats erfragt und dann im Textmodus ein Quadrat dieser Größe ausgibt in Java
*/
public class QuadratProgramm {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Geben Sie die Seitenlänge des Quadrats ein: ");
        int seitenlänge = scanner.nextInt();

        for (int i = 0; i < seitenlänge; i++) {
            for (int j = 0; j < seitenlänge; j++) {
                if (i == 0 || i == seitenlänge - 1 || j == 0 || j == seitenlänge - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
