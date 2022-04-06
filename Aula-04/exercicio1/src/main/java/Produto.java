public class Produto
{
    int codigoSerie;
    String codigoProduto;
    String nome;
    String categoria;
    int quantidade;

    void mostraInfo()
    {
        System.out.println("Código Série: " + codigoSerie);
        System.out.println("Código Produto: " + codigoProduto);
        System.out.println("Nome: " + nome);
        System.out.println("Categoria: " + categoria);
        System.out.println("Quantidade: " + quantidade);
    }

}
