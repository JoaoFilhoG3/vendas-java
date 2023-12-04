package vendas.model;

import java.time.LocalDateTime;

public class Venda {

    private int codVen;
    private LocalDateTime dataHora;
    private Cliente cliente;
    private Funcionario funcionario;
    private double valorTotal;

    public Venda() {
    }

    public Venda(int codVen, LocalDateTime dataHora, Cliente cliente, Funcionario funcionario, double valorTotal) {
        this.codVen = codVen;
        this.dataHora = dataHora;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.valorTotal = valorTotal;
    }

    public int getCodVen() {
        return codVen;
    }

    public void setCodVen(int codVen) {
        this.codVen = codVen;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

}
