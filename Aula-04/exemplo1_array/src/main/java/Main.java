public class Main
{
    public static void main(String[] args)
    {
        // Criando uma instância = usar new
        // Construtor Padrão
        Produto[] produto = new Produto[3];

        { // Método 1 de criar um objeto direto no array

            // Criando o objeto
            produto[0] = new Produto();

            // Atribuindo os atributos, dando valor às variáveis. ("Dar nome aos boi")
            produto[0].nome = "Arroz";
            produto[0].descricao = "Grão";
            produto[0].fabricante = "Panela de Ferro";
            produto[0].preco = 23;
        }

        { // Método 2 de criar um objeto

            // Criando o objeto
            Produto p1 = new Produto();

            // Dando nome aos boi
            p1.nome = "Coca-cola";
            p1.descricao = "Refrigerante";
            p1.fabricante = "Coca-cola";
            p1.preco = 9.90;

            produto[1] = p1; // Atribuindo meus atributos ao array

        }

        { // Método 3 de criar um objeto, a partir do construtor

            // Criando o objeto
            Produto p2 = new Produto("Alecrim", "Tempero", "Kitano", 2.50);
            produto[2] = p2; // Atribuindo meus atributos ao array
        }

        // Agregação
        Carrinho carrinho = new Carrinho();
        carrinho.produto = produto;

        // Métodos
        carrinho.mostrarInfo();
        carrinho.calculaTotal();

    }
}
