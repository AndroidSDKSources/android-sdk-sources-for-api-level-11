package android.webkit;

import java.util.Map;

@Deprecated
public abstract interface UrlInterceptHandler
{
  public abstract CacheManager.CacheResult service(String paramString, Map<String, String> paramMap);

  public abstract PluginData getPluginData(String paramString, Map<String, String> paramMap);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.webkit.UrlInterceptHandler
 * JD-Core Version:    0.6.0
 */