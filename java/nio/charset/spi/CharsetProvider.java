/*   */ package java.nio.charset.spi;
/*   */ 
/*   */ import java.nio.charset.Charset;
/*   */ import java.util.Iterator;
/*   */ 
/*   */ public abstract class CharsetProvider
/*   */ {
/*   */   protected CharsetProvider()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract Iterator<Charset> charsets();
/*   */ 
/*   */   public abstract Charset charsetForName(String paramString);
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.nio.charset.spi.CharsetProvider
 * JD-Core Version:    0.6.0
 */