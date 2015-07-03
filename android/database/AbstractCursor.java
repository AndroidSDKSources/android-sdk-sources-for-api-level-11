/*    */ package android.database;
/*    */ 
/*    */ import android.content.ContentResolver;
/*    */ import android.net.Uri;
/*    */ import android.os.Bundle;
/*    */ import android.os.Handler;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ 
/*    */ public abstract class AbstractCursor
/*    */   implements CrossProcessCursor
/*    */ {
/*    */   protected HashMap<Long, Map<String, Object>> mUpdatedRows;
/*    */   protected int mRowIdColumnIndex;
/*    */   protected int mPos;
/*    */   protected Long mCurrentRowID;
/*    */   protected ContentResolver mContentResolver;
/*    */   protected boolean mClosed;
/*    */ 
/*    */   public AbstractCursor()
/*    */   {
/* 12 */     throw new RuntimeException("Stub!"); } 
/*    */   public abstract int getCount();
/*    */ 
/*    */   public abstract String[] getColumnNames();
/*    */ 
/*    */   public abstract String getString(int paramInt);
/*    */ 
/*    */   public abstract short getShort(int paramInt);
/*    */ 
/*    */   public abstract int getInt(int paramInt);
/*    */ 
/*    */   public abstract long getLong(int paramInt);
/*    */ 
/*    */   public abstract float getFloat(int paramInt);
/*    */ 
/*    */   public abstract double getDouble(int paramInt);
/*    */ 
/*    */   public abstract boolean isNull(int paramInt);
/*    */ 
/* 22 */   public int getType(int column) { throw new RuntimeException("Stub!"); } 
/* 23 */   public byte[] getBlob(int column) { throw new RuntimeException("Stub!"); } 
/* 24 */   public CursorWindow getWindow() { throw new RuntimeException("Stub!"); } 
/* 25 */   public int getColumnCount() { throw new RuntimeException("Stub!"); } 
/* 26 */   public void deactivate() { throw new RuntimeException("Stub!"); } 
/* 27 */   public boolean requery() { throw new RuntimeException("Stub!"); } 
/* 28 */   public boolean isClosed() { throw new RuntimeException("Stub!"); } 
/* 29 */   public void close() { throw new RuntimeException("Stub!"); } 
/* 30 */   public boolean onMove(int oldPosition, int newPosition) { throw new RuntimeException("Stub!"); } 
/* 31 */   public void copyStringToBuffer(int columnIndex, CharArrayBuffer buffer) { throw new RuntimeException("Stub!"); } 
/* 32 */   public final int getPosition() { throw new RuntimeException("Stub!"); } 
/* 33 */   public final boolean moveToPosition(int position) { throw new RuntimeException("Stub!"); } 
/* 34 */   public void fillWindow(int position, CursorWindow window) { throw new RuntimeException("Stub!"); } 
/* 35 */   public final boolean move(int offset) { throw new RuntimeException("Stub!"); } 
/* 36 */   public final boolean moveToFirst() { throw new RuntimeException("Stub!"); } 
/* 37 */   public final boolean moveToLast() { throw new RuntimeException("Stub!"); } 
/* 38 */   public final boolean moveToNext() { throw new RuntimeException("Stub!"); } 
/* 39 */   public final boolean moveToPrevious() { throw new RuntimeException("Stub!"); } 
/* 40 */   public final boolean isFirst() { throw new RuntimeException("Stub!"); } 
/* 41 */   public final boolean isLast() { throw new RuntimeException("Stub!"); } 
/* 42 */   public final boolean isBeforeFirst() { throw new RuntimeException("Stub!"); } 
/* 43 */   public final boolean isAfterLast() { throw new RuntimeException("Stub!"); } 
/* 44 */   public int getColumnIndex(String columnName) { throw new RuntimeException("Stub!"); } 
/* 45 */   public int getColumnIndexOrThrow(String columnName) { throw new RuntimeException("Stub!"); } 
/* 46 */   public String getColumnName(int columnIndex) { throw new RuntimeException("Stub!"); } 
/* 47 */   public void registerContentObserver(ContentObserver observer) { throw new RuntimeException("Stub!"); } 
/* 48 */   public void unregisterContentObserver(ContentObserver observer) { throw new RuntimeException("Stub!"); } 
/* 49 */   public void registerDataSetObserver(DataSetObserver observer) { throw new RuntimeException("Stub!"); } 
/* 50 */   public void unregisterDataSetObserver(DataSetObserver observer) { throw new RuntimeException("Stub!"); } 
/* 51 */   protected void onChange(boolean selfChange) { throw new RuntimeException("Stub!"); } 
/* 52 */   public void setNotificationUri(ContentResolver cr, Uri notifyUri) { throw new RuntimeException("Stub!"); } 
/* 53 */   public Uri getNotificationUri() { throw new RuntimeException("Stub!"); } 
/* 54 */   public boolean getWantsAllOnMoveCalls() { throw new RuntimeException("Stub!"); } 
/* 55 */   public Bundle getExtras() { throw new RuntimeException("Stub!"); } 
/* 56 */   public Bundle respond(Bundle extras) { throw new RuntimeException("Stub!"); } 
/* 57 */   protected boolean isFieldUpdated(int columnIndex) { throw new RuntimeException("Stub!"); } 
/* 58 */   protected Object getUpdatedField(int columnIndex) { throw new RuntimeException("Stub!"); } 
/* 59 */   protected void checkPosition() { throw new RuntimeException("Stub!"); } 
/* 60 */   protected void finalize() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   protected static class SelfContentObserver extends ContentObserver
/*    */   {
/*    */     public SelfContentObserver(AbstractCursor cursor)
/*    */     {
/*  8 */       super(); throw new RuntimeException("Stub!"); } 
/*  9 */     public boolean deliverSelfNotifications() { throw new RuntimeException("Stub!"); } 
/* 10 */     public void onChange(boolean selfChange) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.database.AbstractCursor
 * JD-Core Version:    0.6.0
 */