/*    */ package android.content.res;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import java.io.IOException;
/*    */ import org.xmlpull.v1.XmlPullParser;
/*    */ import org.xmlpull.v1.XmlPullParserException;
/*    */ 
/*    */ public class ColorStateList
/*    */   implements Parcelable
/*    */ {
/* 16 */   public static final Parcelable.Creator<ColorStateList> CREATOR = null;
/*    */ 
/*    */   public ColorStateList(int[][] states, int[] colors)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public static ColorStateList valueOf(int color) { throw new RuntimeException("Stub!"); } 
/*  7 */   public static ColorStateList createFromXml(Resources r, XmlPullParser parser) throws XmlPullParserException, IOException { throw new RuntimeException("Stub!"); } 
/*  8 */   public ColorStateList withAlpha(int alpha) { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean isStateful() { throw new RuntimeException("Stub!"); } 
/* 10 */   public int getColorForState(int[] stateSet, int defaultColor) { throw new RuntimeException("Stub!"); } 
/* 11 */   public int getDefaultColor() { throw new RuntimeException("Stub!"); } 
/* 12 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 13 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 14 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.content.res.ColorStateList
 * JD-Core Version:    0.6.0
 */