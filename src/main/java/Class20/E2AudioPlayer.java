package Class20;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E2AudioPlayer {
    public static void main(String[] args) throws FileNotFoundException, JavaLayerException {
        FileInputStream fis = new FileInputStream("/Users/chinosonnadi/IdeaProjects/Batch17/SdetJava17/src/main/java/Class20/Ambient-music-free.mp3");
        Player mp3Player = new Player(fis);
        mp3Player.play();
    }
}
