package org.apache.http.client;

import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;

public abstract interface CredentialsProvider
{
  public abstract void setCredentials(AuthScope paramAuthScope, Credentials paramCredentials);

  public abstract Credentials getCredentials(AuthScope paramAuthScope);

  public abstract void clear();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.client.CredentialsProvider
 * JD-Core Version:    0.6.0
 */