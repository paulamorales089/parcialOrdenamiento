package model;

import processing.core.PApplet;

public class Dogs {
	private PApplet app;
	private int posXdog, posYdog;
	private int id;
	private String name;
	private String breed;
	private String birthday;
	String text1;
	String text2;
	
	public Dogs (PApplet app) {
		this.app= app;
		this.posXdog=posXdog;
		this.posYdog=posYdog;
		this.id=id;
		this.name=name;
		this.breed=breed;
		this.birthday=birthday;
	
}
	public void loadText() {
		
	}
	
	public void separateText() {
		
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
