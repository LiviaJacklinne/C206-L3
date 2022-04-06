// Aula 04/03/2022

public class Main
{
    public static void main(String[] args)
    {
        Funcionario f1 = new Funcionario();

        f1.nome = "Livia";
        f1.cpf = "123456789";
        f1.salario = 2000;
        f1.idade = 19;

        f1.tirarFerias("Janeiro");
        System.out.println(f1.calculaSalarioAnual);

    }
}
