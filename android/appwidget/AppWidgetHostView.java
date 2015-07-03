/*    */ package android.appwidget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.graphics.Canvas;
/*    */ import android.os.Parcelable;
/*    */ import android.util.AttributeSet;
/*    */ import android.util.SparseArray;
/*    */ import android.view.View;
/*    */ import android.widget.FrameLayout;
/*    */ import android.widget.FrameLayout.LayoutParams;
/*    */ import android.widget.RemoteViews;
/*    */ 
/*    */ public class AppWidgetHostView extends FrameLayout
/*    */ {
/*    */   public AppWidgetHostView(Context context)
/*    */   {
/*  5 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  6 */   public AppWidgetHostView(Context context, int animationIn, int animationOut) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  7 */   public void setAppWidget(int appWidgetId, AppWidgetProviderInfo info) { throw new RuntimeException("Stub!"); } 
/*  8 */   public int getAppWidgetId() { throw new RuntimeException("Stub!"); } 
/*  9 */   public AppWidgetProviderInfo getAppWidgetInfo() { throw new RuntimeException("Stub!"); } 
/* 10 */   protected void dispatchSaveInstanceState(SparseArray<Parcelable> container) { throw new RuntimeException("Stub!"); } 
/* 11 */   protected void dispatchRestoreInstanceState(SparseArray<Parcelable> container) { throw new RuntimeException("Stub!"); } 
/* 12 */   public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attrs) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void updateAppWidget(RemoteViews remoteViews) { throw new RuntimeException("Stub!"); } 
/* 14 */   protected boolean drawChild(Canvas canvas, View child, long drawingTime) { throw new RuntimeException("Stub!"); } 
/* 15 */   protected void prepareView(View view) { throw new RuntimeException("Stub!"); } 
/* 16 */   protected View getDefaultView() { throw new RuntimeException("Stub!"); } 
/* 17 */   protected View getErrorView() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.appwidget.AppWidgetHostView
 * JD-Core Version:    0.6.0
 */