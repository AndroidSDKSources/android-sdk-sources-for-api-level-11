package org.apache.http;

import java.io.IOException;

public abstract interface HttpServerConnection extends HttpConnection
{
  public abstract HttpRequest receiveRequestHeader()
    throws HttpException, IOException;

  public abstract void receiveRequestEntity(HttpEntityEnclosingRequest paramHttpEntityEnclosingRequest)
    throws HttpException, IOException;

  public abstract void sendResponseHeader(HttpResponse paramHttpResponse)
    throws HttpException, IOException;

  public abstract void sendResponseEntity(HttpResponse paramHttpResponse)
    throws HttpException, IOException;

  public abstract void flush()
    throws IOException;
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.HttpServerConnection
 * JD-Core Version:    0.6.0
 */