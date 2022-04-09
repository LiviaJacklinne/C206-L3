public class Anao extends Personagem implements Alianca, CombateADistancia
{
    private String tamanhoDaBarba;

    public Anao(String tamanhoDaBarba)
    {
        this.tamanhoDaBarba = tamanhoDaBarba;
        int aux = getPersonagensCriados();
        setPersonagensCriados(aux+1);
    }

    public String endurecer()
    {
        return "Endurecendo";
    }


    @Override
    public void ForTheAllience()
    {
        System.out.println("Pela Aliança!”");
    }

    @Override
    public void InvadirHorda()
    {
        System.out.println("Invadindo Orgrimmar");
    }

    @Override
    public void CastarSpell()
    {
        System.out.println("Atirar");
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
    public String getTamanhoDaBarba() {return tamanhoDaBarba;}
    public void setTamanhoDaBarba(String tamanhoDaBarba) {this.tamanhoDaBarba = tamanhoDaBarba;}
}
