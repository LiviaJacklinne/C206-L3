// Aula 04/03/2022

public class Main
{
    public static void main(String[] args)
    {
        Conta[] contas = new Conta[3]; // Array (vetor)

        //Criando uma conta a partir
        Conta c1 = new Conta();
        c1.nome = "Livia";
        c1.saldo = 200;
        c1.mostrarInfo();
        // contas[], guarda uma conta; c1, é uma conta preenchida. Então podemos atribuir c1 a contas
        contas[1] = c1; // conta 1 tem duas referencias

        // Criando uma conta direto no arrey
        contas[0] = new Conta();
        contas[0].nome = "Jack";
        contas[0].saldo = 300;
        contas[0].mostrarInfo();

        // for para acessar posição de vetores
        for(int i=0; i < contas.length; i++) // length função que sabe o tamanho do array
        {
            if(contas[i] != null)
            {
                contas[i].mostrarInfo();
                //contas[i - 1].mostrarInfo();
            }
        }
        //for para varrer valores
        for (Conta item : contas)
        {
            if(item != null)
                item.mostrarInfo();
        }
    }
}
