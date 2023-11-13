package estruturadados.vetor.labs;

// Melhore a classe Lista e implemente o método contém,
// semelhante ao método contains da classe Arraylist.

import estruturadados.vetor.Lista;

public class Ex1 {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<String>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");

        System.out.println(lista.contem("A"));
        System.out.println(lista.contem("B"));
        System.out.println(lista.contem("T"));
    }
}
