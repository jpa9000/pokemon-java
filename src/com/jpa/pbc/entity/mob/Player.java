package com.jpa.pbc.entity.mob;

import com.jpa.pbc.graphic.Sprite;
import com.jpa.pbc.system.Keyboard;
import com.jpa.pbc.system.Screen;


public class Player extends Mob {

	private Keyboard input;
	private Sprite sprite;
	public boolean xflip = false, yflip = false;
	private int anim = 0;
	private boolean walking = true;
	
	public Player(Keyboard input)
	{
		this.input = input;
	}
	
	public Player(int x, int y, Keyboard input)
	{
		this.x = x;
		this.y = y;  
		this.input = input;
	}
	
	public void update()
	{
		int xa = 0 , ya = 0;
		if (anim < 7500) anim ++; else anim = 0;
		if (input.up) ya--;y--;
		if (input.down) ya++;y++;
		if (input.left) xa--;x--;
		if (input.right) xa++;x++;
		
		if(xa != 0 || ya != 0){
			move(xa, ya);
			walking = true;
		}
		else{
			walking = false;
		}
	}
	
	public void render(Screen screen)
	{
		if(dir == 0 ){
			sprite = Sprite.player_up;
			if(walking)
				if(anim % 20 > 10)
				{
					sprite = Sprite.player_up2;
				}
				else
				{
					
					sprite = Sprite.player_up3;
					
					
				}
		
		}
		if(dir == 1 ){
			sprite = Sprite.player_side;
			if(walking)
				if(anim % 20 > 10)
				{
					sprite = Sprite.player_side2;
	
				}
				else 
				{
					sprite = Sprite.player_side3;
					sprite = Sprite.player_side;
				}
		
		}
		if(dir == 2 ){
			sprite = Sprite.player_down;
			if(walking)
				if(anim % 20 > 10)
				{
					sprite = Sprite.player_down2;
	
				}
				else 
				{
					sprite = Sprite.player_down3;
		
				}		
		}
		if(dir == 3 ){
			sprite = Sprite.player_side; xflip = true;
			if(walking)
				if(anim % 20 > 10)
				{
					sprite = Sprite.player_side2;
	
				}
				else 
				{
					sprite = Sprite.player_side3;
					sprite = Sprite.player_side;
		
				}		
			} 
		else{xflip = false;}
		screen.renderPlayer(x- 16, y - 16, sprite, xflip, yflip);
	
	}
}
