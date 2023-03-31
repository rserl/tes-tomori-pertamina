import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int x = 0;
        int y = 1;
        int z = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan jumlah bilangan fibonacci = ");
        int jumlah = input.nextInt();

        for (int i = 0; i < jumlah; i++){
            System.out.print(x + " ");
            z = x + y;
            x = y;
            y = z;
        }
        System.out.println();
    }
}