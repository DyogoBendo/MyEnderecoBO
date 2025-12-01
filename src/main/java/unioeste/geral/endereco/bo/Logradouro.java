package unioeste.geral.endereco.bo;

import java.io.Serializable;

public class Logradouro implements Serializable {
    private String codigo;
    private String nome;
    private TipoLogradouro tipologradouro;

    public Logradouro() {
    }

    public Logradouro(String codigo, String nome, TipoLogradouro tipologradouro) {
        this.codigo = codigo;
        this.nome = nome;
        this.tipologradouro = tipologradouro;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoLogradouro getTipologradouro() {
        return tipologradouro;
    }

    public void setTipologradouro(TipoLogradouro tipologradouro) {
        this.tipologradouro = tipologradouro;
    }
}
