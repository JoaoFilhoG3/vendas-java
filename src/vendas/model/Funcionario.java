package vendas.model;

public class Funcionario {

    private int codFun;
    private String nome;
    private String telefone;
    private String cpf;
    private String rg;

    public Funcionario() {
    }

    public Funcionario(int codFun, String nome, String telefone, String cpf, String rg) {
        this.codFun = codFun;
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.rg = rg;
    }

    public int getCodFun() {
        return codFun;
    }

    public void setCodFun(int codFun) {
        this.codFun = codFun;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
