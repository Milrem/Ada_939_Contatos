package com.letscode.model;

import com.letscode.enums.TipoContato;

import java.util.List;
import java.util.Objects;

public class Contato {
    String nome;
    String sobrenome;
    TipoContato tipo;

    List<Telefone> telefones;
    List<Endereco> enderecos;

//    @Override
//    public String toString() {
//        return "Contato{" +
//                "nome='" + nome + '\'' +
//                ", sobrenome='" + sobrenome + '\'' +
//                '}';
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(nome, contato.nome) && Objects.equals(sobrenome, contato.sobrenome) && tipo == contato.tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, sobrenome, tipo);
    }
}
