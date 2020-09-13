package controller;

public class Threadid extends Thread{
	public Threadid() {
	}
	public void run(){
		int id = (int) getId();
		System.out.println(id);
	}	
}

