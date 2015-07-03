/*    */ package android.appwidget;
/*    */ 
/*    */ import android.content.Context;
/*    */ 
/*    */ public class AppWidgetHost
/*    */ {
/*    */   public AppWidgetHost(Context context, int hostId)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public void startListening() { throw new RuntimeException("Stub!"); } 
/*  6 */   public void stopListening() { throw new RuntimeException("Stub!"); } 
/*  7 */   public int allocateAppWidgetId() { throw new RuntimeException("Stub!"); } 
/*  8 */   public void deleteAppWidgetId(int appWidgetId) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void deleteHost() { throw new RuntimeException("Stub!"); } 
/* 10 */   public static void deleteAllHosts() { throw new RuntimeException("Stub!"); } 
/* 11 */   public final AppWidgetHostView createView(Context context, int appWidgetId, AppWidgetProviderInfo appWidget) { throw new RuntimeException("Stub!"); } 
/* 12 */   protected AppWidgetHostView onCreateView(Context context, int appWidgetId, AppWidgetProviderInfo appWidget) { throw new RuntimeException("Stub!"); } 
/* 13 */   protected void onProviderChanged(int appWidgetId, AppWidgetProviderInfo appWidget) { throw new RuntimeException("Stub!"); } 
/* 14 */   protected void clearViews() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.appwidget.AppWidgetHost
 * JD-Core Version:    0.6.0
 */