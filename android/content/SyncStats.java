/*    */ package android.content;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public class SyncStats
/*    */   implements Parcelable
/*    */ {
/*    */   public long numAuthExceptions;
/*    */   public long numIoExceptions;
/*    */   public long numParseExceptions;
/*    */   public long numConflictDetectedExceptions;
/*    */   public long numInserts;
/*    */   public long numUpdates;
/*    */   public long numDeletes;
/*    */   public long numEntries;
/*    */   public long numSkippedEntries;
/* 21 */   public static final Parcelable.Creator<SyncStats> CREATOR = null;
/*    */ 
/*    */   public SyncStats()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public SyncStats(Parcel in) { throw new RuntimeException("Stub!"); } 
/*  7 */   public String toString() { throw new RuntimeException("Stub!"); } 
/*  8 */   public void clear() { throw new RuntimeException("Stub!"); } 
/*  9 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.content.SyncStats
 * JD-Core Version:    0.6.0
 */