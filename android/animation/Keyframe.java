/*    */ package android.animation;
/*    */ 
/*    */ public abstract class Keyframe
/*    */   implements Cloneable
/*    */ {
/*    */   public Keyframe()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public static Keyframe ofInt(float fraction, int value) { throw new RuntimeException("Stub!"); } 
/*  7 */   public static Keyframe ofInt(float fraction) { throw new RuntimeException("Stub!"); } 
/*  8 */   public static Keyframe ofFloat(float fraction, float value) { throw new RuntimeException("Stub!"); } 
/*  9 */   public static Keyframe ofFloat(float fraction) { throw new RuntimeException("Stub!"); } 
/* 10 */   public static Keyframe ofObject(float fraction, Object value) { throw new RuntimeException("Stub!"); } 
/* 11 */   public static Keyframe ofObject(float fraction) { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean hasValue() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract Object getValue();
/*    */ 
/*    */   public abstract void setValue(Object paramObject);
/*    */ 
/* 15 */   public float getFraction() { throw new RuntimeException("Stub!"); } 
/* 16 */   public void setFraction(float fraction) { throw new RuntimeException("Stub!"); } 
/* 17 */   public TimeInterpolator getInterpolator() { throw new RuntimeException("Stub!"); } 
/* 18 */   public void setInterpolator(TimeInterpolator interpolator) { throw new RuntimeException("Stub!"); } 
/* 19 */   public Class getType() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public abstract Keyframe clone();
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.animation.Keyframe
 * JD-Core Version:    0.6.0
 */