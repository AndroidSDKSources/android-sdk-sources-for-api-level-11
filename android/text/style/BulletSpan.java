/*    */ package android.text.style;
/*    */ 
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.Paint;
/*    */ import android.os.Parcel;
/*    */ import android.text.Layout;
/*    */ import android.text.ParcelableSpan;
/*    */ 
/*    */ public class BulletSpan
/*    */   implements LeadingMarginSpan, ParcelableSpan
/*    */ {
/*    */   public static final int STANDARD_GAP_WIDTH = 2;
/*    */ 
/*    */   public BulletSpan()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public BulletSpan(int gapWidth) { throw new RuntimeException("Stub!"); } 
/*  7 */   public BulletSpan(int gapWidth, int color) { throw new RuntimeException("Stub!"); } 
/*  8 */   public BulletSpan(Parcel src) { throw new RuntimeException("Stub!"); } 
/*  9 */   public int getSpanTypeId() { throw new RuntimeException("Stub!"); } 
/* 10 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 11 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); } 
/* 12 */   public int getLeadingMargin(boolean first) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void drawLeadingMargin(Canvas c, Paint p, int x, int dir, int top, int baseline, int bottom, CharSequence text, int start, int end, boolean first, Layout l) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.text.style.BulletSpan
 * JD-Core Version:    0.6.0
 */