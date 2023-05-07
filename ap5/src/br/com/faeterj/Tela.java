package br.com.faeterj;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Tela extends JFrame implements ActionListener{
	private JButton botaoComeca;
	private JButton botaoPara;
	private JLabel pista;
	private ImageIcon cobra1;
	private ImageIcon cobra2;
	private ImageIcon cobra3;
	
	public Tela() {
		this.setLayout(null);
		this.setSize(1000, 650);
		this.setLocation(50,50);
		this.setResizable(false);
		getContentPane().setBackground(Color.white);
		
		this.setTitle("corrida de cobras");
		
		this.pista = new JLabel();
		this.pista.setBounds(0,0,1000,650);
		
		this.add(pista);
		
		this.botaoComeca = new JButton("Começa");
		this.botaoPara = new JButton("Parar");
		
		this.botaoComeca.setBounds(400,530,120,50);
		this.botaoPara.setBounds(540,530,120,50);
		
		//to do implementar cobras
		cobra1 = new ImageIcon("./src/br/com/faeterj/cobraVerde.png");
		cobra2 = new ImageIcon("./src/br/com/faeterj/cobraRoxa.png");
		cobra3 = new ImageIcon("./src/br/com/faeterj/cobraVermelha.png");
		
		this.pista.add(botaoComeca);
		this.pista.add(botaoPara);
		
		this.setVisible(true);
		
		botaoComeca.addActionListener(this);
		botaoPara.addActionListener(this);
	
	}
	
	public JLabel JLabelCarros(String nome, ImageIcon img, int posX, int posY) {
		Cobra cb = new Cobra(nome, img, posX, posY);
		cb.setSize(300, 150);
		cb.setVisible(true);
		this.add(cb);
		return cb;
	}
	
	public void actionPerformed(ActionEvent dispara) {
		if (dispara.getSource() == this.botaoComeca) {
			this.pista.add(JLabelCarros("verde", cobra1,0,50));
			this.pista.add(JLabelCarros("roxa", cobra2,0,200));
			this.pista.add(JLabelCarros("vermelha", cobra3,0,350));
		}
		if (dispara.getSource() == this.botaoPara) {
			System.exit(0);
		}
	}
	
	
	
}
