package com.move;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class SnakeHead implements KeyListener{
	
	public JFrame head;
	private int speed = 5;
	
	public SnakeHead()
	{
		head = new JFrame("First GUI");
		head.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		head.setSize(100,100);
		head.setResizable(false);
		head.setVisible(true);
		head.setLocation(0,0);
		head.addKeyListener(this);
		head.setFocusable(true);
		head.setFocusTraversalKeysEnabled(false);
		
		
	}
	
	public void setSpeed(int newSpeed)
	{
		speed = newSpeed;
	}
	
	public void moveHead(int xmove, int ymove) 
	{
		head.setLocation(head.getLocation().x + xmove*speed, head.getLocation().y + ymove*speed);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("typed " + e.getKeyChar());
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		System.out.println("typed " + e.getKeyChar());
		
		if(e.getKeyCode() ==KeyEvent.VK_RIGHT) {
			System.out.println("pressed right key");
			moveHead(1,0);
		}
		
		if(e.getKeyCode() ==KeyEvent.VK_LEFT) {
			System.out.println("pressed left key");
			moveHead(-1,0);
		}
		
		if(e.getKeyCode() ==KeyEvent.VK_UP) {
			System.out.println("pressed up key");
			moveHead(0,-1);
		}
		
		if(e.getKeyCode() ==KeyEvent.VK_DOWN) {
			System.out.println("pressed down key");
			moveHead(0,1);
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		//System.out.println("typed " + e.getKeyChar());
		
	}

}
