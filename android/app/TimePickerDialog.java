/*    */ package android.app;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.DialogInterface;
/*    */ import android.content.DialogInterface.OnCancelListener;
/*    */ import android.content.DialogInterface.OnClickListener;
/*    */ import android.os.Bundle;
/*    */ import android.widget.TimePicker;
/*    */ import android.widget.TimePicker.OnTimeChangedListener;
/*    */ 
/*    */ public class TimePickerDialog extends AlertDialog
/*    */   implements DialogInterface.OnClickListener, TimePicker.OnTimeChangedListener
/*    */ {
/*    */   public TimePickerDialog(Context context, OnTimeSetListener callBack, int hourOfDay, int minute, boolean is24HourView)
/*    */   {
/* 10 */     super((Context)null, false, (DialogInterface.OnCancelListener)null); throw new RuntimeException("Stub!"); } 
/* 11 */   public TimePickerDialog(Context context, int theme, OnTimeSetListener callBack, int hourOfDay, int minute, boolean is24HourView) { super((Context)null, false, (DialogInterface.OnCancelListener)null); throw new RuntimeException("Stub!"); } 
/* 12 */   public void onClick(DialogInterface dialog, int which) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void updateTime(int hourOfDay, int minutOfHour) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void onTimeChanged(TimePicker view, int hourOfDay, int minute) { throw new RuntimeException("Stub!"); } 
/* 15 */   public Bundle onSaveInstanceState() { throw new RuntimeException("Stub!"); } 
/* 16 */   public void onRestoreInstanceState(Bundle savedInstanceState) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static abstract interface OnTimeSetListener
/*    */   {
/*    */     public abstract void onTimeSet(TimePicker paramTimePicker, int paramInt1, int paramInt2);
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.app.TimePickerDialog
 * JD-Core Version:    0.6.0
 */