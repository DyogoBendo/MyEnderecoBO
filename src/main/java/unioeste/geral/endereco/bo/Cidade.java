package unioeste.geral.endereco.bo;

import java.io.Serializable;

public class Cidade implements Serializable {
    private String codigo;
    private String nome;
    private UnidadeFederativa unidadeFederativa;

    public Cidade() {
    }

    public Cidade(String codigo, String nome, UnidadeFederativa unidadeFederativa) {
        this.codigo = codigo;
        this.nome = nome;
        this.unidadeFederativa = unidadeFederativa;
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

    public UnidadeFederativa getUnidadeFederativa() {
        return unidadeFederativa;
    }

    public void setUnidadeFederativa(UnidadeFederativa unidadeFederativa) {
        this.unidadeFederativa = unidadeFederativa;
    }
}
