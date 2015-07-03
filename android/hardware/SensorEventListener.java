package android.hardware;

public abstract interface SensorEventListener
{
  public abstract void onSensorChanged(SensorEvent paramSensorEvent);

  public abstract void onAccuracyChanged(Sensor paramSensor, int paramInt);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.hardware.SensorEventListener
 * JD-Core Version:    0.6.0
 */