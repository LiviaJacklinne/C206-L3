public class Main
{
    public static void main(String[] args)
    {
        Personagem personagens1[] = new Personagem[2];
        Personagem personagens2[] = new Personagem[2];

        Guilda guilda1 = new Guilda();
        guilda1.setNome("Humanos e Anãos");

        Guilda guilda2 = new Guilda();
        guilda2.setNome("Trolls e Orcs");

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

        personagens1[0] = anao1;
        personagens1[1] = humano1;
        guilda1.setMembros(personagens1);

        personagens2[0] = orc1;
        personagens2[1] = troll1;
        guilda2.setMembros(personagens2);



        for(int i=0; i< personagens1.length;i++)
        {
            if(personagens1[i] != null)
            {
                if(personagens1[i] instanceof Anao)
                {
                    Anao a = (Anao) personagens1[i];
                    a.mostraInfo();
                    a.endurecer();
                    a.CastarSpell();
                    a.ForTheAllience();
                    a.InvadirHorda();
                    a.entrarEmPvP();
                    a.entrarEmRaid();

                }
                else if(personagens1[i] instanceof Humano)
                {
                    Humano h = (Humano) personagens1[i];
                    h.mostraInfo();
                    h.motivar();
                    h.ForTheAllience();
                    h.InvadirHorda();
                    h.sacarArma();
                    h.entrarEmPvP();
                    h.entrarEmRaid();

                }
                else if(personagens1[i] instanceof Orc)
                {
                    Orc o = (Orc) personagens1[i];
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
                    Troll t = (Troll) personagens1[i];
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

        for(int i=0; i< personagens2.length;i++)
        {
            if(personagens2[i] != null)
            {
                if(personagens2[i] instanceof Anao)
                {
                    Anao a = (Anao) personagens2[i];
                    a.mostraInfo();
                    a.endurecer();
                    a.CastarSpell();
                    a.ForTheAllience();
                    a.InvadirHorda();
                    a.entrarEmPvP();
                    a.entrarEmRaid();

                }
                else if(personagens2[i] instanceof Humano)
                {
                    Humano h = (Humano) personagens2[i];
                    h.mostraInfo();
                    h.motivar();
                    h.ForTheAllience();
                    h.InvadirHorda();
                    h.sacarArma();
                    h.entrarEmPvP();
                    h.entrarEmRaid();

                }
                else if(personagens2[i] instanceof Orc)
                {
                    Orc o = (Orc) personagens2[i];
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
                    Troll t = (Troll) personagens2[i];
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
