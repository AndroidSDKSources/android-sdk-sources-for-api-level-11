/*   */ package android.net.wifi;
/*   */ 
/*   */ import android.os.Parcel;
/*   */ import android.os.Parcelable;
/*   */ 
/*   */ public class ScanResult
/*   */   implements Parcelable
/*   */ {
/*   */   public String SSID;
/*   */   public String BSSID;
/*   */   public String capabilities;
/*   */   public int level;
/*   */   public int frequency;
/*   */ 
/*   */   ScanResult()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 7 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 8 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.net.wifi.ScanResult
 * JD-Core Version:    0.6.0
 */