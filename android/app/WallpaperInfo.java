/*    */ package android.app;
/*    */ 
/*    */ import android.content.ComponentName;
/*    */ import android.content.Context;
/*    */ import android.content.pm.PackageManager;
/*    */ import android.content.pm.ResolveInfo;
/*    */ import android.content.pm.ServiceInfo;
/*    */ import android.content.res.Resources.NotFoundException;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import android.util.Printer;
/*    */ import java.io.IOException;
/*    */ import org.xmlpull.v1.XmlPullParserException;
/*    */ 
/*    */ public final class WallpaperInfo
/*    */   implements Parcelable
/*    */ {
/* 21 */   public static final Parcelable.Creator<WallpaperInfo> CREATOR = null;
/*    */ 
/*    */   public WallpaperInfo(Context context, ResolveInfo service)
/*    */     throws XmlPullParserException, IOException
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public String getPackageName() { throw new RuntimeException("Stub!"); } 
/*  7 */   public String getServiceName() { throw new RuntimeException("Stub!"); } 
/*  8 */   public ServiceInfo getServiceInfo() { throw new RuntimeException("Stub!"); } 
/*  9 */   public ComponentName getComponent() { throw new RuntimeException("Stub!"); } 
/* 10 */   public CharSequence loadLabel(PackageManager pm) { throw new RuntimeException("Stub!"); } 
/* 11 */   public Drawable loadIcon(PackageManager pm) { throw new RuntimeException("Stub!"); } 
/* 12 */   public Drawable loadThumbnail(PackageManager pm) { throw new RuntimeException("Stub!"); } 
/* 13 */   public CharSequence loadAuthor(PackageManager pm) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 14 */   public CharSequence loadDescription(PackageManager pm) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 15 */   public String getSettingsActivity() { throw new RuntimeException("Stub!"); } 
/* 16 */   public void dump(Printer pw, String prefix) { throw new RuntimeException("Stub!"); } 
/* 17 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 18 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); } 
/* 19 */   public int describeContents() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.app.WallpaperInfo
 * JD-Core Version:    0.6.0
 */