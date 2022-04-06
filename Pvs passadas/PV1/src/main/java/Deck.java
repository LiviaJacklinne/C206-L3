import org.jetbrains.annotations.NotNull;

public class Deck
{
    String dono;
    Carta[] carta;


    void mostrarInfo()
    {
        for(int i=0; i < carta.length; i++)
        {
            System.out.println("Carta " + (i+1));
            System.out.println("Nome: " + carta[i].nome);
            System.out.println("Poder: " + carta[i].poder);
            System.out.println("Classificação: " + carta[i].classificacao);
            System.out.println(" ");
        }
    }

    void adicionarCarta(@NotNull Carta cartax)
    {
        boolean flag = true;
        for(int i=0; i < carta.length; i++)
        {
            if(carta[i] == null && flag == true)
            {
                carta[i] = cartax;
                flag = false;
                System.out.println("Carta adicionada");
            }
        }
        if(flag == false)
            System.out.println("Decl full");
    }


    void calculaPoderMedio()
    {
        float aux = 0;
        int i;
        for(i=0; i < carta.length; i++)
        {
            if(carta[i] != null)
            {
                aux += carta[i].poder;
            }
        }

        System.out.println("Poder Médio: " + (aux/i));
    }

    void calculaClassificacao()
    {
        int soldado = 0;
        int arqueiro = 0;
        int pesado = 0;

        int i;
        for(i=0; i < carta.length; i++)
        {
            if(carta[i] != null)
            {
                if(carta[i].classificacao.equals("soldado"))
                    soldado++;

                else if (carta[i].classificacao.equals("arqueiro"))
                    arqueiro++;

                else
                    pesado++;
            }
        }
        System.out.println("Soldados: " + soldado);
        System.out.println("Arqueiros: " + arqueiro);
        System.out.println("Pesados: " + pesado);

    }

}
