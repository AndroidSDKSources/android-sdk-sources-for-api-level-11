/*    */ package android.view.inputmethod;
/*    */ 
/*    */ import android.content.ComponentName;
/*    */ import android.content.Context;
/*    */ import android.content.pm.PackageManager;
/*    */ import android.content.pm.ResolveInfo;
/*    */ import android.content.pm.ServiceInfo;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import android.util.Printer;
/*    */ import java.io.IOException;
/*    */ import org.xmlpull.v1.XmlPullParserException;
/*    */ 
/*    */ public final class InputMethodInfo
/*    */   implements Parcelable
/*    */ {
/* 24 */   public static final Parcelable.Creator<InputMethodInfo> CREATOR = null;
/*    */ 
/*    */   public InputMethodInfo(Context context, ResolveInfo service)
/*    */     throws XmlPullParserException, IOException
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public InputMethodInfo(String packageName, String className, CharSequence label, String settingsActivity) { throw new RuntimeException("Stub!"); } 
/*  7 */   public String getId() { throw new RuntimeException("Stub!"); } 
/*  8 */   public String getPackageName() { throw new RuntimeException("Stub!"); } 
/*  9 */   public String getServiceName() { throw new RuntimeException("Stub!"); } 
/* 10 */   public ServiceInfo getServiceInfo() { throw new RuntimeException("Stub!"); } 
/* 11 */   public ComponentName getComponent() { throw new RuntimeException("Stub!"); } 
/* 12 */   public CharSequence loadLabel(PackageManager pm) { throw new RuntimeException("Stub!"); } 
/* 13 */   public Drawable loadIcon(PackageManager pm) { throw new RuntimeException("Stub!"); } 
/* 14 */   public String getSettingsActivity() { throw new RuntimeException("Stub!"); } 
/* 15 */   public int getSubtypeCount() { throw new RuntimeException("Stub!"); } 
/* 16 */   public InputMethodSubtype getSubtypeAt(int index) { throw new RuntimeException("Stub!"); } 
/* 17 */   public int getIsDefaultResourceId() { throw new RuntimeException("Stub!"); } 
/* 18 */   public void dump(Printer pw, String prefix) { throw new RuntimeException("Stub!"); } 
/* 19 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 20 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); } 
/* 21 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); } 
/* 22 */   public int describeContents() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.view.inputmethod.InputMethodInfo
 * JD-Core Version:    0.6.0
 */