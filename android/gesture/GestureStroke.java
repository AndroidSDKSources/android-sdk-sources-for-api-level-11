/*    */ package android.gesture;
/*    */ 
/*    */ import android.graphics.Path;
/*    */ import android.graphics.RectF;
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ public class GestureStroke
/*    */ {
/*    */   public final RectF boundingBox;
/*    */   public final float length;
/* 12 */   public final float[] points = null;
/*    */ 
/*    */   public GestureStroke(ArrayList<GesturePoint> points)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public Object clone() { throw new RuntimeException("Stub!"); } 
/*  6 */   public Path getPath() { throw new RuntimeException("Stub!"); } 
/*  7 */   public Path toPath(float width, float height, int numSample) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void clearPath() { throw new RuntimeException("Stub!"); } 
/*  9 */   public OrientedBoundingBox computeOrientedBoundingBox() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.gesture.GestureStroke
 * JD-Core Version:    0.6.0
 */