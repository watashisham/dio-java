public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume(); //diminui o volume para 24
        smartTv.diminuirVolume(); //diminui o volume para 23
        smartTv.diminuirVolume(); //diminui o volume para 22
        smartTv.aumetarVolume(); //aumenta o volume para 23

        System.out.println("Canal Atual ? : " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal Atual ? : " + smartTv.canal);

        System.out.println("Volume Atual ? : " + smartTv.volume);

        System.out.println("TV Ligada ? : " + smartTv.ligada);
        System.out.println("Canal Atual ? : " + smartTv.canal);
        System.out.println("Volume Atual ? : " + smartTv.volume);
       
        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada? : " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> TV Ligada? : " + smartTv.ligada);
    }
}
