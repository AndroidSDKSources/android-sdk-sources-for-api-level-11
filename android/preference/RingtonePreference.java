/*    */ package android.preference;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.Intent;
/*    */ import android.content.res.TypedArray;
/*    */ import android.net.Uri;
/*    */ import android.util.AttributeSet;
/*    */ 
/*    */ public class RingtonePreference extends Preference
/*    */   implements PreferenceManager.OnActivityResultListener
/*    */ {
/*    */   public RingtonePreference(Context context, AttributeSet attrs, int defStyle)
/*    */   {
/*  6 */     super((Context)null); throw new RuntimeException("Stub!"); } 
/*  7 */   public RingtonePreference(Context context, AttributeSet attrs) { super((Context)null); throw new RuntimeException("Stub!"); } 
/*  8 */   public RingtonePreference(Context context) { super((Context)null); throw new RuntimeException("Stub!"); } 
/*  9 */   public int getRingtoneType() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void setRingtoneType(int type) { throw new RuntimeException("Stub!"); } 
/* 11 */   public boolean getShowDefault() { throw new RuntimeException("Stub!"); } 
/* 12 */   public void setShowDefault(boolean showDefault) { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean getShowSilent() { throw new RuntimeException("Stub!"); } 
/* 14 */   public void setShowSilent(boolean showSilent) { throw new RuntimeException("Stub!"); } 
/* 15 */   protected void onClick() { throw new RuntimeException("Stub!"); } 
/* 16 */   protected void onPrepareRingtonePickerIntent(Intent ringtonePickerIntent) { throw new RuntimeException("Stub!"); } 
/* 17 */   protected void onSaveRingtone(Uri ringtoneUri) { throw new RuntimeException("Stub!"); } 
/* 18 */   protected Uri onRestoreRingtone() { throw new RuntimeException("Stub!"); } 
/* 19 */   protected Object onGetDefaultValue(TypedArray a, int index) { throw new RuntimeException("Stub!"); } 
/* 20 */   protected void onSetInitialValue(boolean restorePersistedValue, Object defaultValueObj) { throw new RuntimeException("Stub!"); } 
/* 21 */   protected void onAttachedToHierarchy(PreferenceManager preferenceManager) { throw new RuntimeException("Stub!"); } 
/* 22 */   public boolean onActivityResult(int requestCode, int resultCode, Intent data) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.preference.RingtonePreference
 * JD-Core Version:    0.6.0
 */