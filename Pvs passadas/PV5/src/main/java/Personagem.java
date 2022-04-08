public abstract class Personagem
{
    public static int contador;
    private String nome;
    private int vitalidade;
    private int inteligencia;
    private int fe;
    public Arma arma;

    public Personagem(String nome, int vitalidade, int inteligencia, int fe) {
        this.nome = nome;
        this.vitalidade = vitalidade;
        this.inteligencia = inteligencia;
        this.fe = fe;
    }

    // COMPOSIÇÃO
    public void arma()
    {
        arma = new Arma();
    }

    public void mostraInfo()
    {
        System.out.println("Nome: " + getNome());
        System.out.println("Vitalidade: " + getVitalidade());
        System.out.println("Inteligencia: " + getInteligencia());
        System.out.println("Fe: " + getFe());
        System.out.println(" ");
    }
    public void passaLevel()
    {
        int aux1, aux2, aux3;
        aux1 = getInteligencia();
        aux2 = getVitalidade();
        aux3 = getFe();

        setInteligencia(aux1 + 1);
        setVitalidade(aux2 + 1);
        setFe(aux3 + 1);
    }
    public abstract void ganhaHabilidade();






    // GETTERS E SETTERS
    public static int getContador() {return contador;}
    public static void setContador(int contador) {Personagem.contador = contador;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public int getVitalidade() {return vitalidade;}
    public void setVitalidade(int vitalidade) {this.vitalidade = vitalidade;}
    public int getInteligencia() {return inteligencia;}
    public void setInteligencia(int inteligencia) {this.inteligencia = inteligencia;}
    public int getFe() {return fe;}
    public void setFe(int fe) {this.fe = fe;}
    public Arma getArma() {return arma;}
    public void setArma(Arma arma) {this.arma = arma;}
}
