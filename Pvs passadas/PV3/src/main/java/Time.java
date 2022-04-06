import java.sql.SQLOutput;
import java.util.Scanner;

public class Time
{
    String nome;
    String corCamisa;
    Jogador[] jogador;
    Estadio estadio;
    Scanner input = new Scanner(System.in);



    void mostraInfo()
    {
        System.out.println("Nome do Estádio: " + estadio.nome);
        System.out.println("Capacidade: " + estadio.capacidade);
        System.out.println("Cidade: " + estadio.cidade);
        System.out.println("Nome do Time: " + nome);
        System.out.println("Cor da Camisa: " + corCamisa);
    }
    void adicionaJogador()
    {
        for(int i=0; i< jogador.length; i++)
        {
                jogador[i] = new Jogador();

                System.out.println("Jogador " + (i+1));
                System.out.print("Nome: ");
                jogador[i].nome = input.next();
                System.out.print("Salário: ");
                jogador[i].salario = input.nextDouble();
                System.out.print("Número da Camisa: ");
                jogador[i].nCamisa = input.nextInt();
                System.out.print("Jogador Base?(True ou False): ");
                jogador[i].base = input.nextBoolean();
        }
        input.close();
    }
    double calculaTotalSalario()
    {
        double totalSalario = 0;
        for(int i=0; i< jogador.length; i++)
        {
            if (jogador[i] != null)
            {
                totalSalario += jogador[i].salario;
            }
        }
        System.out.print("Salario Total: " + totalSalario);
        return 0;
    }
    void mostraJogadoresBase()
    {
        for(int i=0; i< jogador.length; i++)
        {
            if (jogador[i] != null)
            {
                if (jogador[i].base)
                {
                    System.out.println("Jogador Base" + (i+1));
                    System.out.print("Nome: " + jogador[i].nome + ", ");
                    System.out.print("Salário: " + jogador[i].salario + ", ");
                    System.out.print("Número da Camisa: " + jogador[i].nCamisa);
                    System.out.println("");
                }
            }
        }
    }

}
