/*   */ package android.net;
/*   */ 
/*   */ import android.os.Parcel;
/*   */ import android.os.Parcelable;
/*   */ 
/*   */ public class DhcpInfo
/*   */   implements Parcelable
/*   */ {
/*   */   public int ipAddress;
/*   */   public int gateway;
/*   */   public int netmask;
/*   */   public int dns1;
/*   */   public int dns2;
/*   */   public int serverAddress;
/*   */   public int leaseDuration;
/*   */ 
/*   */   public DhcpInfo()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 7 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 8 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.net.DhcpInfo
 * JD-Core Version:    0.6.0
 */