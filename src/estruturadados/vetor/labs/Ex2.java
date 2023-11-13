package estruturadados.vetor.labs;

// Melhore a classe Lista e implemente o método ultimoIndice,
// semelhante ao método lastIndexOf da classe Arraylist.

import estruturadados.vetor.Lista;

public class Ex2 {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<String>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");

        System.out.println(lista.ultimoIndice("A"));

    }
}
