package com.jpa.pbc.tiles;

import com.jpa.pbc.graphic.Sprite;
import com.jpa.pbc.system.Screen;

public class HouseTile extends Tile {

	public HouseTile(Sprite sprite) {
		super(sprite);
	}
	
	public void render(int x, int y, Screen screen)
	{
		screen.renderTile(x << 4, y << 4, this);
	}
	
	public boolean solid()
	{
		return true;
	}

}
