/*    */ package android.net;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ 
/*    */ public class NetworkInfo
/*    */   implements Parcelable
/*    */ {
/*    */   NetworkInfo()
/*    */   {
/* 27 */     throw new RuntimeException("Stub!"); } 
/* 28 */   public int getType() { throw new RuntimeException("Stub!"); } 
/* 29 */   public int getSubtype() { throw new RuntimeException("Stub!"); } 
/* 30 */   public String getTypeName() { throw new RuntimeException("Stub!"); } 
/* 31 */   public String getSubtypeName() { throw new RuntimeException("Stub!"); } 
/* 32 */   public boolean isConnectedOrConnecting() { throw new RuntimeException("Stub!"); } 
/* 33 */   public boolean isConnected() { throw new RuntimeException("Stub!"); } 
/* 34 */   public boolean isAvailable() { throw new RuntimeException("Stub!"); } 
/* 35 */   public boolean isFailover() { throw new RuntimeException("Stub!"); } 
/* 36 */   public boolean isRoaming() { throw new RuntimeException("Stub!"); } 
/* 37 */   public State getState() { throw new RuntimeException("Stub!"); } 
/* 38 */   public DetailedState getDetailedState() { throw new RuntimeException("Stub!"); } 
/* 39 */   public String getReason() { throw new RuntimeException("Stub!"); } 
/* 40 */   public String getExtraInfo() { throw new RuntimeException("Stub!"); } 
/* 41 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 42 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 43 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static enum DetailedState
/*    */   {
/* 16 */     AUTHENTICATING, 
/* 17 */     CONNECTED, 
/* 18 */     CONNECTING, 
/* 19 */     DISCONNECTED, 
/* 20 */     DISCONNECTING, 
/* 21 */     FAILED, 
/* 22 */     IDLE, 
/* 23 */     OBTAINING_IPADDR, 
/* 24 */     SCANNING, 
/* 25 */     SUSPENDED;
/*    */   }
/*    */ 
/*    */   public static enum State
/*    */   {
/*  7 */     CONNECTED, 
/*  8 */     CONNECTING, 
/*  9 */     DISCONNECTED, 
/* 10 */     DISCONNECTING, 
/* 11 */     SUSPENDED, 
/* 12 */     UNKNOWN;
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.net.NetworkInfo
 * JD-Core Version:    0.6.0
 */