import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Instância Classe Estádio
        Estadio estadio = new Estadio();

        // Instanciando Classe Time
        Time time = new Time();
        time.jogador = new Jogador[2];
        time.estadio = estadio;

        System.out.print("Nome do Estádio: ");
        estadio.nome = input.next();
        System.out.print("Capacidade: ");
        estadio.capacidade = input.nextInt();
        input.nextLine();
        System.out.print("Cidade: ");
        estadio.cidade = input.next();
        System.out.println("");


        System.out.print("Nome do Time: ");
        time.nome = input.next();
        System.out.print("Cor da Camisa: ");
        time.corCamisa = input.next();
        System.out.println("");

        time.adicionaJogador();
        System.out.println("");
        time.calculaTotalSalario();
        System.out.println("");
        time.mostraJogadoresBase();
        System.out.println("");
        time.mostraInfo();
        System.out.println("");

        Jogador jogador = new Jogador();
        jogador.mostrarInfo();

        input.close();
    }
}
