/*     */ package android.webkit;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.content.res.Configuration;
/*     */ import android.graphics.Bitmap;
/*     */ import android.graphics.Canvas;
/*     */ import android.graphics.Picture;
/*     */ import android.graphics.Rect;
/*     */ import android.net.http.SslCertificate;
/*     */ import android.os.Bundle;
/*     */ import android.os.Message;
/*     */ import android.util.AttributeSet;
/*     */ import android.view.KeyEvent;
/*     */ import android.view.MotionEvent;
/*     */ import android.view.View;
/*     */ import android.view.ViewGroup.LayoutParams;
/*     */ import android.view.ViewGroup.OnHierarchyChangeListener;
/*     */ import android.view.ViewTreeObserver.OnGlobalFocusChangeListener;
/*     */ import android.view.inputmethod.EditorInfo;
/*     */ import android.view.inputmethod.InputConnection;
/*     */ import android.widget.AbsoluteLayout;
/*     */ import java.io.File;
/*     */ import java.util.Map;
/*     */ 
/*     */ public class WebView extends AbsoluteLayout
/*     */   implements ViewTreeObserver.OnGlobalFocusChangeListener, ViewGroup.OnHierarchyChangeListener
/*     */ {
/*     */   public static final String SCHEME_TEL = "tel:";
/*     */   public static final String SCHEME_MAILTO = "mailto:";
/*     */   public static final String SCHEME_GEO = "geo:0,0?q=";
/*     */ 
/*     */   public WebView(Context context)
/*     */   {
/*  32 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  33 */   public WebView(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  34 */   public WebView(Context context, AttributeSet attrs, int defStyle) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  35 */   public WebView(Context context, AttributeSet attrs, int defStyle, boolean privateBrowsing) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  36 */   public void setOverScrollMode(int mode) { throw new RuntimeException("Stub!"); } 
/*  37 */   public void setScrollBarStyle(int style) { throw new RuntimeException("Stub!"); } 
/*  38 */   public void setHorizontalScrollbarOverlay(boolean overlay) { throw new RuntimeException("Stub!"); } 
/*  39 */   public void setVerticalScrollbarOverlay(boolean overlay) { throw new RuntimeException("Stub!"); } 
/*  40 */   public boolean overlayHorizontalScrollbar() { throw new RuntimeException("Stub!"); } 
/*  41 */   public boolean overlayVerticalScrollbar() { throw new RuntimeException("Stub!"); } 
/*  42 */   public int getVisibleTitleHeight() { throw new RuntimeException("Stub!"); } 
/*  43 */   public SslCertificate getCertificate() { throw new RuntimeException("Stub!"); } 
/*  44 */   public void setCertificate(SslCertificate certificate) { throw new RuntimeException("Stub!"); } 
/*  45 */   public void savePassword(String host, String username, String password) { throw new RuntimeException("Stub!"); } 
/*  46 */   public void setHttpAuthUsernamePassword(String host, String realm, String username, String password) { throw new RuntimeException("Stub!"); } 
/*  47 */   public String[] getHttpAuthUsernamePassword(String host, String realm) { throw new RuntimeException("Stub!"); } 
/*  48 */   public void destroy() { throw new RuntimeException("Stub!"); } 
/*  49 */   public static void enablePlatformNotifications() { throw new RuntimeException("Stub!"); } 
/*  50 */   public static void disablePlatformNotifications() { throw new RuntimeException("Stub!"); } 
/*  51 */   public void setNetworkAvailable(boolean networkUp) { throw new RuntimeException("Stub!"); } 
/*  52 */   public WebBackForwardList saveState(Bundle outState) { throw new RuntimeException("Stub!"); } 
/*  53 */   public boolean savePicture(Bundle b, File dest) { throw new RuntimeException("Stub!"); } 
/*  54 */   public boolean restorePicture(Bundle b, File src) { throw new RuntimeException("Stub!"); } 
/*  55 */   public WebBackForwardList restoreState(Bundle inState) { throw new RuntimeException("Stub!"); } 
/*  56 */   public void loadUrl(String url, Map<String, String> extraHeaders) { throw new RuntimeException("Stub!"); } 
/*  57 */   public void loadUrl(String url) { throw new RuntimeException("Stub!"); } 
/*  58 */   public void postUrl(String url, byte[] postData) { throw new RuntimeException("Stub!"); } 
/*  59 */   public void loadData(String data, String mimeType, String encoding) { throw new RuntimeException("Stub!"); } 
/*  60 */   public void loadDataWithBaseURL(String baseUrl, String data, String mimeType, String encoding, String historyUrl) { throw new RuntimeException("Stub!"); } 
/*  61 */   public void saveWebArchive(String filename) { throw new RuntimeException("Stub!"); } 
/*  62 */   public void saveWebArchive(String basename, boolean autoname, ValueCallback<String> callback) { throw new RuntimeException("Stub!"); } 
/*  63 */   public void stopLoading() { throw new RuntimeException("Stub!"); } 
/*  64 */   public void reload() { throw new RuntimeException("Stub!"); } 
/*  65 */   public boolean canGoBack() { throw new RuntimeException("Stub!"); } 
/*  66 */   public void goBack() { throw new RuntimeException("Stub!"); } 
/*  67 */   public boolean canGoForward() { throw new RuntimeException("Stub!"); } 
/*  68 */   public void goForward() { throw new RuntimeException("Stub!"); } 
/*  69 */   public boolean canGoBackOrForward(int steps) { throw new RuntimeException("Stub!"); } 
/*  70 */   public void goBackOrForward(int steps) { throw new RuntimeException("Stub!"); } 
/*  71 */   public boolean isPrivateBrowsingEnabled() { throw new RuntimeException("Stub!"); } 
/*  72 */   public boolean pageUp(boolean top) { throw new RuntimeException("Stub!"); } 
/*  73 */   public boolean pageDown(boolean bottom) { throw new RuntimeException("Stub!"); } 
/*  74 */   public void clearView() { throw new RuntimeException("Stub!"); } 
/*  75 */   public Picture capturePicture() { throw new RuntimeException("Stub!"); } 
/*  76 */   public float getScale() { throw new RuntimeException("Stub!"); } 
/*  77 */   public void setInitialScale(int scaleInPercent) { throw new RuntimeException("Stub!"); } 
/*  78 */   public void invokeZoomPicker() { throw new RuntimeException("Stub!"); } 
/*  79 */   public HitTestResult getHitTestResult() { throw new RuntimeException("Stub!"); } 
/*  80 */   public void requestFocusNodeHref(Message hrefMsg) { throw new RuntimeException("Stub!"); } 
/*  81 */   public void requestImageRef(Message msg) { throw new RuntimeException("Stub!"); } 
/*  82 */   protected int computeHorizontalScrollRange() { throw new RuntimeException("Stub!"); } 
/*  83 */   protected int computeHorizontalScrollOffset() { throw new RuntimeException("Stub!"); } 
/*  84 */   protected int computeVerticalScrollRange() { throw new RuntimeException("Stub!"); } 
/*  85 */   protected int computeVerticalScrollOffset() { throw new RuntimeException("Stub!"); } 
/*  86 */   protected int computeVerticalScrollExtent() { throw new RuntimeException("Stub!"); } 
/*  87 */   protected void onOverScrolled(int scrollX, int scrollY, boolean clampedX, boolean clampedY) { throw new RuntimeException("Stub!"); } 
/*  88 */   public String getUrl() { throw new RuntimeException("Stub!"); } 
/*  89 */   public String getOriginalUrl() { throw new RuntimeException("Stub!"); } 
/*  90 */   public String getTitle() { throw new RuntimeException("Stub!"); } 
/*  91 */   public Bitmap getFavicon() { throw new RuntimeException("Stub!"); } 
/*  92 */   public int getProgress() { throw new RuntimeException("Stub!"); } 
/*  93 */   public int getContentHeight() { throw new RuntimeException("Stub!"); } 
/*  94 */   public void pauseTimers() { throw new RuntimeException("Stub!"); } 
/*  95 */   public void resumeTimers() { throw new RuntimeException("Stub!"); } 
/*  96 */   public void onPause() { throw new RuntimeException("Stub!"); } 
/*  97 */   public void onResume() { throw new RuntimeException("Stub!"); } 
/*  98 */   public void freeMemory() { throw new RuntimeException("Stub!"); } 
/*  99 */   public void clearCache(boolean includeDiskFiles) { throw new RuntimeException("Stub!"); } 
/* 100 */   public void clearFormData() { throw new RuntimeException("Stub!"); } 
/* 101 */   public void clearHistory() { throw new RuntimeException("Stub!"); } 
/* 102 */   public void clearSslPreferences() { throw new RuntimeException("Stub!"); } 
/* 103 */   public WebBackForwardList copyBackForwardList() { throw new RuntimeException("Stub!"); } 
/* 104 */   public void findNext(boolean forward) { throw new RuntimeException("Stub!"); } 
/* 105 */   public int findAll(String find) { throw new RuntimeException("Stub!"); } 
/* 106 */   public boolean showFindDialog(String text, boolean showIme) { throw new RuntimeException("Stub!"); } 
/* 107 */   public static String findAddress(String addr) { throw new RuntimeException("Stub!"); } 
/* 108 */   public void clearMatches() { throw new RuntimeException("Stub!"); } 
/* 109 */   public void documentHasImages(Message response) { throw new RuntimeException("Stub!"); } 
/* 110 */   public void computeScroll() { throw new RuntimeException("Stub!"); } 
/* 111 */   public void setWebViewClient(WebViewClient client) { throw new RuntimeException("Stub!"); } 
/* 112 */   public void setDownloadListener(DownloadListener listener) { throw new RuntimeException("Stub!"); } 
/* 113 */   public void setWebChromeClient(WebChromeClient client) { throw new RuntimeException("Stub!"); } 
/* 114 */   public void setPictureListener(PictureListener listener) { throw new RuntimeException("Stub!"); } 
/* 115 */   public void addJavascriptInterface(Object obj, String interfaceName) { throw new RuntimeException("Stub!"); } 
/* 116 */   public void removeJavascriptInterface(String interfaceName) { throw new RuntimeException("Stub!"); } 
/* 117 */   public WebSettings getSettings() { throw new RuntimeException("Stub!"); } 
/* 118 */   public static synchronized PluginList getPluginList() { throw new RuntimeException("Stub!"); } 
/* 119 */   public void refreshPlugins(boolean reloadOpenPages) { throw new RuntimeException("Stub!"); } 
/* 120 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); } 
/* 121 */   protected boolean drawChild(Canvas canvas, View child, long drawingTime) { throw new RuntimeException("Stub!"); } 
/* 122 */   protected void onDraw(Canvas canvas) { throw new RuntimeException("Stub!"); } 
/* 123 */   public void setLayoutParams(ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); } 
/* 124 */   public boolean performLongClick() { throw new RuntimeException("Stub!"); } 
/* 125 */   protected void onConfigurationChanged(Configuration newConfig) { throw new RuntimeException("Stub!"); } 
/* 126 */   public InputConnection onCreateInputConnection(EditorInfo outAttrs) { throw new RuntimeException("Stub!"); } 
/* 127 */   public boolean onKeyMultiple(int keyCode, int repeatCount, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 128 */   public boolean onKeyDown(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 129 */   public boolean onKeyUp(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 130 */   public void emulateShiftHeld() { throw new RuntimeException("Stub!"); } 
/* 131 */   protected void onAttachedToWindow() { throw new RuntimeException("Stub!"); } 
/* 132 */   protected void onDetachedFromWindow() { throw new RuntimeException("Stub!"); } 
/* 133 */   protected void onVisibilityChanged(View changedView, int visibility) { throw new RuntimeException("Stub!"); } 
/* 134 */   public void onChildViewAdded(View parent, View child) { throw new RuntimeException("Stub!"); } 
/* 135 */   public void onChildViewRemoved(View p, View child) { throw new RuntimeException("Stub!"); } 
/* 136 */   public void onGlobalFocusChanged(View oldFocus, View newFocus) { throw new RuntimeException("Stub!"); } 
/* 137 */   public void onWindowFocusChanged(boolean hasWindowFocus) { throw new RuntimeException("Stub!"); } 
/* 138 */   protected void onFocusChanged(boolean focused, int direction, Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); } 
/* 139 */   protected void onSizeChanged(int w, int h, int ow, int oh) { throw new RuntimeException("Stub!"); } 
/* 140 */   protected void onScrollChanged(int l, int t, int oldl, int oldt) { throw new RuntimeException("Stub!"); } 
/* 141 */   public boolean dispatchKeyEvent(KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 142 */   public boolean onTouchEvent(MotionEvent ev) { throw new RuntimeException("Stub!"); } 
/* 143 */   public void setMapTrackballToArrowKeys(boolean setMap) { throw new RuntimeException("Stub!"); } 
/* 144 */   public boolean onTrackballEvent(MotionEvent ev) { throw new RuntimeException("Stub!"); } 
/* 145 */   public void flingScroll(int vx, int vy) { throw new RuntimeException("Stub!"); } 
/* 146 */   public View getZoomControls() { throw new RuntimeException("Stub!"); } 
/* 147 */   public boolean canZoomIn() { throw new RuntimeException("Stub!"); } 
/* 148 */   public boolean canZoomOut() { throw new RuntimeException("Stub!"); } 
/* 149 */   public boolean zoomIn() { throw new RuntimeException("Stub!"); } 
/* 150 */   public boolean zoomOut() { throw new RuntimeException("Stub!"); } 
/* 151 */   public boolean requestFocus(int direction, Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); } 
/* 152 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); } 
/* 153 */   public boolean requestChildRectangleOnScreen(View child, Rect rect, boolean immediate) { throw new RuntimeException("Stub!"); } 
/* 154 */   public void setBackgroundColor(int color) { throw new RuntimeException("Stub!"); } 
/* 155 */   public void debugDump() { throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   public class HitTestResult
/*     */   {
/*     */     public static final int UNKNOWN_TYPE = 0;
/*     */     public static final int ANCHOR_TYPE = 1;
/*     */     public static final int PHONE_TYPE = 2;
/*     */     public static final int GEO_TYPE = 3;
/*     */     public static final int EMAIL_TYPE = 4;
/*     */     public static final int IMAGE_TYPE = 5;
/*     */     public static final int IMAGE_ANCHOR_TYPE = 6;
/*     */     public static final int SRC_ANCHOR_TYPE = 7;
/*     */     public static final int SRC_IMAGE_ANCHOR_TYPE = 8;
/*     */     public static final int EDIT_TEXT_TYPE = 9;
/*     */ 
/*     */     HitTestResult()
/*     */     {
/*  18 */       throw new RuntimeException("Stub!"); } 
/*  19 */     public int getType() { throw new RuntimeException("Stub!"); } 
/*  20 */     public String getExtra() { throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   public static abstract interface PictureListener
/*     */   {
/*     */     public abstract void onNewPicture(WebView paramWebView, Picture paramPicture);
/*     */   }
/*     */ 
/*     */   public class WebViewTransport
/*     */   {
/*     */     public WebViewTransport()
/*     */     {
/*   8 */       throw new RuntimeException("Stub!"); } 
/*   9 */     public synchronized void setWebView(WebView webview) { throw new RuntimeException("Stub!"); } 
/*  10 */     public synchronized WebView getWebView() { throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.webkit.WebView
 * JD-Core Version:    0.6.0
 */