package co.edu.uptc.view;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;

public class MenuPanel extends JPanel{
	private Image ImageBackground;
	public MenuPanel() {
		setLayout(null);
		setSize(1200,800);

		MyTextField myTextField = new MyTextField();
		myTextField.setBounds(840, 388, 267, 38);
		add(myTextField);
		
		ButtonRound btnPlay = new ButtonRound("   Jugar    ", new Color(200,215,186,255), null, (Dimension) null);
		btnPlay.setIcon(new ImageIcon(MenuPanel.class.getResource("/resources/boton-de-play.png")));
		btnPlay.setBounds(889, 436, 180, 38);
		add(btnPlay);
		
		ButtonRound btnCredits = new ButtonRound("Creditos", new Color(200, 215, 186), null, (Dimension) null);
		btnCredits.setBounds(889, 532, 180, 38);
		btnCredits.setIcon(new ImageIcon(MenuPanel.class.getResource("/resources/derechos-de-autor.png")));
		add(btnCredits);
		
		ButtonRound btnHistory = new ButtonRound("Historial", new Color(200, 215, 186), null, (Dimension) null);
		btnHistory.setBounds(889, 484, 180, 38);
		btnHistory.setIcon(new ImageIcon(MenuPanel.class.getResource("/resources/historia.png")));

		add(btnHistory);
		
		JLabel tittle = new JLabel("");
		tittle.setIcon(new ImageIcon(MenuPanel.class.getResource("/resources/tittle.png")));
		tittle.setBounds(819, 102, 689, 372);
		add(tittle);
	}
	public void paint(Graphics g) {
		ImageBackground = new ImageIcon(getClass().getResource("/resources/fondoJuego.jpg")).getImage();
		g.drawImage(ImageBackground, 0, 0, getWidth(), getHeight(), this);
		setOpaque(false);
		super.paint(g);
	}
}
