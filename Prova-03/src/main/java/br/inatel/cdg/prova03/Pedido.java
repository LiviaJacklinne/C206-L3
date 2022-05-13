package br.inatel.cdg.prova03;

public class Pedido implements Comparable<Pedido>
{
    private int id;
    private String tipoMadeira;
    private double precoProducao;
    private double precoVenda;

    public Pedido(int id, String tipoMadeira, double precoProducao, double precoVenda)
    {
        this.id = id;
        this.tipoMadeira = tipoMadeira;
        this.precoProducao = precoProducao;
        this.precoVenda = precoVenda;
    }

    public Pedido() {}

    @Override
    public int compareTo(Pedido o)
    {
        return 0;
    }

    public void mostraInfo()
    {
        System.out.println("ID: " + getId());
        System.out.println("Tipo Madeira: " + getTipoMadeira());
        System.out.println("Preco de Producao: " + getPrecoProducao());
        System.out.println("Preco de Venda: " + getPrecoVenda());
    }

    // Getters e Setters
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getTipoMadeira() {return tipoMadeira;}
    public void setTipoMadeira(String tipoMadeira) {this.tipoMadeira = tipoMadeira;}
    public double getPrecoProducao() {return precoProducao;}
    public void setPrecoProducao(double precoProducao) {this.precoProducao = precoProducao;}
    public double getPrecoVenda() {return precoVenda;}
    public void setPrecoVenda(double precoVenda) {this.precoVenda = precoVenda;}

}
