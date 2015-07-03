/*    */ package android.content;
/*    */ 
/*    */ import android.accounts.Account;
/*    */ import android.os.Bundle;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public class PeriodicSync
/*    */   implements Parcelable
/*    */ {
/*    */   public final Account account;
/*    */   public final String authority;
/*    */   public final Bundle extras;
/*    */   public final long period;
/* 14 */   public static final Parcelable.Creator<PeriodicSync> CREATOR = null;
/*    */ 
/*    */   public PeriodicSync(Account account, String authority, Bundle extras, long period)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/*  7 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); } 
/*  8 */   public boolean equals(Object o) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.content.PeriodicSync
 * JD-Core Version:    0.6.0
 */