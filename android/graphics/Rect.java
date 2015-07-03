/*    */ package android.graphics;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public final class Rect
/*    */   implements Parcelable
/*    */ {
/*    */   public int left;
/*    */   public int top;
/*    */   public int right;
/*    */   public int bottom;
/* 46 */   public static final Parcelable.Creator<Rect> CREATOR = null;
/*    */ 
/*    */   public Rect()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public Rect(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); } 
/*  7 */   public Rect(Rect r) { throw new RuntimeException("Stub!"); } 
/*  8 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); } 
/*  9 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 10 */   public String toShortString() { throw new RuntimeException("Stub!"); } 
/* 11 */   public String flattenToString() { throw new RuntimeException("Stub!"); } 
/* 12 */   public static Rect unflattenFromString(String str) { throw new RuntimeException("Stub!"); } 
/* 13 */   public final boolean isEmpty() { throw new RuntimeException("Stub!"); } 
/* 14 */   public final int width() { throw new RuntimeException("Stub!"); } 
/* 15 */   public final int height() { throw new RuntimeException("Stub!"); } 
/* 16 */   public final int centerX() { throw new RuntimeException("Stub!"); } 
/* 17 */   public final int centerY() { throw new RuntimeException("Stub!"); } 
/* 18 */   public final float exactCenterX() { throw new RuntimeException("Stub!"); } 
/* 19 */   public final float exactCenterY() { throw new RuntimeException("Stub!"); } 
/* 20 */   public void setEmpty() { throw new RuntimeException("Stub!"); } 
/* 21 */   public void set(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); } 
/* 22 */   public void set(Rect src) { throw new RuntimeException("Stub!"); } 
/* 23 */   public void offset(int dx, int dy) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void offsetTo(int newLeft, int newTop) { throw new RuntimeException("Stub!"); } 
/* 25 */   public void inset(int dx, int dy) { throw new RuntimeException("Stub!"); } 
/* 26 */   public boolean contains(int x, int y) { throw new RuntimeException("Stub!"); } 
/* 27 */   public boolean contains(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); } 
/* 28 */   public boolean contains(Rect r) { throw new RuntimeException("Stub!"); } 
/* 29 */   public boolean intersect(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); } 
/* 30 */   public boolean intersect(Rect r) { throw new RuntimeException("Stub!"); } 
/* 31 */   public boolean setIntersect(Rect a, Rect b) { throw new RuntimeException("Stub!"); } 
/* 32 */   public boolean intersects(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); } 
/* 33 */   public static boolean intersects(Rect a, Rect b) { throw new RuntimeException("Stub!"); } 
/* 34 */   public void union(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); } 
/* 35 */   public void union(Rect r) { throw new RuntimeException("Stub!"); } 
/* 36 */   public void union(int x, int y) { throw new RuntimeException("Stub!"); } 
/* 37 */   public void sort() { throw new RuntimeException("Stub!"); } 
/* 38 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 39 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); } 
/* 40 */   public void readFromParcel(Parcel in) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.graphics.Rect
 * JD-Core Version:    0.6.0
 */