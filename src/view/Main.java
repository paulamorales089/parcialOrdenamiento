package view;
import model.Dogs;
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
	
	Dogs dogs;
	@Override
	public void setup() {
		dogs = new Dogs(this);
		}
	
	@Override
	public void draw() {
		background(226,2,57);
		System.out.println(mouseX + ","+ mouseY);
		rectMode(CENTER);
		saveButton ();
		dogs.loadText(this);
		}
	
	@Override
	public void mousePressed() {
		
	}
	
	public void saveButton () {
		stroke (255,213,0);
		strokeWeight(2);
		fill(255,237,173);
		rect(410,430,70,30);
		fill(6,188,193);
		textAlign(CENTER);
		textSize(20);
		text("SAVE", 410, 437);

	}
	
}
