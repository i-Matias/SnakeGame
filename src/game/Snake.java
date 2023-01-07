package game;

import javax.swing.*;
import java.awt.*;

public class Snake extends JFrame {

    public Snake(){
        initUI();
    }

    private void initUI() {
        add(new Board());
        ImageIcon snake = new ImageIcon("C:\\Users\\User\\OneDrive\\Documents\\GitHub\\SnakeGame\\images\\snake.png");
        setIconImage(snake.getImage());
        setResizable(false);
        pack();

        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater( () -> {
            JFrame ex = new Snake();
            ex.setVisible(true);
        });
    }
}
