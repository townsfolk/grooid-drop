package com.teammochi.games.drop

import com.badlogic.gdx.Game
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import groovy.transform.CompileStatic

@CompileStatic
class DropGame extends Game {

	SpriteBatch batch
	BitmapFont font
	GameScreen gameScreen

	void create() {
		batch = new SpriteBatch()
		//Use LibGDX's default Arial font.
		font = new BitmapFont()
		gameScreen = new GameScreen(this)
		this.setScreen(new MainMenuScreen(this))
	}

	void render() {
		super.render() //important!
	}

	void dispose() {
		batch.dispose()
		font.dispose()
	}
}