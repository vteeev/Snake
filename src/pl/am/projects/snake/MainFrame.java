package pl.am.projects.snake;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public static JLabel score;

    public MainFrame() throws HeadlessException {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Snake");

        score = new JLabel("Score: ", SwingConstants.CENTER);
        score.setFont(new Font(score.getFont().getName(), Font.BOLD, 30));

        add(new MainPanel());
        add(score, BorderLayout.NORTH);
        pack();
        setLocationRelativeTo(null);

        setResizable(false);
    }

}
