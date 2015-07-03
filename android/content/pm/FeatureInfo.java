/*    */ package android.content.pm;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public class FeatureInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public String name;
/*    */   public static final int GL_ES_VERSION_UNDEFINED = 0;
/*    */   public int reqGlEsVersion;
/*    */   public static final int FLAG_REQUIRED = 1;
/*    */   public int flags;
/* 17 */   public static final Parcelable.Creator<FeatureInfo> CREATOR = null;
/*    */ 
/*    */   public FeatureInfo()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public FeatureInfo(FeatureInfo orig) { throw new RuntimeException("Stub!"); } 
/*  7 */   public String toString() { throw new RuntimeException("Stub!"); } 
/*  8 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/*  9 */   public void writeToParcel(Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); } 
/* 10 */   public String getGlEsVersion() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.content.pm.FeatureInfo
 * JD-Core Version:    0.6.0
 */