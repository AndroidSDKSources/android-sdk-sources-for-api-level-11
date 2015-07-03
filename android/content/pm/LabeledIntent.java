/*    */ package android.content.pm;
/*    */ 
/*    */ import android.content.Intent;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public class LabeledIntent extends Intent
/*    */ {
/* 18 */   public static final Parcelable.Creator<LabeledIntent> CREATOR = null;
/*    */ 
/*    */   public LabeledIntent(Intent origIntent, String sourcePackage, int labelRes, int icon)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public LabeledIntent(Intent origIntent, String sourcePackage, CharSequence nonLocalizedLabel, int icon) { throw new RuntimeException("Stub!"); } 
/*  7 */   public LabeledIntent(String sourcePackage, int labelRes, int icon) { throw new RuntimeException("Stub!"); } 
/*  8 */   public LabeledIntent(String sourcePackage, CharSequence nonLocalizedLabel, int icon) { throw new RuntimeException("Stub!"); } 
/*  9 */   public String getSourcePackage() { throw new RuntimeException("Stub!"); } 
/* 10 */   public int getLabelResource() { throw new RuntimeException("Stub!"); } 
/* 11 */   public CharSequence getNonLocalizedLabel() { throw new RuntimeException("Stub!"); } 
/* 12 */   public int getIconResource() { throw new RuntimeException("Stub!"); } 
/* 13 */   public CharSequence loadLabel(PackageManager pm) { throw new RuntimeException("Stub!"); } 
/* 14 */   public Drawable loadIcon(PackageManager pm) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void writeToParcel(Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void readFromParcel(Parcel in) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.content.pm.LabeledIntent
 * JD-Core Version:    0.6.0
 */