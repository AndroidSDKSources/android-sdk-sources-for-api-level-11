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
/*    */ public class LayerDrawable extends Drawable
/*    */   implements Drawable.Callback
/*    */ {
/*    */   public LayerDrawable(Drawable[] layers)
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public void inflate(Resources r, XmlPullParser parser, AttributeSet attrs) throws XmlPullParserException, IOException { throw new RuntimeException("Stub!"); } 
/*  8 */   public Drawable findDrawableByLayerId(int id) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void setId(int index, int id) { throw new RuntimeException("Stub!"); } 
/* 10 */   public int getNumberOfLayers() { throw new RuntimeException("Stub!"); } 
/* 11 */   public Drawable getDrawable(int index) { throw new RuntimeException("Stub!"); } 
/* 12 */   public int getId(int index) { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean setDrawableByLayerId(int id, Drawable drawable) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void setLayerInset(int index, int l, int t, int r, int b) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void invalidateDrawable(Drawable who) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void scheduleDrawable(Drawable who, Runnable what, long when) { throw new RuntimeException("Stub!"); } 
/* 17 */   public void unscheduleDrawable(Drawable who, Runnable what) { throw new RuntimeException("Stub!"); } 
/* 18 */   public void draw(Canvas canvas) { throw new RuntimeException("Stub!"); } 
/* 19 */   public int getChangingConfigurations() { throw new RuntimeException("Stub!"); } 
/* 20 */   public boolean getPadding(Rect padding) { throw new RuntimeException("Stub!"); } 
/* 21 */   public boolean setVisible(boolean visible, boolean restart) { throw new RuntimeException("Stub!"); } 
/* 22 */   public void setDither(boolean dither) { throw new RuntimeException("Stub!"); } 
/* 23 */   public void setAlpha(int alpha) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void setColorFilter(ColorFilter cf) { throw new RuntimeException("Stub!"); } 
/* 25 */   public void setOpacity(int opacity) { throw new RuntimeException("Stub!"); } 
/* 26 */   public int getOpacity() { throw new RuntimeException("Stub!"); } 
/* 27 */   public boolean isStateful() { throw new RuntimeException("Stub!"); } 
/* 28 */   protected boolean onStateChange(int[] state) { throw new RuntimeException("Stub!"); } 
/* 29 */   protected boolean onLevelChange(int level) { throw new RuntimeException("Stub!"); } 
/* 30 */   protected void onBoundsChange(Rect bounds) { throw new RuntimeException("Stub!"); } 
/* 31 */   public int getIntrinsicWidth() { throw new RuntimeException("Stub!"); } 
/* 32 */   public int getIntrinsicHeight() { throw new RuntimeException("Stub!"); } 
/* 33 */   public Drawable.ConstantState getConstantState() { throw new RuntimeException("Stub!"); } 
/* 34 */   public Drawable mutate() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.graphics.drawable.LayerDrawable
 * JD-Core Version:    0.6.0
 */