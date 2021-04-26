package model;

import java.util.Comparator;

public class DogName implements Comparator <Dogs> {

	/*@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return 0;
	}*/

	@Override
	public int compare(Dogs o1, Dogs o2) {
	
		return o1.getName().compareTo(o2.getName());
	}

}
