package exercicio5;

public class Multa {

    public void verificarMulta(int velocidade) {
        if(velocidade <= 60) {
            System.out.println("Nao foi multado");
        } else {
            System.out.println("Foi multado");
        }
    }
}
