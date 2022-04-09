public class Troll extends Personagem implements Horda, CombateADistancia
{
    private String tamanhoDaPresa;

    public Troll(String tamanhoDaPresa)
    {
        this.tamanhoDaPresa = tamanhoDaPresa;
        int aux = getPersonagensCriados();
        setPersonagensCriados(aux+1);
    }

    public String regenerar()
    {
        return "Regenerado";
    }

    @Override
    public void CastarSpell()
    {
        System.out.println("Castando totem");
    }

    @Override
    public void ForTheHorde()
    {
        System.out.println("Pela Horda!");
    }

    @Override
    public void InvadirAlianca()
    {
        System.out.println("Invadindo Stormwind");
    }

    @Override
    public void entrarEmRaid()
    {
        System.out.println(getNome() + "entrando em raid");
    }

    @Override
    public void entrarEmPvP()
    {
        System.out.println(getNome() + "entrando em arena PvP");
    }

    @Override
    public void mostraInfo()
    {
        System.out.println("Nome: " + getNome());
        System.out.println("Vida: " + getVida());
        System.out.println("Classe: " + getClasse());
        System.out.println(" ");

    }

    // GETTERS E SETTERS
    public String getTamanhoDaPresa() {return tamanhoDaPresa;}
    public void setTamanhoDaPresa(String tamanhoDaPresa) {this.tamanhoDaPresa = tamanhoDaPresa;}

}
