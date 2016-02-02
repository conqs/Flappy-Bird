/**
 * FlappyBird.java
 * Main game class
 *
 * @author  Paul Krishnamurthy
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class FlappyBird extends JFrame implements ActionListener {

	GamePanel game;
	Timer gameTimer;
	Timer spritesTimer;

	private boolean spacePress;
	private final int DELAY = 10;

	public FlappyBird () {

		super("Flappy Bird");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(375, 667);

		gameTimer = new Timer(DELAY, this);
		gameTimer.start();

		game = new GamePanel();
		add(game);

		setResizable(false);
		setVisible(true);	

	}

	public void actionPerformed (ActionEvent e) {
		if (game != null && game.ready) {
			game.repaint();
		}
	}


	public static void main(String[] args) {

		FlappyBird game = new FlappyBird();

	}

}

