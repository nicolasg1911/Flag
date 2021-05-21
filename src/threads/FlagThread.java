package threads;

import java.io.IOException;

import model.Flag;

public class FlagThread extends Thread{

	private Flag flag;
	
	public FlagThread(int color, long sleep) {
		flag= new Flag(color,sleep);
	}
	public void run() {
		try {
			flag.initialize();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
