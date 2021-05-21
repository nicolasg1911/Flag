package model;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Flag {
	public final static String ESC   = "\u001b[";
	public double width=4;
	public int height=1;
	private char space=' ';
	private BufferedWriter printer;
	private int sleep;
	private int color;
	private int position;
	private int size;
	
	public Flag(int color, int sleep,int position,int size) {
		this.color=color;
		this.sleep=sleep;
		this.position=position;
		this.size=size;
		printer= new BufferedWriter(new OutputStreamWriter(System.out));
	}
	public void initialize() throws IOException, InterruptedException {
		printer.write(ESC+position+";"+0+"f");
		while(height<100) {

		for (int i = 0; i < size; i++) {
			printer.write(ESC+color+"m"+space);
			printer.flush();
			Thread.sleep(sleep);
			int x=position+i;
			printer.write(ESC+x+";"+height+"f");
		}
			printer.write(ESC+color+"m"+space);
			printer.flush();
			height++;
			printer.write(ESC+position+";"+height+"f");
		}
	}

}
