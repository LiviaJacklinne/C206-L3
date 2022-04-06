// Aula 26/02/2022

import java.util.Scanner;

public class Exercicio4
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int senha;

        System.out.print("Digite uma senha valida (4 numeros): ");

        do
        {
            senha = entrada.nextInt();
            if(senha != 2002)
                System.out.println("Senha inválida");

        } while (!(senha == 2002));

        System.out.println("Acesso permitido");
        entrada.close();

    }
}
