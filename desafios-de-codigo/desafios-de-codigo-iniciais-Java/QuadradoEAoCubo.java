import java.io.IOException;
import java.util.Scanner;

public class Problem {

 public static void main(String[] args) throws IOException {
        Scanner teclado= new Scanner(System.in);
        int N = teclado.nextInt();
        for (int i = 1; i <= N; i++) {
            int iAoQuadrado = (int) Math.pow(i,2);
            int iAoCubo = (int) Math.pow(i,4);
            System.out.println(i+ " " +(i*i)+ " " +(i*i*i));
        }
        teclado.close();
    }

}