/*    */ package android.telephony;
/*    */ 
/*    */ public class PhoneStateListener
/*    */ {
/*    */   public static final int LISTEN_NONE = 0;
/*    */   public static final int LISTEN_SERVICE_STATE = 1;
/*    */   public static final int LISTEN_SIGNAL_STRENGTH = 2;
/*    */   public static final int LISTEN_MESSAGE_WAITING_INDICATOR = 4;
/*    */   public static final int LISTEN_CALL_FORWARDING_INDICATOR = 8;
/*    */   public static final int LISTEN_CELL_LOCATION = 16;
/*    */   public static final int LISTEN_CALL_STATE = 32;
/*    */   public static final int LISTEN_DATA_CONNECTION_STATE = 64;
/*    */   public static final int LISTEN_DATA_ACTIVITY = 128;
/*    */   public static final int LISTEN_SIGNAL_STRENGTHS = 256;
/*    */ 
/*    */   public PhoneStateListener()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public void onServiceStateChanged(ServiceState serviceState) { throw new RuntimeException("Stub!"); } 
/*  6 */   public void onSignalStrengthChanged(int asu) { throw new RuntimeException("Stub!"); } 
/*  7 */   public void onMessageWaitingIndicatorChanged(boolean mwi) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void onCallForwardingIndicatorChanged(boolean cfi) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void onCellLocationChanged(CellLocation location) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void onCallStateChanged(int state, String incomingNumber) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void onDataConnectionStateChanged(int state) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void onDataConnectionStateChanged(int state, int networkType) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void onDataActivity(int direction) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void onSignalStrengthsChanged(SignalStrength signalStrength) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.telephony.PhoneStateListener
 * JD-Core Version:    0.6.0
 */