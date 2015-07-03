/*    */ package android.database;
/*    */ 
/*    */ public abstract class AbstractWindowedCursor extends AbstractCursor
/*    */ {
/*    */   protected CursorWindow mWindow;
/*    */ 
/*    */   public AbstractWindowedCursor()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public byte[] getBlob(int columnIndex) { throw new RuntimeException("Stub!"); } 
/*  7 */   public String getString(int columnIndex) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void copyStringToBuffer(int columnIndex, CharArrayBuffer buffer) { throw new RuntimeException("Stub!"); } 
/*  9 */   public short getShort(int columnIndex) { throw new RuntimeException("Stub!"); } 
/* 10 */   public int getInt(int columnIndex) { throw new RuntimeException("Stub!"); } 
/* 11 */   public long getLong(int columnIndex) { throw new RuntimeException("Stub!"); } 
/* 12 */   public float getFloat(int columnIndex) { throw new RuntimeException("Stub!"); } 
/* 13 */   public double getDouble(int columnIndex) { throw new RuntimeException("Stub!"); } 
/* 14 */   public boolean isNull(int columnIndex) { throw new RuntimeException("Stub!"); } 
/* 15 */   public boolean isBlob(int columnIndex) { throw new RuntimeException("Stub!"); } 
/* 16 */   public boolean isString(int columnIndex) { throw new RuntimeException("Stub!"); } 
/* 17 */   public boolean isLong(int columnIndex) { throw new RuntimeException("Stub!"); } 
/* 18 */   public boolean isFloat(int columnIndex) { throw new RuntimeException("Stub!"); } 
/* 19 */   public int getType(int columnIndex) { throw new RuntimeException("Stub!"); } 
/* 20 */   protected void checkPosition() { throw new RuntimeException("Stub!"); } 
/* 21 */   public CursorWindow getWindow() { throw new RuntimeException("Stub!"); } 
/* 22 */   public void setWindow(CursorWindow window) { throw new RuntimeException("Stub!"); } 
/* 23 */   public boolean hasWindow() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.database.AbstractWindowedCursor
 * JD-Core Version:    0.6.0
 */