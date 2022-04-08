package br.inatel.cdg.conta;

public class Conta
{
    private static int qtdClientes = 3;
    private double saldo;

    public void depositar(double valor)
    {
        this.saldo = saldo + valor;
    }
    public void saca (double valor)
    {
        if(this.saldo >= valor)
        {
            this.saldo -= valor;
        }
    }
    public void extrato()
    {
        System.out.println("Quantidade de Clientes: " + getQtdClientes());
        System.out.println("Saldo: " + getSaldo());
    }

    // Getters e Setters
    public int getQtdClientes(){return qtdClientes;}
    //public void setQtdClientes(int qtdClientes){this.qtdClientes = qtdClientes;}
    public double getSaldo()
    {
        return saldo;
    }
    //public void setSaldo(double saldo){this.saldo = saldo;}
}
