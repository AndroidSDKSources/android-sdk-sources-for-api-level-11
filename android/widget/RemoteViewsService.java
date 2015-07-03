/*    */ package android.widget;
/*    */ 
/*    */ import android.app.Service;
/*    */ import android.content.Intent;
/*    */ import android.os.IBinder;
/*    */ 
/*    */ public abstract class RemoteViewsService extends Service
/*    */ {
/*    */   public RemoteViewsService()
/*    */   {
/* 17 */     throw new RuntimeException("Stub!"); } 
/* 18 */   public IBinder onBind(Intent intent) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public abstract RemoteViewsFactory onGetViewFactory(Intent paramIntent);
/*    */ 
/*    */   public static abstract interface RemoteViewsFactory
/*    */   {
/*    */     public abstract void onCreate();
/*    */ 
/*    */     public abstract void onDataSetChanged();
/*    */ 
/*    */     public abstract void onDestroy();
/*    */ 
/*    */     public abstract int getCount();
/*    */ 
/*    */     public abstract RemoteViews getViewAt(int paramInt);
/*    */ 
/*    */     public abstract RemoteViews getLoadingView();
/*    */ 
/*    */     public abstract int getViewTypeCount();
/*    */ 
/*    */     public abstract long getItemId(int paramInt);
/*    */ 
/*    */     public abstract boolean hasStableIds();
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.RemoteViewsService
 * JD-Core Version:    0.6.0
 */