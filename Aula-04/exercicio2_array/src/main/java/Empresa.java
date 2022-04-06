public class Empresa
{
    String cnpj;
    String endereco;
    Contato[] contato;

    // Método
    void mostrarInfo()
    {
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Endereço: " + endereco);
        System.out.println(" ");

        for(int i=0; i< contato.length; i++)
        {
            System.out.println("Nome: " + contato[i].nome);
            System.out.println("E-mail: " + contato[i].email);
            System.out.println("Telefone: " + contato[i].telefone);
            System.out.println("Data de Nascimento: " + contato[i].dataNascimento);
            System.out.println(" ");
        }
    }
}
