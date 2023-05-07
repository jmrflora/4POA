package br.com.faeterj;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Cobra extends JLabel implements Runnable{
	private Thread cobra = null;
	private static int pos = 0;
	private String cor;
	private int x;
	private int y;
	private ImageIcon img;
	
	public Cobra(String cor, ImageIcon img, int x, int y) {
		super(img);
		this.cor = cor;
		this.img = img;
		this.x =x;
		this.y = y;
		
		cobra = new Thread(this, cor);
		cobra.start();
	}
	
	public void run() {
		x += new Random().nextInt(7) + 100;
		this.setLocation(x,y);
		if (x >= 1000) {
			pos++;
			JOptionPane.showMessageDialog (null, pos+")"+cor);
			return;
			
		}
		try {
			Thread.sleep(new Random().nextInt(5) * 100);
			run();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
