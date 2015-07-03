/*    */ package android.app;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.View;
/*    */ import android.view.ViewGroup.LayoutParams;
/*    */ import android.view.ViewGroup.MarginLayoutParams;
/*    */ import android.widget.SpinnerAdapter;
/*    */ 
/*    */ public abstract class ActionBar
/*    */ {
/*    */   public static final int NAVIGATION_MODE_STANDARD = 0;
/*    */   public static final int NAVIGATION_MODE_LIST = 1;
/*    */   public static final int NAVIGATION_MODE_TABS = 2;
/*    */   public static final int DISPLAY_USE_LOGO = 1;
/*    */   public static final int DISPLAY_SHOW_HOME = 2;
/*    */   public static final int DISPLAY_HOME_AS_UP = 4;
/*    */   public static final int DISPLAY_SHOW_TITLE = 8;
/*    */   public static final int DISPLAY_SHOW_CUSTOM = 16;
/*    */ 
/*    */   public ActionBar()
/*    */   {
/* 48 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public abstract void setCustomView(View paramView);
/*    */ 
/*    */   public abstract void setCustomView(View paramView, LayoutParams paramLayoutParams);
/*    */ 
/*    */   public abstract void setCustomView(int paramInt);
/*    */ 
/*    */   public abstract void setListNavigationCallbacks(SpinnerAdapter paramSpinnerAdapter, OnNavigationListener paramOnNavigationListener);
/*    */ 
/*    */   public abstract void setSelectedNavigationItem(int paramInt);
/*    */ 
/*    */   public abstract int getSelectedNavigationIndex();
/*    */ 
/*    */   public abstract int getNavigationItemCount();
/*    */ 
/*    */   public abstract void setTitle(CharSequence paramCharSequence);
/*    */ 
/*    */   public abstract void setTitle(int paramInt);
/*    */ 
/*    */   public abstract void setSubtitle(CharSequence paramCharSequence);
/*    */ 
/*    */   public abstract void setSubtitle(int paramInt);
/*    */ 
/*    */   public abstract void setDisplayOptions(int paramInt);
/*    */ 
/*    */   public abstract void setDisplayOptions(int paramInt1, int paramInt2);
/*    */ 
/*    */   public abstract void setDisplayUseLogoEnabled(boolean paramBoolean);
/*    */ 
/*    */   public abstract void setDisplayShowHomeEnabled(boolean paramBoolean);
/*    */ 
/*    */   public abstract void setDisplayHomeAsUpEnabled(boolean paramBoolean);
/*    */ 
/*    */   public abstract void setDisplayShowTitleEnabled(boolean paramBoolean);
/*    */ 
/*    */   public abstract void setDisplayShowCustomEnabled(boolean paramBoolean);
/*    */ 
/*    */   public abstract void setBackgroundDrawable(Drawable paramDrawable);
/*    */ 
/*    */   public abstract View getCustomView();
/*    */ 
/*    */   public abstract CharSequence getTitle();
/*    */ 
/*    */   public abstract CharSequence getSubtitle();
/*    */ 
/*    */   public abstract int getNavigationMode();
/*    */ 
/*    */   public abstract void setNavigationMode(int paramInt);
/*    */ 
/*    */   public abstract int getDisplayOptions();
/*    */ 
/*    */   public abstract Tab newTab();
/*    */ 
/*    */   public abstract void addTab(Tab paramTab);
/*    */ 
/*    */   public abstract void addTab(Tab paramTab, boolean paramBoolean);
/*    */ 
/*    */   public abstract void addTab(Tab paramTab, int paramInt);
/*    */ 
/*    */   public abstract void addTab(Tab paramTab, int paramInt, boolean paramBoolean);
/*    */ 
/*    */   public abstract void removeTab(Tab paramTab);
/*    */ 
/*    */   public abstract void removeTabAt(int paramInt);
/*    */ 
/*    */   public abstract void removeAllTabs();
/*    */ 
/*    */   public abstract void selectTab(Tab paramTab);
/*    */ 
/*    */   public abstract Tab getSelectedTab();
/*    */ 
/*    */   public abstract Tab getTabAt(int paramInt);
/*    */ 
/*    */   public abstract int getTabCount();
/*    */ 
/*    */   public abstract int getHeight();
/*    */ 
/*    */   public abstract void show();
/*    */ 
/*    */   public abstract void hide();
/*    */ 
/*    */   public abstract boolean isShowing();
/*    */ 
/*    */   public abstract void addOnMenuVisibilityListener(OnMenuVisibilityListener paramOnMenuVisibilityListener);
/*    */ 
/*    */   public abstract void removeOnMenuVisibilityListener(OnMenuVisibilityListener paramOnMenuVisibilityListener);
/*    */ 
/*    */   public static class LayoutParams extends ViewGroup.MarginLayoutParams
/*    */   {
/*    */     public int gravity;
/*    */ 
/*    */     public LayoutParams(Context c, AttributeSet attrs)
/*    */     {
/* 40 */       super(); throw new RuntimeException("Stub!"); } 
/* 41 */     public LayoutParams(int width, int height) { super(); throw new RuntimeException("Stub!"); } 
/* 42 */     public LayoutParams(int width, int height, int gravity) { super(); throw new RuntimeException("Stub!"); } 
/* 43 */     public LayoutParams(int gravity) { super(); throw new RuntimeException("Stub!"); } 
/* 44 */     public LayoutParams(LayoutParams source) { super(); throw new RuntimeException("Stub!"); } 
/* 45 */     public LayoutParams(ViewGroup.LayoutParams source) { super(); throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static abstract interface TabListener
/*    */   {
/*    */     public abstract void onTabSelected(ActionBar.Tab paramTab, FragmentTransaction paramFragmentTransaction);
/*    */ 
/*    */     public abstract void onTabUnselected(ActionBar.Tab paramTab, FragmentTransaction paramFragmentTransaction);
/*    */ 
/*    */     public abstract void onTabReselected(ActionBar.Tab paramTab, FragmentTransaction paramFragmentTransaction);
/*    */   }
/*    */ 
/*    */   public static abstract class Tab
/*    */   {
/*    */     public static final int INVALID_POSITION = -1;
/*    */ 
/*    */     public Tab()
/*    */     {
/* 14 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */ 
/*    */     public abstract int getPosition();
/*    */ 
/*    */     public abstract Drawable getIcon();
/*    */ 
/*    */     public abstract CharSequence getText();
/*    */ 
/*    */     public abstract Tab setIcon(Drawable paramDrawable);
/*    */ 
/*    */     public abstract Tab setIcon(int paramInt);
/*    */ 
/*    */     public abstract Tab setText(CharSequence paramCharSequence);
/*    */ 
/*    */     public abstract Tab setText(int paramInt);
/*    */ 
/*    */     public abstract Tab setCustomView(View paramView);
/*    */ 
/*    */     public abstract Tab setCustomView(int paramInt);
/*    */ 
/*    */     public abstract View getCustomView();
/*    */ 
/*    */     public abstract Tab setTag(Object paramObject);
/*    */ 
/*    */     public abstract Object getTag();
/*    */ 
/*    */     public abstract Tab setTabListener(ActionBar.TabListener paramTabListener);
/*    */ 
/*    */     public abstract void select();
/*    */   }
/*    */ 
/*    */   public static abstract interface OnMenuVisibilityListener
/*    */   {
/*    */     public abstract void onMenuVisibilityChanged(boolean paramBoolean);
/*    */   }
/*    */ 
/*    */   public static abstract interface OnNavigationListener
/*    */   {
/*    */     public abstract boolean onNavigationItemSelected(int paramInt, long paramLong);
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.app.ActionBar
 * JD-Core Version:    0.6.0
 */