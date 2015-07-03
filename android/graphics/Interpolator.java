/*    */ package android.graphics;
/*    */ 
/*    */ public class Interpolator
/*    */ {
/*    */   public Interpolator(int valueCount)
/*    */   {
/* 10 */     throw new RuntimeException("Stub!"); } 
/* 11 */   public Interpolator(int valueCount, int frameCount) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void reset(int valueCount) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void reset(int valueCount, int frameCount) { throw new RuntimeException("Stub!"); } 
/* 14 */   public final int getKeyFrameCount() { throw new RuntimeException("Stub!"); } 
/* 15 */   public final int getValueCount() { throw new RuntimeException("Stub!"); } 
/* 16 */   public void setKeyFrame(int index, int msec, float[] values) { throw new RuntimeException("Stub!"); } 
/* 17 */   public void setKeyFrame(int index, int msec, float[] values, float[] blend) { throw new RuntimeException("Stub!"); } 
/* 18 */   public void setRepeatMirror(float repeatCount, boolean mirror) { throw new RuntimeException("Stub!"); } 
/* 19 */   public Result timeToValues(float[] values) { throw new RuntimeException("Stub!"); } 
/* 20 */   public Result timeToValues(int msec, float[] values) { throw new RuntimeException("Stub!"); } 
/* 21 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static enum Result
/*    */   {
/*  6 */     FREEZE_END, 
/*  7 */     FREEZE_START, 
/*  8 */     NORMAL;
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.graphics.Interpolator
 * JD-Core Version:    0.6.0
 */