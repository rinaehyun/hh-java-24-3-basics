package grouptasks.templates;

import javax.print.attribute.standard.Media;

public class Main {
    public static void main(String[] args) {

        // Initialize objects with interface (Polymorphism)
        Playable mp = new MusicPlayer();
        Playable vmp = new VideoPlayer();

        // Test a method with Object as a parameter
        MediaController mc = new MediaController();
        mc.playMedia(mp);
        mc.playMedia(vmp);

    }
}
