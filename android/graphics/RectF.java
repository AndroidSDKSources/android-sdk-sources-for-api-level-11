/*    */ package android.graphics;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public class RectF
/*    */   implements Parcelable
/*    */ {
/*    */   public float left;
/*    */   public float top;
/*    */   public float right;
/*    */   public float bottom;
/* 44 */   public static final Parcelable.Creator<RectF> CREATOR = null;
/*    */ 
/*    */   public RectF()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public RectF(float left, float top, float right, float bottom) { throw new RuntimeException("Stub!"); } 
/*  7 */   public RectF(RectF r) { throw new RuntimeException("Stub!"); } 
/*  8 */   public RectF(Rect r) { throw new RuntimeException("Stub!"); } 
/*  9 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 10 */   public final boolean isEmpty() { throw new RuntimeException("Stub!"); } 
/* 11 */   public final float width() { throw new RuntimeException("Stub!"); } 
/* 12 */   public final float height() { throw new RuntimeException("Stub!"); } 
/* 13 */   public final float centerX() { throw new RuntimeException("Stub!"); } 
/* 14 */   public final float centerY() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void setEmpty() { throw new RuntimeException("Stub!"); } 
/* 16 */   public void set(float left, float top, float right, float bottom) { throw new RuntimeException("Stub!"); } 
/* 17 */   public void set(RectF src) { throw new RuntimeException("Stub!"); } 
/* 18 */   public void set(Rect src) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void offset(float dx, float dy) { throw new RuntimeException("Stub!"); } 
/* 20 */   public void offsetTo(float newLeft, float newTop) { throw new RuntimeException("Stub!"); } 
/* 21 */   public void inset(float dx, float dy) { throw new RuntimeException("Stub!"); } 
/* 22 */   public boolean contains(float x, float y) { throw new RuntimeException("Stub!"); } 
/* 23 */   public boolean contains(float left, float top, float right, float bottom) { throw new RuntimeException("Stub!"); } 
/* 24 */   public boolean contains(RectF r) { throw new RuntimeException("Stub!"); } 
/* 25 */   public boolean intersect(float left, float top, float right, float bottom) { throw new RuntimeException("Stub!"); } 
/* 26 */   public boolean intersect(RectF r) { throw new RuntimeException("Stub!"); } 
/* 27 */   public boolean setIntersect(RectF a, RectF b) { throw new RuntimeException("Stub!"); } 
/* 28 */   public boolean intersects(float left, float top, float right, float bottom) { throw new RuntimeException("Stub!"); } 
/* 29 */   public static boolean intersects(RectF a, RectF b) { throw new RuntimeException("Stub!"); } 
/* 30 */   public void round(Rect dst) { throw new RuntimeException("Stub!"); } 
/* 31 */   public void roundOut(Rect dst) { throw new RuntimeException("Stub!"); } 
/* 32 */   public void union(float left, float top, float right, float bottom) { throw new RuntimeException("Stub!"); } 
/* 33 */   public void union(RectF r) { throw new RuntimeException("Stub!"); } 
/* 34 */   public void union(float x, float y) { throw new RuntimeException("Stub!"); } 
/* 35 */   public void sort() { throw new RuntimeException("Stub!"); } 
/* 36 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 37 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); } 
/* 38 */   public void readFromParcel(Parcel in) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.graphics.RectF
 * JD-Core Version:    0.6.0
 */