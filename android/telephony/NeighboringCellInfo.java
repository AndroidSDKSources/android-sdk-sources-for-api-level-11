/*    */ package android.telephony;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public class NeighboringCellInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public static final int UNKNOWN_RSSI = 99;
/*    */   public static final int UNKNOWN_CID = -1;
/* 22 */   public static final Parcelable.Creator<NeighboringCellInfo> CREATOR = null;
/*    */ 
/*    */   public NeighboringCellInfo()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public NeighboringCellInfo(int rssi, int cid) { throw new RuntimeException("Stub!"); } 
/*  7 */   public NeighboringCellInfo(int rssi, String location, int radioType) { throw new RuntimeException("Stub!"); } 
/*  8 */   public NeighboringCellInfo(Parcel in) { throw new RuntimeException("Stub!"); } 
/*  9 */   public int getRssi() { throw new RuntimeException("Stub!"); } 
/* 10 */   public int getLac() { throw new RuntimeException("Stub!"); } 
/* 11 */   public int getCid() { throw new RuntimeException("Stub!"); } 
/* 12 */   public int getPsc() { throw new RuntimeException("Stub!"); } 
/* 13 */   public int getNetworkType() { throw new RuntimeException("Stub!"); } 
/* 14 */   public void setCid(int cid) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void setRssi(int rssi) { throw new RuntimeException("Stub!"); } 
/* 16 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 17 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 18 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.telephony.NeighboringCellInfo
 * JD-Core Version:    0.6.0
 */