import java.util.Scanner;

public class Exercicio3
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int operador;
        double x, y;

        System.out.println("1 - Soma ");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Potência");
        //System.out.println("\n");
        System.out.print("Digite qual operador você deseja: ");
        operador = entrada.nextInt();

        if (operador == 1) // Condição de Soma
        {
            System.out.print("Valor 1: ");
            x = entrada.nextDouble();
            System.out.print("Valor 2: ");
            y = entrada.nextDouble();

            // Colocar os valores entre () para calcular
            System.out.println("Total: " + (x+y));
        }
        else if (operador == 2) // Condição de Subtração
        {
            System.out.print("Valor 1: ");
            x = entrada.nextDouble();
            System.out.print("Valor 2: ");
            y = entrada.nextDouble();

            // Colocar os valores entre () para calcular
            System.out.println("Total: " + (x-y));
        }
        else if (operador == 3) // Condição de Multiplicação
        {
            System.out.print("Valor 1: ");
            x = entrada.nextDouble();
            System.out.print("Valor 2: ");
            y = entrada.nextDouble();

            // Colocar os valores entre () para calcular
            System.out.println("Total: " + (x*y));
        }
        else if (operador == 4) // Condição de Divisão
        {
            do // Condição para o numerador ser diferente de 0
            {
                System.out.print("Digite seu valor (diferente de 0): ");
                x = entrada.nextDouble();

            } while (!(x != 0));
            y = entrada.nextDouble();

            // Colocar os valores entre () para calcular
            System.out.println("Total: " + (x/y));
        }
        else if (operador == 5) // Condição de Exponenciação
        {
            System.out.print("Digite a base: ");
            x = entrada.nextDouble();
            System.out.print("Digite o expoente: ");
            y = entrada.nextDouble();

            // Colocar os valores entre () para calcular
            System.out.println("Total: " + Math.pow(x,y));
        }
        else
            System.out.println("Valor inválido");

        entrada.close();
    }
}
