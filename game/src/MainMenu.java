import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class MainMenu {


	@SuppressWarnings({ "unchecked", "rawtypes" })
	public JLabel Title()
	{
		JLabel label = new JLabel();
		Font fnt = new Font("arial", Font.BOLD, 50);
		label.setFont(fnt);
		label.setForeground(Color.white);
		label.setHorizontalTextPosition(SwingConstants.CENTER);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		Map attributes = fnt.getAttributes();
		attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		label.setFont(fnt.deriveFont(attributes));
		label.setText("Main Menu");
		return label;
		
	}
	
	public JButton newGame()
	{
		Border emptyBorder = BorderFactory.createEmptyBorder();
		JButton label = new JButton();
		Font fnt = new Font("arial", Font.BOLD, 30);
		label.setFont(fnt);
		label.setForeground(Color.white);
		label.setHorizontalTextPosition(SwingConstants.CENTER);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBorder(emptyBorder);
		label.setBackground(Color.black);
		label.setText("New Game");
		return label;
	}
	
	
	public JButton loadGame()
	{
		Border emptyBorder = BorderFactory.createEmptyBorder();
		JButton label = new JButton();
		Font fnt = new Font("arial", Font.BOLD, 30);
		label.setFont(fnt);
		label.setForeground(Color.white);
		label.setHorizontalTextPosition(SwingConstants.CENTER);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBorder(emptyBorder);
		label.setBackground(Color.black);
		label.setText("Load Game");
		return label;
	}
	
	public JButton exitGame()
	{
		Border emptyBorder = BorderFactory.createEmptyBorder();
		JButton label = new JButton();
		Font fnt = new Font("arial", Font.BOLD, 30);
		label.setFont(fnt);
		label.setForeground(Color.white);
		label.setHorizontalTextPosition(SwingConstants.CENTER);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBorder(emptyBorder);
		label.setBackground(Color.black);
		label.setText("Exit Game");
		return label;
	} 
	
	
	
}
