/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.util.AttributeSet;
/*    */ 
/*    */ public class SeekBar extends AbsSeekBar
/*    */ {
/*    */   public SeekBar(Context context)
/*    */   {
/* 11 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 12 */   public SeekBar(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 13 */   public SeekBar(Context context, AttributeSet attrs, int defStyle) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 14 */   public void setOnSeekBarChangeListener(OnSeekBarChangeListener l) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static abstract interface OnSeekBarChangeListener
/*    */   {
/*    */     public abstract void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean);
/*    */ 
/*    */     public abstract void onStartTrackingTouch(SeekBar paramSeekBar);
/*    */ 
/*    */     public abstract void onStopTrackingTouch(SeekBar paramSeekBar);
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.SeekBar
 * JD-Core Version:    0.6.0
 */