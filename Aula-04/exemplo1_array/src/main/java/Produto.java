public class Produto
{
    // Atributos = Variaveis
    String nome;
    String descricao;
    String fabricante;
    double preco;

    // Construtor Padrão, tem que declarar por causa ter o construtor por parâmetro
    // Se não da pau
    Produto()
    {

    }

    // Construtor por parâmetro
    Produto (String nome, String descricao, String fabricante, double preco)
    {
        this.nome = nome;
        this.descricao = descricao;
        this.fabricante = fabricante;
        this.preco = preco;
    }
}
