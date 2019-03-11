//package com.guiyunli.rxjava;
//
//
//import android.content.Context;
//import android.content.res.TypedArray;
//import android.graphics.Canvas;
//import android.graphics.Color;
//import android.graphics.Paint;
//import android.graphics.RectF;
//import android.support.annotation.Nullable;
//import android.text.TextPaint;
//import android.util.AttributeSet;
//import android.view.View;
//import android.widget.Button;
//
///**
// * @Author Li Gui Yun
// * @date 2019年02月19日19:10
// * @email guiyun.li@aihuishou.com
// **/
//public class LoadIngButton extends View {
//
//    enum State {
//        NORMAL,
//        LOADDING,
//        LOADDING_PAUSE
//    }
//
//    private View.OnClickListener mListenner;
//    private Paint mPaint;
//
//    private int mDefaultWidth;
//    private int mDefaultRadiu;
//
//    private int rectWidth;
//
//    private TextPaint mTextPaint;
//
//    private int mDefaultTextSize;
//
//    private int mTopBottomPadding;
//    private int mLeftRightPadding;
//
//    private String mText;
//
//    private int mTextColor;
//
//    private int mTextWidth;
//    private int mTextSize;
//    private int mRadiu;
//
//    private float mWidth;
//
//    private float mHeight;
//
//    private float mLeftPadding;
//    private float mRightPadding;
//    private float mTopPadding;
//    private float mBottomPadding;
//
//    public LoadIngButton(Context context) {
//        this(context,null);
//    }
//
//    public LoadIngButton(Context context, AttributeSet attrs) {
//        this(context, attrs,0);
//    }
//
//    public LoadIngButton(Context context, AttributeSet attrs, int defStyleAttr) {
//        super(context, attrs, defStyleAttr);
//        mDefaultRadiu = 40;
//        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.LoadButton);
//        mDefaultTextSize = 24;
//        mTextSize = typedArray.getDimensionPixelSize(R.styleable.LoadButton_android_textSize,
//                mDefaultTextSize);
//        mStrokeColor = typedArray.getColor(R.styleable.LoadButton_stroke_color, Color.RED);
//        mTextColor = typedArray.getColor(com.android.internal.R.styleable.TextView_textColor, Color.WHITE);
//        mText = typedArray.getString(R.styleable.LoadButton_android_text);
//
//        mLeftPadding = typedArray.getDimensionPixelOffset(com.android.internal.R.styleable.View_paddingStart, 0);
//        mRightPadding = typedArray.getDimensionPixelOffset(com.android.internal.R.styleable.View_paddingEnd, 0);
//        mTopPadding = typedArray.getDimensionPixelOffset(com.android.internal.R.styleable.View_paddingTop, 0);
//        mBottomPadding = typedArray.getDimensionPixelOffset(com.android.internal.R.styleable.View_paddingBottom, 0);
//
//
//        mBackgroundColor = typedArray.getColor(R.styleable.LoadButton_backColor, Color.WHITE);
//        mProgressColor = typedArray.getColor(R.styleable.LoadButton_progressColor, Color.WHITE);
//        mProgressSecondColor = typedArray.getColor(R.styleable.LoadButton_progressSecondColor, Color.parseColor("#c3c3c3"));
//        mProgressWidth = typedArray.getDimensionPixelOffset(R.styleable.LoadButton_progressedWidth, 2);
//
//        mSuccessedDrawable = typedArray.getDrawable(R.styleable.LoadButton_loadSuccessDrawable);
//        mErrorDrawable = typedArray.getDrawable(R.styleable.LoadButton_loadErrorDrawable);
//        mPauseDrawable = typedArray.getDrawable(R.styleable.LoadButton_loadPauseDrawable);
//        typedArray.recycle();
//
//        mPaint = new Paint();
//        mPaint.setAntiAlias(true);
//        mPaint.setColor(mStrokeColor);
//        mPaint.setStyle(Paint.Style.STROKE);
//        mPaint.setStrokeWidth(mProgressWidth);
//
//        mDefaultWidth = 200;
//
//
//        mTextPaint = new TextPaint();
//        mTextPaint.setColor(mTextColor);
//        mTextPaint.setTextAlign(Paint.Align.CENTER);
//        mTextPaint.setTextSize(mTextSize);
//
//        rectWidth = mDefaultWidth - mDefaultRadiu * 2;
//
//
//    }
//
//
//    @Override
//    protected void onDraw(Canvas canvas) {
//        super.onDraw(canvas);
//    }
//
//    private void drawNormalBackground(Canvas canvas) {
//
//
//    }
//
//    private void drawNotStatusBackground(Canvas canvas) {
//
//
//    }
//
//
//    private void drawNormalText(Canvas canvas) {
//        mTextWidth = (int) mTextPaint.measureText(mText);
//        int x = (int) ((mWidth - mLeftPadding - mTextWidth) / 2);
//        int y = (int) ((mHeight - mTopBottomPadding - mBottomPadding - mTextPaint.getTextSize()) / 2);
//            canvas.drawText(mText, x, y, mTextPaint);
//    }
//
//    private void drawLoadingText() {
//
//
//    }
//
//    private void drawNotStatusText() {
//
//
//    }
//
//}
