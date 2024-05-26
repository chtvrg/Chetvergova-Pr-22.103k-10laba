package com.example.mydraw;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;

public class MyDraw extends View {

    private Paint mPaint = new Paint();
    private Rect mRect = new Rect();
    private Bitmap mBitmap;
    private Bitmap mStarBitmap;

    public MyDraw(Context context) {
        super(context);

        // Выводим значок из ресурсов
        Resources res = this.getResources();
        mBitmap = BitmapFactory.decodeResource(res, R.drawable.pngwing);
        mStarBitmap = BitmapFactory.decodeResource(res, R.drawable.star);
    }



    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int width = canvas.getWidth();
        int height = canvas.getHeight();

        // стиль Заливка
        mPaint.setStyle(Paint.Style.FILL);

        // закрашиваем холст розовым
        mPaint.setColor(0xFF800080);
        canvas.drawPaint(mPaint);

        // Рисуем текст
        mPaint.setColor(0xFFFF69B4);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setAntiAlias(true);
        mPaint.setTextSize(70);
        mPaint.setTypeface(Typeface.DEFAULT_BOLD);

        canvas.drawText("Кристина", 600, height - 1100, mPaint);
        int starSize = 100;
        int starX = width - starSize - 10;
        int starY = height - starSize - 10;
        canvas.drawBitmap(mStarBitmap, starX, starY, mPaint);
        canvas.save();
        // восстанавливаем холст
        canvas.restore();

        // Выводим изображение
        // canvas.drawBitmap(mBitmap, 450, 530, mPaint);
        canvas.drawBitmap(mStarBitmap, width - mStarBitmap.getWidth(), height - mStarBitmap.getHeight() - 10, mPaint);
        canvas.drawBitmap(mBitmap, width - mBitmap.getWidth(), height - mBitmap.getHeight() - 10, mPaint);
    }
}

