package ui;

import threads.FlagThread;

public class Main {
	public final static String ESC   = "\u001b[";
	public final static int yellow=43;
	public final static int red=41;
	public final static int blue=44;
	
	public static void main(String[] args) {
		System.out.println(ESC+"2J");
	FlagThread colorYellow =new FlagThread(yellow,20,1,10);
	FlagThread colorBlue =new FlagThread(blue,50,11,5);
	FlagThread colorRed =new FlagThread(red,70,16,5);
	colorYellow.start();
	colorBlue.start();
	colorRed.start();

	}
}
