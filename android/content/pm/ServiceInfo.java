/*    */ package android.content.pm;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import android.util.Printer;
/*    */ 
/*    */ public class ServiceInfo extends ComponentInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public String permission;
/* 14 */   public static final Parcelable.Creator<ServiceInfo> CREATOR = null;
/*    */ 
/*    */   public ServiceInfo()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public ServiceInfo(ServiceInfo orig) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void dump(Printer pw, String prefix) { throw new RuntimeException("Stub!"); } 
/*  9 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 10 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 11 */   public void writeToParcel(Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.content.pm.ServiceInfo
 * JD-Core Version:    0.6.0
 */