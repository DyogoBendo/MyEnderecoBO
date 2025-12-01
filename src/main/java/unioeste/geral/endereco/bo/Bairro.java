package unioeste.geral.endereco.bo;

import java.io.Serializable;

public class Bairro implements Serializable {
    private String codigo;
    private String nome;

    public Bairro() {
    }

    public Bairro(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
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
}
