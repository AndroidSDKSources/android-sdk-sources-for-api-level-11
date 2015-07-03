/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.graphics.Bitmap;
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.ColorFilter;
/*    */ import android.graphics.Matrix;
/*    */ import android.graphics.PorterDuff.Mode;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.net.Uri;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.View;
/*    */ 
/*    */ @RemoteViews.RemoteView
/*    */ public class ImageView extends View
/*    */ {
/*    */   public ImageView(Context context)
/*    */   {
/* 17 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 18 */   public ImageView(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 19 */   public ImageView(Context context, AttributeSet attrs, int defStyle) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 20 */   protected boolean verifyDrawable(Drawable dr) { throw new RuntimeException("Stub!"); } 
/* 21 */   public void jumpDrawablesToCurrentState() { throw new RuntimeException("Stub!"); } 
/* 22 */   public void invalidateDrawable(Drawable dr) { throw new RuntimeException("Stub!"); } 
/* 23 */   protected boolean onSetAlpha(int alpha) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void setAdjustViewBounds(boolean adjustViewBounds) { throw new RuntimeException("Stub!"); } 
/* 25 */   public void setMaxWidth(int maxWidth) { throw new RuntimeException("Stub!"); } 
/* 26 */   public void setMaxHeight(int maxHeight) { throw new RuntimeException("Stub!"); } 
/* 27 */   public Drawable getDrawable() { throw new RuntimeException("Stub!"); } 
/* 28 */   public void setImageResource(int resId) { throw new RuntimeException("Stub!"); } 
/* 29 */   public void setImageURI(Uri uri) { throw new RuntimeException("Stub!"); } 
/* 30 */   public void setImageDrawable(Drawable drawable) { throw new RuntimeException("Stub!"); } 
/* 31 */   public void setImageBitmap(Bitmap bm) { throw new RuntimeException("Stub!"); } 
/* 32 */   public void setImageState(int[] state, boolean merge) { throw new RuntimeException("Stub!"); } 
/* 33 */   public void setSelected(boolean selected) { throw new RuntimeException("Stub!"); } 
/* 34 */   public void setImageLevel(int level) { throw new RuntimeException("Stub!"); } 
/* 35 */   public void setScaleType(ScaleType scaleType) { throw new RuntimeException("Stub!"); } 
/* 36 */   public ScaleType getScaleType() { throw new RuntimeException("Stub!"); } 
/* 37 */   public Matrix getImageMatrix() { throw new RuntimeException("Stub!"); } 
/* 38 */   public void setImageMatrix(Matrix matrix) { throw new RuntimeException("Stub!"); } 
/* 39 */   public int[] onCreateDrawableState(int extraSpace) { throw new RuntimeException("Stub!"); } 
/* 40 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); } 
/* 41 */   protected boolean setFrame(int l, int t, int r, int b) { throw new RuntimeException("Stub!"); } 
/* 42 */   protected void drawableStateChanged() { throw new RuntimeException("Stub!"); } 
/* 43 */   protected void onDraw(Canvas canvas) { throw new RuntimeException("Stub!"); } 
/* 44 */   public int getBaseline() { throw new RuntimeException("Stub!"); } 
/* 45 */   public void setBaseline(int baseline) { throw new RuntimeException("Stub!"); } 
/* 46 */   public void setBaselineAlignBottom(boolean aligned) { throw new RuntimeException("Stub!"); } 
/* 47 */   public boolean getBaselineAlignBottom() { throw new RuntimeException("Stub!"); } 
/* 48 */   public final void setColorFilter(int color, PorterDuff.Mode mode) { throw new RuntimeException("Stub!"); } 
/* 49 */   public final void setColorFilter(int color) { throw new RuntimeException("Stub!"); } 
/* 50 */   public final void clearColorFilter() { throw new RuntimeException("Stub!"); } 
/* 51 */   public void setColorFilter(ColorFilter cf) { throw new RuntimeException("Stub!"); } 
/* 52 */   public void setAlpha(int alpha) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static enum ScaleType
/*    */   {
/*  8 */     CENTER, 
/*  9 */     CENTER_CROP, 
/* 10 */     CENTER_INSIDE, 
/* 11 */     FIT_CENTER, 
/* 12 */     FIT_END, 
/* 13 */     FIT_START, 
/* 14 */     FIT_XY, 
/* 15 */     MATRIX;
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.ImageView
 * JD-Core Version:    0.6.0
 */