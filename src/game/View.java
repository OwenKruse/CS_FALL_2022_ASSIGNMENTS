package game;

/*
 * @Author Jonas Jacobs
 */

import javax.swing.*;
import java.awt.*;

public class View extends JPanel {
    private State state;
    private Control control;

    public View(Control control, State state) {
        this.control = control;
        this.state = state;
        JFrame frame = new JFrame("Tower Defense");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setMinimumSize(new Dimension(600, 600));
        this.setPreferredSize(this.getMinimumSize());
        frame.setSize(getPreferredSize());
        frame.setContentPane(this);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        for (GameObject go : state.getFrameObjects())
            if (go.isVisible() && !go.isExpired())
                go.draw(g);
    }

}