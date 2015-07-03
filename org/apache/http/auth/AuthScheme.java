package org.apache.http.auth;

import org.apache.http.Header;
import org.apache.http.HttpRequest;

public abstract interface AuthScheme
{
  public abstract void processChallenge(Header paramHeader)
    throws MalformedChallengeException;

  public abstract String getSchemeName();

  public abstract String getParameter(String paramString);

  public abstract String getRealm();

  public abstract boolean isConnectionBased();

  public abstract boolean isComplete();

  public abstract Header authenticate(Credentials paramCredentials, HttpRequest paramHttpRequest)
    throws AuthenticationException;
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.auth.AuthScheme
 * JD-Core Version:    0.6.0
 */