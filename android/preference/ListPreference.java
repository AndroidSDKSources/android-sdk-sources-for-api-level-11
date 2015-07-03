/*    */ package android.preference;
/*    */ 
/*    */ import android.app.AlertDialog.Builder;
/*    */ import android.content.Context;
/*    */ import android.content.res.TypedArray;
/*    */ import android.os.Parcelable;
/*    */ import android.util.AttributeSet;
/*    */ 
/*    */ public class ListPreference extends DialogPreference
/*    */ {
/*    */   public ListPreference(Context context, AttributeSet attrs)
/*    */   {
/*  5 */     super((Context)null, (AttributeSet)null); throw new RuntimeException("Stub!"); } 
/*  6 */   public ListPreference(Context context) { super((Context)null, (AttributeSet)null); throw new RuntimeException("Stub!"); } 
/*  7 */   public void setEntries(CharSequence[] entries) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void setEntries(int entriesResId) { throw new RuntimeException("Stub!"); } 
/*  9 */   public CharSequence[] getEntries() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void setEntryValues(CharSequence[] entryValues) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void setEntryValues(int entryValuesResId) { throw new RuntimeException("Stub!"); } 
/* 12 */   public CharSequence[] getEntryValues() { throw new RuntimeException("Stub!"); } 
/* 13 */   public void setValue(String value) { throw new RuntimeException("Stub!"); } 
/* 14 */   public CharSequence getSummary() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void setSummary(CharSequence summary) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void setValueIndex(int index) { throw new RuntimeException("Stub!"); } 
/* 17 */   public String getValue() { throw new RuntimeException("Stub!"); } 
/* 18 */   public CharSequence getEntry() { throw new RuntimeException("Stub!"); } 
/* 19 */   public int findIndexOfValue(String value) { throw new RuntimeException("Stub!"); } 
/* 20 */   protected void onPrepareDialogBuilder(AlertDialog.Builder builder) { throw new RuntimeException("Stub!"); } 
/* 21 */   protected void onDialogClosed(boolean positiveResult) { throw new RuntimeException("Stub!"); } 
/* 22 */   protected Object onGetDefaultValue(TypedArray a, int index) { throw new RuntimeException("Stub!"); } 
/* 23 */   protected void onSetInitialValue(boolean restoreValue, Object defaultValue) { throw new RuntimeException("Stub!"); } 
/* 24 */   protected Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); } 
/* 25 */   protected void onRestoreInstanceState(Parcelable state) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.preference.ListPreference
 * JD-Core Version:    0.6.0
 */