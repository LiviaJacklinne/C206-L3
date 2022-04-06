import java.util.Scanner;

public class Exercicio1
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner (System.in);
        int x;

        System.out.print("Digite 1 para a tabela E, ou 2 para a tabela OU: ");
        x = entrada.nextInt();

        switch (x)
        {
            case 1: // Tabela da verdade E
                if(x == 1)
                {
                    System.out.println("0 0 = 0");
                    System.out.println("0 1 = 0");
                    System.out.println("1 0 = 0");
                    System.out.println("1 1 = 1");
                }
                break;
            case 2: // Tabela da verdade OU
                if(x == 2)
                {
                    System.out.println("0 0 = 0");
                    System.out.println("0 1 = 1");
                    System.out.println("1 0 = 1");
                    System.out.println("1 1 = 1");
                }
                break;
            default:
                System.out.println("Valor digitado inválido");
                break;
        }
        entrada.close(); // Fechando entrada de dados
    }
}
