/*    */ package android.accounts;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public class Account
/*    */   implements Parcelable
/*    */ {
/*    */   public final String name;
/*    */   public final String type;
/* 15 */   public static final Parcelable.Creator<Account> CREATOR = null;
/*    */ 
/*    */   public Account(String name, String type)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public Account(Parcel in) { throw new RuntimeException("Stub!"); } 
/*  7 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); } 
/*  8 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/*  9 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); } 
/* 11 */   public String toString() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.accounts.Account
 * JD-Core Version:    0.6.0
 */