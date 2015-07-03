package org.apache.http.message;

import org.apache.http.Header;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.StatusLine;
import org.apache.http.util.CharArrayBuffer;

public abstract interface LineFormatter
{
  public abstract CharArrayBuffer appendProtocolVersion(CharArrayBuffer paramCharArrayBuffer, ProtocolVersion paramProtocolVersion);

  public abstract CharArrayBuffer formatRequestLine(CharArrayBuffer paramCharArrayBuffer, RequestLine paramRequestLine);

  public abstract CharArrayBuffer formatStatusLine(CharArrayBuffer paramCharArrayBuffer, StatusLine paramStatusLine);

  public abstract CharArrayBuffer formatHeader(CharArrayBuffer paramCharArrayBuffer, Header paramHeader);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.message.LineFormatter
 * JD-Core Version:    0.6.0
 */