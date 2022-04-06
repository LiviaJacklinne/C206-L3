public class Main
{
    public static void main(String[] args)
    {
        Carro carro1 = new Carro();
        carro1.cor = "Vermelho";
        carro1.marca = "BMW";
        carro1.modelo = "X6";
        carro1.velMax = 260;
        carro1.velAtual = 100;
        motor.carro1 = Carro; // Agregação

        carro1.ligar();
        System.out.println(carro1.toString());
        carro1.acelerar();
        System.out.println(carro1.toString());
        System.out.print("\n");

        Carro carro2 = new Carro();
        carro2.cor = "Preto";
        carro2.marca = "Jaguar";
        carro2.modelo = "E-Pace";
        carro2.velMax = 280;
        carro2.velAtual = 278;
        motor.carro2 = Carro; // Agregação

        carro2.ligar();
        System.out.println(carro2.toString());
        carro2.acelerar();
        System.out.println(carro2.toString());

    }
}
