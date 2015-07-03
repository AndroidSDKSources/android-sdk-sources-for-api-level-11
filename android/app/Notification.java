/*    */ package android.app;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.graphics.Bitmap;
/*    */ import android.net.Uri;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import android.widget.RemoteViews;
/*    */ 
/*    */ public class Notification
/*    */   implements Parcelable
/*    */ {
/*    */   public static final int DEFAULT_ALL = -1;
/*    */   public static final int DEFAULT_SOUND = 1;
/*    */   public static final int DEFAULT_VIBRATE = 2;
/*    */   public static final int DEFAULT_LIGHTS = 4;
/*    */   public long when;
/*    */   public int icon;
/*    */   public int iconLevel;
/*    */   public int number;
/*    */   public PendingIntent contentIntent;
/*    */   public PendingIntent deleteIntent;
/*    */   public PendingIntent fullScreenIntent;
/*    */   public CharSequence tickerText;
/*    */   public RemoteViews tickerView;
/*    */   public RemoteViews contentView;
/*    */   public Bitmap largeIcon;
/*    */   public Uri sound;
/*    */   public static final int STREAM_DEFAULT = -1;
/*    */   public int audioStreamType;
/* 58 */   public long[] vibrate = null;
/*    */   public int ledARGB;
/*    */   public int ledOnMS;
/*    */   public int ledOffMS;
/*    */   public int defaults;
/*    */   public static final int FLAG_SHOW_LIGHTS = 1;
/*    */   public static final int FLAG_ONGOING_EVENT = 2;
/*    */   public static final int FLAG_INSISTENT = 4;
/*    */   public static final int FLAG_ONLY_ALERT_ONCE = 8;
/*    */   public static final int FLAG_AUTO_CANCEL = 16;
/*    */   public static final int FLAG_NO_CLEAR = 32;
/*    */   public static final int FLAG_FOREGROUND_SERVICE = 64;
/*    */   public static final int FLAG_HIGH_PRIORITY = 128;
/*    */   public int flags;
/* 73 */   public static final Parcelable.Creator<Notification> CREATOR = null;
/*    */ 
/*    */   public Notification()
/*    */   {
/* 32 */     throw new RuntimeException("Stub!"); } 
/* 33 */   public Notification(int icon, CharSequence tickerText, long when) { throw new RuntimeException("Stub!"); } 
/* 34 */   public Notification(Parcel parcel) { throw new RuntimeException("Stub!"); } 
/* 35 */   public Notification clone() { throw new RuntimeException("Stub!"); } 
/* 36 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 37 */   public void writeToParcel(Parcel parcel, int flags) { throw new RuntimeException("Stub!"); } 
/* 38 */   public void setLatestEventInfo(Context context, CharSequence contentTitle, CharSequence contentText, PendingIntent contentIntent) { throw new RuntimeException("Stub!"); } 
/* 39 */   public String toString() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class Builder
/*    */   {
/*    */     public Builder(Context context)
/*    */     {
/*  7 */       throw new RuntimeException("Stub!"); } 
/*  8 */     public Builder setWhen(long when) { throw new RuntimeException("Stub!"); } 
/*  9 */     public Builder setSmallIcon(int icon) { throw new RuntimeException("Stub!"); } 
/* 10 */     public Builder setSmallIcon(int icon, int level) { throw new RuntimeException("Stub!"); } 
/* 11 */     public Builder setContentTitle(CharSequence title) { throw new RuntimeException("Stub!"); } 
/* 12 */     public Builder setContentText(CharSequence text) { throw new RuntimeException("Stub!"); } 
/* 13 */     public Builder setNumber(int number) { throw new RuntimeException("Stub!"); } 
/* 14 */     public Builder setContentInfo(CharSequence info) { throw new RuntimeException("Stub!"); } 
/* 15 */     public Builder setContent(RemoteViews views) { throw new RuntimeException("Stub!"); } 
/* 16 */     public Builder setContentIntent(PendingIntent intent) { throw new RuntimeException("Stub!"); } 
/* 17 */     public Builder setDeleteIntent(PendingIntent intent) { throw new RuntimeException("Stub!"); } 
/* 18 */     public Builder setFullScreenIntent(PendingIntent intent, boolean highPriority) { throw new RuntimeException("Stub!"); } 
/* 19 */     public Builder setTicker(CharSequence tickerText) { throw new RuntimeException("Stub!"); } 
/* 20 */     public Builder setTicker(CharSequence tickerText, RemoteViews views) { throw new RuntimeException("Stub!"); } 
/* 21 */     public Builder setLargeIcon(Bitmap icon) { throw new RuntimeException("Stub!"); } 
/* 22 */     public Builder setSound(Uri sound) { throw new RuntimeException("Stub!"); } 
/* 23 */     public Builder setSound(Uri sound, int streamType) { throw new RuntimeException("Stub!"); } 
/* 24 */     public Builder setVibrate(long[] pattern) { throw new RuntimeException("Stub!"); } 
/* 25 */     public Builder setLights(int argb, int onMs, int offMs) { throw new RuntimeException("Stub!"); } 
/* 26 */     public Builder setOngoing(boolean ongoing) { throw new RuntimeException("Stub!"); } 
/* 27 */     public Builder setOnlyAlertOnce(boolean onlyAlertOnce) { throw new RuntimeException("Stub!"); } 
/* 28 */     public Builder setAutoCancel(boolean autoCancel) { throw new RuntimeException("Stub!"); } 
/* 29 */     public Builder setDefaults(int defaults) { throw new RuntimeException("Stub!"); } 
/* 30 */     public Notification getNotification() { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.app.Notification
 * JD-Core Version:    0.6.0
 */