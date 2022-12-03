package com.letscode.model;

import com.letscode.enums.TipoContato;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Contato {
    private String nome;
    private String sobrenome;

    private TipoContato tipo;

    private List<Telefone> telefones;
    private List<Endereco> enderecos;

    public Contato(String nome) {
        this(nome, "", TipoContato.Pessoal);
    }

    public Contato(String nome, String sobrenome) {
        this(nome, sobrenome, TipoContato.Pessoal);
    }

    public Contato(String nome, TipoContato tipo) {
        this(nome, "", tipo);
    }

    public Contato(String nome, String sobrenome, TipoContato tipo) {
        this.nome = nome;
        this.tipo = tipo;
        this.sobrenome = sobrenome;
        this.telefones = new ArrayList<>();
        this.enderecos = new ArrayList<>();
    }

    public Contato(String nome, Telefone telefone) {
        this(nome);
        this.telefones.add(telefone);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public TipoContato getTipo() {
        return tipo;
    }

    public void setTipo(TipoContato tipo) {
        this.tipo = tipo;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public String getNomeCompleto() {
        String valor = nome;
        if (!sobrenome.isBlank()) {
            valor += " " + sobrenome;
        }
        return valor.trim();
    }

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

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                '}';
    }

}
