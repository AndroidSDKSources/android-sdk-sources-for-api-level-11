/*   */ package java.text;
/*   */ 
/*   */ public abstract class CollationKey
/*   */   implements Comparable<CollationKey>
/*   */ {
/*   */   protected CollationKey(String source)
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/*   */   public abstract int compareTo(CollationKey paramCollationKey);
/*   */ 
/* 7 */   public String getSourceString() { throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract byte[] toByteArray();
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.text.CollationKey
 * JD-Core Version:    0.6.0
 */