package br.inatel.cdg.prova03;

import java.io.*;
import java.util.ArrayList;
import java.io.FileOutputStream;
import java.util.Scanner;


public class Arquivo
{
    public void escrever(Pedido f1)
    {
        //Scanner sc = new Scanner(System.in);

        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        try
        {
            os = new FileOutputStream("arquivoPedidos.txt", true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            bw.write("Pedido");
            bw.newLine();
            bw.write(f1.getId() + "\n");
            bw.write(f1.getTipoMadeira()+ "\n");
            bw.write(f1.getPrecoProducao() + "\n");
            bw.write(f1.getPrecoVenda()+ "\n");

        }
        catch (Exception e)
        {
            System.out.println("O preço de producao não pode ser maior que o preco de venda (prejuizo)");
        }
        finally
        {
            try
            {
                bw.close();
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }

    }

    public ArrayList<Pedido> ler()
    {
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        String linhaLer = null;

        ArrayList<Pedido> acheiNoArquivo = new ArrayList<>();

        try
        {
            is = new FileInputStream("arquivoPedido.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            linhaLer = br.readLine();
            while(linhaLer != null)
            {
                if(linhaLer.contains("Funcionario"))
                {
                    Pedido aux = new Pedido();
                    aux.setId(Integer.parseInt(br.readLine()));
                  //sc.next();
                    aux.setTipoMadeira(br.readLine());
                    aux.setPrecoProducao(Double.parseDouble(br.readLine()));
                    aux.setPrecoVenda(Double.parseDouble(br.readLine()));
                    acheiNoArquivo.add(aux);
                }
                linhaLer = br.readLine();
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            try
            {
                assert br != null;
                br.close();
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
        return  acheiNoArquivo;
    }
}
