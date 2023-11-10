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
        
        Vetor vetor2 = new Vetor(3);
        
        vetor2.adiciona("B");
        vetor2.adiciona("C");
        //vetor2.adiciona("D");
        vetor2.adiciona("E");
        vetor2.adiciona("F");
        vetor2.adiciona("G");

        System.out.println(vetor2);
        System.out.println("tamanho: " + vetor2.tamanho());
        vetor2.adiciona(0,"A");
        System.out.println(vetor2);
        System.out.println("tamanho: " + vetor2.tamanho());
        vetor2.adiciona(3,"D");
        System.out.println(vetor2);
        System.out.println("tamanho: " + vetor2.tamanho());
    }
}
