/*    */ package android.preference;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.os.Bundle;
/*    */ import android.util.AttributeSet;
/*    */ 
/*    */ public abstract class PreferenceGroup extends Preference
/*    */ {
/*    */   public PreferenceGroup(Context context, AttributeSet attrs, int defStyle)
/*    */   {
/*  5 */     super((Context)null); throw new RuntimeException("Stub!"); } 
/*  6 */   public PreferenceGroup(Context context, AttributeSet attrs) { super((Context)null); throw new RuntimeException("Stub!"); } 
/*  7 */   public void setOrderingAsAdded(boolean orderingAsAdded) { throw new RuntimeException("Stub!"); } 
/*  8 */   public boolean isOrderingAsAdded() { throw new RuntimeException("Stub!"); } 
/*  9 */   public void addItemFromInflater(Preference preference) { throw new RuntimeException("Stub!"); } 
/* 10 */   public int getPreferenceCount() { throw new RuntimeException("Stub!"); } 
/* 11 */   public Preference getPreference(int index) { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean addPreference(Preference preference) { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean removePreference(Preference preference) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void removeAll() { throw new RuntimeException("Stub!"); } 
/* 15 */   protected boolean onPrepareAddPreference(Preference preference) { throw new RuntimeException("Stub!"); } 
/* 16 */   public Preference findPreference(CharSequence key) { throw new RuntimeException("Stub!"); } 
/* 17 */   protected boolean isOnSameScreenAsChildren() { throw new RuntimeException("Stub!"); } 
/* 18 */   protected void onAttachedToActivity() { throw new RuntimeException("Stub!"); } 
/* 19 */   protected void onPrepareForRemoval() { throw new RuntimeException("Stub!"); } 
/* 20 */   public void setEnabled(boolean enabled) { throw new RuntimeException("Stub!"); } 
/* 21 */   protected void dispatchSaveInstanceState(Bundle container) { throw new RuntimeException("Stub!"); } 
/* 22 */   protected void dispatchRestoreInstanceState(Bundle container) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.preference.PreferenceGroup
 * JD-Core Version:    0.6.0
 */