package vendas.model;

public class Cliente {

    private int codCli;
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;
    private String rg;
    
    public Cliente(){
        
    }    
    
    public Cliente(int codCli, String nome,
            String endereco, String telefone,
            String cpf, String rg) {
        this.codCli = codCli;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.rg = rg;

    }

    public int getCodCli() {
        return this.codCli;
    }

    public void setCodCli(int codCli) {
        this.codCli = codCli;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

}
