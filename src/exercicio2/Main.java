package exercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int porcentagem = sc.nextInt();


        for(int i = 0; i < porcentagem; i++) {
            System.out.print("/");
        }
    }
}
