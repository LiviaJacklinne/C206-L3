import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // Entrada da dados
        Scanner entrada = new Scanner(System.in);

        // Instânciando classe Plataforma
        Plataforma plataforma = new Plataforma();
        System.out.print("Nome da Plataforma: ");
        plataforma.nome = entrada.next();
        System.out.print("Nome do Criador: ");
        plataforma.criador = entrada.next();
        System.out.println(" ");

        // Instânciando classe Jogo
        Jogo[] jogo = new Jogo[2];
        plataforma.adicionarJogo();

        // Agregação
        plataforma.jogo = jogo;

        plataforma.mostraMaisCaroBarato();










        // Fechando entrada de dados
        entrada.close();
    }
}
