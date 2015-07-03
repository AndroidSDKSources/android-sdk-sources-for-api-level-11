/*    */ package android.view.animation;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.util.AttributeSet;
/*    */ import java.util.List;
/*    */ 
/*    */ public class AnimationSet extends Animation
/*    */ {
/*    */   public AnimationSet(Context context, AttributeSet attrs)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public AnimationSet(boolean shareInterpolator) { throw new RuntimeException("Stub!"); } 
/*  7 */   protected AnimationSet clone() throws CloneNotSupportedException { throw new RuntimeException("Stub!"); } 
/*  8 */   public void setFillAfter(boolean fillAfter) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void setFillBefore(boolean fillBefore) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void setRepeatMode(int repeatMode) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void setStartOffset(long startOffset) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void setDuration(long durationMillis) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void addAnimation(Animation a) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void setStartTime(long startTimeMillis) { throw new RuntimeException("Stub!"); } 
/* 15 */   public long getStartTime() { throw new RuntimeException("Stub!"); } 
/* 16 */   public void restrictDuration(long durationMillis) { throw new RuntimeException("Stub!"); } 
/* 17 */   public long getDuration() { throw new RuntimeException("Stub!"); } 
/* 18 */   public long computeDurationHint() { throw new RuntimeException("Stub!"); } 
/* 19 */   public boolean getTransformation(long currentTime, Transformation t) { throw new RuntimeException("Stub!"); } 
/* 20 */   public void scaleCurrentDuration(float scale) { throw new RuntimeException("Stub!"); } 
/* 21 */   public void initialize(int width, int height, int parentWidth, int parentHeight) { throw new RuntimeException("Stub!"); } 
/* 22 */   public void reset() { throw new RuntimeException("Stub!"); } 
/* 23 */   public List<Animation> getAnimations() { throw new RuntimeException("Stub!"); } 
/* 24 */   public boolean willChangeTransformationMatrix() { throw new RuntimeException("Stub!"); } 
/* 25 */   public boolean willChangeBounds() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.view.animation.AnimationSet
 * JD-Core Version:    0.6.0
 */