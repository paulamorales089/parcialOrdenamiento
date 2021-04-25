package model;

import java.util.LinkedList;

import processing.core.PApplet;

public class Logic {
	private PApplet app;
	private String textNew  [];
	private LinkedList <Dogs> listDogs;
	
	private int posX1;
	private int posX2;
	
	private int posY1;
	private int posY2;

	public Logic (PApplet app) {
		this.app=app;
		listDogs = new LinkedList <Dogs> ();
		//this.posX1=
		
	}
	
	public void draw () {
		
	}
	
	public void sortList () {
		
		
	}
	
	public void clickZone (PApplet app) {
		if(app.mouseX < 100 && app.mouseX >20 && app.mouseY < 80 && app.mouseY > 45){
			System.out.println("sirve");
		}

		if(app.mouseX < 220 && app.mouseX >120 && app.mouseY < 80 && app.mouseY > 45){
			System.out.println("sirve2");
		}
		
		if(app.mouseX < 340 && app.mouseX >240 && app.mouseY < 80 && app.mouseY > 45){
			System.out.println("sirve3");
		}

		if(app.mouseX < 480 && app.mouseX >360 && app.mouseY < 80 && app.mouseY > 45){
			System.out.println("sirve4");
		}
		
		
		
		
	}
	
	public void saveNewText () {
		
	}
}
