package com.Practice2;

import java.util.Comparator;

public class SupNameComparator implements Comparator<Supplier> {

	@Override
	public int compare(Supplier s1, Supplier s2) {
		
		return s1.getsName().compareTo(s2.getsName());
	}

}
