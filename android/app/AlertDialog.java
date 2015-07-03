/*    */ package android.app;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.DialogInterface;
/*    */ import android.content.DialogInterface.OnCancelListener;
/*    */ import android.content.DialogInterface.OnClickListener;
/*    */ import android.content.DialogInterface.OnKeyListener;
/*    */ import android.content.DialogInterface.OnMultiChoiceClickListener;
/*    */ import android.database.Cursor;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.os.Bundle;
/*    */ import android.os.Message;
/*    */ import android.view.KeyEvent;
/*    */ import android.view.View;
/*    */ import android.widget.AdapterView.OnItemSelectedListener;
/*    */ import android.widget.Button;
/*    */ import android.widget.ListAdapter;
/*    */ import android.widget.ListView;
/*    */ 
/*    */ public class AlertDialog extends Dialog
/*    */   implements DialogInterface
/*    */ {
/*    */   public static final int THEME_TRADITIONAL = 1;
/*    */   public static final int THEME_HOLO_DARK = 2;
/*    */   public static final int THEME_HOLO_LIGHT = 3;
/*    */ 
/*    */   protected AlertDialog(Context context)
/*    */   {
/* 45 */     super((Context)null, false, (DialogInterface.OnCancelListener)null); throw new RuntimeException("Stub!"); } 
/* 46 */   protected AlertDialog(Context context, int theme) { super((Context)null, false, (DialogInterface.OnCancelListener)null); throw new RuntimeException("Stub!"); } 
/* 47 */   protected AlertDialog(Context context, boolean cancelable, DialogInterface.OnCancelListener cancelListener) { super((Context)null, false, (DialogInterface.OnCancelListener)null); throw new RuntimeException("Stub!"); } 
/* 48 */   public Button getButton(int whichButton) { throw new RuntimeException("Stub!"); } 
/* 49 */   public ListView getListView() { throw new RuntimeException("Stub!"); } 
/* 50 */   public void setTitle(CharSequence title) { throw new RuntimeException("Stub!"); } 
/* 51 */   public void setCustomTitle(View customTitleView) { throw new RuntimeException("Stub!"); } 
/* 52 */   public void setMessage(CharSequence message) { throw new RuntimeException("Stub!"); } 
/* 53 */   public void setView(View view) { throw new RuntimeException("Stub!"); } 
/* 54 */   public void setView(View view, int viewSpacingLeft, int viewSpacingTop, int viewSpacingRight, int viewSpacingBottom) { throw new RuntimeException("Stub!"); } 
/* 55 */   public void setButton(int whichButton, CharSequence text, Message msg) { throw new RuntimeException("Stub!"); } 
/* 56 */   public void setButton(int whichButton, CharSequence text, DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); } 
/* 57 */   public void setButton(CharSequence text, Message msg) { throw new RuntimeException("Stub!"); } 
/* 58 */   public void setButton2(CharSequence text, Message msg) { throw new RuntimeException("Stub!"); } 
/* 59 */   public void setButton3(CharSequence text, Message msg) { throw new RuntimeException("Stub!"); } 
/* 60 */   public void setButton(CharSequence text, DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); } 
/* 61 */   public void setButton2(CharSequence text, DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); } 
/* 62 */   public void setButton3(CharSequence text, DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); } 
/* 63 */   public void setIcon(int resId) { throw new RuntimeException("Stub!"); } 
/* 64 */   public void setIcon(Drawable icon) { throw new RuntimeException("Stub!"); } 
/* 65 */   public void setIconAttribute(int attrId) { throw new RuntimeException("Stub!"); } 
/* 66 */   public void setInverseBackgroundForced(boolean forceInverseBackground) { throw new RuntimeException("Stub!"); } 
/* 67 */   protected void onCreate(Bundle savedInstanceState) { throw new RuntimeException("Stub!"); } 
/* 68 */   public boolean onKeyDown(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 69 */   public boolean onKeyUp(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class Builder
/*    */   {
/*    */     public Builder(Context context)
/*    */     {
/*  8 */       throw new RuntimeException("Stub!"); } 
/*  9 */     public Builder(Context context, int theme) { throw new RuntimeException("Stub!"); } 
/* 10 */     public Context getContext() { throw new RuntimeException("Stub!"); } 
/* 11 */     public Builder setTitle(int titleId) { throw new RuntimeException("Stub!"); } 
/* 12 */     public Builder setTitle(CharSequence title) { throw new RuntimeException("Stub!"); } 
/* 13 */     public Builder setCustomTitle(View customTitleView) { throw new RuntimeException("Stub!"); } 
/* 14 */     public Builder setMessage(int messageId) { throw new RuntimeException("Stub!"); } 
/* 15 */     public Builder setMessage(CharSequence message) { throw new RuntimeException("Stub!"); } 
/* 16 */     public Builder setIcon(int iconId) { throw new RuntimeException("Stub!"); } 
/* 17 */     public Builder setIcon(Drawable icon) { throw new RuntimeException("Stub!"); } 
/* 18 */     public Builder setIconAttribute(int attrId) { throw new RuntimeException("Stub!"); } 
/* 19 */     public Builder setPositiveButton(int textId, DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); } 
/* 20 */     public Builder setPositiveButton(CharSequence text, DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); } 
/* 21 */     public Builder setNegativeButton(int textId, DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); } 
/* 22 */     public Builder setNegativeButton(CharSequence text, DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); } 
/* 23 */     public Builder setNeutralButton(int textId, DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); } 
/* 24 */     public Builder setNeutralButton(CharSequence text, DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); } 
/* 25 */     public Builder setCancelable(boolean cancelable) { throw new RuntimeException("Stub!"); } 
/* 26 */     public Builder setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) { throw new RuntimeException("Stub!"); } 
/* 27 */     public Builder setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) { throw new RuntimeException("Stub!"); } 
/* 28 */     public Builder setItems(int itemsId, DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); } 
/* 29 */     public Builder setItems(CharSequence[] items, DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); } 
/* 30 */     public Builder setAdapter(ListAdapter adapter, DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); } 
/* 31 */     public Builder setCursor(Cursor cursor, DialogInterface.OnClickListener listener, String labelColumn) { throw new RuntimeException("Stub!"); } 
/* 32 */     public Builder setMultiChoiceItems(int itemsId, boolean[] checkedItems, DialogInterface.OnMultiChoiceClickListener listener) { throw new RuntimeException("Stub!"); } 
/* 33 */     public Builder setMultiChoiceItems(CharSequence[] items, boolean[] checkedItems, DialogInterface.OnMultiChoiceClickListener listener) { throw new RuntimeException("Stub!"); } 
/* 34 */     public Builder setMultiChoiceItems(Cursor cursor, String isCheckedColumn, String labelColumn, DialogInterface.OnMultiChoiceClickListener listener) { throw new RuntimeException("Stub!"); } 
/* 35 */     public Builder setSingleChoiceItems(int itemsId, int checkedItem, DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); } 
/* 36 */     public Builder setSingleChoiceItems(Cursor cursor, int checkedItem, String labelColumn, DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); } 
/* 37 */     public Builder setSingleChoiceItems(CharSequence[] items, int checkedItem, DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); } 
/* 38 */     public Builder setSingleChoiceItems(ListAdapter adapter, int checkedItem, DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); } 
/* 39 */     public Builder setOnItemSelectedListener(AdapterView.OnItemSelectedListener listener) { throw new RuntimeException("Stub!"); } 
/* 40 */     public Builder setView(View view) { throw new RuntimeException("Stub!"); } 
/* 41 */     public Builder setInverseBackgroundForced(boolean useInverseBackground) { throw new RuntimeException("Stub!"); } 
/* 42 */     public AlertDialog create() { throw new RuntimeException("Stub!"); } 
/* 43 */     public AlertDialog show() { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.app.AlertDialog
 * JD-Core Version:    0.6.0
 */