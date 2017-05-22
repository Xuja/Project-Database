package Display;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Display {
	private JFrame frame;
	private JPanel jpanel;

	private String title;
	private int width, height;

	public Display(String title, int width, int height) {
		this.title = title;
		this.width = width;
		this.height = height;

		createDisplay();
	}

	private void createDisplay() {
		frame = new JFrame(title);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		jpanel = new JPanel();
		jpanel.setPreferredSize(new Dimension(width, height));
		jpanel.setMaximumSize(new Dimension(width, height));
		jpanel.setMinimumSize(new Dimension(width, height));
		jpanel.setFocusable(false);

		frame.add(jpanel);
		frame.pack();
	}

	public JPanel getJpanel() {
		return jpanel;
	}

	public JFrame getFrame() {
		return frame;
	}

}

