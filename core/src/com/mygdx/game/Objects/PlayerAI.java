package com.mygdx.game.Objects;

import com.mygdx.game.GameScreen;

public class PlayerAI extends PlayerPaddle {

    public PlayerAI(float x, float y, GameScreen gameScreen) {
        super(x, y, gameScreen);
    }

    public void update() {
        super.update();

        Ball ball = gameScreen.getBall();
        if (ball.getY() + 10 > y && ball.getY() - 10 > y)
            velY = 1;
        if (ball.getY() + 10 < y && ball.getY() - 10 < y)
            velY = -1;

        body.setLinearVelocity(0, velY * speed);
    }

}
