import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do raio: ");
        Calculadora.raio = sc.nextDouble();

        Calculadora.circunferencia(Calculadora.raio);
        Calculadora.volume(Calculadora.raio);

        sc.close();
    }
}
