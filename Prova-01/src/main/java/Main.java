import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // Entrada de dados
        Scanner sc = new Scanner(System.in);

        // Instânciando
        Locadora locadora = new Locadora();
        locadora.carro = new Carro [3];
        Carro carros = new Carro();

        // Entrada de dados locadora
        System.out.print("Nome Locadora: ");
        locadora.nome = sc.next();
        System.out.print("CNPJ: ");
        locadora.cnpj = sc.next();
        sc.nextLine();
        System.out.print("Endereço: ");
        locadora.endereco = sc.next();
        sc.nextLine();
        locadora.carrosParaAlugar = 3;
        System.out.print("Carros para alugar: " + locadora.carrosParaAlugar);
        System.out.println("");

        // Exibindo métodos
        locadora.adicionarCarro();
        locadora.contarCarrosParaAlugar();
        locadora.alugarCarro();
        locadora.mostraInfo();

        for(int i=0; i<3; i++)
        {
                locadora.carro[i].mostrarInfo();
        }

        carros.motor.mostrarInfo();

        // Fechando entrada de dados
        sc.close();
    }
}
