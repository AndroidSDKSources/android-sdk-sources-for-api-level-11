/*    */ package javax.net.ssl;
/*    */ 
/*    */ import java.security.InvalidAlgorithmParameterException;
/*    */ import java.security.KeyStore;
/*    */ import java.security.KeyStoreException;
/*    */ import java.security.NoSuchAlgorithmException;
/*    */ import java.security.NoSuchProviderException;
/*    */ import java.security.Provider;
/*    */ import java.security.UnrecoverableKeyException;
/*    */ 
/*    */ public class KeyManagerFactory
/*    */ {
/*    */   protected KeyManagerFactory(KeyManagerFactorySpi factorySpi, Provider provider, String algorithm)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public static final String getDefaultAlgorithm() { throw new RuntimeException("Stub!"); } 
/*  6 */   public static final KeyManagerFactory getInstance(String algorithm) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); } 
/*  7 */   public static final KeyManagerFactory getInstance(String algorithm, String provider) throws NoSuchAlgorithmException, NoSuchProviderException { throw new RuntimeException("Stub!"); } 
/*  8 */   public static final KeyManagerFactory getInstance(String algorithm, Provider provider) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); } 
/*  9 */   public final String getAlgorithm() { throw new RuntimeException("Stub!"); } 
/* 10 */   public final Provider getProvider() { throw new RuntimeException("Stub!"); } 
/* 11 */   public final void init(KeyStore ks, char[] password) throws KeyStoreException, NoSuchAlgorithmException, UnrecoverableKeyException { throw new RuntimeException("Stub!"); } 
/* 12 */   public final void init(ManagerFactoryParameters spec) throws InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); } 
/* 13 */   public final KeyManager[] getKeyManagers() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.net.ssl.KeyManagerFactory
 * JD-Core Version:    0.6.0
 */