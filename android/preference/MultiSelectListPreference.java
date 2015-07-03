/*    */ package android.preference;
/*    */ 
/*    */ import android.app.AlertDialog.Builder;
/*    */ import android.content.Context;
/*    */ import android.content.res.TypedArray;
/*    */ import android.os.Parcelable;
/*    */ import android.util.AttributeSet;
/*    */ import java.util.Set;
/*    */ 
/*    */ public class MultiSelectListPreference extends DialogPreference
/*    */ {
/*    */   public MultiSelectListPreference(Context context, AttributeSet attrs)
/*    */   {
/*  5 */     super((Context)null, (AttributeSet)null); throw new RuntimeException("Stub!"); } 
/*  6 */   public MultiSelectListPreference(Context context) { super((Context)null, (AttributeSet)null); throw new RuntimeException("Stub!"); } 
/*  7 */   public void setEntries(CharSequence[] entries) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void setEntries(int entriesResId) { throw new RuntimeException("Stub!"); } 
/*  9 */   public CharSequence[] getEntries() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void setEntryValues(CharSequence[] entryValues) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void setEntryValues(int entryValuesResId) { throw new RuntimeException("Stub!"); } 
/* 12 */   public CharSequence[] getEntryValues() { throw new RuntimeException("Stub!"); } 
/* 13 */   public void setValues(Set<String> values) { throw new RuntimeException("Stub!"); } 
/* 14 */   public Set<String> getValues() { throw new RuntimeException("Stub!"); } 
/* 15 */   public int findIndexOfValue(String value) { throw new RuntimeException("Stub!"); } 
/* 16 */   protected void onPrepareDialogBuilder(AlertDialog.Builder builder) { throw new RuntimeException("Stub!"); } 
/* 17 */   protected void onDialogClosed(boolean positiveResult) { throw new RuntimeException("Stub!"); } 
/* 18 */   protected Object onGetDefaultValue(TypedArray a, int index) { throw new RuntimeException("Stub!"); } 
/* 19 */   protected void onSetInitialValue(boolean restoreValue, Object defaultValue) { throw new RuntimeException("Stub!"); } 
/* 20 */   protected Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.preference.MultiSelectListPreference
 * JD-Core Version:    0.6.0
 */