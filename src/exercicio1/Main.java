package exercicio1;

import java.util.Scanner;

// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int meses = sc.nextInt();
        int mesada = 50;

        int mesadaTotal = meses * mesada;
        // System.out.println("Voce tera " + mesadaTotal + " reais");
        System.out.println(mesadaTotal);

    }
}

