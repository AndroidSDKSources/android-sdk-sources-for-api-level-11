/*    */ package android.view.animation;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.View;
/*    */ import java.util.Random;
/*    */ 
/*    */ public class LayoutAnimationController
/*    */ {
/*    */   public static final int ORDER_NORMAL = 0;
/*    */   public static final int ORDER_REVERSE = 1;
/*    */   public static final int ORDER_RANDOM = 2;
/*    */   protected Animation mAnimation;
/*    */   protected Random mRandomizer;
/*    */   protected Interpolator mInterpolator;
/*    */ 
/*    */   public LayoutAnimationController(Context context, AttributeSet attrs)
/*    */   {
/* 10 */     throw new RuntimeException("Stub!"); } 
/* 11 */   public LayoutAnimationController(Animation animation) { throw new RuntimeException("Stub!"); } 
/* 12 */   public LayoutAnimationController(Animation animation, float delay) { throw new RuntimeException("Stub!"); } 
/* 13 */   public int getOrder() { throw new RuntimeException("Stub!"); } 
/* 14 */   public void setOrder(int order) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void setAnimation(Context context, int resourceID) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void setAnimation(Animation animation) { throw new RuntimeException("Stub!"); } 
/* 17 */   public Animation getAnimation() { throw new RuntimeException("Stub!"); } 
/* 18 */   public void setInterpolator(Context context, int resourceID) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void setInterpolator(Interpolator interpolator) { throw new RuntimeException("Stub!"); } 
/* 20 */   public Interpolator getInterpolator() { throw new RuntimeException("Stub!"); } 
/* 21 */   public float getDelay() { throw new RuntimeException("Stub!"); } 
/* 22 */   public void setDelay(float delay) { throw new RuntimeException("Stub!"); } 
/* 23 */   public boolean willOverlap() { throw new RuntimeException("Stub!"); } 
/* 24 */   public void start() { throw new RuntimeException("Stub!"); } 
/* 25 */   public final Animation getAnimationForView(View view) { throw new RuntimeException("Stub!"); } 
/* 26 */   public boolean isDone() { throw new RuntimeException("Stub!"); } 
/* 27 */   protected long getDelayForView(View view) { throw new RuntimeException("Stub!"); } 
/* 28 */   protected int getTransformedIndex(AnimationParameters params) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class AnimationParameters
/*    */   {
/*    */     public int count;
/*    */     public int index;
/*    */ 
/*    */     public AnimationParameters()
/*    */     {
/*  6 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.view.animation.LayoutAnimationController
 * JD-Core Version:    0.6.0
 */