import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GamePanel extends JPanel implements Runnable
{
//Dimensions of the table, based od actual real life ping pong table dimensions
    static final int GAME_WIDTH = 1000;
    static final int GAME_HEIGHT = (int)(GAME_WIDTH * (5/9));
    public final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH, GAME_HEIGHT);
    static final int BALL_DIAMETER = 20;
    static final int PADDLE_WIDTH = 25;
    static final int PADDLE_HEIGHT  = 100;
    public GamePanel()
    {

    }

    public void newBall()
    {

    }
    public void newPaddles()
    {

    }
    public void paint(Graphics g)
    {

    }
    public void draw(Graphics g)
    {

    }
    public void move()
    {

    }
    public void checkCollision()
    {

    }
    public void run()
    {

    }

    public class AL extends KeyAdapter
    {
        public void keyPressed(KeyEvent e)
        {

        }
        public void keyReleased(KeyEvent e)
        {

        }
    }




}
