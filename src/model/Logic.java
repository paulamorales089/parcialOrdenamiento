package model;

import java.util.Collections;
import java.util.LinkedList;

import processing.core.PApplet;

public class Logic {
	private PApplet app;
	private String textNew  [];
	
	
	
	Dogs dogs;
	private LinkedList <Dogs> listDogs;
	
	DogName Name;
	DogBreed Breed;
	DogBirthday Date;
	
	private int posXdog, posYdog;
	private int id, id2;
	private String name;
	private String breed;
	private String birthday;
	String [] dog1;
	String [] dog2;
	
	String [] textDogs1;
	String [] textDogs2;
	
	
	
	private int posX1;
	private int posX2;
	
	private int posY1;
	private int posY2;
	
	

	public Logic (PApplet app) {
		this.app=app;
		this.posXdog = posXdog;
		this.posYdog = posYdog;
		this.id = id;
		this.name = name;
		this.breed = breed;
		this.birthday = birthday;
		
		listDogs = new LinkedList <Dogs> ();
		
		//dogs = new Dogs (app, dogs.getId(), dogs.getName(), dogs.getBreed(), dogs.getBirthday());
		//this.posX1=
		
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
		 name = textDogs1[1];
		//System.out.println(dog1 [0]);
		}
		
		for (int j = 0; j < dog2.length; j++) {
			String[] textDogs2 = dog2[j].split(" ");
			
			 id2 = Integer.parseInt (textDogs2[0]);
			
			if (id == id2) {
				 breed = textDogs2[1];
				 birthday = textDogs2[2];
				//System.out.println(textDogs2 [1]);
				listDogs.add (new Dogs (app, id, name, breed, birthday));
				 
			}
		}
	}
	
	
	/*public void creatText () {
		dogs.separateDogsText(app);
		listDogs.add (new Dogs (app, dogs.getId(), dogs.getName(), dogs.getBreed(), dogs.getBirthday()));
	}*/
	
	public void draw () {
		
	}
	
	public void sortList () {
		// id button
		if(app.mouseX < 100 && app.mouseX >20 && app.mouseY < 80 && app.mouseY > 45){
		
		Collections.sort(listDogs);
		System.out.println("sirve");
		
			app.noStroke ();
			app.fill(255);
			app.rect(60,60,80,30);
			app.fill(0,95,184);
			app.textAlign(app.CENTER);
			app.textSize(15);
			app.text("Dog id", 60, 66);
			
			
			
			for (int i = 0; i < listDogs.size(); i++) {

				id = listDogs.get(i).getId();

				name = listDogs.get(i).getName().toLowerCase();
				
				birthday = listDogs.get(i).getBirthday();

				breed = listDogs.get(i).getBreed().toLowerCase();

				
		} 
		
		//name button
		if(app.mouseX < 220 && app.mouseX >120 && app.mouseY < 80 && app.mouseY > 45){
			
			Collections.sort(listDogs, Name);
			
			System.out.println("sirve2");
			app.noStroke ();
			app.fill(255);
			app.rect(170,60,100,30);
			app.fill(0,95,184);
			app.textAlign(app.CENTER);
			app.textSize(15);
			app.text("Dog Name", 171, 66);
		
			
			
			for (int i = 0; i < listDogs.size(); i++) {

				id = listDogs.get(i).getId();
				
				name = listDogs.get(i).getName().toLowerCase();
				
				breed = listDogs.get(i).getBreed().toLowerCase();
				
				birthday = listDogs.get(i).getBirthday();
		}
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
	}
	
	/*public void whiteButtonId (PApplet app) {
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
			public void whiteButtonId (PApplet app) {
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
	
	
	
	public String[] getDog1() {
		return dog1;
	}

	public void setText1(String[] dog1) {
		this.dog1 = dog1;
	}

	public String[] getDog2() {
		return dog2;
	}

	public void setDog2(String[] dog2) {
		this.dog2 = dog2;
	}

	public LinkedList<Dogs> getListDogs() {
		return listDogs;
	}
	public void setListDogs(LinkedList<Dogs> listDogs) {
		this.listDogs = listDogs;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	
	

	
	
}
