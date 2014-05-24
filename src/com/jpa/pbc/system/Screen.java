package com.jpa.pbc.system;

import java.util.Random;

import com.jpa.pbc.graphic.Sprite;
import com.jpa.pbc.tiles.Tile;

public class Screen {
	public int width, height;
	public int[] pixels;
	public int[] tiles = new int[64 * 64];
	public final int MAP_SIZE = 64;
	public final int MAP_SIZE_MASK = MAP_SIZE - 1;
 	
	public int xOS, yOS;
	
	private Random random = new Random();
	
	public Screen(int width, int height)
	{
		this.height = height;
		this.width = width;
		pixels = new int[width * height];
		
		for (int i = 0; i<MAP_SIZE * MAP_SIZE; i++)
		{
			tiles[i] = random.nextInt(0xffffff);
			
			
		}
	}
	
	public void clear()
	{
		for(int i = 0; i < pixels.length; i++)
		{
			pixels[i] = 0;
		}
	}
	
	
	public void renderTile(int xp, int yp, Tile tile)
	{
		xp -= xOS;
		yp -= yOS;
		for(int y = 0; y < tile.sprite.getSize(); y++)
		{
			int ys = y;
			int ya/*absolute position*/ = y + yp;
			for(int x = 0; x < tile.sprite.getSize(); x++)
			{
				int xs = x;
				int xa = x + xp;
				if(xa < -tile.sprite.getSize() || xa >= width || ya < 0 || ya >= height) break;
				if(xa < 0) xa = 0;
				int color = tile.sprite.pixels[xs+ys*16];
				if (color != 0xffff00ff )
				pixels[xa + ya * width] = color = tile.sprite.pixels[x + y * tile.sprite.getSize()];
			}
		}
	}
	
	public void renderTile(int xp, int yp, Sprite sprite) {
		xp -= xOS;
		yp -= yOS;
		for (int y = 0; y < sprite.getSize(); y++) {
			int yt = y + yp;
			for (int x = 0; x < sprite.getSize(); x++) {
				int xt = x + xp;
				if (xt < -sprite.getSize() || xt >= width || yt < -sprite.getSize() || yt >= height) break;
				if (xt < 0) xt = 0;
				if (yt < 0) yt = 0;
				int col = sprite.pixels[x + y * sprite.getSize()];
				if (col != 0xffff00ff) {
					pixels[xt + yt * width] = col;
				}
			}
		}
	}
	
	public void renderPlayer(int xp, int yp, Sprite sprite, boolean xFlip, boolean yFlip)
	{
		xp -= xOS;
		yp -= yOS;
		for(int y = 0; y < 32; y++)
		{
			int ys = y;
			if(yFlip) {ys = 31 - y;} //flip y
			int ya= y + yp;
			for(int x = 0; x < 32; x++)
			{
				int xs = x;
				int xa = x + xp;
				if(xFlip){xs = 31 - x;} //flip x
				if(xa < -32 || xa >= width || ya < 0 || ya >= height) break;
				if(xa < 0) xa = 0;
				int color = sprite.pixels[xs+ys*32];
				if (color != 0xffff00ff )//two extra ff at beginning for rgba
				pixels[xa + ya * width] = color;
			}
		}
	}
	
	public void setOffset(int xOffset, int yOffset)
	{
		this.xOS = xOffset;
		this.yOS = yOffset;
		
	}
}
