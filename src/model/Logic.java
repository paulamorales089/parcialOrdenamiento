package model;

import java.util.LinkedList;

import processing.core.PApplet;

public class Logic {
	private PApplet app;
	private String textNew  [];
	
	
	
	Dogs dogs;
	private LinkedList <Dogs> listDogs;
	
	
	
	
	
	private int posX1;
	private int posX2;
	
	private int posY1;
	private int posY2;
	
	

	public Logic (PApplet app) {
		this.app=app;
		listDogs = new LinkedList <Dogs> ();
		dogs = new Dogs (app, dogs.getId(), dogs.getName(), dogs.getBreed(), dogs.getBirthday());
		//this.posX1=
		
	}
	
	public void creatText () {
		dogs.separateDogsText(app);
		listDogs.add (new Dogs (app, dogs.getId(), dogs.getName(), dogs.getBreed(), dogs.getBirthday()));
	}
	
	public void draw () {
		
	}
	
	public void sortList () {
		// id button
		if(app.mouseX < 100 && app.mouseX >20 && app.mouseY < 80 && app.mouseY > 45){
			System.out.println("sirve");
			app.noStroke ();
			app.fill(255);
			app.rect(60,60,80,30);
			app.fill(0,95,184);
			app.textAlign(app.CENTER);
			app.textSize(15);
			app.text("Dog id", 60, 66);
		} 
		
		//name button
		if(app.mouseX < 220 && app.mouseX >120 && app.mouseY < 80 && app.mouseY > 45){
			System.out.println("sirve2");
			app.noStroke ();
			app.fill(255);
			app.rect(170,60,100,30);
			app.fill(0,95,184);
			app.textAlign(app.CENTER);
			app.textSize(15);
			app.text("Dog Name", 171, 66);
		}
		
		// breed button
		if(app.mouseX < 340 && app.mouseX >240 && app.mouseY < 80 && app.mouseY > 45){
			System.out.println("sirve3");
			app.noStroke ();
			app.fill(255);
			app.rect(290,60,100,30);
			app.fill(0,95,184);
			app.textAlign(app.CENTER);
			app.textSize(15);
			app.text("Dog Breed", 290, 66);
		}
		
		//birthday button
		if(app.mouseX < 480 && app.mouseX >360 && app.mouseY < 80 && app.mouseY > 45){
			System.out.println("sirve4");
			app.noStroke ();
			app.fill(255);
			app.rect(420,60,115,30);
			app.fill(0,95,184);
			app.textAlign(app.CENTER);
			app.textSize(15);
			app.text("Dog Birthday", 420, 66);
			
		}
	}
	
	/*public void clickZone (PApplet app) {
		if(app.mouseX < 100 && app.mouseX >20 && app.mouseY < 80 && app.mouseY > 45){
			System.out.println("sirve");
			app.noStroke ();
			app.fill(255);
			app.rect(60,60,80,30);
			app.fill(0,95,184);
			app.textAlign(app.CENTER);
			app.textSize(15);
			app.text("Dog id", 60, 66);
		} 
			
		if(app.mouseX < 220 && app.mouseX >120 && app.mouseY < 80 && app.mouseY > 45){
			System.out.println("sirve2");
			app.noStroke ();
			app.fill(255);
			app.rect(170,60,100,30);
			app.fill(0,95,184);
			app.textAlign(app.CENTER);
			app.textSize(15);
			app.text("Dog Name", 171, 66);
		}
		
		if(app.mouseX < 340 && app.mouseX >240 && app.mouseY < 80 && app.mouseY > 45){
			System.out.println("sirve3");
			app.noStroke ();
			app.fill(255);
			app.rect(290,60,100,30);
			app.fill(0,95,184);
			app.textAlign(app.CENTER);
			app.textSize(15);
			app.text("Dog Breed", 290, 66);
		}

		if(app.mouseX < 480 && app.mouseX >360 && app.mouseY < 80 && app.mouseY > 45){
			System.out.println("sirve4");
			app.noStroke ();
			app.fill(255);
			app.rect(420,60,115,30);
			app.fill(0,95,184);
			app.textAlign(app.CENTER);
			app.textSize(15);
			app.text("Dog Birthday", 420, 66);
			
		}
	}*/
	
	public void saveNewText () {
		
	}
}
