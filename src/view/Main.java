package view;
import controller.ControllerMain;
import model.Dogs;
import model.Logic;
import processing.core.PApplet;
public class Main extends PApplet{

	public static void main(String[] args) {	
		PApplet.main("view.Main");
	}
	
	int posXButton, posYButton ;
	@Override
	public void settings() {
		size(500,500);
	}
	
	Dogs doggy;
	ControllerMain controller;
	
	// solo de prueba (luego lo borras pendeja)
	Logic logic;
	
	@Override
	public void setup() {
		doggy = new Dogs(this);
		controller = new ControllerMain(this);
		
		// solo de prueba (luego lo borras pendeja)
		logic = new Logic(this);
		}
	
	@Override
	public void draw() {
		background(0,95,184);
		//System.out.println(mouseX + ","+ mouseY);
		rectMode(CENTER);
		idButton();
		saveDog2Button ();
		nameButton();
		breedButton ();
		birthdayButton ();
		doggy.loadDogsText(this);
		doggy.separateDogsText();
		
		
		
		}
	
	@Override
	public void mousePressed() {
		controller.sortList();
		// solo de prueba (luego lo borras pendeja)
		logic.clickZone(this);
		
	}
	
	public void idButton () {
		stroke (255);
		strokeWeight(2);
		noFill();
		rect(60,60,80,30);
		fill(255);
		textAlign(CENTER);
		textSize(15);
		text("Dog id", 60, 66);
	}
	
	public void nameButton () {
		stroke (255);
		strokeWeight(2);
		noFill();
		rect(170,60,100,30);
		fill(255);
		textAlign(CENTER);
		textSize(15);
		text("Dog Name", 171, 66);
	}
	public void breedButton () {
		stroke (255);
		strokeWeight(2);
		noFill();
		rect(290,60,100,30);
		fill(255);
		textAlign(CENTER);
		textSize(15);
		text("Dog Breed", 290, 66);

	}
	
	public void birthdayButton () {
		stroke (255);
		strokeWeight(2);
		noFill();
		rect(420,60,115,30);
		fill(255);
		textAlign(CENTER);
		textSize(15);
		text("Dog Birthday", 420, 66);
	}
	
	public void saveDog2Button () {
		stroke (255);
		strokeWeight(2);
		noFill();
		rect(410,430,70,30);
		fill(255);
		textAlign(CENTER);
		textSize(20);
		text("SAVE", 410, 437);
	}
	
}
