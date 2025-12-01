package unioeste.geral.endereco.bo;


import java.io.Serializable;

public class UnidadeFederativa implements Serializable {
    private String codigo;
    private String nome;
    private String sigla;

    public UnidadeFederativa() {
    }

    public UnidadeFederativa(String codigo, String nome, String sigla) {
        this.codigo = codigo;
        this.nome = nome;
        this.sigla = sigla;
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

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
}
