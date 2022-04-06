public class Main
{
    public static void main(String[] args)
    {
        // Instanciando = new
        Restaurante restaurante = new Restaurante();
        restaurante.cnpj = "22071995";
        restaurante.endereco = "Av. Paulista";
        restaurante.nome = "Patroas";

        // Instanciando o array
        Fornecedor[] fornecedor = new Fornecedor[4];

        // Criando objeto
        Fornecedor f1 = new Fornecedor();
        f1.tipo = "Macarrão";
        f1.quantidade = 50;
        fornecedor[0] = f1;

        // Criando objeto
        Fornecedor f2 = new Fornecedor();
        f2.tipo = "Carne";
        f2.quantidade = 4;
        fornecedor[1] = f2;

        // Criando objeto
        Fornecedor f3 = new Fornecedor();
        f3.tipo = "Chopp";
        f3.quantidade = 100;
        fornecedor[2] = f3;

        // Criando objeto
        Fornecedor f4 = new Fornecedor();
        f4.tipo = "Morango";
        f4.quantidade = 20;
        fornecedor[3] = f4;

        // Agregação
        restaurante.fornecedor = fornecedor;

        // Método
        restaurante.mostrarInfo();
        System.out.println("");
        restaurante.comparando();

    }
}
