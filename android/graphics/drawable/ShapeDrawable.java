/*    */ package android.graphics.drawable;
/*    */ 
/*    */ import android.content.res.Resources;
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.ColorFilter;
/*    */ import android.graphics.Paint;
/*    */ import android.graphics.Rect;
/*    */ import android.graphics.Shader;
/*    */ import android.graphics.drawable.shapes.Shape;
/*    */ import android.util.AttributeSet;
/*    */ import java.io.IOException;
/*    */ import org.xmlpull.v1.XmlPullParser;
/*    */ import org.xmlpull.v1.XmlPullParserException;
/*    */ 
/*    */ public class ShapeDrawable extends Drawable
/*    */ {
/*    */   public ShapeDrawable()
/*    */   {
/* 10 */     throw new RuntimeException("Stub!"); } 
/* 11 */   public ShapeDrawable(Shape s) { throw new RuntimeException("Stub!"); } 
/* 12 */   public Shape getShape() { throw new RuntimeException("Stub!"); } 
/* 13 */   public void setShape(Shape s) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void setShaderFactory(ShaderFactory fact) { throw new RuntimeException("Stub!"); } 
/* 15 */   public ShaderFactory getShaderFactory() { throw new RuntimeException("Stub!"); } 
/* 16 */   public Paint getPaint() { throw new RuntimeException("Stub!"); } 
/* 17 */   public void setPadding(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); } 
/* 18 */   public void setPadding(Rect padding) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void setIntrinsicWidth(int width) { throw new RuntimeException("Stub!"); } 
/* 20 */   public void setIntrinsicHeight(int height) { throw new RuntimeException("Stub!"); } 
/* 21 */   public int getIntrinsicWidth() { throw new RuntimeException("Stub!"); } 
/* 22 */   public int getIntrinsicHeight() { throw new RuntimeException("Stub!"); } 
/* 23 */   public boolean getPadding(Rect padding) { throw new RuntimeException("Stub!"); } 
/* 24 */   protected void onDraw(Shape shape, Canvas canvas, Paint paint) { throw new RuntimeException("Stub!"); } 
/* 25 */   public void draw(Canvas canvas) { throw new RuntimeException("Stub!"); } 
/* 26 */   public int getChangingConfigurations() { throw new RuntimeException("Stub!"); } 
/* 27 */   public void setAlpha(int alpha) { throw new RuntimeException("Stub!"); } 
/* 28 */   public void setColorFilter(ColorFilter cf) { throw new RuntimeException("Stub!"); } 
/* 29 */   public int getOpacity() { throw new RuntimeException("Stub!"); } 
/* 30 */   public void setDither(boolean dither) { throw new RuntimeException("Stub!"); } 
/* 31 */   protected void onBoundsChange(Rect bounds) { throw new RuntimeException("Stub!"); } 
/* 32 */   protected boolean inflateTag(String name, Resources r, XmlPullParser parser, AttributeSet attrs) { throw new RuntimeException("Stub!"); } 
/* 33 */   public void inflate(Resources r, XmlPullParser parser, AttributeSet attrs) throws XmlPullParserException, IOException { throw new RuntimeException("Stub!"); } 
/* 34 */   public Drawable.ConstantState getConstantState() { throw new RuntimeException("Stub!"); } 
/* 35 */   public Drawable mutate() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static abstract class ShaderFactory
/*    */   {
/*    */     public ShaderFactory()
/*    */     {
/*  7 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */ 
/*    */     public abstract Shader resize(int paramInt1, int paramInt2);
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.graphics.drawable.ShapeDrawable
 * JD-Core Version:    0.6.0
 */