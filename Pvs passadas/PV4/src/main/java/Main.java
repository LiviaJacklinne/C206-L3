public class Main
{
    public static void main(String[] args)
    {
        Nave nave1 = new Nave();
        nave1.setNome("Nave 1");
        nave1.setVelocidadeLuz(true);

        Jedi jedi1 = new Jedi();
        jedi1.setNome("Jedi 1");
        jedi1.setId(00);
        jedi1.setPoder(100);
        jedi1.setMestre(true);


        Sith sith1 = new Sith();
        sith1.setNome("Sith 1");
        sith1.setId(11);
        sith1.setPoder(90);
        sith1.setDarth(false);

        Droid droid1 = new Droid();
        droid1.setNome("Droid 1");
        droid1.setId(22);
        droid1.setPoder(85);
        droid1.setHostil(true);

        nave1.personagens[0] = jedi1;
        nave1.personagens[1] = sith1;
        nave1.personagens[2] = droid1;

        nave1.mostraInfo();

        for(int i=0; i< nave1.personagens.length; i++)
        {
            if(nave1.personagens[i] != null)
            {
                if(nave1.personagens[i] instanceof Jedi)
                {
                    Jedi x = (Jedi) nave1.personagens[i];

                    x.mostraInfo();
                    x.treinarPadawan();
                    x.usarForca();
                    x.trocarSabre("Vermelho");
                    x.travarBatalha();

                }
                else if(nave1.personagens[i] instanceof Sith)
                {
                    Sith y = (Sith) nave1.personagens[i];
                    y.mostraInfo();
                    y.corromperJedi();
                    y.usarForca();
                    y.trocarSabre("Azul");
                    y.travarBatalha();

                }
                else
                {
                    Droid z = (Droid) nave1.personagens[i];
                    z.mostraInfo();
                    z.hackearSistema();
                    z.travarBatalha();

                }
            }
        }

    }

}
