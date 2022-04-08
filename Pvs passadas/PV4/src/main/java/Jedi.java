public class Jedi extends Personagem implements Treinamento, Forca
{
    private boolean mestre;
    private Sabre sabre;

    @Override
    public void usarForca()
    {
        int aux;
        System.out.println(getNome() + " usou a forca para o bem");
        aux = getPoder() + 5;
        setPoder(aux);
    }

    @Override
    public void trocarSabre(String cor)
    {

    }

    @Override
    public void treinarPadawan()
    {
        if(mestre || getPoder() > 70)
            System.out.println(getNome() + " treinou um Padawan");
        else
            System.out.println(getNome() + " ainda nao consegue treinar padawans");

    }

    @Override
    public void travarBatalha()
    {
        int aux;
        System.out.println(getNome() + " travou uma batalha contra um sith");
        aux = getPoder() + 1;
        setPoder(aux);
    }

    // GETTERS E SETTERS
    public boolean isMestre() {return mestre;}
    public void setMestre(boolean mestre) {this.mestre = mestre;}
    public Sabre getSabre() {return sabre;}
    public void setSabre() {this.sabre = sabre;}

}
