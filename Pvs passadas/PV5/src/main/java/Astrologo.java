public class Astrologo extends Personagem implements Cura, Magia
{

    public Astrologo(String nome, int vitalidade, int inteligencia, int fe) {
        super(nome, vitalidade, inteligencia, fe);
        contador++;
    }

    public void bonus()
    {
        int aux1, aux2, aux3;
        aux1 = getInteligencia();
        aux2 = getVitalidade();
        aux3 = getFe();

        setInteligencia(aux1 + 5);
        setVitalidade(aux2 - 2);
        setFe(aux3 - 2);
    }

    @Override
    public void ganhaHabilidade()
    {
        System.out.println("Nova habilidade adquiria");
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
    public void aprendeFeitico()
    {
        System.out.println("Novo feitico aprendido");
    }

    @Override
    public void usaFeitico(int dano)
    {
        System.out.println("Feitico usado. Dano: " + dano);

    }
}
