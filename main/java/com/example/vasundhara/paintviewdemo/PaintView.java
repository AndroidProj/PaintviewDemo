package com.example.vasundhara.paintviewdemo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.EmbossMaskFilter;
import android.graphics.MaskFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by Vasundhara on 10/3/2017.
 */

public class PaintView extends View {

//    public static int BRUSH_SIZE = 20;
//    public static final int DEFAULT_COLOR = Color.RED;
//    public static final int DEFAULT_BG_COLOR = Color.WHITE;
//    public static final float TOUCH_TOLERENCE = 4;
//    private float mX, mY;
//    private Path mPath;
//    private Paint mPaint = new Paint();
//    private ArrayList<FingerPath> paths = new ArrayList<>();
//    private int currentColor;
//    private int backgroundColor = DEFAULT_BG_COLOR;
//    private int strokeWidth;
//    private boolean emboss;
//    private boolean blur;
//    private MaskFilter mEmboss;
//    private MaskFilter mBlur;
//    private Bitmap mBitmap;
//    private Canvas mCanvas;
//    private Paint mBitmapPaint = new Paint(Paint.DITHER_FLAG);
//    private boolean erase = false;


    //drawing path
    private Path drawPath;
    //drawing and canvas paint
    private Paint drawPaint, canvasPaint;
    //initial color
    private int paintColor = 0xFF660000, paintAlpha = 255;
    //canvas
    private Canvas drawCanvas;
    //canvas bitmap
    private Bitmap canvasBitmap;
    //brush sizes
    private float brushSize, lastBrushSize;
    //erase flag
    private boolean erase = false;

    public PaintView(Context context) {
        this(context, null);
    }

    public PaintView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setup();
//        mPath = new Path();
//        mPaint = new Paint();
//        mPaint.setAntiAlias(true);
//        mPaint.setDither(true);
//        mPaint.setColor(DEFAULT_COLOR);
//        mPaint.setStyle(Paint.Style.STROKE);
//        mPaint.setStrokeJoin(Paint.Join.ROUND);
//        mPaint.setStrokeCap(Paint.Cap.ROUND);
//        mPaint.setXfermode(null);
//        mPaint.setAlpha(0xff);

//        mEmboss = new EmbossMaskFilter(new float[]{1, 1, 1}, 0.4f, 6, 3.5f);
//        mBlur = new BlurMaskFilter(5, BlurMaskFilter.Blur.NORMAL);
    }

    public void setup() {
        brushSize = 20;
        lastBrushSize = brushSize;
        drawPath = new Path();
        drawPaint = new Paint();
        drawPaint.setColor(paintColor);
        drawPaint.setAntiAlias(true);
        drawPaint.setStrokeWidth(brushSize);
        drawPaint.setStyle(Paint.Style.STROKE);
        drawPaint.setStrokeJoin(Paint.Join.ROUND);
        drawPaint.setStrokeCap(Paint.Cap.ROUND);
        canvasPaint = new Paint(Paint.DITHER_FLAG);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
//        mBitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
//        mCanvas = new Canvas(mBitmap);
//
//        Bitmap bitmap = Bitmap.createScaledBitmap(mBitmap, w, h, true);
//        mCanvas.drawBitmap(bitmap, 0, 0, mBitmapPaint);
        canvasBitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
        drawCanvas = new Canvas(canvasBitmap);

        Bitmap sbitmap = Bitmap.createScaledBitmap(EfectActivity.b, drawCanvas.getWidth(), drawCanvas.getHeight(), true);
        drawCanvas.drawBitmap(sbitmap, 0, 0, canvasPaint);
    }

    public void init(DisplayMetrics metrics) {
//        int width = metrics.widthPixels;
//        int height = metrics.heightPixels;
//
//        mBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
//        mCanvas = new Canvas(mBitmap);

//        currentColor = DEFAULT_COLOR;
//        strokeWidth = BRUSH_SIZE;
    }

    public void normal() {
//        emboss = false;
//        blur = false;
    }

    public void emboss() {
//        emboss = true;
//        blur = false;
    }

    public void blur() {
//        emboss = false;
//        blur = true;
    }

    public void clear() {
//        backgroundColor = DEFAULT_BG_COLOR;
//        paths.clear();
//        normal();
//        invalidate();
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        canvas.save();
//        mCanvas.drawColor(backgroundColor);
//        for (FingerPath fp : paths) {
//            mPaint.setColor(fp.color);
//            mPaint.setStrokeWidth(fp.strokeWidth);
//            mPaint.setMaskFilter(null);
//
//            if (fp.emboss) {
//                mPaint.setMaskFilter(mEmboss);
//            } else {
//                mPaint.setMaskFilter(mBlur);
//            }
//            mCanvas.drawPath(fp.path, mPaint);
//        }

//        canvas.drawBitmap(mBitmap, 0, 0, mBitmapPaint);
//        canvas.drawPath(mPath, mPaint);
//        canvas.restore();

        canvas.drawBitmap(canvasBitmap, 0, 0, canvasPaint);
        canvas.drawPath(drawPath, drawPaint);
    }

    private void touchStart(float x, float y) {
//        mPath = new Path();
//        FingerPath fp = new FingerPath(currentColor, emboss, blur, strokeWidth, mPath);
//        paths.add(fp);
//
//        mPath.reset();
//        mPath.moveTo(x, y);
//        mX = x;
//        mY = y;
    }

    private void touchMove(float x, float y) {
//        float dx = Math.abs(x - mX);
//        float dy = Math.abs(y - mY);
//
//        if (dx >= TOUCH_TOLERENCE || dy >= TOUCH_TOLERENCE) {
//            mPath.quadTo(mX, mY, (x + mX) / 2, (y + mY) / 2);
//            mX = x;
//            mY = y;
//        }
    }

    private void touchUp() {
//        mPath.lineTo(mX, mY);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
//        float x = event.getX();
//        float y = event.getY();

//        switch (event.getAction()) {
//            case MotionEvent.ACTION_DOWN:
//                touchStart(x, y);
//                mPath.moveTo(x, y);
//                invalidate();
//                break;
//            case MotionEvent.ACTION_MOVE:
//                touchMove(x, y);
//                mPath.lineTo(x, y);
//                invalidate();
//                break;
//            case MotionEvent.ACTION_UP:
//                touchUp();
//                mPath.lineTo(x, y);
//                mCanvas.drawPath(mPath, mPaint);
//                mPath.reset();
//                invalidate();
//                break;
//            default:
//                return false;
//        }
        float touchX = event.getX();
        float touchY = event.getY();
        //respond to down, move and up events
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                drawPath.moveTo(touchX, touchY);
                break;
            case MotionEvent.ACTION_MOVE:
                drawPath.lineTo(touchX, touchY);
                break;
            case MotionEvent.ACTION_UP:
                drawPath.lineTo(touchX, touchY);
                drawCanvas.drawPath(drawPath, drawPaint);
                drawPath.reset();
                break;
            default:
                return false;
        }
        //redraw
        invalidate();
        return true;
    }

    public void setErase(boolean isErase) {
//        erase = bool;
//        if (erase) {
//            mPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
//        } else {
//            mPaint.setXfermode(null);
//        }
        erase = isErase;
        if (erase) {
            drawPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
//            canvasBitmap.eraseColor(Color.TRANSPARENT);
//            Bitmap sbitmap = Bitmap.createScaledBitmap(EfectActivity.b, drawCanvas.getWidth(), drawCanvas.getHeight(), true);
//            drawCanvas.drawBitmap(sbitmap, 0, 0, canvasPaint);
            invalidate();
        } else drawPaint.setXfermode(null);
    }
}
