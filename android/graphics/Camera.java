/*    */ package android.graphics;
/*    */ 
/*    */ public class Camera
/*    */ {
/*    */   public Camera()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*    */   public native void save();
/*    */ 
/*    */   public native void restore();
/*    */ 
/*    */   public native void translate(float paramFloat1, float paramFloat2, float paramFloat3);
/*    */ 
/*    */   public native void rotateX(float paramFloat);
/*    */ 
/*    */   public native void rotateY(float paramFloat);
/*    */ 
/*    */   public native void rotateZ(float paramFloat);
/*    */ 
/* 11 */   public void getMatrix(Matrix matrix) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void applyToCanvas(Canvas canvas) { throw new RuntimeException("Stub!"); } 
/*    */   public native float dotWithNormal(float paramFloat1, float paramFloat2, float paramFloat3);
/*    */ 
/* 14 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.graphics.Camera
 * JD-Core Version:    0.6.0
 */