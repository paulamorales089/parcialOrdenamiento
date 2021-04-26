package controller;

import java.util.LinkedList;

import model.Dogs;
import model.Logic;
import processing.core.PApplet;

public class ControllerMain {
	private PApplet app;
	private Logic logic;
	
	public ControllerMain (PApplet app) {
		this.app=app;
		logic = new Logic(app);
		logic.loadDogsText(app);
		logic.separateDogsText(app);
	}
	
	
	public void sortList () {
		logic.sortList();
		
	}

	public LinkedList <Dogs> listDogs(){
		
		return logic.getListDogs();
	}


	public Logic getLogic() {
		return logic;
	}

	public void setLogic(Logic logic) {
		this.logic = logic;
	}
	

}
