package com.techelevator.model.domain;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	
	public List<Tool> items = new ArrayList<>();

	
	public List<Tool> getItems() {
		return items;
	}
	public void setItems(List<Tool> items) {
		this.items = items;
	}

	public void addToCart(Tool tool) {
		if(items != null) {
			items.add(tool);
		}
		if(items == null) {
			List<Tool> newList = new ArrayList<>();
			setItems(newList);
		}
	
	}
	
	public void removeFromCart (int toolId) {
		
		for(Tool e: items) {
			
			List<Tool> newList = new ArrayList<>();
			
			if(e.getToolId() != toolId) {
				
				newList.add(e);
			}
			
			items = newList;
			
		}
		
	}
	
}
