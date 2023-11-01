package co.edu.uptc.view;

import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class MyFrame extends JFrame {
	private MenuPanel menu;
	public MyFrame(){
		super("SnakeGame");
		menu =new MenuPanel();
		add(menu);
		initComponents();


	}
	private void initComponents() {
		setIconImage(new ImageIcon(getClass().getResource("/resources/serpiente.png")).getImage());
		setSize(new Dimension(1200,800));
		setResizable(false);
		setLocationRelativeTo(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);	
		}
	public static void main(String[] args) {
		new MyFrame();
	}
}

