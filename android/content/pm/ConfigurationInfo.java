/*    */ package android.content.pm;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public class ConfigurationInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public int reqTouchScreen;
/*    */   public int reqKeyboardType;
/*    */   public int reqNavigation;
/*    */   public static final int INPUT_FEATURE_HARD_KEYBOARD = 1;
/*    */   public static final int INPUT_FEATURE_FIVE_WAY_NAV = 2;
/*    */   public int reqInputFeatures;
/*    */   public static final int GL_ES_VERSION_UNDEFINED = 0;
/*    */   public int reqGlEsVersion;
/* 20 */   public static final Parcelable.Creator<ConfigurationInfo> CREATOR = null;
/*    */ 
/*    */   public ConfigurationInfo()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public ConfigurationInfo(ConfigurationInfo orig) { throw new RuntimeException("Stub!"); } 
/*  7 */   public String toString() { throw new RuntimeException("Stub!"); } 
/*  8 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/*  9 */   public void writeToParcel(Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); } 
/* 10 */   public String getGlEsVersion() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.content.pm.ConfigurationInfo
 * JD-Core Version:    0.6.0
 */