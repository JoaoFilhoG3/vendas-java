package vendas.model;

public class Fornecedor {

    private int codFor;
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private String telefone;

    public Fornecedor() {
    }

    public Fornecedor(int codFor, String nomeFantasia, String razaoSocial, String cnpj, String telefone) {
        this.codFor = codFor;
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.telefone = telefone;
    }

    public int getCodFor() {
        return codFor;
    }

    public void setCodFor(int codFor) {
        this.codFor = codFor;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
