package unioeste.geral.endereco.bo;

import java.io.Serializable;

public class Endereco implements Serializable {
    private String codigo;
    private String cep;
    private Cidade cidade;
    private Bairro bairro;
    private Logradouro logradouro;

    public Endereco() {
    }

    public Endereco(String codigo, String cep, Cidade cidade, Bairro bairro, Logradouro logradouro) {
        this.codigo = codigo;
        this.cep = cep;
        this.cidade = cidade;
        this.bairro = bairro;
        this.logradouro = logradouro;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public Logradouro getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(Logradouro logradouro) {
        this.logradouro = logradouro;
    }
}
