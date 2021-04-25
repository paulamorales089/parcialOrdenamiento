package model;

import processing.core.PApplet;

public class Dogs {
	private PApplet app;
	private int posXdog, posYdog;
	private String id;
	private String name;
	private String breed;
	private String birthday;
	String [] dog1;
	String [] dog2;
	
	String [] textDogs1;
	String [] textDogs2;
	
	public Dogs (PApplet app) {
		this.app= app;
		this.posXdog = posXdog;
		this.posYdog = posYdog;
		this.id = id;
		this.name = name;
		this.breed = breed;
		this.birthday = birthday;
	
}
	public void loadDogsText(PApplet app) {
		
		dog1 = app.loadStrings("./imports/TXT1");
		dog2 = app.loadStrings("./imports/TXT2");
		
	}
	
	public void separateDogsText() {
		for (int i = 0; i < dog1.length; i++) {
			String[] textDogs1 = dog1[i].split(" ");
			
			String id = textDogs1 [0];
			String name = textDogs1[1];
		System.out.println(dog1 [0]);
		}
		
		for (int j = 0; j < dog2.length; j++) {
			String[] textDogs2 = dog2[j].split(" ");
			
			if (id == textDogs2[0]) {
				String breed = textDogs2[1];
				String birthday = textDogs2[2];
				//System.out.println(textDogs2 [1]);
			}
		}
		
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
