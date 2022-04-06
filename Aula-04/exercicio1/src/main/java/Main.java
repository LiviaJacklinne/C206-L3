public class Main
{
    public static void main(String[] args)
    {
        Produto produto1 = new Produto();
        produto1.codigoSerie = 1234;
        produto1.codigoProduto = "0001";
        produto1.nome = "Heiniken";
        produto1.categoria = "Cerveja";
        produto1.quantidade = 12;

        Produto produto2 = new Produto();
        produto2.codigoSerie = 4321;
        produto2.codigoProduto = "0002";
        produto2.nome = "Chopp Potiguar";
        produto2.categoria = "Chopp";
        produto2.quantidade = 35;

        produto1.mostraInfo();
        System.out.print("\n");
        produto2.mostraInfo();

    }
}
