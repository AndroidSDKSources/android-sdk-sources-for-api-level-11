/*    */ package android.preference;
/*    */ 
/*    */ import android.app.Fragment;
/*    */ import android.app.ListActivity;
/*    */ import android.content.Intent;
/*    */ import android.content.res.Resources;
/*    */ import android.os.Bundle;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import android.view.View;
/*    */ import android.view.View.OnClickListener;
/*    */ import android.widget.ListView;
/*    */ import java.util.List;
/*    */ 
/*    */ public abstract class PreferenceActivity extends ListActivity
/*    */   implements PreferenceFragment.OnPreferenceStartFragmentCallback
/*    */ {
/*    */   public static final String EXTRA_SHOW_FRAGMENT = ":android:show_fragment";
/*    */   public static final String EXTRA_SHOW_FRAGMENT_ARGUMENTS = ":android:show_fragment_args";
/*    */   public static final String EXTRA_NO_HEADERS = ":android:no_headers";
/*    */   public static final long HEADER_ID_UNDEFINED = -1L;
/*    */ 
/*    */   public PreferenceActivity()
/*    */   {
/* 34 */     throw new RuntimeException("Stub!"); } 
/* 35 */   protected void onCreate(Bundle savedInstanceState) { throw new RuntimeException("Stub!"); } 
/* 36 */   public boolean hasHeaders() { throw new RuntimeException("Stub!"); } 
/* 37 */   public boolean isMultiPane() { throw new RuntimeException("Stub!"); } 
/* 38 */   public boolean onIsMultiPane() { throw new RuntimeException("Stub!"); } 
/* 39 */   public boolean onIsHidingHeaders() { throw new RuntimeException("Stub!"); } 
/* 40 */   public Header onGetInitialHeader() { throw new RuntimeException("Stub!"); } 
/* 41 */   public Header onGetNewHeader() { throw new RuntimeException("Stub!"); } 
/* 42 */   public void onBuildHeaders(List<Header> target) { throw new RuntimeException("Stub!"); } 
/* 43 */   public void invalidateHeaders() { throw new RuntimeException("Stub!"); } 
/* 44 */   public void loadHeadersFromResource(int resid, List<Header> target) { throw new RuntimeException("Stub!"); } 
/* 45 */   public void setListFooter(View view) { throw new RuntimeException("Stub!"); } 
/* 46 */   protected void onStop() { throw new RuntimeException("Stub!"); } 
/* 47 */   protected void onDestroy() { throw new RuntimeException("Stub!"); } 
/* 48 */   protected void onSaveInstanceState(Bundle outState) { throw new RuntimeException("Stub!"); } 
/* 49 */   protected void onRestoreInstanceState(Bundle state) { throw new RuntimeException("Stub!"); } 
/* 50 */   protected void onActivityResult(int requestCode, int resultCode, Intent data) { throw new RuntimeException("Stub!"); } 
/* 51 */   public void onContentChanged() { throw new RuntimeException("Stub!"); } 
/* 52 */   protected void onListItemClick(ListView l, View v, int position, long id) { throw new RuntimeException("Stub!"); } 
/* 53 */   public void onHeaderClick(Header header, int position) { throw new RuntimeException("Stub!"); } 
/* 54 */   public void startWithFragment(String fragmentName, Bundle args, Fragment resultTo, int resultRequestCode) { throw new RuntimeException("Stub!"); } 
/* 55 */   public void showBreadCrumbs(CharSequence title, CharSequence shortTitle) { throw new RuntimeException("Stub!"); } 
/* 56 */   public void setParentTitle(CharSequence title, CharSequence shortTitle, View.OnClickListener listener) { throw new RuntimeException("Stub!"); } 
/* 57 */   public void switchToHeader(String fragmentName, Bundle args) { throw new RuntimeException("Stub!"); } 
/* 58 */   public void switchToHeader(Header header) { throw new RuntimeException("Stub!"); } 
/* 59 */   public void startPreferenceFragment(Fragment fragment, boolean push) { throw new RuntimeException("Stub!"); } 
/* 60 */   public void startPreferencePanel(String fragmentClass, Bundle args, int titleRes, CharSequence titleText, Fragment resultTo, int resultRequestCode) { throw new RuntimeException("Stub!"); } 
/* 61 */   public void finishPreferencePanel(Fragment caller, int resultCode, Intent resultData) { throw new RuntimeException("Stub!"); } 
/* 62 */   public boolean onPreferenceStartFragment(PreferenceFragment caller, Preference pref) { throw new RuntimeException("Stub!"); } 
/* 63 */   public PreferenceManager getPreferenceManager() { throw new RuntimeException("Stub!"); } 
/* 64 */   public void setPreferenceScreen(PreferenceScreen preferenceScreen) { throw new RuntimeException("Stub!"); } 
/* 65 */   public PreferenceScreen getPreferenceScreen() { throw new RuntimeException("Stub!"); } 
/* 66 */   public void addPreferencesFromIntent(Intent intent) { throw new RuntimeException("Stub!"); } 
/* 67 */   public void addPreferencesFromResource(int preferencesResId) { throw new RuntimeException("Stub!"); } 
/* 68 */   public boolean onPreferenceTreeClick(PreferenceScreen preferenceScreen, Preference preference) { throw new RuntimeException("Stub!"); } 
/* 69 */   public Preference findPreference(CharSequence key) { throw new RuntimeException("Stub!"); } 
/* 70 */   protected void onNewIntent(Intent intent) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static final class Header
/*    */     implements Parcelable
/*    */   {
/*    */     public long id;
/*    */     public int titleRes;
/*    */     public CharSequence title;
/*    */     public int summaryRes;
/*    */     public CharSequence summary;
/*    */     public int breadCrumbTitleRes;
/*    */     public CharSequence breadCrumbTitle;
/*    */     public int breadCrumbShortTitleRes;
/*    */     public CharSequence breadCrumbShortTitle;
/*    */     public int iconRes;
/*    */     public String fragment;
/*    */     public Bundle fragmentArguments;
/*    */     public Intent intent;
/*    */     public Bundle extras;
/* 32 */     public static final Parcelable.Creator<Header> CREATOR = null;
/*    */ 
/*    */     public Header()
/*    */     {
/*  9 */       throw new RuntimeException("Stub!"); } 
/* 10 */     public CharSequence getTitle(Resources res) { throw new RuntimeException("Stub!"); } 
/* 11 */     public CharSequence getSummary(Resources res) { throw new RuntimeException("Stub!"); } 
/* 12 */     public CharSequence getBreadCrumbTitle(Resources res) { throw new RuntimeException("Stub!"); } 
/* 13 */     public CharSequence getBreadCrumbShortTitle(Resources res) { throw new RuntimeException("Stub!"); } 
/* 14 */     public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 15 */     public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); } 
/* 16 */     public void readFromParcel(Parcel in) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.preference.PreferenceActivity
 * JD-Core Version:    0.6.0
 */