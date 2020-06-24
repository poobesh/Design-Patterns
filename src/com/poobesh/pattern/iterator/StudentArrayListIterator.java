package com.poobesh.pattern.iterator;

import java.util.ArrayList;

public class StudentArrayListIterator implements Iterator {
	
	ArrayList<Object> items;
	int position = 0;

	public ArrayList<Object> getItems() {
		return items;
	}

	public void setItems(ArrayList<Object> items) {
		this.items = items;
	}

	@Override
	public Object next() {
		if(position > this.items.size()-1)
		{
			return null;
		}
		else
		{
			return items.get(position++);
		}
		
	}

	@Override
	public boolean hasNext() {
		return (position < this.items.size());
		
	}
	
	
	

}
