/*    */ package android.webkit;
/*    */ 
/*    */ import android.graphics.Bitmap;
/*    */ import android.os.Message;
/*    */ import android.view.View;
/*    */ 
/*    */ public class WebChromeClient
/*    */ {
/*    */   public WebChromeClient()
/*    */   {
/*  8 */     throw new RuntimeException("Stub!"); } 
/*  9 */   public void onProgressChanged(WebView view, int newProgress) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void onReceivedTitle(WebView view, String title) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void onReceivedIcon(WebView view, Bitmap icon) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void onReceivedTouchIconUrl(WebView view, String url, boolean precomposed) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void onShowCustomView(View view, CustomViewCallback callback) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void onHideCustomView() { throw new RuntimeException("Stub!"); } 
/* 15 */   public boolean onCreateWindow(WebView view, boolean dialog, boolean userGesture, Message resultMsg) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void onRequestFocus(WebView view) { throw new RuntimeException("Stub!"); } 
/* 17 */   public void onCloseWindow(WebView window) { throw new RuntimeException("Stub!"); } 
/* 18 */   public boolean onJsAlert(WebView view, String url, String message, JsResult result) { throw new RuntimeException("Stub!"); } 
/* 19 */   public boolean onJsConfirm(WebView view, String url, String message, JsResult result) { throw new RuntimeException("Stub!"); } 
/* 20 */   public boolean onJsPrompt(WebView view, String url, String message, String defaultValue, JsPromptResult result) { throw new RuntimeException("Stub!"); } 
/* 21 */   public boolean onJsBeforeUnload(WebView view, String url, String message, JsResult result) { throw new RuntimeException("Stub!"); } 
/* 22 */   public void onExceededDatabaseQuota(String url, String databaseIdentifier, long currentQuota, long estimatedSize, long totalUsedQuota, WebStorage.QuotaUpdater quotaUpdater) { throw new RuntimeException("Stub!"); } 
/* 23 */   public void onReachedMaxAppCacheSize(long spaceNeeded, long totalUsedQuota, WebStorage.QuotaUpdater quotaUpdater) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void onGeolocationPermissionsShowPrompt(String origin, GeolocationPermissions.Callback callback) { throw new RuntimeException("Stub!"); } 
/* 25 */   public void onGeolocationPermissionsHidePrompt() { throw new RuntimeException("Stub!"); } 
/* 26 */   public boolean onJsTimeout() { throw new RuntimeException("Stub!"); } 
/* 27 */   public void onConsoleMessage(String message, int lineNumber, String sourceID) { throw new RuntimeException("Stub!"); } 
/* 28 */   public boolean onConsoleMessage(ConsoleMessage consoleMessage) { throw new RuntimeException("Stub!"); } 
/* 29 */   public Bitmap getDefaultVideoPoster() { throw new RuntimeException("Stub!"); } 
/* 30 */   public View getVideoLoadingProgressView() { throw new RuntimeException("Stub!"); } 
/* 31 */   public void getVisitedHistory(ValueCallback<String[]> callback) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static abstract interface CustomViewCallback
/*    */   {
/*    */     public abstract void onCustomViewHidden();
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.webkit.WebChromeClient
 * JD-Core Version:    0.6.0
 */