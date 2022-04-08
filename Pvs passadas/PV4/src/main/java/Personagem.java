public abstract class Personagem
{
    public static int cont;
    private String nome;
    private int id;
    private int poder;


    public void mostraInfo()
    {
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("Poder: " + getPoder());
        System.out.println(" ");
    }
    public abstract void travarBatalha();


    // GETTERS E SETTERS
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public int getPoder() {return poder;}
    public void setPoder(int poder) {this.poder = poder;}
}
