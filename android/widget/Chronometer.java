/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.util.AttributeSet;
/*    */ 
/*    */ @RemoteViews.RemoteView
/*    */ public class Chronometer extends TextView
/*    */ {
/*    */   public Chronometer(Context context)
/*    */   {
/* 10 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 11 */   public Chronometer(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 12 */   public Chronometer(Context context, AttributeSet attrs, int defStyle) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 13 */   public void setBase(long base) { throw new RuntimeException("Stub!"); } 
/* 14 */   public long getBase() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void setFormat(String format) { throw new RuntimeException("Stub!"); } 
/* 16 */   public String getFormat() { throw new RuntimeException("Stub!"); } 
/* 17 */   public void setOnChronometerTickListener(OnChronometerTickListener listener) { throw new RuntimeException("Stub!"); } 
/* 18 */   public OnChronometerTickListener getOnChronometerTickListener() { throw new RuntimeException("Stub!"); } 
/* 19 */   public void start() { throw new RuntimeException("Stub!"); } 
/* 20 */   public void stop() { throw new RuntimeException("Stub!"); } 
/* 21 */   protected void onDetachedFromWindow() { throw new RuntimeException("Stub!"); } 
/* 22 */   protected void onWindowVisibilityChanged(int visibility) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static abstract interface OnChronometerTickListener
/*    */   {
/*    */     public abstract void onChronometerTick(Chronometer paramChronometer);
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.Chronometer
 * JD-Core Version:    0.6.0
 */