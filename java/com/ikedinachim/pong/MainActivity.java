package com.ikedinachim.pong;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;

public class MainActivity extends AppCompatActivity {
    private PongGame mPongGame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Display display = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        display.getSize(point);

        mPongGame = new PongGame(this,point.x,point.y);


        setContentView(mPongGame);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mPongGame.resume();

    }

    @Override
    protected void onPause() {
        super.onPause();
        mPongGame.pause();
    }
}
