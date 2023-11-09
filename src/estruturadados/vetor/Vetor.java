package estruturadados.vetor;

public class Vetor {

    private String[] elementos;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        System.out.println("capacidade do vetor: " + elementos.length);
    }

}
