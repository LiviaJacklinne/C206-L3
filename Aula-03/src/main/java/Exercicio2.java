import java.util.Scanner;

public class Exercicio2
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        double peso;
        double altura;
        double imc;

        System.out.print("Digite a sua altura em metros (use virgula): ");
        altura = entrada.nextFloat();
        System.out.print("Digite seu peso: ");
        peso = entrada.nextFloat();

        // Chamando a função de exponencial, ambos os argumentos devem ser double (?)
        imc = peso/ Math.pow(altura, 2);

        // Comparações do IMC
        if(imc <= 18.5)
            System.out.println("Abaixo do peso");
        else if (imc >= 18.6 && imc <= 24.9)
            System.out.println("Peso ideal (parabéns)");
        else if (imc >= 25 && imc <= 29.9)
            System.out.println("Levemente acima do peso");
        else if (imc >= 30 && imc <= 34.9)
            System.out.println("Obesidade grau I");
        else if (imc >= 35 && imc <= 39.9)
            System.out.println("Obesidade grau II (severa)");
        else
            System.out.println("Obesidade grau III (mórbida)");

        // Fechando entrada de dados (OBS: deve ser fechado no mesmo escopo que foi aberto)
        entrada.close();

    }
}
