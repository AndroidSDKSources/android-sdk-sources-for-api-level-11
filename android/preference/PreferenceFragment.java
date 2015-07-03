/*    */ package android.preference;
/*    */ 
/*    */ import android.app.Fragment;
/*    */ import android.content.Intent;
/*    */ import android.os.Bundle;
/*    */ import android.view.LayoutInflater;
/*    */ import android.view.View;
/*    */ import android.view.ViewGroup;
/*    */ 
/*    */ public abstract class PreferenceFragment extends Fragment
/*    */ {
/*    */   public PreferenceFragment()
/*    */   {
/*  9 */     throw new RuntimeException("Stub!"); } 
/* 10 */   public void onCreate(Bundle savedInstanceState) { throw new RuntimeException("Stub!"); } 
/* 11 */   public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void onActivityCreated(Bundle savedInstanceState) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void onStop() { throw new RuntimeException("Stub!"); } 
/* 14 */   public void onDestroyView() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void onDestroy() { throw new RuntimeException("Stub!"); } 
/* 16 */   public void onSaveInstanceState(Bundle outState) { throw new RuntimeException("Stub!"); } 
/* 17 */   public void onActivityResult(int requestCode, int resultCode, Intent data) { throw new RuntimeException("Stub!"); } 
/* 18 */   public PreferenceManager getPreferenceManager() { throw new RuntimeException("Stub!"); } 
/* 19 */   public void setPreferenceScreen(PreferenceScreen preferenceScreen) { throw new RuntimeException("Stub!"); } 
/* 20 */   public PreferenceScreen getPreferenceScreen() { throw new RuntimeException("Stub!"); } 
/* 21 */   public void addPreferencesFromIntent(Intent intent) { throw new RuntimeException("Stub!"); } 
/* 22 */   public void addPreferencesFromResource(int preferencesResId) { throw new RuntimeException("Stub!"); } 
/* 23 */   public boolean onPreferenceTreeClick(PreferenceScreen preferenceScreen, Preference preference) { throw new RuntimeException("Stub!"); } 
/* 24 */   public Preference findPreference(CharSequence key) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static abstract interface OnPreferenceStartFragmentCallback
/*    */   {
/*    */     public abstract boolean onPreferenceStartFragment(PreferenceFragment paramPreferenceFragment, Preference paramPreference);
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.preference.PreferenceFragment
 * JD-Core Version:    0.6.0
 */