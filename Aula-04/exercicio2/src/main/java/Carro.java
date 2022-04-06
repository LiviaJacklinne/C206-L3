public class Carro
{
    String cor;
    String marca;
    String modelo;
    double velMax;
    double velAtual;

    void ligar()
    {
        System.out.println("Carro ligado");
    }

    void acelerar()
    {
        if(velAtual+10 < velMax)
            velAtual += 10;
        else
            System.out.println("Velocidade máxima atingida");
    }

    @Override
    public String toString() {
        return "Carro{" +
                "cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velMax=" + velMax +
                ", velAtual=" + velAtual +
                '}';
    }
}
