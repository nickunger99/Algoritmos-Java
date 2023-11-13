package estruturadados.vetor.teste;

import estruturadados.vetor.Vetor;
import estruturadados.vetor.VetorObjetos;

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
        vetor2.adiciona(0, "A");
        System.out.println(vetor2);
        System.out.println("tamanho: " + vetor2.tamanho());
        vetor2.adiciona(3, "D");
        System.out.println(vetor2);
        System.out.println("tamanho: " + vetor2.tamanho());


        System.out.println("---------------------");
        System.out.println("Vetor Objetos");

        VetorObjetos vetorObjetos = new VetorObjetos(3);

        Contato c1 = new Contato("Contato 1", "1234-5678", "conato1@email.com");
        Contato c2 = new Contato("Contato 2", "2234-5678", "conato2@email.com");
        Contato c3 = new Contato("Contato 3", "3234-5678", "conato3@email.com");

        Contato c4 = new Contato("Contato 1", "1234-5678", "conato1@email.com");
        vetorObjetos.adiciona(c1);
        vetorObjetos.adiciona(c2);
        vetorObjetos.adiciona(c3);

        System.out.println("Tamanho = " + vetorObjetos.tamanho());
        int pos = vetorObjetos.busca(c4);
        if (pos > -1) {
            System.out.println("Elemento existe no vetor");
        } else {
            System.out.println("Elemento não existe no vetor");
        }

        System.out.println(vetorObjetos);
    }
}
