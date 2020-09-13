package main;

import controller.Threadid;

public class Principal {
	public static void main(String[] args) {
		for (int i = 0; i <5; i++) {
			Thread threadid = new Threadid();
			threadid.start();
		}
	}
}
