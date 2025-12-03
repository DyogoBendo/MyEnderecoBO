package unioeste.geral.endereco.bo;

import java.io.Serializable;

public class Logradouro implements Serializable {
    private Long id;
    private String nome;
    private TipoLogradouro tipologradouro;

    public Logradouro() {
    }

    public Logradouro(Long id, String nome, TipoLogradouro tipologradouro) {
        this.id = id;
        this.nome = nome;
        this.tipologradouro = tipologradouro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
