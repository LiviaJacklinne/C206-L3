public class Carro
{
    String modelo;
    String cor;
    boolean alugado;
    Motor motor;
    Locadora locadora;

    void mostrarInfo()
    {
        System.out.println("Modelo do carro: " + this.modelo);
        System.out.println("Cor do Carro: " + this.cor);
        System.out.println("Carro alugado: " + this.alugado);
    }
    Carro()
    {
        motor = new Motor();
    }
}
