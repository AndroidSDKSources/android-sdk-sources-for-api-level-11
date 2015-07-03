/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.KeyEvent;
/*    */ import android.view.MotionEvent;
/*    */ 
/*    */ public abstract class AbsSeekBar extends ProgressBar
/*    */ {
/*    */   public AbsSeekBar(Context context)
/*    */   {
/*  5 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  6 */   public AbsSeekBar(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  7 */   public AbsSeekBar(Context context, AttributeSet attrs, int defStyle) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  8 */   public void setThumb(Drawable thumb) { throw new RuntimeException("Stub!"); } 
/*  9 */   public int getThumbOffset() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void setThumbOffset(int thumbOffset) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void setKeyProgressIncrement(int increment) { throw new RuntimeException("Stub!"); } 
/* 12 */   public int getKeyProgressIncrement() { throw new RuntimeException("Stub!"); } 
/* 13 */   public synchronized void setMax(int max) { throw new RuntimeException("Stub!"); } 
/* 14 */   protected boolean verifyDrawable(Drawable who) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void jumpDrawablesToCurrentState() { throw new RuntimeException("Stub!"); } 
/* 16 */   protected void drawableStateChanged() { throw new RuntimeException("Stub!"); } 
/* 17 */   protected void onSizeChanged(int w, int h, int oldw, int oldh) { throw new RuntimeException("Stub!"); } 
/* 18 */   protected synchronized void onDraw(Canvas canvas) { throw new RuntimeException("Stub!"); } 
/* 19 */   protected synchronized void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); } 
/* 20 */   public boolean onTouchEvent(MotionEvent event) { throw new RuntimeException("Stub!"); } 
/* 21 */   public boolean onKeyDown(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.AbsSeekBar
 * JD-Core Version:    0.6.0
 */