/*    */ package android.gesture;
/*    */ 
/*    */ import android.graphics.Bitmap;
/*    */ import android.graphics.Path;
/*    */ import android.graphics.RectF;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ public class Gesture
/*    */   implements Parcelable
/*    */ {
/* 22 */   public static final Parcelable.Creator<Gesture> CREATOR = null;
/*    */ 
/*    */   public Gesture()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public Object clone() { throw new RuntimeException("Stub!"); } 
/*  7 */   public ArrayList<GestureStroke> getStrokes() { throw new RuntimeException("Stub!"); } 
/*  8 */   public int getStrokesCount() { throw new RuntimeException("Stub!"); } 
/*  9 */   public void addStroke(GestureStroke stroke) { throw new RuntimeException("Stub!"); } 
/* 10 */   public float getLength() { throw new RuntimeException("Stub!"); } 
/* 11 */   public RectF getBoundingBox() { throw new RuntimeException("Stub!"); } 
/* 12 */   public Path toPath() { throw new RuntimeException("Stub!"); } 
/* 13 */   public Path toPath(Path path) { throw new RuntimeException("Stub!"); } 
/* 14 */   public Path toPath(int width, int height, int edge, int numSample) { throw new RuntimeException("Stub!"); } 
/* 15 */   public Path toPath(Path path, int width, int height, int edge, int numSample) { throw new RuntimeException("Stub!"); } 
/* 16 */   public long getID() { throw new RuntimeException("Stub!"); } 
/* 17 */   public Bitmap toBitmap(int width, int height, int edge, int numSample, int color) { throw new RuntimeException("Stub!"); } 
/* 18 */   public Bitmap toBitmap(int width, int height, int inset, int color) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); } 
/* 20 */   public int describeContents() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.gesture.Gesture
 * JD-Core Version:    0.6.0
 */