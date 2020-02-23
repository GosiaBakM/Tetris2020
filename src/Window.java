import javax.swing.*;
import java.util.jar.JarEntry;

public class Window {
    public static final int WIDTH =300, HEIGHT = 600;
    private JFrame window;

    public Window(){
        window = new JFrame("Tetris game");
        window.setSize(WIDTH,HEIGHT);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
    public static void main(String[] args) {
        new Window();
    }
}
