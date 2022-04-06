public class Jogo
{
    String nome;
    String genero;
    double preco;
    boolean dlc;
    Jogo[] jogo;

    void mostraInfo()
    {
        for(int i=0; i <jogo.length; i++)
        {
            if(jogo[i] != null)
            {
                System.out.println("Nome: " + nome);
                System.out.println("Gênero: " + genero);
                System.out.println("Preço: " + preco);
                System.out.println("DLC: " + dlc);
            }
        }

    }
}
