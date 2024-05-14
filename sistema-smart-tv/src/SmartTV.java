public class SmartTV {
    boolean ligada=false;
    int canal =1;
    int volume = 25;

    public void aumentarVolume (){
        volume++;
        System.out.println( "Aumentando o volume para" + volume);
    }

    public void diminuirVolume (){
        volume--;
        System.out.println( "Diminuindo o volume para" + volume);
}
}