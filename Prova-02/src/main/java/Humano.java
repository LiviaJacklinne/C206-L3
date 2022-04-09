public class Humano extends Personagem implements Alianca, CombateCorpoACorpo
{
    private String tamanhoDoCabelo;

    public Humano(String tamanhoDoCabelo)
    {
        this.tamanhoDoCabelo = tamanhoDoCabelo;
        int aux = getPersonagensCriados();
        setPersonagensCriados(aux+1);
    }

    public String motivar()
    {
        return "Motivando";
    }

    @Override
    public void ForTheAllience()
    {
        System.out.println("Pela Aliança!");
    }

    @Override
    public void InvadirHorda()
    {
        System.out.println("Invadindo Orgrimmar");
    }

    @Override
    public void sacarArma()
    {
        System.out.println("Desembainhando espada");
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
    public String getTamanhoDoCabelo() {return tamanhoDoCabelo;}
    public void setTamanhoDoCabelo(String tamanhoDoCabelo) {this.tamanhoDoCabelo = tamanhoDoCabelo;}

}
