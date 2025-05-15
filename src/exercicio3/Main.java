package exercicio3;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Contador contador = new Contador();
        int paginas = sc.nextInt();
        int resultado = Contador.contadorDePaginas(paginas);

        System.out.println(resultado + " dias");
    }
}
