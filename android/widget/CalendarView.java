/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.util.AttributeSet;
/*    */ 
/*    */ public class CalendarView extends FrameLayout
/*    */ {
/*    */   public CalendarView(Context context)
/*    */   {
/*  9 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 10 */   public CalendarView(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 11 */   public CalendarView(Context context, AttributeSet attrs, int defStyle) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 12 */   public void setEnabled(boolean enabled) { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean isEnabled() { throw new RuntimeException("Stub!"); } 
/* 14 */   public long getMinDate() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void setMinDate(long minDate) { throw new RuntimeException("Stub!"); } 
/* 16 */   public long getMaxDate() { throw new RuntimeException("Stub!"); } 
/* 17 */   public void setMaxDate(long maxDate) { throw new RuntimeException("Stub!"); } 
/* 18 */   public void setShowWeekNumber(boolean showWeekNumber) { throw new RuntimeException("Stub!"); } 
/* 19 */   public boolean getShowWeekNumber() { throw new RuntimeException("Stub!"); } 
/* 20 */   public int getFirstDayOfWeek() { throw new RuntimeException("Stub!"); } 
/* 21 */   public void setFirstDayOfWeek(int firstDayOfWeek) { throw new RuntimeException("Stub!"); } 
/* 22 */   public void setOnDateChangeListener(OnDateChangeListener listener) { throw new RuntimeException("Stub!"); } 
/* 23 */   public long getDate() { throw new RuntimeException("Stub!"); } 
/* 24 */   public void setDate(long date) { throw new RuntimeException("Stub!"); } 
/* 25 */   public void setDate(long date, boolean animate, boolean center) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static abstract interface OnDateChangeListener
/*    */   {
/*    */     public abstract void onSelectedDayChange(CalendarView paramCalendarView, int paramInt1, int paramInt2, int paramInt3);
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.CalendarView
 * JD-Core Version:    0.6.0
 */