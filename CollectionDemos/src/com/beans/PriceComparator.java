package com.beans;

import java.util.Comparator;

import com.beans.book;

public class PriceComparator implements Comparator {
	@Override
	public int compare(Object arg0, Object arg1) {
		book b1 = (book) arg0;
		book b2 = (book) arg1;

		return (int) (b1.getPrice() - b2.getPrice());
	}
}
