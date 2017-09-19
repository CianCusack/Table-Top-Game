import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.*;
public class SetupWindow extends JFrame{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int HEIGHT = 480;
	public static final int WIDTH = 720;

	public SetupWindow()
	{
		initUI();
	}
	
	private void initUI()
	{
		setTitle("Ludo Game");
		setSize(WIDTH,HEIGHT);
		getContentPane().setBackground(Color.black);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		MainMenu menu = new MainMenu();
		
		JButton exitButton = menu.exitGame();
		exitButton.addActionListener((ActionEvent event) ->
		{
			System.exit(0);
		});
		
		JButton newGameButton = menu.newGame();
		newGameButton.addActionListener((ActionEvent event) -> {
			System.out.println("Start a new Game");
			setupGame();
		});
		
		JButton loadGameButton = menu.loadGame();
		loadGameButton.addActionListener((ActionEvent event) ->{
			System.out.println("Load Game");
		});
		createLayout(
				menu.Title(), 
				newGameButton,
				loadGameButton,
				exitButton
		);
	}
	
	private void createLayout(JComponent... arg)
	{
		Container pane = getContentPane();
		GroupLayout gl = new GroupLayout(pane);
		pane.setLayout(gl);
		gl.setAutoCreateContainerGaps(true);
		gl.setHorizontalGroup(gl.createParallelGroup()
				.addGap(220)
				.addComponent(arg[0])
				.addComponent(arg[1])
				.addComponent(arg[2])
				.addComponent(arg[3])
				);
		gl.setVerticalGroup(gl.createSequentialGroup()
				//.addGap(200)
				.addComponent(arg[0])
				.addGap(20)
				.addComponent(arg[1])
				.addGap(20)
				.addComponent(arg[2])
				.addGap(20)
				.addComponent(arg[3])
				);
	}
	
	public void setupGame()
	{
		JOptionPane setup = new JOptionPane();
		Object[] options = {"Yes, please",
                "No, thanks",
                "No eggs, no ham!"};
		int n = JOptionPane.showOptionDialog(this,
			"Would you like some green eggs to go "
			+ "with that ham?",
			"A Silly Question",
			JOptionPane.YES_NO_CANCEL_OPTION,
			JOptionPane.QUESTION_MESSAGE,
			null,
			options,
			options[2]);
	}
	
	public static void main(String[] args)
	{
		EventQueue.invokeLater(() -> {
			SetupWindow window = new SetupWindow();
			window.setVisible(true);
		});
	}
}
