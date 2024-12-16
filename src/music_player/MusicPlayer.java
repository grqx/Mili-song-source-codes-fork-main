package music_player;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

/**
 * Created by unusuallman on 2022/05/25.
 * From:
 *   https://raw.githubusercontent.com/unusuallman/Mili-song-source-codes/refs/heads/master/src/goddrinksjava/MusicPlayer.java
 */
public class MusicPlayer {
    private SourceDataLine line;
    private boolean isPlaying;

    public MusicPlayer() {
        this.line = null;
        this.isPlaying = false;
    }

    public void loadAndPlay(String musicFilePath) {
        if (isPlaying) {
            System.err.println("Music is already playing.");
            return;
        }

        try {
            File musicFile = new File(musicFilePath);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(musicFile);
            AudioFormat format = audioStream.getFormat();

            DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);
            line = (SourceDataLine) AudioSystem.getLine(info);
            line.open(format);

            isPlaying = true;
            line.start();

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = audioStream.read(buffer, 0, buffer.length)) != -1 && isPlaying) {
                line.write(buffer, 0, bytesRead);
            }

            line.drain();
            line.stop();
            line.close();
            audioStream.close();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public void pause() {
        if (isPlaying) {
            line.stop();
            isPlaying = false;
        }
    }

    public void resume() {
        if (!isPlaying && line != null) {
            line.start();
            isPlaying = true;
        }
    }

    public void stop() {
        if (isPlaying) {
            line.stop();
            line.close();
            isPlaying = false;
        }
    }

    public boolean isPlaying() {
        return isPlaying;
    }
}