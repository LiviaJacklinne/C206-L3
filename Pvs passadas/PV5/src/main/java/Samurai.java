public class Samurai extends Personagem implements Cura
{
    private int honra = 5;

    public Samurai(String nome, int vitalidade, int inteligencia, int fe) {
        super(nome, vitalidade, inteligencia, fe);
        contador++;
    }

    public void mostraInfo()
    {
        super.passaLevel();
        System.out.println("Nome: " + getNome());
        System.out.println("Vitalidade: " + getVitalidade());
        System.out.println("Inteligencia: " + getInteligencia());
        System.out.println("Fe: " + getFe());
        System.out.println("Honra: " + getHonra());
        System.out.println(" ");
    }

    public void bonus()
    {
        int aux1, aux2, aux3;
        aux1 = getInteligencia();
        aux2 = getVitalidade();
        aux3 = getFe();

        setInteligencia(aux1 - 2);
        setVitalidade(aux2 + 5);
        setFe(aux3 - 2);
    }

    @Override
    public void aprendeCura()
    {
        System.out.println("Aprendeu Curar");
    }

    @Override
    public void cura()
    {
        System.out.println("Curado");
    }

    @Override
    public void ganhaHabilidade()
    {
        System.out.println("Nova habilidade adquiria");
    }

    // GETTERS E SETTERS
    public int getHonra() {return honra;}
    public void setHonra(int honra) {this.honra = honra;}
}
