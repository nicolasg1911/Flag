package model;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Flag {
	public final static String ESC   = "\u001b[";
	public static double width=4;
	public static double height=1;
	private char space=' ';
	private BufferedWriter printer;
	private long sleep;
	private int color;
	
	public Flag(int color, long sleep) {
		this.color=color;
		this.sleep=sleep;
		printer= new BufferedWriter(new OutputStreamWriter(System.out));
	}
	public void initialize() throws IOException, InterruptedException {
		printer.write(ESC+0+";"+0+"f");
		while(height<50) {
			printer.write(ESC+color+"m"+space);
			printer.flush();
			Thread.sleep(sleep);
			height++;
			printer.write(ESC+0+";"+height+"f");
		}
	}

}
