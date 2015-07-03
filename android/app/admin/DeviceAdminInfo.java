/*    */ package android.app.admin;
/*    */ 
/*    */ import android.content.ComponentName;
/*    */ import android.content.Context;
/*    */ import android.content.pm.ActivityInfo;
/*    */ import android.content.pm.PackageManager;
/*    */ import android.content.pm.ResolveInfo;
/*    */ import android.content.res.Resources.NotFoundException;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import android.util.Printer;
/*    */ import java.io.IOException;
/*    */ import org.xmlpull.v1.XmlPullParserException;
/*    */ 
/*    */ public final class DeviceAdminInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public static final int USES_POLICY_LIMIT_PASSWORD = 0;
/*    */   public static final int USES_POLICY_WATCH_LOGIN = 1;
/*    */   public static final int USES_POLICY_RESET_PASSWORD = 2;
/*    */   public static final int USES_POLICY_FORCE_LOCK = 3;
/*    */   public static final int USES_POLICY_WIPE_DATA = 4;
/*    */   public static final int USES_POLICY_EXPIRE_PASSWORD = 6;
/*    */   public static final int USES_ENCRYPTED_STORAGE = 7;
/* 28 */   public static final Parcelable.Creator<DeviceAdminInfo> CREATOR = null;
/*    */ 
/*    */   public DeviceAdminInfo(Context context, ResolveInfo receiver)
/*    */     throws XmlPullParserException, IOException
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public String getPackageName() { throw new RuntimeException("Stub!"); } 
/*  7 */   public String getReceiverName() { throw new RuntimeException("Stub!"); } 
/*  8 */   public ActivityInfo getActivityInfo() { throw new RuntimeException("Stub!"); } 
/*  9 */   public ComponentName getComponent() { throw new RuntimeException("Stub!"); } 
/* 10 */   public CharSequence loadLabel(PackageManager pm) { throw new RuntimeException("Stub!"); } 
/* 11 */   public CharSequence loadDescription(PackageManager pm) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 12 */   public Drawable loadIcon(PackageManager pm) { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean isVisible() { throw new RuntimeException("Stub!"); } 
/* 14 */   public boolean usesPolicy(int policyIdent) { throw new RuntimeException("Stub!"); } 
/* 15 */   public String getTagForPolicy(int policyIdent) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void dump(Printer pw, String prefix) { throw new RuntimeException("Stub!"); } 
/* 17 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 18 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); } 
/* 19 */   public int describeContents() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.app.admin.DeviceAdminInfo
 * JD-Core Version:    0.6.0
 */