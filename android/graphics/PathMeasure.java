/*    */ package android.graphics;
/*    */ 
/*    */ public class PathMeasure
/*    */ {
/*    */   public static final int POSITION_MATRIX_FLAG = 1;
/*    */   public static final int TANGENT_MATRIX_FLAG = 2;
/*    */ 
/*    */   public PathMeasure()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public PathMeasure(Path path, boolean forceClosed) { throw new RuntimeException("Stub!"); } 
/*  6 */   public void setPath(Path path, boolean forceClosed) { throw new RuntimeException("Stub!"); } 
/*  7 */   public float getLength() { throw new RuntimeException("Stub!"); } 
/*  8 */   public boolean getPosTan(float distance, float[] pos, float[] tan) { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean getMatrix(float distance, Matrix matrix, int flags) { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean getSegment(float startD, float stopD, Path dst, boolean startWithMoveTo) { throw new RuntimeException("Stub!"); } 
/* 11 */   public boolean isClosed() { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean nextContour() { throw new RuntimeException("Stub!"); } 
/* 13 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.graphics.PathMeasure
 * JD-Core Version:    0.6.0
 */