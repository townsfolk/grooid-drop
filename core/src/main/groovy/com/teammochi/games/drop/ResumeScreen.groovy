package com.teammochi.games.drop;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera
import groovy.transform.CompileStatic;

/**
 * Created by elberry on 11/29/14.
 */
@CompileStatic
public class ResumeScreen implements Screen {
	final DropGame dropGame;
	OrthographicCamera camera;

	public ResumeScreen(DropGame dropGame) {
		this.dropGame = dropGame;

		camera = new OrthographicCamera();
		camera.setToOrtho(false, 800, 480);
	}

	@Override
	public void render(float delta) {

		Gdx.gl.glClearColor(0, 0, 0.2f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		camera.update();
		dropGame.batch.setProjectionMatrix(camera.combined);

		dropGame.batch.begin();
		dropGame.font.draw(dropGame.batch, "Game Paused!", 100, 150);
		dropGame.font.draw(dropGame.batch, "Tap anywhere to resume!", 100, 100);
		dropGame.batch.end();

		if (Gdx.input.isTouched()) {
			dropGame.setScreen(dropGame.gameScreen);
			dispose();
		}
	}

	@Override
	public void resize(int width, int height) {

	}

	@Override
	public void show() {

	}

	@Override
	public void hide() {

	}

	@Override
	public void pause() {

	}

	@Override
	public void resume() {

	}

	@Override
	public void dispose() {

	}
}
