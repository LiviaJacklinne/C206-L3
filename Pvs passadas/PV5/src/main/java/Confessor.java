public class Confessor extends Personagem implements Cura
{
    public Confessor(String nome, int vitalidade, int inteligencia, int fe) {
        super(nome, vitalidade, inteligencia, fe);
        contador++;
    }

    public void bonus()
    {
        int aux1, aux2, aux3;
        aux1 = getInteligencia();
        aux2 = getVitalidade();
        aux3 = getFe();

        setInteligencia(aux1 - 2);
        setVitalidade(aux2 - 2);
        setFe(aux3 + 5);
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
}
