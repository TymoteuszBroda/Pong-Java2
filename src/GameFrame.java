import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame
{
    GamePanel panel;
    public GameFrame()
    {
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("Pong");
        this.setResizable(false);
        this.setBackground(Color.BLACK);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
