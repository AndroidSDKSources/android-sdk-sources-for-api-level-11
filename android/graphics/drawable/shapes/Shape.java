/*    */ package android.graphics.drawable.shapes;
/*    */ 
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.Paint;
/*    */ 
/*    */ public abstract class Shape
/*    */   implements Cloneable
/*    */ {
/*    */   public Shape()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public final float getWidth() { throw new RuntimeException("Stub!"); } 
/*  7 */   public final float getHeight() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract void draw(Canvas paramCanvas, Paint paramPaint);
/*    */ 
/*  9 */   public final void resize(float width, float height) { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean hasAlpha() { throw new RuntimeException("Stub!"); } 
/* 11 */   protected void onResize(float width, float height) { throw new RuntimeException("Stub!"); } 
/* 12 */   public Shape clone() throws CloneNotSupportedException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.graphics.drawable.shapes.Shape
 * JD-Core Version:    0.6.0
 */