/*   */ package android.bluetooth;
/*   */ 
/*   */ import java.util.List;
/*   */ 
/*   */ public final class BluetoothA2dp
/*   */   implements BluetoothProfile
/*   */ {
/*   */   public static final String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED";
/*   */   public static final String ACTION_PLAYING_STATE_CHANGED = "android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED";
/*   */   public static final int STATE_PLAYING = 10;
/*   */   public static final int STATE_NOT_PLAYING = 11;
/*   */ 
/*   */   BluetoothA2dp()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public List<BluetoothDevice> getConnectedDevices() { throw new RuntimeException("Stub!"); } 
/* 7 */   public List<BluetoothDevice> getDevicesMatchingConnectionStates(int[] states) { throw new RuntimeException("Stub!"); } 
/* 8 */   public int getConnectionState(BluetoothDevice device) { throw new RuntimeException("Stub!"); } 
/* 9 */   public boolean isA2dpPlaying(BluetoothDevice device) { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.bluetooth.BluetoothA2dp
 * JD-Core Version:    0.6.0
 */