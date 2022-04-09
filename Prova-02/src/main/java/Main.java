public class Main
{
    public static void main(String[] args)
    {
        Personagem personagens[] = new Personagem[4];

        Guilda guilda1 = new Guilda();
        guilda1.setNome("Humanos e Anãos");
        guilda1.setMembros(personagens);

        Guilda guilda2 = new Guilda();
        guilda2.setNome("Trolls e Orcs");
        guilda2.setMembros(personagens);

        Anao anao1 = new Anao("Medio");
        anao1.setNome("Anao 1");
        anao1.setVida(30);
        anao1.setClasse("Cacador");

        Humano humano1 = new Humano("Grande");
        humano1.setNome("Humano 1");
        humano1.setVida(35);
        humano1.setClasse("Paladino");

        Orc orc1 = new Orc("Verde");
        orc1.setNome("Orc 1");
        orc1.setVida(25);
        orc1.setClasse("Guerreiro");

        Troll troll1 = new Troll("Media");
        troll1.setNome("Troll 1");
        troll1.setVida(45);
        troll1.setClasse("Xama");

        personagens[0] = anao1;
        personagens[1] = humano1;
        personagens[2] = orc1;
        personagens[3] = troll1;

        for(int i=0; i< personagens.length;i++)
        {
            if(personagens[i] != null)
            {
                if(personagens[i] instanceof Anao)
                {
                    Anao a = (Anao) personagens[i];
                    a.mostraInfo();
                    a.endurecer();
                    a.CastarSpell();
                    a.ForTheAllience();
                    a.InvadirHorda();
                    a.entrarEmPvP();
                    a.entrarEmRaid();

                }
                else if(personagens[i] instanceof Humano)
                {
                    Humano h = (Humano) personagens[i];
                    h.mostraInfo();
                    h.motivar();
                    h.ForTheAllience();
                    h.InvadirHorda();
                    h.sacarArma();
                    h.entrarEmPvP();
                    h.entrarEmRaid();

                }
                else if(personagens[i] instanceof Orc)
                {
                    Orc o = (Orc) personagens[i];
                    o.mostraInfo();
                    o.enfurecer();
                    o.sacarArma();
                    o.ForTheHorde();
                    o.InvadirAlianca();
                    o.entrarEmPvP();
                    o.entrarEmRaid();
                }
                else // TROLL
                {
                    Troll t = (Troll) personagens[i];
                    t.mostraInfo();
                    t.regenerar();
                    t.ForTheHorde();
                    t.InvadirAlianca();
                    t.CastarSpell();
                    t.entrarEmPvP();
                    t.entrarEmRaid();

                }

            }
        }

        guilda1.mostraInfo();
        guilda2.mostraInfo();

        System.out.println("Personagens Criados: " + Personagem.getPersonagensCriados());

    }
}
