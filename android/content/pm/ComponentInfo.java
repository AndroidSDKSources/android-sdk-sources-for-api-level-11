/*    */ package android.content.pm;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.util.Printer;
/*    */ 
/*    */ public class ComponentInfo extends PackageItemInfo
/*    */ {
/*    */   public ApplicationInfo applicationInfo;
/*    */   public String processName;
/*    */   public int descriptionRes;
/*    */   public boolean enabled;
/*    */   public boolean exported;
/*    */ 
/*    */   public ComponentInfo()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public ComponentInfo(ComponentInfo orig) { throw new RuntimeException("Stub!"); } 
/*  7 */   protected ComponentInfo(Parcel source) { throw new RuntimeException("Stub!"); } 
/*  8 */   public CharSequence loadLabel(PackageManager pm) { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean isEnabled() { throw new RuntimeException("Stub!"); } 
/* 10 */   public final int getIconResource() { throw new RuntimeException("Stub!"); } 
/* 11 */   protected void dumpFront(Printer pw, String prefix) { throw new RuntimeException("Stub!"); } 
/* 12 */   protected void dumpBack(Printer pw, String prefix) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void writeToParcel(Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.content.pm.ComponentInfo
 * JD-Core Version:    0.6.0
 */