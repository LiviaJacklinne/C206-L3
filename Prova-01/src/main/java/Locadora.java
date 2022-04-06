import java.sql.SQLOutput;
import java.util.Scanner;

public class Locadora
{
    String nome;
    String cnpj;
    String endereco;
    int carrosParaAlugar;
    Carro[] carro;
    Scanner sc = new Scanner(System.in);

    void mostraInfo()
    {
        System.out.println("Nome Locadora: " + nome);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Endereço: " + endereco);
        System.out.println("Carros para alugar: " + carrosParaAlugar);
        for(int i=0; i<carro.length; i++)
        {
            if(carro[i] != null)
            {
                System.out.println("Modelo do carro: " + carro[i].modelo);
                System.out.println("Cor do Carro: " + carro[i].cor);
                System.out.println("Carro alugado: " + carro[i].alugado);
                System.out.println("");
            }
        }

    }
    void adicionarCarro()
    {
        for(int i=0; i<carro.length; i++)
        {
            carro[i] = new Carro();
            System.out.print("Modelo: ");
            carro[i].modelo = sc.next();
            System.out.print("Cor: ");
            carro[i].cor = sc.next();
            System.out.print("Alugado(true or false): ");
            carro[i].alugado = sc.nextBoolean();
            System.out.println("");
        }

    }
    void alugarCarro()
    {
        int aux;
        System.out.print("Qual carro você quer alugar?(pos do vet) ");
        aux = sc.nextInt();
        System.out.println(" ");
        for(int i=0; i<carro.length; i++)
        {
            if(carro[i] != null)
            {
                if (i == aux && carro[i].alugado == false)
                {
                    System.out.println("Carro Alugado");
                    System.out.println("Modelo do carro: " + carro[i].modelo);
                    System.out.println("Cor do Carro: " + carro[i].cor);
                    System.out.println("Carro alugado: " + carro[i].alugado);
                    System.out.println(" ");
                }
                else
                    System.out.println("Carro Indisponivel");
            }
        }

        sc.close();
    }
    float contarCarrosParaAlugar()
    {
        int sim = 0;
        int total = 0;
        int i;
        for(i=0; i<carro.length; i++)
        {
            if(carro[i] != null)
            {
                total++;

                if(carro[i].alugado == false)
                    sim++;
            }
            else
                System.out.println("Carro Indisponível");
        }
        System.out.println("Há " + sim + " carros para alugar");
        System.out.println("Um total de " + ((sim*100)/(i*1.0)) + "%");
        System.out.println("");
        return 0;
    }
}
