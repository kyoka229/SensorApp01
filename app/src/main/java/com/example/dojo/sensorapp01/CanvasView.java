package com.example.dojo.sensorapp01;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import java.text.AttributedCharacterIterator;

public class CanvasView extends View {
    private Paint paint;
    private float posX;
    private float posY;
    private float preXV;
    private float preYV;

    public CanvasView(Context con,AttributeSet as){
        super(con, as);

        paint = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas){
        canvas.drawColor(Color.YELLOW);

        float cx = canvas.getWidth() / 2;
        float cy = canvas.getHeight() / 2;

        paint.setColor(Color.BLUE);
        canvas.drawCircle(cx + posX, cy + posY, 50, paint);
    }

    public void setPos(float ax,float ay){
        float dt = 3.0f;
        ax *= -1;


        //時間を進める処理
        posX =preXV * dt + ax * dt * dt /2;
        preXV += ax * dt;

        posY = preYV * dt + ay * dt * dt / 2;
        preYV += ay * dt;

        invalidate();  //再描画
    }

}
