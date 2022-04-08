public class Droid extends Personagem
{
    private boolean hostil;

    public void hackearSistema()
    {
        System.out.println(getNome() + " hackeou o sistema da nave");

    }

    @Override
    public void travarBatalha()
    {
        if(hostil)
            System.out.println(getNome() + " travou uma batalha contra um Jedi");
        else
            System.out.println(getNome() + " travou uma batalha contra um Sith");

    }

    // GETTERS E SETTERS
    public boolean isHostil() {return hostil;}
    public void setHostil(boolean hostil) {this.hostil = hostil;}

}
