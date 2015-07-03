/*    */ package java.security;
/*    */ 
/*    */ import java.io.ObjectStreamException;
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public class KeyRep
/*    */   implements Serializable
/*    */ {
/*    */   public KeyRep(Type type, String algorithm, String format, byte[] encoded)
/*    */   {
/* 11 */     throw new RuntimeException("Stub!"); } 
/* 12 */   protected Object readResolve() throws ObjectStreamException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static enum Type
/*    */   {
/*  7 */     PRIVATE, 
/*  8 */     PUBLIC, 
/*  9 */     SECRET;
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.KeyRep
 * JD-Core Version:    0.6.0
 */