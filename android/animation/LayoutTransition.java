/*    */ package android.animation;
/*    */ 
/*    */ import android.view.View;
/*    */ import android.view.ViewGroup;
/*    */ import java.util.List;
/*    */ 
/*    */ public class LayoutTransition
/*    */ {
/*    */   public static final int CHANGE_APPEARING = 0;
/*    */   public static final int CHANGE_DISAPPEARING = 1;
/*    */   public static final int APPEARING = 2;
/*    */   public static final int DISAPPEARING = 3;
/*    */ 
/*    */   public LayoutTransition()
/*    */   {
/*  9 */     throw new RuntimeException("Stub!"); } 
/* 10 */   public void setDuration(long duration) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void setStartDelay(int transitionType, long delay) { throw new RuntimeException("Stub!"); } 
/* 12 */   public long getStartDelay(int transitionType) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void setDuration(int transitionType, long duration) { throw new RuntimeException("Stub!"); } 
/* 14 */   public long getDuration(int transitionType) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void setStagger(int transitionType, long duration) { throw new RuntimeException("Stub!"); } 
/* 16 */   public long getStagger(int transitionType) { throw new RuntimeException("Stub!"); } 
/* 17 */   public void setInterpolator(int transitionType, TimeInterpolator interpolator) { throw new RuntimeException("Stub!"); } 
/* 18 */   public TimeInterpolator getInterpolator(int transitionType) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void setAnimator(int transitionType, Animator animator) { throw new RuntimeException("Stub!"); } 
/* 20 */   public Animator getAnimator(int transitionType) { throw new RuntimeException("Stub!"); } 
/* 21 */   public boolean isChangingLayout() { throw new RuntimeException("Stub!"); } 
/* 22 */   public boolean isRunning() { throw new RuntimeException("Stub!"); } 
/* 23 */   public void addChild(ViewGroup parent, View child) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void showChild(ViewGroup parent, View child) { throw new RuntimeException("Stub!"); } 
/* 25 */   public void removeChild(ViewGroup parent, View child) { throw new RuntimeException("Stub!"); } 
/* 26 */   public void hideChild(ViewGroup parent, View child) { throw new RuntimeException("Stub!"); } 
/* 27 */   public void addTransitionListener(TransitionListener listener) { throw new RuntimeException("Stub!"); } 
/* 28 */   public void removeTransitionListener(TransitionListener listener) { throw new RuntimeException("Stub!"); } 
/* 29 */   public List<TransitionListener> getTransitionListeners() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static abstract interface TransitionListener
/*    */   {
/*    */     public abstract void startTransition(LayoutTransition paramLayoutTransition, ViewGroup paramViewGroup, View paramView, int paramInt);
/*    */ 
/*    */     public abstract void endTransition(LayoutTransition paramLayoutTransition, ViewGroup paramViewGroup, View paramView, int paramInt);
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.animation.LayoutTransition
 * JD-Core Version:    0.6.0
 */