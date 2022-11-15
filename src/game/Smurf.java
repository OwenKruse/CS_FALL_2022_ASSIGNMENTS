package game;

/*
 * @Author Jonas Jacobs
 */

import java.awt.*;
import java.awt.image.BufferedImage;

public class Smurf extends GameObject{
    private double percentage;
    private Control control;
	private BufferedImage image;
    public Smurf(Control control) {
        this.control = control;
        percentage = 0;
        isVisible = true;
        isExpired = false;
        image = control.getImage("ememy.jpeg");
    }

    @Override
    public void update(double elapsedTime) {
        percentage += 0.001;
    }

    @Override
    public void draw(Graphics g) {
        Point loc = control.getPath().convertToCoordinates(percentage);
        g.drawImage(image, loc.x, loc.y, null);
    }
}
