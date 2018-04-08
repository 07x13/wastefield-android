package com.mycompany.mygame2;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.*;

public class MyGdxGame implements ApplicationListener
{
	Texture texture1;
	Texture texture2;
	
	
	SpriteBatch batch;
	SpriteBatch batch2;

	@Override
	public void create()
	{
		texture1 = new Texture(Gdx.files.internal("player.png"));
		texture2 = new Texture(Gdx.files.internal("b1.jpg"));
		batch = new SpriteBatch();
		batch2 = new SpriteBatch();
	}

	@Override
	public void render()
	{        
	    Gdx.gl.glClearColor(1, 1, 1, 1);
	    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(texture1, Gdx.graphics.getWidth() / 2, 0, 
				   Gdx.graphics.getWidth() / 10, Gdx.graphics.getWidth() / 8);
		batch.end();
		batch2.begin();
				   batch2.draw(texture2, Gdx.graphics.getWidth() / 6,1,
		             Gdx.graphics.getWidth() / 5, Gdx.graphics.getWidth() / 3);
		batch2.end();
	}

	@Override
	public void dispose()
	{
	}

	@Override
	public void resize(int width, int height)
	{
	}

	@Override
	public void pause()
	{
	}

	@Override
	public void resume()
	{
	}
}