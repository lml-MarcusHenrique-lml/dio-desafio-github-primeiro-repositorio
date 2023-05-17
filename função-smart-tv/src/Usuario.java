import javax.xml.transform.SourceLocator;

public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("A tv está ligada? "+ smartTv.ligada);
        System.out.println("Qual o canal atual da TV? Canal " + smartTv.canal);
        System.out.println("Qual é o volume da TV ? Volume "+ smartTv.volume);

        smartTv.ligar();
        System.out.println("A tv está ligada? " + smartTv.ligada);

        smartTv.deligar();
        System.out.println("A Tv está ligada? "+ smartTv.ligada);

        smartTv.mudarCanal(13);
        System.out.println(" Canal: "+smartTv.canal);

        smartTv.aumentarVolume();
        System.out.println("Volume: "+smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println("Volume: "+smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println("Volume: "+smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println("Volume: "+smartTv.volume);

        System.out.println(smartTv.volume);
    }

}
