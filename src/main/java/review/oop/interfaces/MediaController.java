package review.oop.interfaces;

public class MediaController {
    // Constructors
    public MediaController() {}

    // Methods
    public void playMedia(Playable playable) {
        playable.play();
    }
}
