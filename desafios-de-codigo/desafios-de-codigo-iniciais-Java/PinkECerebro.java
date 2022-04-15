import java.util.Scanner;

public class PinkECerebro {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();

        int multiplosDe2 = 0, multiplosDe3 = 0, multiplosDe4 = 0, multiplosDe5 = 0;

        for (int i = 0; i < n; i++) {
            int li = teclado.nextInt();
            if (li % 2 == 0) {
                multiplosDe2++;
            }
            if (li % 3 == 0) {
                multiplosDe3++;
            }
            if (li % 4 == 0) {
                multiplosDe4++;
            }
            if (li % 5 == 0) {
                multiplosDe5++;
            }
        }

        System.out.printf("%d Multiplo(s) de 2\n", multiplosDe2);
        System.out.printf("%d Multiplo(s) de 3\n", multiplosDe3);
        System.out.printf("%d Multiplo(s) de 4\n", multiplosDe4);
        System.out.printf("%d Multiplo(s) de 5\n", multiplosDe5);

    teclado.close();
    }
}