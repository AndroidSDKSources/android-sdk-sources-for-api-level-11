/*   */ package android.nfc.tech;
/*   */ 
/*   */ import android.nfc.Tag;
/*   */ import java.io.IOException;
/*   */ 
/*   */ abstract class BasicTagTechnology
/*   */   implements TagTechnology
/*   */ {
/*   */   BasicTagTechnology()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public Tag getTag() { throw new RuntimeException("Stub!"); } 
/* 7 */   public boolean isConnected() { throw new RuntimeException("Stub!"); } 
/* 8 */   public void connect() throws IOException { throw new RuntimeException("Stub!"); } 
/* 9 */   public void close() throws IOException { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.nfc.tech.BasicTagTechnology
 * JD-Core Version:    0.6.0
 */