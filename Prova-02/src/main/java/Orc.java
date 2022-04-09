public class Orc extends Personagem implements CombateCorpoACorpo, Horda
{
    private String corDaPele;

    public Orc(String corDaPele)
    {
        this.corDaPele = corDaPele;
        int aux = getPersonagensCriados();
        setPersonagensCriados(aux+1);
    }

    public String enfurecer()
    {
        return "Efurecer";
    }

    @Override
    public void sacarArma()
    {
        System.out.println("Pegando machado de duas mãos");
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
    public String getCorDaPele() {return corDaPele;}
    public void setCorDaPele(String corDaPele) {this.corDaPele = corDaPele;}

}
