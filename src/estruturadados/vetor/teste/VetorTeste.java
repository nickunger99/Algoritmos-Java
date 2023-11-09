package estruturadados.vetor.teste;

import estruturadados.vetor.Vetor;

public class VetorTeste {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(20);

        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");
        vetor.adiciona("elemento 4");
        vetor.adiciona("elemento 5");
        vetor.adiciona("elemento 6");

        System.out.println(vetor.tamanho());

        System.out.println(vetor);

        System.out.println(vetor.busca(5));

        System.out.println(vetor.busca("elemento 1"));
    }
}
