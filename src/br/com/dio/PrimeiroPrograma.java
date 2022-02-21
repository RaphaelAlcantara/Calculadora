package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.setIdade(45);
        gato.setCor("Azul");
        gato.setNome("Alfredo");
        System.out.println(gato);

        Gato gato2 = new Gato();
        gato2.setNome("Jose");
        gato2.setCor("Azul");
        gato2.setIdade(15);
        System.out.println(gato2);
        /*int a = 5;
        int b = 4;
        System.out.println("A soma e: " + (a+b));*/
    }
}
