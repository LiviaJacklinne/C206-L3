public class Main
{
    public static void main(String[] args)
    {
        Personagem personagens[] = new Personagem[3];

        Samurai samurai1 = new Samurai("Samurai",10,10,10);
        /*samurai1.setNome("Samurai");
        samurai1.setVitalidade(10);
        samurai1.setInteligencia(10);
        samurai1.setFe(10);*/

        Astrologo astrologo1 = new Astrologo("Astrologo",10,10,10);
        /*astrologo1.setNome("Astrologo");
        astrologo1.setVitalidade(10);
        astrologo1.setInteligencia(10);
        astrologo1.setFe(10);*/

        Confessor confessor1 = new Confessor("Confessor",10,10,10);
        /*confessor1.setNome("Confessor");
        confessor1.setVitalidade(10);
        confessor1.setInteligencia(10);
        confessor1.setFe(10);*/

        personagens[0] = samurai1;
        personagens[1] = astrologo1;
        personagens[2] = confessor1;

        for (int i=0; i<personagens.length; i++)
        {
            if(personagens[i] != null)
            {
                if(personagens[i] instanceof Samurai)
                {
                    Samurai s = (Samurai) personagens[i];
                    s.mostraInfo();
                    s.passaLevel();
                    s.bonus();
                    s.ganhaHabilidade();
                    s.aprendeCura();
                    s.cura();
                    s.mostraInfo();

                }
                else if(personagens[i] instanceof Astrologo)
                {
                    Astrologo a = (Astrologo) personagens[i];
                    a.mostraInfo();
                    a.passaLevel();
                    a.bonus();
                    a.ganhaHabilidade();
                    a.aprendeFeitico();
                    a.usaFeitico(4);
                    a.aprendeCura();
                    a.cura();
                    a.mostraInfo();

                }
                else // Confessor
                {
                    Confessor c = (Confessor) personagens[i];
                    c.mostraInfo();
                    c.passaLevel();
                    c.bonus();
                    c.ganhaHabilidade();
                    c.aprendeCura();
                    c.cura();
                    c.mostraInfo();

                }
            }
        }
        System.out.println("Contador: " + Personagem.contador);

    }
}
