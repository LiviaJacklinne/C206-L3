package br.inatel.cdg.calculadora;

public class Calculadora
{
    private static double PI = 3.14;

    public static double circunferencia(double raio)
    {
        return PI*(raio*raio);
    }
    public static double volume(double raio)
    {
        return (4.0/3.0) * PI * (raio*raio*raio);
    }

}
