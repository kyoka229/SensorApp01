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

    public CanvasView(Context con,AttributeSet as){
        super(con, as);

        paint = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas){
        canvas.drawColor(Color.YELLOW);
    }

}
