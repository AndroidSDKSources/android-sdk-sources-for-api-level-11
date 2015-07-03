/*    */ package android.bluetooth;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import java.io.IOException;
/*    */ import java.util.UUID;
/*    */ 
/*    */ public final class BluetoothDevice
/*    */   implements Parcelable
/*    */ {
/*    */   public static final int ERROR = -2147483648;
/*    */   public static final String ACTION_FOUND = "android.bluetooth.device.action.FOUND";
/*    */   public static final String ACTION_CLASS_CHANGED = "android.bluetooth.device.action.CLASS_CHANGED";
/*    */   public static final String ACTION_ACL_CONNECTED = "android.bluetooth.device.action.ACL_CONNECTED";
/*    */   public static final String ACTION_ACL_DISCONNECT_REQUESTED = "android.bluetooth.device.action.ACL_DISCONNECT_REQUESTED";
/*    */   public static final String ACTION_ACL_DISCONNECTED = "android.bluetooth.device.action.ACL_DISCONNECTED";
/*    */   public static final String ACTION_NAME_CHANGED = "android.bluetooth.device.action.NAME_CHANGED";
/*    */   public static final String ACTION_BOND_STATE_CHANGED = "android.bluetooth.device.action.BOND_STATE_CHANGED";
/*    */   public static final String EXTRA_DEVICE = "android.bluetooth.device.extra.DEVICE";
/*    */   public static final String EXTRA_NAME = "android.bluetooth.device.extra.NAME";
/*    */   public static final String EXTRA_RSSI = "android.bluetooth.device.extra.RSSI";
/*    */   public static final String EXTRA_CLASS = "android.bluetooth.device.extra.CLASS";
/*    */   public static final String EXTRA_BOND_STATE = "android.bluetooth.device.extra.BOND_STATE";
/*    */   public static final String EXTRA_PREVIOUS_BOND_STATE = "android.bluetooth.device.extra.PREVIOUS_BOND_STATE";
/*    */   public static final int BOND_NONE = 10;
/*    */   public static final int BOND_BONDING = 11;
/*    */   public static final int BOND_BONDED = 12;
/* 35 */   public static final Parcelable.Creator<BluetoothDevice> CREATOR = null;
/*    */ 
/*    */   BluetoothDevice()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); } 
/*  7 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/*  8 */   public String toString() { throw new RuntimeException("Stub!"); } 
/*  9 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); } 
/* 11 */   public String getAddress() { throw new RuntimeException("Stub!"); } 
/* 12 */   public String getName() { throw new RuntimeException("Stub!"); } 
/* 13 */   public int getBondState() { throw new RuntimeException("Stub!"); } 
/* 14 */   public BluetoothClass getBluetoothClass() { throw new RuntimeException("Stub!"); } 
/* 15 */   public BluetoothSocket createRfcommSocketToServiceRecord(UUID uuid) throws IOException { throw new RuntimeException("Stub!"); } 
/* 16 */   public BluetoothSocket createInsecureRfcommSocketToServiceRecord(UUID uuid) throws IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.bluetooth.BluetoothDevice
 * JD-Core Version:    0.6.0
 */