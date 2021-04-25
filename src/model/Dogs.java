package model;

import java.util.LinkedList;

import processing.core.PApplet;

public class Dogs {
	private PApplet app;
	private int posXdog, posYdog;
	private int id, id2;
	private String name;
	private String breed;
	private String birthday;
	String [] dog1;
	String [] dog2;
	
	String [] textDogs1;
	String [] textDogs2;
	
	
	private LinkedList <Dogs> listDogs;
	
	public Dogs (PApplet app, int id, String name, String breed, String birthday) {
		this.app= app;
		this.posXdog = posXdog;
		this.posYdog = posYdog;
		this.id = id;
		this.name = name;
		this.breed = breed;
		this.birthday = birthday;
		listDogs = new LinkedList<Dogs>();
}
	public void loadDogsText(PApplet app) {
		
		dog1 = app.loadStrings("./imports/TXT1");
		dog2 = app.loadStrings("./imports/TXT2");
		
	}
	
	public void separateDogsText(PApplet app) {
		for (int i = 0; i < dog1.length; i++) {
			String[] textDogs1 = dog1[i].split(" ");
			
			id = Integer.parseInt(textDogs1[0]);
			
			//String id = textDogs1 [0];
		/*String*/ name = textDogs1[1];
		//System.out.println(dog1 [0]);
		}
		
		for (int j = 0; j < dog2.length; j++) {
			String[] textDogs2 = dog2[j].split(" ");
			
			 id2 = Integer.parseInt (textDogs2[0]);
			
			if (id == id2) {
				 breed = textDogs2[1];
				 birthday = textDogs2[2];
				//System.out.println(textDogs2 [1]);
				//listDogs.add (new Dogs (app, id, name, breed, birthday));
				 
			}
		}
	}
	
	public void drawDogs (int x, int y) {
		
		/*app.text(id, x, y);
		app.text(name, x + 60, y);
		app.text(breed, x + 180, y);
		app.text(birthday, x + 320, y);*/ 

		app.text("Id:" + id, x, y);
		app.text("Name:" + name, x, y + 20);
		app.text("Breed:" + breed, x, y + 40);
		app.text("Date:" + birthday, x, y + 60);
		
		
	}
	
	public int getPosXdog() {
		return posXdog;
	}
	public void setPosXdog(int posXdog) {
		this.posXdog = posXdog;
	}
	
	
	public int getPosYdog() {
		return posYdog;
	}
	public void setPosYdog(int posYdog) {
		this.posYdog = posYdog;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId2() {
		return id2;
	}
	public void setId2(int id2) {
		this.id2 = id2;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
}
