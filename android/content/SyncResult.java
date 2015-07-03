/*    */ package android.content;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public final class SyncResult
/*    */   implements Parcelable
/*    */ {
/*    */   public final boolean syncAlreadyInProgress;
/*    */   public boolean tooManyDeletions;
/*    */   public boolean tooManyRetries;
/*    */   public boolean databaseError;
/*    */   public boolean fullSyncRequested;
/*    */   public boolean partialSyncUnavailable;
/*    */   public boolean moreRecordsToGet;
/*    */   public long delayUntil;
/*    */   public final SyncStats stats;
/* 26 */   public static final SyncResult ALREADY_IN_PROGRESS = null; public static final Parcelable.Creator<SyncResult> CREATOR = null;
/*    */ 
/*    */   public SyncResult()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public boolean hasHardError() { throw new RuntimeException("Stub!"); } 
/*  7 */   public boolean hasSoftError() { throw new RuntimeException("Stub!"); } 
/*  8 */   public boolean hasError() { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean madeSomeProgress() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void clear() { throw new RuntimeException("Stub!"); } 
/* 11 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 12 */   public void writeToParcel(Parcel parcel, int flags) { throw new RuntimeException("Stub!"); } 
/* 13 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 14 */   public String toDebugString() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.content.SyncResult
 * JD-Core Version:    0.6.0
 */