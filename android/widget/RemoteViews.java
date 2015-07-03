/*    */ package android.widget;
/*    */ 
/*    */ import android.app.PendingIntent;
/*    */ import android.content.Context;
/*    */ import android.content.Intent;
/*    */ import android.graphics.Bitmap;
/*    */ import android.net.Uri;
/*    */ import android.os.Bundle;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import android.view.LayoutInflater.Filter;
/*    */ import android.view.View;
/*    */ import android.view.ViewGroup;
/*    */ import java.lang.annotation.Annotation;
/*    */ import java.lang.annotation.Retention;
/*    */ import java.lang.annotation.RetentionPolicy;
/*    */ import java.lang.annotation.Target;
/*    */ 
/*    */ public class RemoteViews
/*    */   implements Parcelable, LayoutInflater.Filter
/*    */ {
/* 60 */   public static final Parcelable.Creator<RemoteViews> CREATOR = null;
/*    */ 
/*    */   public RemoteViews(String packageName, int layoutId)
/*    */   {
/* 16 */     throw new RuntimeException("Stub!"); } 
/* 17 */   public RemoteViews(Parcel parcel) { throw new RuntimeException("Stub!"); } 
/* 18 */   public RemoteViews clone() { throw new RuntimeException("Stub!"); } 
/* 19 */   public String getPackage() { throw new RuntimeException("Stub!"); } 
/* 20 */   public int getLayoutId() { throw new RuntimeException("Stub!"); } 
/* 21 */   public void addView(int viewId, RemoteViews nestedView) { throw new RuntimeException("Stub!"); } 
/* 22 */   public void removeAllViews(int viewId) { throw new RuntimeException("Stub!"); } 
/* 23 */   public void showNext(int viewId) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void showPrevious(int viewId) { throw new RuntimeException("Stub!"); } 
/* 25 */   public void setViewVisibility(int viewId, int visibility) { throw new RuntimeException("Stub!"); } 
/* 26 */   public void setTextViewText(int viewId, CharSequence text) { throw new RuntimeException("Stub!"); } 
/* 27 */   public void setImageViewResource(int viewId, int srcId) { throw new RuntimeException("Stub!"); } 
/* 28 */   public void setImageViewUri(int viewId, Uri uri) { throw new RuntimeException("Stub!"); } 
/* 29 */   public void setImageViewBitmap(int viewId, Bitmap bitmap) { throw new RuntimeException("Stub!"); } 
/* 30 */   public void setEmptyView(int viewId, int emptyViewId) { throw new RuntimeException("Stub!"); } 
/* 31 */   public void setChronometer(int viewId, long base, String format, boolean started) { throw new RuntimeException("Stub!"); } 
/* 32 */   public void setProgressBar(int viewId, int max, int progress, boolean indeterminate) { throw new RuntimeException("Stub!"); } 
/* 33 */   public void setOnClickPendingIntent(int viewId, PendingIntent pendingIntent) { throw new RuntimeException("Stub!"); } 
/* 34 */   public void setPendingIntentTemplate(int viewId, PendingIntent pendingIntentTemplate) { throw new RuntimeException("Stub!"); } 
/* 35 */   public void setOnClickFillInIntent(int viewId, Intent fillInIntent) { throw new RuntimeException("Stub!"); } 
/* 36 */   public void setTextColor(int viewId, int color) { throw new RuntimeException("Stub!"); } 
/* 37 */   public void setRemoteAdapter(int appWidgetId, int viewId, Intent intent) { throw new RuntimeException("Stub!"); } 
/* 38 */   public void setScrollPosition(int viewId, int position) { throw new RuntimeException("Stub!"); } 
/* 39 */   public void setRelativeScrollPosition(int viewId, int offset) { throw new RuntimeException("Stub!"); } 
/* 40 */   public void setBoolean(int viewId, String methodName, boolean value) { throw new RuntimeException("Stub!"); } 
/* 41 */   public void setByte(int viewId, String methodName, byte value) { throw new RuntimeException("Stub!"); } 
/* 42 */   public void setShort(int viewId, String methodName, short value) { throw new RuntimeException("Stub!"); } 
/* 43 */   public void setInt(int viewId, String methodName, int value) { throw new RuntimeException("Stub!"); } 
/* 44 */   public void setLong(int viewId, String methodName, long value) { throw new RuntimeException("Stub!"); } 
/* 45 */   public void setFloat(int viewId, String methodName, float value) { throw new RuntimeException("Stub!"); } 
/* 46 */   public void setDouble(int viewId, String methodName, double value) { throw new RuntimeException("Stub!"); } 
/* 47 */   public void setChar(int viewId, String methodName, char value) { throw new RuntimeException("Stub!"); } 
/* 48 */   public void setString(int viewId, String methodName, String value) { throw new RuntimeException("Stub!"); } 
/* 49 */   public void setCharSequence(int viewId, String methodName, CharSequence value) { throw new RuntimeException("Stub!"); } 
/* 50 */   public void setUri(int viewId, String methodName, Uri value) { throw new RuntimeException("Stub!"); } 
/* 51 */   public void setBitmap(int viewId, String methodName, Bitmap value) { throw new RuntimeException("Stub!"); } 
/* 52 */   public void setBundle(int viewId, String methodName, Bundle value) { throw new RuntimeException("Stub!"); } 
/* 53 */   public void setIntent(int viewId, String methodName, Intent value) { throw new RuntimeException("Stub!"); } 
/* 54 */   public View apply(Context context, ViewGroup parent) { throw new RuntimeException("Stub!"); } 
/* 55 */   public void reapply(Context context, View v) { throw new RuntimeException("Stub!"); } 
/* 56 */   public boolean onLoadClass(Class clazz) { throw new RuntimeException("Stub!"); } 
/* 57 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 58 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class ActionException extends RuntimeException
/*    */   {
/*    */     public ActionException(Exception ex)
/*    */     {
/* 13 */       throw new RuntimeException("Stub!"); } 
/* 14 */     public ActionException(String message) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   @Target({java.lang.annotation.ElementType.TYPE})
/*    */   @Retention(RetentionPolicy.RUNTIME)
/*    */   public static @interface RemoteView
/*    */   {
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.RemoteViews
 * JD-Core Version:    0.6.0
 */