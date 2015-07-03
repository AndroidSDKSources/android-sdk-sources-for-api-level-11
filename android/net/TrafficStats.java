/*   */ package android.net;
/*   */ 
/*   */ public class TrafficStats
/*   */ {
/*   */   public static final int UNSUPPORTED = -1;
/*   */ 
/*   */   public TrafficStats()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public static native long getMobileTxPackets();
/*   */ 
/*   */   public static native long getMobileRxPackets();
/*   */ 
/*   */   public static native long getMobileTxBytes();
/*   */ 
/*   */   public static native long getMobileRxBytes();
/*   */ 
/*   */   public static native long getTotalTxPackets();
/*   */ 
/*   */   public static native long getTotalRxPackets();
/*   */ 
/*   */   public static native long getTotalTxBytes();
/*   */ 
/*   */   public static native long getTotalRxBytes();
/*   */ 
/*   */   public static native long getUidTxBytes(int paramInt);
/*   */ 
/*   */   public static native long getUidRxBytes(int paramInt);
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.net.TrafficStats
 * JD-Core Version:    0.6.0
 */