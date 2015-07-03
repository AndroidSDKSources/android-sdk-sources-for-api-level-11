/*    */ package android.appwidget;
/*    */ 
/*    */ import android.content.ComponentName;
/*    */ import android.content.Context;
/*    */ import android.widget.RemoteViews;
/*    */ import java.util.List;
/*    */ 
/*    */ public class AppWidgetManager
/*    */ {
/*    */   public static final String ACTION_APPWIDGET_PICK = "android.appwidget.action.APPWIDGET_PICK";
/*    */   public static final String ACTION_APPWIDGET_CONFIGURE = "android.appwidget.action.APPWIDGET_CONFIGURE";
/*    */   public static final String EXTRA_APPWIDGET_ID = "appWidgetId";
/*    */   public static final String EXTRA_APPWIDGET_IDS = "appWidgetIds";
/*    */   public static final String EXTRA_CUSTOM_INFO = "customInfo";
/*    */   public static final String EXTRA_CUSTOM_EXTRAS = "customExtras";
/*    */   public static final int INVALID_APPWIDGET_ID = 0;
/*    */   public static final String ACTION_APPWIDGET_UPDATE = "android.appwidget.action.APPWIDGET_UPDATE";
/*    */   public static final String ACTION_APPWIDGET_DELETED = "android.appwidget.action.APPWIDGET_DELETED";
/*    */   public static final String ACTION_APPWIDGET_DISABLED = "android.appwidget.action.APPWIDGET_DISABLED";
/*    */   public static final String ACTION_APPWIDGET_ENABLED = "android.appwidget.action.APPWIDGET_ENABLED";
/*    */   public static final String META_DATA_APPWIDGET_PROVIDER = "android.appwidget.provider";
/*    */ 
/*    */   AppWidgetManager()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public static AppWidgetManager getInstance(Context context) { throw new RuntimeException("Stub!"); } 
/*  6 */   public void updateAppWidget(int[] appWidgetIds, RemoteViews views) { throw new RuntimeException("Stub!"); } 
/*  7 */   public void updateAppWidget(int appWidgetId, RemoteViews views) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void partiallyUpdateAppWidget(int[] appWidgetIds, RemoteViews views) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void partiallyUpdateAppWidget(int appWidgetId, RemoteViews views) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void updateAppWidget(ComponentName provider, RemoteViews views) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void notifyAppWidgetViewDataChanged(int[] appWidgetIds, int viewId) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void notifyAppWidgetViewDataChanged(int appWidgetId, int viewId) { throw new RuntimeException("Stub!"); } 
/* 13 */   public List<AppWidgetProviderInfo> getInstalledProviders() { throw new RuntimeException("Stub!"); } 
/* 14 */   public AppWidgetProviderInfo getAppWidgetInfo(int appWidgetId) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void bindAppWidgetId(int appWidgetId, ComponentName provider) { throw new RuntimeException("Stub!"); } 
/* 16 */   public int[] getAppWidgetIds(ComponentName provider) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.appwidget.AppWidgetManager
 * JD-Core Version:    0.6.0
 */