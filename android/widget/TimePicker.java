/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.os.Parcelable;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.accessibility.AccessibilityEvent;
/*    */ 
/*    */ public class TimePicker extends FrameLayout
/*    */ {
/*    */   public TimePicker(Context context)
/*    */   {
/*  9 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 10 */   public TimePicker(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 11 */   public TimePicker(Context context, AttributeSet attrs, int defStyle) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 12 */   public void setEnabled(boolean enabled) { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean isEnabled() { throw new RuntimeException("Stub!"); } 
/* 14 */   protected Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); } 
/* 15 */   protected void onRestoreInstanceState(Parcelable state) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void setOnTimeChangedListener(OnTimeChangedListener onTimeChangedListener) { throw new RuntimeException("Stub!"); } 
/* 17 */   public Integer getCurrentHour() { throw new RuntimeException("Stub!"); } 
/* 18 */   public void setCurrentHour(Integer currentHour) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void setIs24HourView(Boolean is24HourView) { throw new RuntimeException("Stub!"); } 
/* 20 */   public boolean is24HourView() { throw new RuntimeException("Stub!"); } 
/* 21 */   public Integer getCurrentMinute() { throw new RuntimeException("Stub!"); } 
/* 22 */   public void setCurrentMinute(Integer currentMinute) { throw new RuntimeException("Stub!"); } 
/* 23 */   public int getBaseline() { throw new RuntimeException("Stub!"); } 
/* 24 */   public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static abstract interface OnTimeChangedListener
/*    */   {
/*    */     public abstract void onTimeChanged(TimePicker paramTimePicker, int paramInt1, int paramInt2);
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.TimePicker
 * JD-Core Version:    0.6.0
 */