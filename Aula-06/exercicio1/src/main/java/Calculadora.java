import java.util.Scanner;

public class Calculadora
{
    Scanner sc = new Scanner(System.in);

    public static double raio;
    public static double pi = 3.14;

    public static double circunferencia(double raiox)
    {
        System.out.println(2*pi*raiox);
        return 0;
    }
    public static double volume(double raiox)
    {
        System.out.println(0.75*pi*Math.pow(raiox,3));
        return 0;
    }
}
