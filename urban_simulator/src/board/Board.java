package board;
import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Board extends JPanel {

	private JFrame frame;
	private String title;
	private Canvas can;
	private int width, height;
	
	public Board(String title, int width, int height)
	{
		this.title = title;
		this.width = width;
		this.height = height;
		
		createBoard();
	}
	
	private void createBoard()
	{
		frame = new JFrame(title);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		can = new Canvas();
		can.setPreferredSize(new Dimension(width, height));
		can.setMaximumSize(new Dimension(width, height));
		can.setMinimumSize(new Dimension(width, height));
		
		frame.add(can);
		frame.pack();
	}
}