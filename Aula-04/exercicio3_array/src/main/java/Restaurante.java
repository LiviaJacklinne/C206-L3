public class Restaurante
{
    String cnpj;
    String endereco;
    String nome;
    Fornecedor[] fornecedor;

    // Método
    void mostrarInfo()
    {
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Endereço: " + endereco);
        System.out.println("Nome: " + nome);
        System.out.println(" ");

        for(int i=0; i<fornecedor.length; i++)
        {
            System.out.println("Tipo: " + fornecedor[i].tipo);
            System.out.println("Quantidade: " + fornecedor[i].quantidade);
            System.out.println(" ");
        }
    }

    int aux = 0;
    // Método de comparação, atributo de quantidade
    void comparando()
    {
        for(int i=0; i<fornecedor.length; i++)
        {
            if(fornecedor[i].quantidade <= 20)
                aux++;
        }
        System.out.println(aux + " produtos chergaram uma quantidade <= a 20");
    }
}
