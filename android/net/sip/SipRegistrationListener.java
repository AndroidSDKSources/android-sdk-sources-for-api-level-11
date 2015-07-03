package android.net.sip;

public abstract interface SipRegistrationListener
{
  public abstract void onRegistering(String paramString);

  public abstract void onRegistrationDone(String paramString, long paramLong);

  public abstract void onRegistrationFailed(String paramString1, int paramInt, String paramString2);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.net.sip.SipRegistrationListener
 * JD-Core Version:    0.6.0
 */