/*    */ package javax.crypto;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.Serializable;
/*    */ import java.security.InvalidKeyException;
/*    */ import java.security.Key;
/*    */ import java.security.NoSuchAlgorithmException;
/*    */ import java.security.NoSuchProviderException;
/*    */ 
/*    */ public class SealedObject
/*    */   implements Serializable
/*    */ {
/* 11 */   protected byte[] encodedParams = null;
/*    */ 
/*    */   public SealedObject(Serializable object, Cipher c)
/*    */     throws IOException, IllegalBlockSizeException
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   protected SealedObject(SealedObject so) { throw new RuntimeException("Stub!"); } 
/*  7 */   public final String getAlgorithm() { throw new RuntimeException("Stub!"); } 
/*  8 */   public final Object getObject(Key key) throws IOException, ClassNotFoundException, NoSuchAlgorithmException, InvalidKeyException { throw new RuntimeException("Stub!"); } 
/*  9 */   public final Object getObject(Cipher c) throws IOException, ClassNotFoundException, IllegalBlockSizeException, BadPaddingException { throw new RuntimeException("Stub!"); } 
/* 10 */   public final Object getObject(Key key, String provider) throws IOException, ClassNotFoundException, NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.crypto.SealedObject
 * JD-Core Version:    0.6.0
 */