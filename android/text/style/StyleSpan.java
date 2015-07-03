/*    */ package android.text.style;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.text.ParcelableSpan;
/*    */ import android.text.TextPaint;
/*    */ 
/*    */ public class StyleSpan extends MetricAffectingSpan
/*    */   implements ParcelableSpan
/*    */ {
/*    */   public StyleSpan(int style)
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public StyleSpan(Parcel src) { throw new RuntimeException("Stub!"); } 
/*  8 */   public int getSpanTypeId() { throw new RuntimeException("Stub!"); } 
/*  9 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); } 
/* 11 */   public int getStyle() { throw new RuntimeException("Stub!"); } 
/* 12 */   public void updateDrawState(TextPaint ds) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void updateMeasureState(TextPaint paint) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.text.style.StyleSpan
 * JD-Core Version:    0.6.0
 */