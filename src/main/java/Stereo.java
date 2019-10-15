import org.w3c.dom.CDATASection;

public class Stereo {

    String name;
    int volume;
    CdPlayer cdPlayer;


    public Stereo(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public void turnUpVolume() {
        this.volume += 1;
    }

    public int getVolume() {
        return this.volume;
    }

    public String playCd() {
        return cdPlayer.play();
    }

//    public void playCd() {
//
//    }
//
//    public void playRecord() {
//
//    }

}
