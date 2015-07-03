/*    */ package android.preference;
/*    */ 
/*    */ import android.app.AlertDialog.Builder;
/*    */ import android.app.Dialog;
/*    */ import android.content.Context;
/*    */ import android.content.DialogInterface;
/*    */ import android.content.DialogInterface.OnClickListener;
/*    */ import android.content.DialogInterface.OnDismissListener;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.os.Bundle;
/*    */ import android.os.Parcelable;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.View;
/*    */ 
/*    */ public abstract class DialogPreference extends Preference
/*    */   implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener, PreferenceManager.OnActivityDestroyListener
/*    */ {
/*    */   public DialogPreference(Context context, AttributeSet attrs, int defStyle)
/*    */   {
/*  6 */     super((Context)null); throw new RuntimeException("Stub!"); } 
/*  7 */   public DialogPreference(Context context, AttributeSet attrs) { super((Context)null); throw new RuntimeException("Stub!"); } 
/*  8 */   public void setDialogTitle(CharSequence dialogTitle) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void setDialogTitle(int dialogTitleResId) { throw new RuntimeException("Stub!"); } 
/* 10 */   public CharSequence getDialogTitle() { throw new RuntimeException("Stub!"); } 
/* 11 */   public void setDialogMessage(CharSequence dialogMessage) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void setDialogMessage(int dialogMessageResId) { throw new RuntimeException("Stub!"); } 
/* 13 */   public CharSequence getDialogMessage() { throw new RuntimeException("Stub!"); } 
/* 14 */   public void setDialogIcon(Drawable dialogIcon) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void setDialogIcon(int dialogIconRes) { throw new RuntimeException("Stub!"); } 
/* 16 */   public Drawable getDialogIcon() { throw new RuntimeException("Stub!"); } 
/* 17 */   public void setPositiveButtonText(CharSequence positiveButtonText) { throw new RuntimeException("Stub!"); } 
/* 18 */   public void setPositiveButtonText(int positiveButtonTextResId) { throw new RuntimeException("Stub!"); } 
/* 19 */   public CharSequence getPositiveButtonText() { throw new RuntimeException("Stub!"); } 
/* 20 */   public void setNegativeButtonText(CharSequence negativeButtonText) { throw new RuntimeException("Stub!"); } 
/* 21 */   public void setNegativeButtonText(int negativeButtonTextResId) { throw new RuntimeException("Stub!"); } 
/* 22 */   public CharSequence getNegativeButtonText() { throw new RuntimeException("Stub!"); } 
/* 23 */   public void setDialogLayoutResource(int dialogLayoutResId) { throw new RuntimeException("Stub!"); } 
/* 24 */   public int getDialogLayoutResource() { throw new RuntimeException("Stub!"); } 
/* 25 */   protected void onPrepareDialogBuilder(AlertDialog.Builder builder) { throw new RuntimeException("Stub!"); } 
/* 26 */   protected void onClick() { throw new RuntimeException("Stub!"); } 
/* 27 */   protected void showDialog(Bundle state) { throw new RuntimeException("Stub!"); } 
/* 28 */   protected View onCreateDialogView() { throw new RuntimeException("Stub!"); } 
/* 29 */   protected void onBindDialogView(View view) { throw new RuntimeException("Stub!"); } 
/* 30 */   public void onClick(DialogInterface dialog, int which) { throw new RuntimeException("Stub!"); } 
/* 31 */   public void onDismiss(DialogInterface dialog) { throw new RuntimeException("Stub!"); } 
/* 32 */   protected void onDialogClosed(boolean positiveResult) { throw new RuntimeException("Stub!"); } 
/* 33 */   public Dialog getDialog() { throw new RuntimeException("Stub!"); } 
/* 34 */   public void onActivityDestroy() { throw new RuntimeException("Stub!"); } 
/* 35 */   protected Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); } 
/* 36 */   protected void onRestoreInstanceState(Parcelable state) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.preference.DialogPreference
 * JD-Core Version:    0.6.0
 */