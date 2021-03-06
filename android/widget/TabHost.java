/*    */ package android.widget;
/*    */ 
/*    */ import android.app.LocalActivityManager;
/*    */ import android.content.Context;
/*    */ import android.content.Intent;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.KeyEvent;
/*    */ import android.view.View;
/*    */ import android.view.ViewTreeObserver.OnTouchModeChangeListener;
/*    */ 
/*    */ public class TabHost extends FrameLayout
/*    */   implements ViewTreeObserver.OnTouchModeChangeListener
/*    */ {
/*    */   public TabHost(Context context)
/*    */   {
/* 25 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 26 */   public TabHost(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 27 */   public TabSpec newTabSpec(String tag) { throw new RuntimeException("Stub!"); } 
/* 28 */   public void setup() { throw new RuntimeException("Stub!"); } 
/* 29 */   public void sendAccessibilityEvent(int eventType) { throw new RuntimeException("Stub!"); } 
/* 30 */   public void setup(LocalActivityManager activityGroup) { throw new RuntimeException("Stub!"); } 
/* 31 */   protected void onAttachedToWindow() { throw new RuntimeException("Stub!"); } 
/* 32 */   protected void onDetachedFromWindow() { throw new RuntimeException("Stub!"); } 
/* 33 */   public void onTouchModeChanged(boolean isInTouchMode) { throw new RuntimeException("Stub!"); } 
/* 34 */   public void addTab(TabSpec tabSpec) { throw new RuntimeException("Stub!"); } 
/* 35 */   public void clearAllTabs() { throw new RuntimeException("Stub!"); } 
/* 36 */   public TabWidget getTabWidget() { throw new RuntimeException("Stub!"); } 
/* 37 */   public int getCurrentTab() { throw new RuntimeException("Stub!"); } 
/* 38 */   public String getCurrentTabTag() { throw new RuntimeException("Stub!"); } 
/* 39 */   public View getCurrentTabView() { throw new RuntimeException("Stub!"); } 
/* 40 */   public View getCurrentView() { throw new RuntimeException("Stub!"); } 
/* 41 */   public void setCurrentTabByTag(String tag) { throw new RuntimeException("Stub!"); } 
/* 42 */   public FrameLayout getTabContentView() { throw new RuntimeException("Stub!"); } 
/* 43 */   public boolean dispatchKeyEvent(KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 44 */   public void dispatchWindowFocusChanged(boolean hasFocus) { throw new RuntimeException("Stub!"); } 
/* 45 */   public void setCurrentTab(int index) { throw new RuntimeException("Stub!"); } 
/* 46 */   public void setOnTabChangedListener(OnTabChangeListener l) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public class TabSpec
/*    */   {
/*    */     TabSpec()
/*    */     {
/* 16 */       throw new RuntimeException("Stub!"); } 
/* 17 */     public TabSpec setIndicator(CharSequence label) { throw new RuntimeException("Stub!"); } 
/* 18 */     public TabSpec setIndicator(CharSequence label, Drawable icon) { throw new RuntimeException("Stub!"); } 
/* 19 */     public TabSpec setIndicator(View view) { throw new RuntimeException("Stub!"); } 
/* 20 */     public TabSpec setContent(int viewId) { throw new RuntimeException("Stub!"); } 
/* 21 */     public TabSpec setContent(TabHost.TabContentFactory contentFactory) { throw new RuntimeException("Stub!"); } 
/* 22 */     public TabSpec setContent(Intent intent) { throw new RuntimeException("Stub!"); } 
/* 23 */     public String getTag() { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static abstract interface TabContentFactory
/*    */   {
/*    */     public abstract View createTabContent(String paramString);
/*    */   }
/*    */ 
/*    */   public static abstract interface OnTabChangeListener
/*    */   {
/*    */     public abstract void onTabChanged(String paramString);
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.TabHost
 * JD-Core Version:    0.6.0
 */