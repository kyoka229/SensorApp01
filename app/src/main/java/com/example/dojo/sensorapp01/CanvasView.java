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

    public void setPos(float x,float y){
        posX = x * -50;
        posY = y * 50;

        invalidate();  //再描画
    }

}
