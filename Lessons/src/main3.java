import java.util.Scanner;
public class main3 {
    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);
        System.out.print("N: ");
        int n = in.nextInt();
        int [][] a = new int[n][n];
        int [][] b = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) (Math.random() * 100) + 1;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }
        b[0][0] = a[0][0];
        for (int i = 1; i < n; i++) {
            b[0][i] = a[0][i] + b[0][i-1];
        }
        for (int j = 1; j < n; j++) {
            b[j][0] = a[j][0] + b[j-1][0];
        }
        for(int i = 1; i < n; i++){
            for (int j = 1; j < n; j++) {
                if (b[i][j-1] > b[i-1][j]) b[i][j] = b[i][j-1] + a[i][j];
                else b[i][j] = b[i-1][j] + a[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d",b[i][j]);
            }
            System.out.println();
        }
        System.out.print("Max = " + b[n-1][n-1]);
    }
   /* static class robot {

    }*/
}