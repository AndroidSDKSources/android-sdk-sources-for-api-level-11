/*    */ package javax.crypto;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.security.AlgorithmParameters;
/*    */ import java.security.InvalidKeyException;
/*    */ import java.security.Key;
/*    */ import java.security.NoSuchAlgorithmException;
/*    */ import java.security.NoSuchProviderException;
/*    */ import java.security.Provider;
/*    */ import java.security.spec.InvalidKeySpecException;
/*    */ import java.security.spec.PKCS8EncodedKeySpec;
/*    */ 
/*    */ public class EncryptedPrivateKeyInfo
/*    */ {
/*    */   public EncryptedPrivateKeyInfo(byte[] encoded)
/*    */     throws IOException
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public EncryptedPrivateKeyInfo(String encrAlgName, byte[] encryptedData) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); } 
/*  6 */   public EncryptedPrivateKeyInfo(AlgorithmParameters algParams, byte[] encryptedData) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); } 
/*  7 */   public String getAlgName() { throw new RuntimeException("Stub!"); } 
/*  8 */   public AlgorithmParameters getAlgParameters() { throw new RuntimeException("Stub!"); } 
/*  9 */   public byte[] getEncryptedData() { throw new RuntimeException("Stub!"); } 
/* 10 */   public PKCS8EncodedKeySpec getKeySpec(Cipher cipher) throws InvalidKeySpecException { throw new RuntimeException("Stub!"); } 
/* 11 */   public PKCS8EncodedKeySpec getKeySpec(Key decryptKey) throws NoSuchAlgorithmException, InvalidKeyException { throw new RuntimeException("Stub!"); } 
/* 12 */   public PKCS8EncodedKeySpec getKeySpec(Key decryptKey, String providerName) throws NoSuchProviderException, NoSuchAlgorithmException, InvalidKeyException { throw new RuntimeException("Stub!"); } 
/* 13 */   public PKCS8EncodedKeySpec getKeySpec(Key decryptKey, Provider provider) throws NoSuchAlgorithmException, InvalidKeyException { throw new RuntimeException("Stub!"); } 
/* 14 */   public byte[] getEncoded() throws IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.crypto.EncryptedPrivateKeyInfo
 * JD-Core Version:    0.6.0
 */