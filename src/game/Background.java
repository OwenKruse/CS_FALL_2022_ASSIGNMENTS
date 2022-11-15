package game;

/*
 * @Author Jonas Jacobs
 */

public class Background extends GameObject {

    private Control control;

    public Background(Control control) {
        this.control = control;
        isVisible = true;
        isExpired = false;
    }

    public void update(double elapsedTime) {
    }

    public void draw(java.awt.Graphics g) {
        g.drawImage(control.getImage("Map.jpeg"), 0, 0, null);
    }
}
