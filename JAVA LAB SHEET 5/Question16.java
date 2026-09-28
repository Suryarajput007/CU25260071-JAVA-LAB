// Question 16: Camera + MusicPlayer → Smartphone
package question16;

// Camera   MusicPlayer
//     \     /
//    Smartphone
interface Camera      { void takePhoto(); }
interface MusicPlayer { void playMusic(); }

class Smartphone implements Camera, MusicPlayer {
    @Override public void takePhoto()  { System.out.println("Smartphone: photo captured."); }
    @Override public void playMusic()  { System.out.println("Smartphone: playing music."); }
}

public class Question16 {
    public static void main(String[] args) {
        Smartphone s = new Smartphone();
        s.takePhoto();
        s.playMusic();
    }
}
