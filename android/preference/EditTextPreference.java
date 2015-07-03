/*    */ package android.preference;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.res.TypedArray;
/*    */ import android.os.Parcelable;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.View;
/*    */ import android.widget.EditText;
/*    */ 
/*    */ public class EditTextPreference extends DialogPreference
/*    */ {
/*    */   public EditTextPreference(Context context, AttributeSet attrs, int defStyle)
/*    */   {
/*  5 */     super((Context)null, (AttributeSet)null); throw new RuntimeException("Stub!"); } 
/*  6 */   public EditTextPreference(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null); throw new RuntimeException("Stub!"); } 
/*  7 */   public EditTextPreference(Context context) { super((Context)null, (AttributeSet)null); throw new RuntimeException("Stub!"); } 
/*  8 */   public void setText(String text) { throw new RuntimeException("Stub!"); } 
/*  9 */   public String getText() { throw new RuntimeException("Stub!"); } 
/* 10 */   protected void onBindDialogView(View view) { throw new RuntimeException("Stub!"); } 
/* 11 */   protected void onAddEditTextToDialogView(View dialogView, EditText editText) { throw new RuntimeException("Stub!"); } 
/* 12 */   protected void onDialogClosed(boolean positiveResult) { throw new RuntimeException("Stub!"); } 
/* 13 */   protected Object onGetDefaultValue(TypedArray a, int index) { throw new RuntimeException("Stub!"); } 
/* 14 */   protected void onSetInitialValue(boolean restoreValue, Object defaultValue) { throw new RuntimeException("Stub!"); } 
/* 15 */   public boolean shouldDisableDependents() { throw new RuntimeException("Stub!"); } 
/* 16 */   public EditText getEditText() { throw new RuntimeException("Stub!"); } 
/* 17 */   protected Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); } 
/* 18 */   protected void onRestoreInstanceState(Parcelable state) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.preference.EditTextPreference
 * JD-Core Version:    0.6.0
 */