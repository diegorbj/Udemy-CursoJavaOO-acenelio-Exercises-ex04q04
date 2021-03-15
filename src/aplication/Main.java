package aplication;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            if (n2 == 0) {
                System.out.println("Divisão impossível!");
            } else {
                double quociente = (double) n1 / n2;
                System.out.printf("%.1f%n", quociente);
            }
        }

        sc.close();
    }
}
