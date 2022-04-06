public class Main
{
    public static void main(String[] args)
    {
        // Criando uma instância = new
        // Construtor padrão, implicito
        Empresa empresa = new Empresa();
        empresa.cnpj = "1234";
        empresa.endereco = "Residencial Aldeia do Vale";

        // Criando uma instância = new
        Contato[] contato = new Contato[3];

        { // Construtor padrão
            //Criando um objeto
            contato[0] = new Contato();
            contato[0].nome = "Maraisa";
            contato[0].email = "maraisa@inate.br";
            contato[0].telefone = "9988-7766";
            contato[0].dataNascimento = "31/12/1987";
        }

        {
            // Criando um objeto
            Contato c1 = new Contato();
            c1.nome = "Maiara";
            c1.email = "maiara@inatel.br";
            c1.telefone = "5544-3322";
            c1.dataNascimento = "31/12/1987";
            contato[1] = c1;
        }

        { // Construtor por paramentro
            // Criando um objeto
            Contato c2 = new Contato("Marilia","marilia.mendonça@inatel.br","9912-5003");

            // OBS: deixei um atributo fora dos parametros e atribui em baixo
            c2.dataNascimento = "22/07/1995";
            contato[2] = c2;
        }

        // Agregação
        empresa.contato = contato;

        // Chamando o metódo
        empresa.mostrarInfo();

    }
}
