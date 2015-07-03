package android.bluetooth;

import java.util.List;

public abstract interface BluetoothProfile
{
  public static final String EXTRA_STATE = "android.bluetooth.profile.extra.STATE";
  public static final String EXTRA_PREVIOUS_STATE = "android.bluetooth.profile.extra.PREVIOUS_STATE";
  public static final int STATE_DISCONNECTED = 0;
  public static final int STATE_CONNECTING = 1;
  public static final int STATE_CONNECTED = 2;
  public static final int STATE_DISCONNECTING = 3;
  public static final int HEADSET = 1;
  public static final int A2DP = 2;

  public abstract List<BluetoothDevice> getConnectedDevices();

  public abstract List<BluetoothDevice> getDevicesMatchingConnectionStates(int[] paramArrayOfInt);

  public abstract int getConnectionState(BluetoothDevice paramBluetoothDevice);

  public static abstract interface ServiceListener
  {
    public abstract void onServiceConnected(int paramInt, BluetoothProfile paramBluetoothProfile);

    public abstract void onServiceDisconnected(int paramInt);
  }
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.bluetooth.BluetoothProfile
 * JD-Core Version:    0.6.0
 */