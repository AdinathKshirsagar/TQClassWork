package com.Practice2;

import java.util.Comparator;

public class RegNoComparator implements Comparator<Supplier> {

	@Override
	public int compare(Supplier s1, Supplier s2) {
		if(s1.getRegNo()==s2.getRegNo())
			return 0;
		else if(s1.getRegNo()>s2.getRegNo())
			return 1;
		else
			return -1;
	}


}
