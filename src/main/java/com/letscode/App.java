package com.letscode;

import com.letscode.enums.TipoContato;
import com.letscode.model.Contato;

public class App {
    public static void main(String[] args) {
        System.out.println("Rodou!");

        Contato jose = new Contato();
        jose.nome = "José";
        jose.sobrenome = "Maria";
        jose.tipo = TipoContato.Pessoal;

        Contato maria = new Contato();
        maria.nome = "José";
        maria.sobrenome = "Maria";
        maria.tipo = TipoContato.Profissional;

        Contato copia = jose;

        Integer n1 = 2;
        Integer n2 = 2;

        System.out.println("Contato José: " + jose);
        System.out.println("Contato Maria: " + maria);
        System.out.println("Contato Cópia: " + copia);
        System.out.println("José == Maria:" + jose.equals(maria));

        System.out.println("n1 == n2:" + n1.equals(n2));

    }
}
