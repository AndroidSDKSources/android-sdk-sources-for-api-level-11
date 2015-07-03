/*    */ package android.app;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.Intent;
/*    */ import android.content.IntentSender;
/*    */ import android.os.Bundle;
/*    */ import android.os.Handler;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import android.util.AndroidException;
/*    */ 
/*    */ public final class PendingIntent
/*    */   implements Parcelable
/*    */ {
/*    */   public static final int FLAG_ONE_SHOT = 1073741824;
/*    */   public static final int FLAG_NO_CREATE = 536870912;
/*    */   public static final int FLAG_CANCEL_CURRENT = 268435456;
/*    */   public static final int FLAG_UPDATE_CURRENT = 134217728;
/* 41 */   public static final Parcelable.Creator<PendingIntent> CREATOR = null;
/*    */ 
/*    */   PendingIntent()
/*    */   {
/* 16 */     throw new RuntimeException("Stub!"); } 
/* 17 */   public static PendingIntent getActivity(Context context, int requestCode, Intent intent, int flags) { throw new RuntimeException("Stub!"); } 
/* 18 */   public static PendingIntent getActivities(Context context, int requestCode, Intent[] intents, int flags) { throw new RuntimeException("Stub!"); } 
/* 19 */   public static PendingIntent getBroadcast(Context context, int requestCode, Intent intent, int flags) { throw new RuntimeException("Stub!"); } 
/* 20 */   public static PendingIntent getService(Context context, int requestCode, Intent intent, int flags) { throw new RuntimeException("Stub!"); } 
/* 21 */   public IntentSender getIntentSender() { throw new RuntimeException("Stub!"); } 
/* 22 */   public void cancel() { throw new RuntimeException("Stub!"); } 
/* 23 */   public void send() throws PendingIntent.CanceledException { throw new RuntimeException("Stub!"); } 
/* 24 */   public void send(int code) throws PendingIntent.CanceledException { throw new RuntimeException("Stub!"); } 
/* 25 */   public void send(Context context, int code, Intent intent) throws PendingIntent.CanceledException { throw new RuntimeException("Stub!"); } 
/* 26 */   public void send(int code, OnFinished onFinished, Handler handler) throws PendingIntent.CanceledException { throw new RuntimeException("Stub!"); } 
/* 27 */   public void send(Context context, int code, Intent intent, OnFinished onFinished, Handler handler) throws PendingIntent.CanceledException { throw new RuntimeException("Stub!"); } 
/* 28 */   public String getTargetPackage() { throw new RuntimeException("Stub!"); } 
/* 29 */   public boolean equals(Object otherObj) { throw new RuntimeException("Stub!"); } 
/* 30 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 31 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 32 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 33 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); } 
/* 34 */   public static void writePendingIntentOrNullToParcel(PendingIntent sender, Parcel out) { throw new RuntimeException("Stub!"); } 
/* 35 */   public static PendingIntent readPendingIntentOrNullFromParcel(Parcel in) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static abstract interface OnFinished
/*    */   {
/*    */     public abstract void onSendFinished(PendingIntent paramPendingIntent, Intent paramIntent, int paramInt, String paramString, Bundle paramBundle);
/*    */   }
/*    */ 
/*    */   public static class CanceledException extends AndroidException
/*    */   {
/*    */     public CanceledException()
/*    */     {
/*  8 */       throw new RuntimeException("Stub!"); } 
/*  9 */     public CanceledException(String name) { throw new RuntimeException("Stub!"); } 
/* 10 */     public CanceledException(Exception cause) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.app.PendingIntent
 * JD-Core Version:    0.6.0
 */