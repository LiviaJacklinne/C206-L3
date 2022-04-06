public class Carrinho
{
    // Atributo = Variavel
    double total = 0;
    Produto[] produto;

    // Método = Ação que a classe sabe fazer
    void mostrarInfo()
    {
        // FOR para varrer o vetor = Array
        for(int i=0; i< produto.length; i++)
            if (produto[i] != null)
            {
                System.out.println("Nome: " + produto[i].nome);
                System.out.println("Descrição: " + produto[i].descricao);
                System.out.println("Fabricante: " + produto[i].fabricante);
                System.out.println("Preço: " + produto[i].preco);
                System.out.println(" ");
            }
    }

    // Método
    double calculaTotal()
    {
        for(int i=0; i< produto.length; i++)
            if (produto[i] != null)
            {
                total += produto[i].preco;
            }

        System.out.println("Total: " + total);

        return total;
    }

}
