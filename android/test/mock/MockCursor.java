/*    */ package android.test.mock;
/*    */ 
/*    */ import android.content.ContentResolver;
/*    */ import android.database.CharArrayBuffer;
/*    */ import android.database.ContentObserver;
/*    */ import android.database.Cursor;
/*    */ import android.database.DataSetObserver;
/*    */ import android.net.Uri;
/*    */ import android.os.Bundle;
/*    */ 
/*    */ public class MockCursor
/*    */   implements Cursor
/*    */ {
/*    */   public MockCursor()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public int getColumnCount() { throw new RuntimeException("Stub!"); } 
/*  7 */   public int getColumnIndex(String columnName) { throw new RuntimeException("Stub!"); } 
/*  8 */   public int getColumnIndexOrThrow(String columnName) { throw new RuntimeException("Stub!"); } 
/*  9 */   public String getColumnName(int columnIndex) { throw new RuntimeException("Stub!"); } 
/* 10 */   public String[] getColumnNames() { throw new RuntimeException("Stub!"); } 
/* 11 */   public int getCount() { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean isNull(int columnIndex) { throw new RuntimeException("Stub!"); } 
/* 13 */   public int getInt(int columnIndex) { throw new RuntimeException("Stub!"); } 
/* 14 */   public long getLong(int columnIndex) { throw new RuntimeException("Stub!"); } 
/* 15 */   public short getShort(int columnIndex) { throw new RuntimeException("Stub!"); } 
/* 16 */   public float getFloat(int columnIndex) { throw new RuntimeException("Stub!"); } 
/* 17 */   public double getDouble(int columnIndex) { throw new RuntimeException("Stub!"); } 
/* 18 */   public byte[] getBlob(int columnIndex) { throw new RuntimeException("Stub!"); } 
/* 19 */   public String getString(int columnIndex) { throw new RuntimeException("Stub!"); } 
/* 20 */   public Bundle getExtras() { throw new RuntimeException("Stub!"); } 
/* 21 */   public int getPosition() { throw new RuntimeException("Stub!"); } 
/* 22 */   public boolean isAfterLast() { throw new RuntimeException("Stub!"); } 
/* 23 */   public boolean isBeforeFirst() { throw new RuntimeException("Stub!"); } 
/* 24 */   public boolean isFirst() { throw new RuntimeException("Stub!"); } 
/* 25 */   public boolean isLast() { throw new RuntimeException("Stub!"); } 
/* 26 */   public boolean move(int offset) { throw new RuntimeException("Stub!"); } 
/* 27 */   public boolean moveToFirst() { throw new RuntimeException("Stub!"); } 
/* 28 */   public boolean moveToLast() { throw new RuntimeException("Stub!"); } 
/* 29 */   public boolean moveToNext() { throw new RuntimeException("Stub!"); } 
/* 30 */   public boolean moveToPrevious() { throw new RuntimeException("Stub!"); } 
/* 31 */   public boolean moveToPosition(int position) { throw new RuntimeException("Stub!"); } 
/* 32 */   public void copyStringToBuffer(int columnIndex, CharArrayBuffer buffer) { throw new RuntimeException("Stub!"); } 
/* 33 */   public void deactivate() { throw new RuntimeException("Stub!"); } 
/* 34 */   public void close() { throw new RuntimeException("Stub!"); } 
/* 35 */   public boolean isClosed() { throw new RuntimeException("Stub!"); } 
/* 36 */   public boolean requery() { throw new RuntimeException("Stub!"); } 
/* 37 */   public void registerContentObserver(ContentObserver observer) { throw new RuntimeException("Stub!"); } 
/* 38 */   public void registerDataSetObserver(DataSetObserver observer) { throw new RuntimeException("Stub!"); } 
/* 39 */   public Bundle respond(Bundle extras) { throw new RuntimeException("Stub!"); } 
/* 40 */   public boolean getWantsAllOnMoveCalls() { throw new RuntimeException("Stub!"); } 
/* 41 */   public void setNotificationUri(ContentResolver cr, Uri uri) { throw new RuntimeException("Stub!"); } 
/* 42 */   public void unregisterContentObserver(ContentObserver observer) { throw new RuntimeException("Stub!"); } 
/* 43 */   public void unregisterDataSetObserver(DataSetObserver observer) { throw new RuntimeException("Stub!"); } 
/* 44 */   public int getType(int columnIndex) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.test.mock.MockCursor
 * JD-Core Version:    0.6.0
 */