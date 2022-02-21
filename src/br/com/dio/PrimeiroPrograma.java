package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.setIdade(45);
        gato.setCor("Azul");
        gato.setNome("Alfredo");
        System.out.println(gato);

        Gato gato2 = new Gato("rapha","Azul",20);
        System.out.println(gato2);

        Livro livro1 = new Livro("Pense como um gato", 300);
        System.out.println(livro1);
        /*int a = 5;
        int b = 4;
        System.out.println("A soma e: " + (a+b));*/
    }
}

class Livro {
    private String nome;
    private Integer NumPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        NumPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return NumPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        NumPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", NumPaginas=" + NumPaginas +
                '}';
    }
}
