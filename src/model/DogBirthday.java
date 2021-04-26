package model;

import java.util.Comparator;

public class DogBirthday implements Comparator <Dogs> {

	@Override
	public int compare(Dogs o1, Dogs o2) {
		return o1.getBirthday().compareTo(o2.getBirthday());
	}

}
