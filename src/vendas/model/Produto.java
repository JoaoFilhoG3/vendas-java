package vendas.model;

public class Produto {

    private int codPro;
    private String nome;
    private int codBarras;
    private double valor;
    private int estoque;
    private Fornecedor fornecedor;

    public Produto() {
    }

    public Produto(int codPro, String nome, int codBarras, double valor, int estoque, Fornecedor fornecedor) {
        this.codPro = codPro;
        this.nome = nome;
        this.codBarras = codBarras;
        this.valor = valor;
        this.estoque = estoque;
        this.fornecedor = fornecedor;
    }

    public int getCodPro() {
        return codPro;
    }

    public void setCodPro(int codPro) {
        this.codPro = codPro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(int codBarras) {
        this.codBarras = codBarras;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

}
