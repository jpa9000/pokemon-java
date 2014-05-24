package com.jpa.pbc.entity;

import java.util.Random;

import com.jpa.pbc.level.Level;
import com.jpa.pbc.system.Screen;

public abstract class Entity {

	public int x, y;
	private boolean removed = false;
	protected Level level;
	protected final Random random = new Random();
	
	
	public void update(){
		
	}
	
	public void render(Screen screen)
	{
		
	}
	
	public void remove()
	{
		removed = true;
	}
	
	public boolean isRemoved()
	{
		return removed;
	}
	
	public void init(Level level)
	{
		this.level = level;
	}
}

