/*    */ package android.app;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.DialogInterface;
/*    */ import android.content.DialogInterface.OnCancelListener;
/*    */ import android.content.DialogInterface.OnClickListener;
/*    */ import android.os.Bundle;
/*    */ import android.widget.DatePicker;
/*    */ import android.widget.DatePicker.OnDateChangedListener;
/*    */ 
/*    */ public class DatePickerDialog extends AlertDialog
/*    */   implements DialogInterface.OnClickListener, DatePicker.OnDateChangedListener
/*    */ {
/*    */   public DatePickerDialog(Context context, OnDateSetListener callBack, int year, int monthOfYear, int dayOfMonth)
/*    */   {
/* 10 */     super((Context)null, false, (DialogInterface.OnCancelListener)null); throw new RuntimeException("Stub!"); } 
/* 11 */   public DatePickerDialog(Context context, int theme, OnDateSetListener callBack, int year, int monthOfYear, int dayOfMonth) { super((Context)null, false, (DialogInterface.OnCancelListener)null); throw new RuntimeException("Stub!"); } 
/* 12 */   public void onClick(DialogInterface dialog, int which) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void onDateChanged(DatePicker view, int year, int month, int day) { throw new RuntimeException("Stub!"); } 
/* 14 */   public DatePicker getDatePicker() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void updateDate(int year, int monthOfYear, int dayOfMonth) { throw new RuntimeException("Stub!"); } 
/* 16 */   public Bundle onSaveInstanceState() { throw new RuntimeException("Stub!"); } 
/* 17 */   public void onRestoreInstanceState(Bundle savedInstanceState) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static abstract interface OnDateSetListener
/*    */   {
/*    */     public abstract void onDateSet(DatePicker paramDatePicker, int paramInt1, int paramInt2, int paramInt3);
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.app.DatePickerDialog
 * JD-Core Version:    0.6.0
 */