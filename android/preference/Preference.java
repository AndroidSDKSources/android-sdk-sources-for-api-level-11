/*     */ package android.preference;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.content.Intent;
/*     */ import android.content.SharedPreferences;
/*     */ import android.content.SharedPreferences.Editor;
/*     */ import android.content.res.TypedArray;
/*     */ import android.graphics.drawable.Drawable;
/*     */ import android.os.Bundle;
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import android.os.Parcelable.Creator;
/*     */ import android.util.AttributeSet;
/*     */ import android.view.AbsSavedState;
/*     */ import android.view.View;
/*     */ import android.view.ViewGroup;
/*     */ 
/*     */ public class Preference
/*     */   implements Comparable<Preference>
/*     */ {
/*     */   public static final int DEFAULT_ORDER = 2147483647;
/*     */ 
/*     */   public Preference(Context context, AttributeSet attrs, int defStyle)
/*     */   {
/*  21 */     throw new RuntimeException("Stub!"); } 
/*  22 */   public Preference(Context context, AttributeSet attrs) { throw new RuntimeException("Stub!"); } 
/*  23 */   public Preference(Context context) { throw new RuntimeException("Stub!"); } 
/*  24 */   protected Object onGetDefaultValue(TypedArray a, int index) { throw new RuntimeException("Stub!"); } 
/*  25 */   public void setIntent(Intent intent) { throw new RuntimeException("Stub!"); } 
/*  26 */   public Intent getIntent() { throw new RuntimeException("Stub!"); } 
/*  27 */   public void setFragment(String fragment) { throw new RuntimeException("Stub!"); } 
/*  28 */   public String getFragment() { throw new RuntimeException("Stub!"); } 
/*  29 */   public Bundle getExtras() { throw new RuntimeException("Stub!"); } 
/*  30 */   public Bundle peekExtras() { throw new RuntimeException("Stub!"); } 
/*  31 */   public void setLayoutResource(int layoutResId) { throw new RuntimeException("Stub!"); } 
/*  32 */   public int getLayoutResource() { throw new RuntimeException("Stub!"); } 
/*  33 */   public void setWidgetLayoutResource(int widgetLayoutResId) { throw new RuntimeException("Stub!"); } 
/*  34 */   public int getWidgetLayoutResource() { throw new RuntimeException("Stub!"); } 
/*  35 */   public View getView(View convertView, ViewGroup parent) { throw new RuntimeException("Stub!"); } 
/*  36 */   protected View onCreateView(ViewGroup parent) { throw new RuntimeException("Stub!"); } 
/*  37 */   protected void onBindView(View view) { throw new RuntimeException("Stub!"); } 
/*  38 */   public void setOrder(int order) { throw new RuntimeException("Stub!"); } 
/*  39 */   public int getOrder() { throw new RuntimeException("Stub!"); } 
/*  40 */   public void setTitle(CharSequence title) { throw new RuntimeException("Stub!"); } 
/*  41 */   public void setTitle(int titleResId) { throw new RuntimeException("Stub!"); } 
/*  42 */   public CharSequence getTitle() { throw new RuntimeException("Stub!"); } 
/*  43 */   public void setIcon(Drawable icon) { throw new RuntimeException("Stub!"); } 
/*  44 */   public void setIcon(int iconResId) { throw new RuntimeException("Stub!"); } 
/*  45 */   public Drawable getIcon() { throw new RuntimeException("Stub!"); } 
/*  46 */   public CharSequence getSummary() { throw new RuntimeException("Stub!"); } 
/*  47 */   public void setSummary(CharSequence summary) { throw new RuntimeException("Stub!"); } 
/*  48 */   public void setSummary(int summaryResId) { throw new RuntimeException("Stub!"); } 
/*  49 */   public void setEnabled(boolean enabled) { throw new RuntimeException("Stub!"); } 
/*  50 */   public boolean isEnabled() { throw new RuntimeException("Stub!"); } 
/*  51 */   public void setSelectable(boolean selectable) { throw new RuntimeException("Stub!"); } 
/*  52 */   public boolean isSelectable() { throw new RuntimeException("Stub!"); } 
/*  53 */   public void setShouldDisableView(boolean shouldDisableView) { throw new RuntimeException("Stub!"); } 
/*  54 */   public boolean getShouldDisableView() { throw new RuntimeException("Stub!"); } 
/*  55 */   protected void onClick() { throw new RuntimeException("Stub!"); } 
/*  56 */   public void setKey(String key) { throw new RuntimeException("Stub!"); } 
/*  57 */   public String getKey() { throw new RuntimeException("Stub!"); } 
/*  58 */   public boolean hasKey() { throw new RuntimeException("Stub!"); } 
/*  59 */   public boolean isPersistent() { throw new RuntimeException("Stub!"); } 
/*  60 */   protected boolean shouldPersist() { throw new RuntimeException("Stub!"); } 
/*  61 */   public void setPersistent(boolean persistent) { throw new RuntimeException("Stub!"); } 
/*  62 */   protected boolean callChangeListener(Object newValue) { throw new RuntimeException("Stub!"); } 
/*  63 */   public void setOnPreferenceChangeListener(OnPreferenceChangeListener onPreferenceChangeListener) { throw new RuntimeException("Stub!"); } 
/*  64 */   public OnPreferenceChangeListener getOnPreferenceChangeListener() { throw new RuntimeException("Stub!"); } 
/*  65 */   public void setOnPreferenceClickListener(OnPreferenceClickListener onPreferenceClickListener) { throw new RuntimeException("Stub!"); } 
/*  66 */   public OnPreferenceClickListener getOnPreferenceClickListener() { throw new RuntimeException("Stub!"); } 
/*  67 */   public Context getContext() { throw new RuntimeException("Stub!"); } 
/*  68 */   public SharedPreferences getSharedPreferences() { throw new RuntimeException("Stub!"); } 
/*  69 */   public SharedPreferences.Editor getEditor() { throw new RuntimeException("Stub!"); } 
/*  70 */   public boolean shouldCommit() { throw new RuntimeException("Stub!"); } 
/*  71 */   public int compareTo(Preference another) { throw new RuntimeException("Stub!"); } 
/*  72 */   protected void notifyChanged() { throw new RuntimeException("Stub!"); } 
/*  73 */   protected void notifyHierarchyChanged() { throw new RuntimeException("Stub!"); } 
/*  74 */   public PreferenceManager getPreferenceManager() { throw new RuntimeException("Stub!"); } 
/*  75 */   protected void onAttachedToHierarchy(PreferenceManager preferenceManager) { throw new RuntimeException("Stub!"); } 
/*  76 */   protected void onAttachedToActivity() { throw new RuntimeException("Stub!"); } 
/*  77 */   protected Preference findPreferenceInHierarchy(String key) { throw new RuntimeException("Stub!"); } 
/*  78 */   public void notifyDependencyChange(boolean disableDependents) { throw new RuntimeException("Stub!"); } 
/*  79 */   public void onDependencyChanged(Preference dependency, boolean disableDependent) { throw new RuntimeException("Stub!"); } 
/*  80 */   public boolean shouldDisableDependents() { throw new RuntimeException("Stub!"); } 
/*  81 */   public void setDependency(String dependencyKey) { throw new RuntimeException("Stub!"); } 
/*  82 */   public String getDependency() { throw new RuntimeException("Stub!"); } 
/*  83 */   protected void onPrepareForRemoval() { throw new RuntimeException("Stub!"); } 
/*  84 */   public void setDefaultValue(Object defaultValue) { throw new RuntimeException("Stub!"); } 
/*  85 */   protected void onSetInitialValue(boolean restorePersistedValue, Object defaultValue) { throw new RuntimeException("Stub!"); } 
/*  86 */   protected boolean persistString(String value) { throw new RuntimeException("Stub!"); } 
/*  87 */   protected String getPersistedString(String defaultReturnValue) { throw new RuntimeException("Stub!"); } 
/*  88 */   protected boolean persistInt(int value) { throw new RuntimeException("Stub!"); } 
/*  89 */   protected int getPersistedInt(int defaultReturnValue) { throw new RuntimeException("Stub!"); } 
/*  90 */   protected boolean persistFloat(float value) { throw new RuntimeException("Stub!"); } 
/*  91 */   protected float getPersistedFloat(float defaultReturnValue) { throw new RuntimeException("Stub!"); } 
/*  92 */   protected boolean persistLong(long value) { throw new RuntimeException("Stub!"); } 
/*  93 */   protected long getPersistedLong(long defaultReturnValue) { throw new RuntimeException("Stub!"); } 
/*  94 */   protected boolean persistBoolean(boolean value) { throw new RuntimeException("Stub!"); } 
/*  95 */   protected boolean getPersistedBoolean(boolean defaultReturnValue) { throw new RuntimeException("Stub!"); } 
/*  96 */   public String toString() { throw new RuntimeException("Stub!"); } 
/*  97 */   public void saveHierarchyState(Bundle container) { throw new RuntimeException("Stub!"); } 
/*  98 */   protected Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); } 
/*  99 */   public void restoreHierarchyState(Bundle container) { throw new RuntimeException("Stub!"); } 
/* 100 */   protected void onRestoreInstanceState(Parcelable state) { throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   public static class BaseSavedState extends AbsSavedState
/*     */   {
/*  19 */     public static final Parcelable.Creator<BaseSavedState> CREATOR = null;
/*     */ 
/*     */     public BaseSavedState(Parcel source)
/*     */     {
/*  16 */       super(); throw new RuntimeException("Stub!"); } 
/*  17 */     public BaseSavedState(Parcelable superState) { super(); throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   public static abstract interface OnPreferenceClickListener
/*     */   {
/*     */     public abstract boolean onPreferenceClick(Preference paramPreference);
/*     */   }
/*     */ 
/*     */   public static abstract interface OnPreferenceChangeListener
/*     */   {
/*     */     public abstract boolean onPreferenceChange(Preference paramPreference, Object paramObject);
/*     */   }
/*     */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.preference.Preference
 * JD-Core Version:    0.6.0
 */