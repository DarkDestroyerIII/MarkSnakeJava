package com.move;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;
public class Move {

	public static void main(String[] args) {
		SnakeHead head = new SnakeHead();
		SnakeHead headForFun = new SnakeHead();
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		System.out.println("Screen width " + screenSize.getWidth() + "screen height " + screenSize.getHeight() );
		System.out.println("width " + head.head.getSize().getWidth() );
			
	}

}
