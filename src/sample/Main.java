package sample;

import sample.controller.Tabuleiro;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> nomes =
                new ArrayList<>();
        nomes.add("Manu");
        nomes.add("João");
        nomes.add("Luana");
        nomes.add("Sofia");
        nomes.add("Cezar");
        nomes.add("Emili");
        nomes.add("Kauan");

        Tabuleiro tabuleiro =
                new Tabuleiro(nomes);

        tabuleiro.jogar();
        System.out.println(tabuleiro);

    }
}