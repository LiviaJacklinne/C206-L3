package br.inatel.cdg.prova03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Arquivo a = new Arquivo();
        Pedido p1 = new Pedido();
        Pedido p2 = new Pedido();
        Pedido p3 = new Pedido();

        /*System.out.println("Digite seu pedido, ID, Tipo Madeira, Preco Produto, Preco Venda: ");
        p1.setId(sc.nextInt());
        p1.setTipoMadeira(sc.nextLine());
        p1.setPrecoProducao(sc.nextDouble());
        p1.setPrecoVenda(sc.nextDouble());*/


        p1.setId(1);
        p1.setTipoMadeira("ype");
        p1.setPrecoProducao(15);
        p1.setPrecoVenda(30);

        p3.setId(2);
        p3.setTipoMadeira("bambu");
        p3.setPrecoProducao(10);
        p3.setPrecoVenda(20);

        p2.setId(3);
        p2.setTipoMadeira("Pau Brasil");
        p2.setPrecoProducao(35);
        p2.setPrecoVenda(50);

        ArrayList<Pedido> pedido = new ArrayList<Pedido>();
        pedido.add(p1);
        pedido.add(p2);
        pedido.add(p3);

        a.escrever(p1);
        a.escrever(p2);
        a.escrever(p3);

        ArrayList<Pedido> funcs = a.ler();

        for(int i=0; i<funcs.size(); i++)
        {
            System.out.println("ID: " + funcs.get(i).getId());
            System.out.println("Tipo de Madeira: " + funcs.get(i).getTipoMadeira());
            System.out.println("Preco Producao: " + funcs.get(i).getPrecoProducao());
            System.out.println("Preco Venda: " + funcs.get(i).getPrecoVenda());
        }

        System.out.println("-------------");

        // Array sem ordenar
        System.out.println("**Array sem ordenar**");
        for(Pedido pedidos: pedido)
        {
            pedidos.mostraInfo();
        }

        System.out.println(" ");

        // Ordenando em ordem crescente
        Collections.sort(pedido);
        System.out.println("**Array ordenado em ordem crescente**");
        for(Pedido pedidos: pedido)
        {
            pedidos.mostraInfo();
        }

        System.out.println(" ");

        // Ordenando em ordem decrescente
        Collections.reverse(pedido);
        System.out.println("**Array ordenado em ordem decrescente**");
        for(Pedido pedidos: pedido)
        {
            pedidos.mostraInfo();
        }

        for(int i=0; i<funcs.size(); i++)
        {
            System.out.println("Lucro: " +
                    (funcs.get(i).getPrecoVenda() - funcs.get(i).getPrecoProducao()) );
        }

    }
}
