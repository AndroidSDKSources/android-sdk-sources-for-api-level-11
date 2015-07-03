/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.os.Parcelable;
/*    */ import android.util.AttributeSet;
/*    */ import android.util.SparseArray;
/*    */ import android.view.accessibility.AccessibilityEvent;
/*    */ 
/*    */ public class DatePicker extends FrameLayout
/*    */ {
/*    */   public DatePicker(Context context)
/*    */   {
/*  9 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 10 */   public DatePicker(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 11 */   public DatePicker(Context context, AttributeSet attrs, int defStyle) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 12 */   public long getMinDate() { throw new RuntimeException("Stub!"); } 
/* 13 */   public void setMinDate(long minDate) { throw new RuntimeException("Stub!"); } 
/* 14 */   public long getMaxDate() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void setMaxDate(long maxDate) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void setEnabled(boolean enabled) { throw new RuntimeException("Stub!"); } 
/* 17 */   public boolean isEnabled() { throw new RuntimeException("Stub!"); } 
/* 18 */   public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) { throw new RuntimeException("Stub!"); } 
/* 19 */   public boolean getCalendarViewShown() { throw new RuntimeException("Stub!"); } 
/* 20 */   public void setCalendarViewShown(boolean shown) { throw new RuntimeException("Stub!"); } 
/* 21 */   public boolean getSpinnersShown() { throw new RuntimeException("Stub!"); } 
/* 22 */   public void setSpinnersShown(boolean shown) { throw new RuntimeException("Stub!"); } 
/* 23 */   public void updateDate(int year, int month, int dayOfMonth) { throw new RuntimeException("Stub!"); } 
/* 24 */   protected void dispatchRestoreInstanceState(SparseArray<Parcelable> container) { throw new RuntimeException("Stub!"); } 
/* 25 */   protected Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); } 
/* 26 */   protected void onRestoreInstanceState(Parcelable state) { throw new RuntimeException("Stub!"); } 
/* 27 */   public void init(int year, int monthOfYear, int dayOfMonth, OnDateChangedListener onDateChangedListener) { throw new RuntimeException("Stub!"); } 
/* 28 */   public int getYear() { throw new RuntimeException("Stub!"); } 
/* 29 */   public int getMonth() { throw new RuntimeException("Stub!"); } 
/* 30 */   public int getDayOfMonth() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static abstract interface OnDateChangedListener
/*    */   {
/*    */     public abstract void onDateChanged(DatePicker paramDatePicker, int paramInt1, int paramInt2, int paramInt3);
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.DatePicker
 * JD-Core Version:    0.6.0
 */