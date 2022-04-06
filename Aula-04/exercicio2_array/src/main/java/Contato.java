public class Contato
{
    String nome;
    String email;
    String telefone;
    String dataNascimento;

    // Construtor padrão declarado pra não dar xabu
    Contato()
    {

    }

    // Construtor por 3 parâmetro
    Contato(String nome, String email, String telefone)
    {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
}
