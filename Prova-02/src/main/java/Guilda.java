public class Guilda
{
    private String nome;
    private Personagem membros[];

    public void GuildRaid()
    {
        for(int i=0; i<membros.length; i++)
        {
            if(membros[i] != null)
            {
                membros[i].entrarEmRaid();
            }
        }
    }

    public void mostraInfo()
    {
        System.out.println("Nome Guilda: " + getNome());

    }

    // GETTERS E SETTERS
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public Personagem[] getMembros() {return membros;}
    public void setMembros(Personagem[] membros) {this.membros = membros;}

}
