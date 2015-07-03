/*    */ package android.database;
/*    */ 
/*    */ import android.database.sqlite.SQLiteClosable;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public class CursorWindow extends SQLiteClosable
/*    */   implements Parcelable
/*    */ {
/* 40 */   public static final Parcelable.Creator<CursorWindow> CREATOR = null;
/*    */ 
/*    */   public CursorWindow(boolean localWindow)
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public int getStartPosition() { throw new RuntimeException("Stub!"); } 
/*  8 */   public void setStartPosition(int pos) { throw new RuntimeException("Stub!"); } 
/*  9 */   public int getNumRows() { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean setNumColumns(int columnNum) { throw new RuntimeException("Stub!"); } 
/* 11 */   public boolean allocRow() { throw new RuntimeException("Stub!"); } 
/* 12 */   public void freeLastRow() { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean putBlob(byte[] value, int row, int col) { throw new RuntimeException("Stub!"); } 
/* 14 */   public boolean putString(String value, int row, int col) { throw new RuntimeException("Stub!"); } 
/* 15 */   public boolean putLong(long value, int row, int col) { throw new RuntimeException("Stub!"); } 
/* 16 */   public boolean putDouble(double value, int row, int col) { throw new RuntimeException("Stub!"); } 
/* 17 */   public boolean putNull(int row, int col) { throw new RuntimeException("Stub!"); } 
/* 18 */   public boolean isNull(int row, int col) { throw new RuntimeException("Stub!"); } 
/* 19 */   public byte[] getBlob(int row, int col) { throw new RuntimeException("Stub!"); } 
/* 20 */   public int getType(int row, int col) { throw new RuntimeException("Stub!"); } 
/* 21 */   public boolean isBlob(int row, int col) { throw new RuntimeException("Stub!"); } 
/* 22 */   public boolean isLong(int row, int col) { throw new RuntimeException("Stub!"); } 
/* 23 */   public boolean isFloat(int row, int col) { throw new RuntimeException("Stub!"); } 
/* 24 */   public boolean isString(int row, int col) { throw new RuntimeException("Stub!"); } 
/* 25 */   public String getString(int row, int col) { throw new RuntimeException("Stub!"); } 
/* 26 */   public void copyStringToBuffer(int row, int col, CharArrayBuffer buffer) { throw new RuntimeException("Stub!"); } 
/* 27 */   public long getLong(int row, int col) { throw new RuntimeException("Stub!"); } 
/* 28 */   public double getDouble(int row, int col) { throw new RuntimeException("Stub!"); } 
/* 29 */   public short getShort(int row, int col) { throw new RuntimeException("Stub!"); } 
/* 30 */   public int getInt(int row, int col) { throw new RuntimeException("Stub!"); } 
/* 31 */   public float getFloat(int row, int col) { throw new RuntimeException("Stub!"); } 
/* 32 */   public void clear() { throw new RuntimeException("Stub!"); } 
/* 33 */   public void close() { throw new RuntimeException("Stub!"); } 
/* 34 */   protected void finalize() { throw new RuntimeException("Stub!"); } 
/* 35 */   public static CursorWindow newFromParcel(Parcel p) { throw new RuntimeException("Stub!"); } 
/* 36 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 37 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); } 
/* 38 */   protected void onAllReferencesReleased() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.database.CursorWindow
 * JD-Core Version:    0.6.0
 */