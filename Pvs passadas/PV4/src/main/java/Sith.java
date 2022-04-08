public class Sith extends Personagem implements Forca
{
    private boolean darth;
    private Sabre sabre;

    public void comrromperJedi()
    {
        if(darth && getPoder()> 60)
        {
            System.out.println(getNome() + " levou um jedi para o lado negro da força");
        }
        else
            System.out.println(getNome() + "ainda não consegue corromper jedis");
    }

    @Override
    public void usarForca()
    {
        int aux;
        System.out.println(getNome() + " usou o lado negro da força");
        aux = getPoder() + 3;
        setPoder(aux);
    }

    @Override
    public void trocarSabre(String cor) {

    }

    @Override
    public void travarBatalha()
    {
        int aux;
        System.out.println(getNome() + "travou uma batalha contra um Jedi");
        aux = getPoder() + 1;
        setPoder(aux);

    }
}
