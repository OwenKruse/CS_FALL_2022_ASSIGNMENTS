package path;

/**
 * This checkpoint allows the user to draw paths on a GUI as well as save and load existing paths
 * 
 * @author Jonas Jacobs
 * @version November 6, 2022
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;

public class PathEditor extends JPanel implements Runnable, MouseListener, ActionListener
	{
	 JMenuItem loadItem;
	 JMenuItem saveItem;
	 BufferedImage backdrop;
	 JMenuItem clear;
	 
	 Path path = new Path();

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new PathEditor());
	}

	public void run() {
		 this.addMouseListener(this);
		 JFrame f = new JFrame();
	     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     
	     f.setMinimumSize(new Dimension(600,600));
	     JPanel topLevel = new JPanel();
	     
	 	try
    	{    		
    	    backdrop = javax.imageio.ImageIO.read(new File("src/Map.jpeg"));
    	}
    	catch (IOException e)
    	{
    		System.out.println("Could not read your path.");
    	}
	 	
	 	 JMenuBar menuBar = new JMenuBar();
	        JMenu fileMenu = new JMenu("File");
	        
	        loadItem = new JMenuItem("Load");
	        saveItem = new JMenuItem("Save");
	        clear = new JMenuItem("Clear");
	        
	        
	        menuBar.add(fileMenu);
	        fileMenu.add(loadItem);
	        fileMenu.add(saveItem);
	        fileMenu.add(clear);
	        path.add(0, 420);
	        
	        loadItem.addActionListener(this);
	        saveItem.addActionListener(this);
	        clear.addActionListener(this);
	        
	        // Put the menu bar in the frame.
	        
	        f.setJMenuBar(menuBar);
	 	
	     f.setContentPane(this);
	     f.pack();
	     
	     
	     f.setLocationRelativeTo(null);
	     f.setVisible(true);
	}
	
	public void paint (Graphics g)
    {
		g.drawImage(backdrop,0,0,null);
		
		for(int i = 0; i < path.getPointCount() - 1; i++) {
			g.setColor(Color.RED);
			g.drawLine(path.getX(i),path.getY(i), path.getX(i + 1), path.getY(i + 1));
		}
		 
    }

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		path.add(e.getX(), e.getY());
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Listens to the task bar objects and runs functions depending on what button is tapped
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == loadItem)
		{
			loadPath();
			//System.out.println("Load clicked.");
		}
		if (e.getSource() == saveItem)
		{
			savePath();
			
			//System.out.println("Save clicked.");
		} 
		if (e.getSource() == clear) 
		{
			clearPath();
		}
	}
	
	/**
	 * loads the current path and stores it on your device
	 */
	private void loadPath ()
	{
		// Ask the user for a file to load.  Restrict their choices
		// to files that end in .shapes
		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter(
		        "path files", "path");
		chooser.setFileFilter(filter);
		int result = chooser.showOpenDialog(this);
		
		if (result != JFileChooser.APPROVE_OPTION)
			return;  // Bail out - user cancelled
		
		// Get the file the user selected.
		
		File f = chooser.getSelectedFile();
	
		// Load the shapes.
		
		try
		{
			Scanner in = new Scanner(f);
			
			path = new Path(in);
			
		}
		catch (IOException e)
		{
			// It would be better to put up an error dialog box, like this:
			// JOptionPane.showConfirmDialog(this, "Could not load that file.");
			
			System.out.println("error loading.");
		}
		
		repaint();
	}
	
	/**
	 * saves the current path and stores it on your device as a File object
	 */
	private void savePath()
	{		
		JFileChooser chooser = new JFileChooser();
		int result = chooser.showSaveDialog(this);
		
		if (result != JFileChooser.APPROVE_OPTION)
			return;  // Bail out - user cancelled
		
		File f = chooser.getSelectedFile();
		
		String completeFilePath = f.getAbsolutePath();
		if(!completeFilePath.endsWith(".path"))
		    f = new File(completeFilePath + ".path");
		
		// Save the file.
		
		try
		{
			PrintWriter out = new PrintWriter(f);
			
			out.println(path.toString());  // Output the array size first.
			out.close();
		}
		catch (IOException e)
		{
			// It would be better to put up an error dialog box, like this:
			// JOptionPane.showConfirmDialog(this, "Could not load that file.");

			System.out.println("Error.");
		}
	}
	
	/**
	 * clears the current path off the GUI
	 */
	private void clearPath() {
		path = new Path();
		repaint();
	}
	
}
