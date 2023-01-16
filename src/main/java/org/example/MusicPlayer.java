package org.example;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor // Construcotr pentru toate
@NoArgsConstructor // Default constructor

public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;
    public void playMusic() {
        System.out.println("Playing " + music.getSong());
    }
}
