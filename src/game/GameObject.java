package game;

/**
 * @author jonasjacobs
 */

import java.awt.*;

abstract public class GameObject {
    protected boolean isVisible;
    protected boolean isExpired;

    public boolean isVisible() { return isVisible; }
    public boolean isExpired() { return isExpired; }

    abstract public void update (double elapsedTime);
    abstract public void draw (Graphics g);
}
