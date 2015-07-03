/*    */ package android.media;
/*    */ 
/*    */ import android.graphics.Bitmap;
/*    */ import android.graphics.PointF;
/*    */ 
/*    */ public class FaceDetector
/*    */ {
/*    */   public FaceDetector(int width, int height, int maxFaces)
/*    */   {
/* 16 */     throw new RuntimeException("Stub!"); } 
/* 17 */   public int findFaces(Bitmap bitmap, Face[] faces) { throw new RuntimeException("Stub!"); } 
/* 18 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public class Face
/*    */   {
/*    */     public static final float CONFIDENCE_THRESHOLD = 0.4F;
/*    */     public static final int EULER_X = 0;
/*    */     public static final int EULER_Y = 1;
/*    */     public static final int EULER_Z = 2;
/*    */ 
/*    */     Face()
/*    */     {
/*  6 */       throw new RuntimeException("Stub!"); } 
/*  7 */     public float confidence() { throw new RuntimeException("Stub!"); } 
/*  8 */     public void getMidPoint(PointF point) { throw new RuntimeException("Stub!"); } 
/*  9 */     public float eyesDistance() { throw new RuntimeException("Stub!"); } 
/* 10 */     public float pose(int euler) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.media.FaceDetector
 * JD-Core Version:    0.6.0
 */