package Pessoas;
public class Administrador extends Pessoa {
    protected String cnpj;


    public Administrador(String nome, String senha, String perfil) {
        super(nome, senha, perfil);
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    

}

