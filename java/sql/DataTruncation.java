/*    */ package java.sql;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public class DataTruncation extends SQLWarning
/*    */   implements Serializable
/*    */ {
/*    */   public DataTruncation(int index, boolean parameter, boolean read, int dataSize, int transferSize)
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public DataTruncation(int index, boolean parameter, boolean read, int dataSize, int transferSize, Throwable cause) { throw new RuntimeException("Stub!"); } 
/*  8 */   public int getDataSize() { throw new RuntimeException("Stub!"); } 
/*  9 */   public int getIndex() { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean getParameter() { throw new RuntimeException("Stub!"); } 
/* 11 */   public boolean getRead() { throw new RuntimeException("Stub!"); } 
/* 12 */   public int getTransferSize() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.sql.DataTruncation
 * JD-Core Version:    0.6.0
 */