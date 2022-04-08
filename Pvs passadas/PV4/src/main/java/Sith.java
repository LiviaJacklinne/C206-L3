public class Sith extends Personagem implements Forca
{
    private boolean darth;
    private Sabre sabre;

    public void corromperJedi()
    {
        if(darth && getPoder()> 60)
        {
            System.out.println(getNome() + " levou um jedi para o lado negro da forca");
        }
        else
            System.out.println(getNome() + " ainda nao consegue corromper jedis");
    }

    @Override
    public void usarForca()
    {
        int aux;
        System.out.println(getNome() + " usou o lado negro da forca");
        aux = getPoder() + 3;
        setPoder(aux);
    }

    @Override
    public void trocarSabre(String cor)
    {

    }

    @Override
    public void travarBatalha()
    {
        int aux;
        System.out.println(getNome() + " travou uma batalha contra um Jedi");
        aux = getPoder() + 1;
        setPoder(aux);

    }

    // GETTERS E SETTERS
    public boolean isDarth() {return darth;}
    public void setDarth(boolean darth) {this.darth = darth;}
    public Sabre getSabre() {return sabre;}
    public void setSabre(Sabre sabre) {this.sabre = sabre;}

}
