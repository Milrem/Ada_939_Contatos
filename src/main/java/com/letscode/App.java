package com.letscode;

import com.letscode.enums.TipoContato;
import com.letscode.model.Contato;
import com.letscode.model.Telefone;

public class App {
    public static void main(String[] args) {
        System.out.println("Rodou!");

        Contato jose = new Contato("José", "Maria");
        jose.setNome("José");
        jose.setSobrenome("Maria");
        jose.setTipo(TipoContato.Pessoal);

        Contato maria = new Contato("Maria", TipoContato.Profissional);
        maria.setNome("José");
        maria.setSobrenome("Maria");
        maria.setTipo(TipoContato.Profissional);

        Contato copia = new Contato("copia", new Telefone());


        Integer n1 = 2;
        Integer n2 = 2;

        System.out.println("Contato José: " + jose);
        System.out.println("Contato Maria: " + maria);
        System.out.println("Contato Cópia: " + copia);
        System.out.println("José == Maria:" + jose.equals(maria));

        System.out.println("n1 == n2:" + n1.equals(n2));

        System.out.println("|" + jose.getNomeCompleto() + "|");
        System.out.println("|" + maria.getNomeCompleto() + "|");
        System.out.println("|" + copia.getNomeCompleto() + "|");

    }
}
