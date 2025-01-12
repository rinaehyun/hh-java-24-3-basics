package review.oop.interfaces;

public class Main {
    public static void main(String[] args) {
        // Example from tutorial
        Shape circle = new Circle(3.5);
        Shape square = new Square(3);

        System.out.println(circle.calculateArea());
        System.out.println(square.calculateArea());

        // Example from challenges
        Playable musicPlayer = new MusicPlayer();
        Playable videoPlayer = new VideoPlayer();

        MediaController mediaController = new MediaController();
        mediaController.playMedia(musicPlayer);
        mediaController.playMedia(videoPlayer);
    }
}
