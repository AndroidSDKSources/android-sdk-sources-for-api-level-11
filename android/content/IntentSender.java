/*    */ package android.content;
/*    */ 
/*    */ import android.os.Bundle;
/*    */ import android.os.Handler;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import android.util.AndroidException;
/*    */ 
/*    */ public class IntentSender
/*    */   implements Parcelable
/*    */ {
/* 27 */   public static final Parcelable.Creator<IntentSender> CREATOR = null;
/*    */ 
/*    */   IntentSender()
/*    */   {
/* 16 */     throw new RuntimeException("Stub!"); } 
/* 17 */   public void sendIntent(Context context, int code, Intent intent, OnFinished onFinished, Handler handler) throws IntentSender.SendIntentException { throw new RuntimeException("Stub!"); } 
/* 18 */   public String getTargetPackage() { throw new RuntimeException("Stub!"); } 
/* 19 */   public boolean equals(Object otherObj) { throw new RuntimeException("Stub!"); } 
/* 20 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 21 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 22 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 23 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); } 
/* 24 */   public static void writeIntentSenderOrNullToParcel(IntentSender sender, Parcel out) { throw new RuntimeException("Stub!"); } 
/* 25 */   public static IntentSender readIntentSenderOrNullFromParcel(Parcel in) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static abstract interface OnFinished
/*    */   {
/*    */     public abstract void onSendFinished(IntentSender paramIntentSender, Intent paramIntent, int paramInt, String paramString, Bundle paramBundle);
/*    */   }
/*    */ 
/*    */   public static class SendIntentException extends AndroidException
/*    */   {
/*    */     public SendIntentException()
/*    */     {
/*  8 */       throw new RuntimeException("Stub!"); } 
/*  9 */     public SendIntentException(String name) { throw new RuntimeException("Stub!"); } 
/* 10 */     public SendIntentException(Exception cause) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.content.IntentSender
 * JD-Core Version:    0.6.0
 */