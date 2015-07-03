/*    */ package android.net.wifi;
/*    */ 
/*    */ import android.net.NetworkInfo.DetailedState;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ 
/*    */ public class WifiInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public static final String LINK_SPEED_UNITS = "Mbps";
/*    */ 
/*    */   WifiInfo()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public String getSSID() { throw new RuntimeException("Stub!"); } 
/*  7 */   public String getBSSID() { throw new RuntimeException("Stub!"); } 
/*  8 */   public int getRssi() { throw new RuntimeException("Stub!"); } 
/*  9 */   public int getLinkSpeed() { throw new RuntimeException("Stub!"); } 
/* 10 */   public String getMacAddress() { throw new RuntimeException("Stub!"); } 
/* 11 */   public int getNetworkId() { throw new RuntimeException("Stub!"); } 
/* 12 */   public SupplicantState getSupplicantState() { throw new RuntimeException("Stub!"); } 
/* 13 */   public int getIpAddress() { throw new RuntimeException("Stub!"); } 
/* 14 */   public boolean getHiddenSSID() { throw new RuntimeException("Stub!"); } 
/* 15 */   public static NetworkInfo.DetailedState getDetailedStateOf(SupplicantState suppState) { throw new RuntimeException("Stub!"); } 
/* 16 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 17 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 18 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.net.wifi.WifiInfo
 * JD-Core Version:    0.6.0
 */