package javax.security.auth.callback;

import java.io.IOException;

public abstract interface CallbackHandler
{
  public abstract void handle(Callback[] paramArrayOfCallback)
    throws IOException, UnsupportedCallbackException;
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.security.auth.callback.CallbackHandler
 * JD-Core Version:    0.6.0
 */