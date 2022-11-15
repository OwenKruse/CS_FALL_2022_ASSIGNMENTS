package assignment04;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JPanel;

public class RubiksPanel extends JPanel {
	public void paint(Graphics g) {
		super.paintChildren(g);
		g.setColor(Color.GRAY);

		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		makeCube4x4(g, 100, 100);
		makeCube4x4(g, 600, 600);

		makeCube2x2(g, 300, 200);
		
		makeCube3x3(g, 500, 100);
		makeCube3x3(g, 600, 300);
	


		makeCube4x4(g, 75, 350);

	}
	// Draws a black background then a 4x4 cube that has a random color. RED, GREEN, BLUE, ORANGE, WHITE, or
	// YELLOW

	public void makeCube4x4(Graphics g, int x, int y) {
		g.setColor(Color.BLACK);
		g.fillRect(x-17, y-17, 450, 450);
		for (int z = y; z < y + 420; z = z + 105) {
			for (int i = x; i < x + 420; i = i + 105) {
				int random = (int) ((Math.random() * 6) + 1);
				if (random == 1) {
					g.setColor(Color.WHITE);
					g.fillRect(i, z, 100, 100);
					g.drawRect(i, z, 100, 100);
				} else if (random == 2) {
					g.setColor(Color.RED);
					g.fillRect(i, z, 100, 100);
					g.drawRect(i, z, 100, 100);
				} else if (random == 3) {
					g.setColor(Color.GREEN);
					g.fillRect(i, z, 100, 100);
					g.drawRect(i, z, 100, 100);
				} else if (random == 4) {
					g.setColor(Color.BLUE);
					g.fillRect(i, z, 100, 100);
					g.drawRect(i, z, 100, 100);
				} else if (random == 5) {
					g.setColor(Color.ORANGE);
					g.fillRect(i, z, 100, 100);
					g.drawRect(i, z, 100, 100);
				} else if (random == 6) {
					g.setColor(Color.YELLOW);
					g.fillRect(i, z, 100, 100);
					g.drawRect(i, z, 100, 100);
				}
			}
		}
	}
	// Draws a black background then a 3x3 cube that has a random color. RED, GREEN, BLUE, ORANGE, WHITE, or
	// YELLOW

	public void makeCube3x3(Graphics g, int x, int y) {
		g.setColor(Color.BLACK);
		g.fillRect(x-17, y-17, 345, 345);
		for (int z = y; z < y + 315; z = z + 105) {
			for (int i = x; i < x + 315; i = i + 105) {
				int random = (int) ((Math.random() * 6) + 1);
				if (random == 1) {
					g.setColor(Color.WHITE);
					g.fillRect(i, z, 100, 100);
					g.drawRect(i, z, 100, 100);
				} else if (random == 2) {
					g.setColor(Color.RED);
					g.fillRect(i, z, 100, 100);
					g.drawRect(i, z, 100, 100);
				} else if (random == 3) {
					g.setColor(Color.GREEN);
					g.fillRect(i, z, 100, 100);
					g.drawRect(i, z, 100, 100);
				} else if (random == 4) {
					g.setColor(Color.BLUE);
					g.fillRect(i, z, 100, 100);
					g.drawRect(i, z, 100, 100);
				} else if (random == 5) {
					g.setColor(Color.ORANGE);
					g.fillRect(i, z, 100, 100);
					g.drawRect(i, z, 100, 100);
				} else if (random == 6) {
					g.setColor(Color.YELLOW);
					g.fillRect(i, z, 100, 100);
					g.drawRect(i, z, 100, 100);
				}
			}
		}
	}
	// Draws a black background then a 2x2 cube that has a random color. RED, GREEN, BLUE, ORANGE, WHITE, or
	// YELLOW

	public void makeCube2x2(Graphics g, int x, int y) {
		g.setColor(Color.BLACK);
		g.fillRect(x-17, y-115, 240, 240);
		for (int z = 100; z < 210; z = z + 105) {
			for (int i = x; i < x + 210; i = i + 105) {
				int random = (int) ((Math.random() * 6) + 1);
				if (random == 1) {
					g.setColor(Color.WHITE);
					g.fillRect(i, z, 100, 100);
					g.drawRect(i, z, 100, 100);
				} else if (random == 2) {
					g.setColor(Color.RED);
					g.fillRect(i, z, 100, 100);
					g.drawRect(i, z, 100, 100);
				} else if (random == 3) {
					g.setColor(Color.GREEN);
					g.fillRect(i, z, 100, 100);
					g.drawRect(i, z, 100, 100);
				} else if (random == 4) {
					g.setColor(Color.BLUE);
					g.fillRect(i, z, 100, 100);
					g.drawRect(i, z, 100, 100);
				} else if (random == 5) {
					g.setColor(Color.ORANGE);
					g.fillRect(i, z, 100, 100);
					g.drawRect(i, z, 100, 100);
				} else if (random == 6) {
					g.setColor(Color.YELLOW);
					g.fillRect(i, z, 100, 100);
					g.drawRect(i, z, 100, 100);
				}
			}
		}
	}
}
