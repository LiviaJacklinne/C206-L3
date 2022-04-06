public class Funcionario
{
    int idade;
    String cpf;
    String nome;
    double salario;

    public Funcionario(String nome, int idade, String cpf)
    {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }
    public Funcionario()
    {
        this.nome = "Nome genérico";
    }

    void tirarFerias(String mes)
    {
        System.out.println("Funcionário " + nome + " vai tirar férias em " + mes);
    }
    double calcularSalarioAnual()
    {
        return 12*salario;
    }


}
