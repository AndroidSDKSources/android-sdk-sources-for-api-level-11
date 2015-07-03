/*    */ package android.content.pm;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public class PermissionInfo extends PackageItemInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public static final int PROTECTION_NORMAL = 0;
/*    */   public static final int PROTECTION_DANGEROUS = 1;
/*    */   public static final int PROTECTION_SIGNATURE = 2;
/*    */   public static final int PROTECTION_SIGNATURE_OR_SYSTEM = 3;
/*    */   public String group;
/*    */   public int descriptionRes;
/*    */   public CharSequence nonLocalizedDescription;
/*    */   public int protectionLevel;
/* 21 */   public static final Parcelable.Creator<PermissionInfo> CREATOR = null;
/*    */ 
/*    */   public PermissionInfo()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public PermissionInfo(PermissionInfo orig) { throw new RuntimeException("Stub!"); } 
/*  8 */   public CharSequence loadDescription(PackageManager pm) { throw new RuntimeException("Stub!"); } 
/*  9 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 10 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 11 */   public void writeToParcel(Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.content.pm.PermissionInfo
 * JD-Core Version:    0.6.0
 */