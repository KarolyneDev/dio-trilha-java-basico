import javax.sound.midi.SysexMessage;

public class Usuario {
    public static void main(String[] args)throws Exception {
        SmartTV smartTV = new SmartTV();

        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.diminuirVolume();

        System.out.println("Volume Atual " + smartTV.volume);


        System.out.println("TV LIGADA? " + smartTV.ligada);
        System.out.println("CANAL ATUAL " + smartTV.canal);
        System.out.println("VOLUME ATUAL " + smartTV.volume);
    }
}
