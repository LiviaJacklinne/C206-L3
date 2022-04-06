package br.inatel.cdg.calculadora;
import br.inatel.cdg.calculadora.Calculadora;

public class Main
{
    public static void main(String[] args)
    {
        double raio = 6.0;
        System.out.println("Circunferencia raio " + raio +" "+ Calculadora.circunferencia(raio));
        System.out.println("Volume raio " + raio + " "+ Calculadora.volume(raio));
    }
}
