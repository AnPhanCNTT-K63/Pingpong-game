package com.mygdx.game.Objects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.physics.box2d.Body;
import com.mygdx.game.Boot;
import com.mygdx.game.GameScreen;
import com.mygdx.game.Helper.BodyHelper;
import com.mygdx.game.Helper.ContactType;

public class Wall {

    private Body body;
    private float x, y;
    private int width, height;
    private Texture texture;

    public Wall(float y, GameScreen gameScreen) {
        this.x = Boot.INSTANCE.getScreenWidth() / 2;
        this.y = y;
        this.width = Boot.INSTANCE.getScreenWidth();
        this.height = 64;

        this.texture = new Texture("white.jpg");
        this.body = BodyHelper.createBody(x, y, width, height, true, 0, gameScreen.getWorld(), ContactType.WALL);

    }

    public void render(SpriteBatch batch) {
        batch.draw(texture, x - (width / 2), y - (height / 2), width, height);

    }
}
