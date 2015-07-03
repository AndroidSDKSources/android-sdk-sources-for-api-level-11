/*    */ package android.graphics.drawable;
/*    */ 
/*    */ import android.content.res.Resources;
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.ColorFilter;
/*    */ import android.graphics.Rect;
/*    */ import android.util.AttributeSet;
/*    */ import java.io.IOException;
/*    */ import org.xmlpull.v1.XmlPullParser;
/*    */ import org.xmlpull.v1.XmlPullParserException;
/*    */ 
/*    */ public class GradientDrawable extends Drawable
/*    */ {
/*    */   public static final int RECTANGLE = 0;
/*    */   public static final int OVAL = 1;
/*    */   public static final int LINE = 2;
/*    */   public static final int RING = 3;
/*    */   public static final int LINEAR_GRADIENT = 0;
/*    */   public static final int RADIAL_GRADIENT = 1;
/*    */   public static final int SWEEP_GRADIENT = 2;
/*    */ 
/*    */   public GradientDrawable()
/*    */   {
/* 16 */     throw new RuntimeException("Stub!"); } 
/* 17 */   public GradientDrawable(Orientation orientation, int[] colors) { throw new RuntimeException("Stub!"); } 
/* 18 */   public boolean getPadding(Rect padding) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void setCornerRadii(float[] radii) { throw new RuntimeException("Stub!"); } 
/* 20 */   public void setCornerRadius(float radius) { throw new RuntimeException("Stub!"); } 
/* 21 */   public void setStroke(int width, int color) { throw new RuntimeException("Stub!"); } 
/* 22 */   public void setStroke(int width, int color, float dashWidth, float dashGap) { throw new RuntimeException("Stub!"); } 
/* 23 */   public void setSize(int width, int height) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void setShape(int shape) { throw new RuntimeException("Stub!"); } 
/* 25 */   public void setGradientType(int gradient) { throw new RuntimeException("Stub!"); } 
/* 26 */   public void setGradientCenter(float x, float y) { throw new RuntimeException("Stub!"); } 
/* 27 */   public void setGradientRadius(float gradientRadius) { throw new RuntimeException("Stub!"); } 
/* 28 */   public void setUseLevel(boolean useLevel) { throw new RuntimeException("Stub!"); } 
/* 29 */   public void draw(Canvas canvas) { throw new RuntimeException("Stub!"); } 
/* 30 */   public void setColor(int argb) { throw new RuntimeException("Stub!"); } 
/* 31 */   public int getChangingConfigurations() { throw new RuntimeException("Stub!"); } 
/* 32 */   public void setAlpha(int alpha) { throw new RuntimeException("Stub!"); } 
/* 33 */   public void setDither(boolean dither) { throw new RuntimeException("Stub!"); } 
/* 34 */   public void setColorFilter(ColorFilter cf) { throw new RuntimeException("Stub!"); } 
/* 35 */   public int getOpacity() { throw new RuntimeException("Stub!"); } 
/* 36 */   protected void onBoundsChange(Rect r) { throw new RuntimeException("Stub!"); } 
/* 37 */   protected boolean onLevelChange(int level) { throw new RuntimeException("Stub!"); } 
/* 38 */   public void inflate(Resources r, XmlPullParser parser, AttributeSet attrs) throws XmlPullParserException, IOException { throw new RuntimeException("Stub!"); } 
/* 39 */   public int getIntrinsicWidth() { throw new RuntimeException("Stub!"); } 
/* 40 */   public int getIntrinsicHeight() { throw new RuntimeException("Stub!"); } 
/* 41 */   public Drawable.ConstantState getConstantState() { throw new RuntimeException("Stub!"); } 
/* 42 */   public Drawable mutate() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static enum Orientation
/*    */   {
/*  7 */     BL_TR, 
/*  8 */     BOTTOM_TOP, 
/*  9 */     BR_TL, 
/* 10 */     LEFT_RIGHT, 
/* 11 */     RIGHT_LEFT, 
/* 12 */     TL_BR, 
/* 13 */     TOP_BOTTOM, 
/* 14 */     TR_BL;
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.graphics.drawable.GradientDrawable
 * JD-Core Version:    0.6.0
 */