package android.hardware;

@Deprecated
public abstract interface SensorListener
{
  public abstract void onSensorChanged(int paramInt, float[] paramArrayOfFloat);

  public abstract void onAccuracyChanged(int paramInt1, int paramInt2);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.hardware.SensorListener
 * JD-Core Version:    0.6.0
 */