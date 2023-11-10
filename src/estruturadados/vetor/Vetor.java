package estruturadados.vetor;

import java.util.Arrays;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
        System.out.println("capacidade do vetor: " + elementos.length);
    }

//    public void adiciona(String elemento){
//        for (int i=0; i<this.elementos.length; i++){
//            if(this.elementos[i] == null){
//                this.elementos[i] = elemento;
//                System.out.println(this.elementos[i]);
//                break;
//            }
//        }
//    }

    public boolean adiciona(String elemento) {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            System.out.println(this.elementos[tamanho]);
            this.tamanho++;
            return true;
        }
        return false;
    }

    public boolean adiciona(int pos, String elemento) {

        if (!(pos >= 0 && pos < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        //move todos os elementos para o indice +1
        for (int i = this.tamanho - 1; i >= pos; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[pos] = elemento;
        this.tamanho++;


        return true;
    }

    public String busca(int pos) {
        if (!(pos >= 0 && pos < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[pos];
    }

    public int busca(String elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }
        s.append("]");


        return s.toString();
    }
}
