package com.jpa.pbc;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

import javax.swing.JFrame;

import com.jpa.pbc.entity.mob.Player;
import com.jpa.pbc.level.Level;
import com.jpa.pbc.level.map2;
import com.jpa.pbc.system.Keyboard;
import com.jpa.pbc.system.Screen;
import com.jpa.pbc.tiles.TileCoordinate;

public class Game extends Canvas implements Runnable {
	
	private static final long serialVersionUID = 1L;
	public static int width = 300;
	public static int height = width / 16 * 9;
	public static int scale = 3;
	final public static String gametitle = "Pokémon Simulation ";
	
	
	private Thread thread;
	private JFrame frame;
	private Keyboard key;
	private Level level;
	private  Player player;
	private boolean running = false;
	private BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
	private int[] pixels = ((DataBufferInt)image.getRaster().getDataBuffer()).getData();
	private Screen screen;
	
	public Game()
	{
		Dimension size = new Dimension(width * scale, height * scale);
		setPreferredSize(size);
		
		screen = new Screen(width, height);
		frame = new  JFrame();
		key = new Keyboard();
		addKeyListener(key);
		TileCoordinate ps = new TileCoordinate(6, 0);
		player = new Player(ps.x(), ps.y(), key);
		level = new Level("/maps/a1.png");
		level.add(player);
		/*level = new map2();	
		level.add(player, level);*/
	}
	
	public synchronized void start()
	{
		running = true;
		thread = new Thread(this, "Display");
		thread.start();
	}
	
	public synchronized void stop()
	{
		level.destroy();
		running = false;
		try { thread.join();}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
	public void run() 
	{
		
		long lastTime = System.nanoTime();
		long timer = System.currentTimeMillis();
		final double ns = 1000000000.0 / 60.0;
		double delta = 0;
		int frames = 0, updates = 0;
		requestFocus();
		
		while (running)
		{
			
			long now = System.nanoTime();
			delta += (now - lastTime)/ ns;
			lastTime = now;
			while (delta >= 1)
			{
				if(hasFocus()) update();
				updates++;
				delta--;
			}
			render();
			frames++;
			if(System.currentTimeMillis() - timer > 1000)
			{
				timer += 1000;
				frame.setTitle(gametitle + " UPS: "+ updates +"    FPS:" + frames + " x:" + player.x + " y:" + player.y);
				updates = 0; frames = 0;
			}
			else{
				
			}
		}
		stop();
		
	}
	
	
	private void render() {
		
		BufferStrategy bs = getBufferStrategy();
		if (bs == null)
		{
			createBufferStrategy(3);
			return;
		}
		screen.clear();
		int xscroll = player.x - screen.width / 2;
		int yscroll = player.y - screen.height / 2;
		level.render(xscroll, yscroll, screen);
		for (int i = 0; i < pixels.length; i++)
		{
			pixels[i] = screen.pixels[i];
		}
		Graphics g = bs.getDrawGraphics();
		g.fillRect(0, 0, getWidth(), getHeight());
		g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
		g.dispose();
		bs.show();
	
	}

	private void update() {
		key.update();
		player.update();

	}

	public static void main(String[] args) {
		
		Game game = new Game();
		game.frame.setResizable(false);
		game.frame.add(game);
		game.frame.pack();
		game.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		game.frame.setLocationRelativeTo(null);
		game.frame.setVisible(true);
		
		game.start();
	
	}

}
