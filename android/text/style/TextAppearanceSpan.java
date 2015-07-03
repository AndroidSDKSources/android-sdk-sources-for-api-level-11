/*    */ package android.text.style;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.res.ColorStateList;
/*    */ import android.os.Parcel;
/*    */ import android.text.ParcelableSpan;
/*    */ import android.text.TextPaint;
/*    */ 
/*    */ public class TextAppearanceSpan extends MetricAffectingSpan
/*    */   implements ParcelableSpan
/*    */ {
/*    */   public TextAppearanceSpan(Context context, int appearance)
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public TextAppearanceSpan(Context context, int appearance, int colorList) { throw new RuntimeException("Stub!"); } 
/*  8 */   public TextAppearanceSpan(String family, int style, int size, ColorStateList color, ColorStateList linkColor) { throw new RuntimeException("Stub!"); } 
/*  9 */   public TextAppearanceSpan(Parcel src) { throw new RuntimeException("Stub!"); } 
/* 10 */   public int getSpanTypeId() { throw new RuntimeException("Stub!"); } 
/* 11 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 12 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); } 
/* 13 */   public String getFamily() { throw new RuntimeException("Stub!"); } 
/* 14 */   public ColorStateList getTextColor() { throw new RuntimeException("Stub!"); } 
/* 15 */   public ColorStateList getLinkTextColor() { throw new RuntimeException("Stub!"); } 
/* 16 */   public int getTextSize() { throw new RuntimeException("Stub!"); } 
/* 17 */   public int getTextStyle() { throw new RuntimeException("Stub!"); } 
/* 18 */   public void updateDrawState(TextPaint ds) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void updateMeasureState(TextPaint ds) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.text.style.TextAppearanceSpan
 * JD-Core Version:    0.6.0
 */