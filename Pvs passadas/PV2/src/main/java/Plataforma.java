import java.util.Scanner;

public class Plataforma
{
    String nome;
    String criador;
    Jogo[] jogo;

    void mostraInfo()
    {
        System.out.println("Nome: " + nome);
        System.out.println("Criador: " + criador);
    }

    void adicionarJogo()
    {
        Scanner entrada = new Scanner(System.in);
        for(int i=0; i <jogo.length; i++)
        {
            // Criando objeto
            jogo[i] = new Jogo();

            // Preenchendo o Array
            System.out.print("Nome: ");
            jogo[i].nome = entrada.next();
            System.out.print("Gênero: ");
            jogo[i].genero = entrada.next();
            System.out.print("Preço: ");
            jogo[i].preco = entrada.nextDouble();
            System.out.print("O jogo tem DLC: ");
            jogo[i].dlc = entrada.hasNextBoolean();
        }
        entrada.close();

    }

    void mostraMaisCaroBarato()
    {

        for(int i=0; i <jogo.length; i++)
        {
            if (jogo[i].preco != null)
            {


            }
        }
    }

    void calculaDlc()
    {
        int sim = 0;
        int nao = 0;
        for(int i=0; i <jogo.length; i++)
        {
            if(jogo[i].dlc)
                sim++;

            else
                nao++;
        }
    }

}
