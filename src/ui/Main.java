package ui;

import threads.FlagThread;

public class Main {
	public final static String ESC   = "\u001b[";
	public final static int yellow=43;
	public final static int red=41;
	public final static int blue=44;
	
	public static void main(String[] args) {
		System.out.println(ESC+"2J");
	
	FlagThread colorY =new FlagThread(yellow,100);
	colorY.start();
	}
}
