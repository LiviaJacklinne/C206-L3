public class Nave
{
    private String nome;
    public Personagem personagens[] = new Personagem[3];
    private boolean velocidadeLuz;

    public void mostraInfo()
    {
        System.out.println("Nome Nave: " + getNome());
        System.out.println("Velocidade Luz: " + isVelocidadeLuz());
        System.out.println(" ");
    }

    //for(int i=0; i<personagens.)

    // GETTERS E SETTERS
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public boolean isVelocidadeLuz() {return velocidadeLuz;}
    public void setVelocidadeLuz(boolean velocidadeLuz) {this.velocidadeLuz = velocidadeLuz;}

}
