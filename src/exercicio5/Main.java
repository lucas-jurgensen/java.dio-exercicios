package exercicio5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Multa multado = new Multa();

        int velocidade = sc.nextInt();
        multado.verificarMulta(velocidade);
    }
}
