package com.letscode.model;

import com.letscode.enums.TipoTelefone;

public class Telefone {
    private TipoTelefone tipo;
    private String ddi;
    private String ddd;
    private String numero;
    private String ramal;
    private String contato;

    public Telefone(TipoTelefone tipo, String ddd, String numero) {
        this(tipo, "", ddd, numero, "", "");
    }

    public Telefone(TipoTelefone tipo, String ddd, String numero, String contato) {
        this(tipo, "", ddd, numero, "", contato);
    }

    public Telefone(TipoTelefone tipo, String ddi, String ddd, String numero, String ramal, String contato) {
        this.tipo = tipo;
        this.ddi = ddi;
        this.ddd = ddd;
        this.numero = numero;
        this.ramal = ramal;
        this.contato = contato;
    }

    public TipoTelefone getTipo() {
        return tipo;
    }

    public void setTipo(TipoTelefone tipo) {
        this.tipo = tipo;
    }

    public String getDdi() {
        return ddi;
    }

    public void setDdi(String ddi) {
        this.ddi = ddi;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getRamal() {
        return ramal;
    }

    public void setRamal(String ramal) {
        this.ramal = ramal;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
}
