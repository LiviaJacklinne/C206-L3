package br.inatel.cdg;

import br.inatel.cdg.cliente.Cliente;
import br.inatel.cdg.conta.Conta;

public class Main
{
    public static void main(String[] args)
    {
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Livia");
        cliente1.setCPF(1234);

        Conta conta1 = new Conta();
        conta1.depositar(50);
        conta1.saca(200);
        conta1.extrato();
        conta1.saca(20);
        conta1.extrato();

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Ramos");
        cliente2.setCPF(4321);

        Conta conta2 = new Conta();
        conta2.depositar(200);
        conta2.saca(50);
        conta2.extrato();

    }
}
