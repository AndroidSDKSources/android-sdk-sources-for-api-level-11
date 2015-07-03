/*    */ package android.content;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public class SyncAdapterType
/*    */   implements Parcelable
/*    */ {
/*    */   public final String authority;
/*    */   public final String accountType;
/*    */   public final boolean isKey;
/* 21 */   public static final Parcelable.Creator<SyncAdapterType> CREATOR = null;
/*    */ 
/*    */   public SyncAdapterType(String authority, String accountType, boolean userVisible, boolean supportsUploading)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public SyncAdapterType(Parcel source) { throw new RuntimeException("Stub!"); } 
/*  7 */   public boolean supportsUploading() { throw new RuntimeException("Stub!"); } 
/*  8 */   public boolean isUserVisible() { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean allowParallelSyncs() { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean isAlwaysSyncable() { throw new RuntimeException("Stub!"); } 
/* 11 */   public static SyncAdapterType newKey(String authority, String accountType) { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); } 
/* 13 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 14 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 15 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 16 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.content.SyncAdapterType
 * JD-Core Version:    0.6.0
 */