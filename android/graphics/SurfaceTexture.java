/*    */ package android.graphics;
/*    */ 
/*    */ public class SurfaceTexture
/*    */ {
/*    */   public SurfaceTexture(int texName)
/*    */   {
/* 14 */     throw new RuntimeException("Stub!"); } 
/* 15 */   public void setOnFrameAvailableListener(OnFrameAvailableListener l) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void updateTexImage() { throw new RuntimeException("Stub!"); } 
/* 17 */   public void getTransformMatrix(float[] mtx) { throw new RuntimeException("Stub!"); } 
/* 18 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class OutOfResourcesException extends Exception
/*    */   {
/*    */     public OutOfResourcesException()
/*    */     {
/* 11 */       throw new RuntimeException("Stub!"); } 
/* 12 */     public OutOfResourcesException(String name) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static abstract interface OnFrameAvailableListener
/*    */   {
/*    */     public abstract void onFrameAvailable(SurfaceTexture paramSurfaceTexture);
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.graphics.SurfaceTexture
 * JD-Core Version:    0.6.0
 */