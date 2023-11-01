package co.edu.uptc.view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;

public class ButtonRound extends JButton {
 

	private static final long serialVersionUID = 1L;

	public ButtonRound(String value,Color color, String pathiIcon,Dimension d) {
		super(value);
		setUI(new ShapedButtonUI(color));
		setIcon(new ImageIcon(pathiIcon));
		setBorderPainted(false);
		setContentAreaFilled(false);
		setBorder(new EmptyBorder(5, 0, 5, 0));
		setCursor(new Cursor(Cursor.HAND_CURSOR));
        setForeground(new Color(48,136,96,255));
        setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 20));
		setPreferredSize(d);
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
		        setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 21));
				setBorderPainted(true);

			}
			public void mouseExited(MouseEvent e) {
		        setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 20));
				setBorder(new EmptyBorder(5, 0, 5, 0));

			}		
			public void mousePressed(MouseEvent e) {
		        setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 17));
				setBorderPainted(true);
			}
			public void mouseReleased(MouseEvent e) {
				setBorder(new EmptyBorder(5, 0, 5, 0));
		        setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 20));
				setBorderPainted(true);
			}


		});
	}

}
