import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // Entrada de dados
        Scanner input = new Scanner(System.in);

        // Instânciando = new
        Deck deck = new Deck();
        System.out.print("Digite o nome do dono do Deck: ");
        deck.dono = input.next(); // Inserindo dados


        // Instânciando Array
        Carta[] carta = new Carta[2];

        // Criando Objetos
        carta[0] = new Carta();
        carta[1] = new Carta();
        //carta[2] = new Carta();
        //carta[3] = new Carta();
       // carta[4] = new Carta();
        //carta[5] = new Carta();

        // For para inserir dados
        for(int i=0; i< carta.length; i++)
        {
            System.out.println("Carta " + (i+1));
            System.out.print("Nome: ");
            carta[i].nome = input.next();
            System.out.print("Poder: ");
            carta[i].poder = input.nextInt();
            input.nextLine();
            System.out.print("Classificação (soldado/arqueiro/pesado): ");
            carta[i].classificacao = input.next();
            System.out.println(" ");
        }

        // Agregação
        deck.carta = carta;

        // Chamando Métodos
        deck.mostrarInfo();
        deck.calculaPoderMedio();
        deck.calculaClassificacao();


        // Fechando entrada de dados
        input.close();
    }
}
