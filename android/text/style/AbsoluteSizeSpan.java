/*    */ package android.text.style;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.text.ParcelableSpan;
/*    */ import android.text.TextPaint;
/*    */ 
/*    */ public class AbsoluteSizeSpan extends MetricAffectingSpan
/*    */   implements ParcelableSpan
/*    */ {
/*    */   public AbsoluteSizeSpan(int size)
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public AbsoluteSizeSpan(int size, boolean dip) { throw new RuntimeException("Stub!"); } 
/*  8 */   public AbsoluteSizeSpan(Parcel src) { throw new RuntimeException("Stub!"); } 
/*  9 */   public int getSpanTypeId() { throw new RuntimeException("Stub!"); } 
/* 10 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 11 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); } 
/* 12 */   public int getSize() { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean getDip() { throw new RuntimeException("Stub!"); } 
/* 14 */   public void updateDrawState(TextPaint ds) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void updateMeasureState(TextPaint ds) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.text.style.AbsoluteSizeSpan
 * JD-Core Version:    0.6.0
 */