/*    */ package java.security;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ import java.security.cert.Certificate;
/*    */ import java.security.cert.CertificateException;
/*    */ import java.util.Date;
/*    */ import java.util.Enumeration;
/*    */ import javax.crypto.SecretKey;
/*    */ import javax.security.auth.DestroyFailedException;
/*    */ import javax.security.auth.Destroyable;
/*    */ import javax.security.auth.callback.CallbackHandler;
/*    */ 
/*    */ public class KeyStore
/*    */ {
/*    */   protected KeyStore(KeyStoreSpi keyStoreSpi, Provider provider, String type)
/*    */   {
/* 60 */     throw new RuntimeException("Stub!"); } 
/* 61 */   public static KeyStore getInstance(String type) throws KeyStoreException { throw new RuntimeException("Stub!"); } 
/* 62 */   public static KeyStore getInstance(String type, String provider) throws KeyStoreException, NoSuchProviderException { throw new RuntimeException("Stub!"); } 
/* 63 */   public static KeyStore getInstance(String type, Provider provider) throws KeyStoreException { throw new RuntimeException("Stub!"); } 
/* 64 */   public static final String getDefaultType() { throw new RuntimeException("Stub!"); } 
/* 65 */   public final Provider getProvider() { throw new RuntimeException("Stub!"); } 
/* 66 */   public final String getType() { throw new RuntimeException("Stub!"); } 
/* 67 */   public final Key getKey(String alias, char[] password) throws KeyStoreException, NoSuchAlgorithmException, UnrecoverableKeyException { throw new RuntimeException("Stub!"); } 
/* 68 */   public final Certificate[] getCertificateChain(String alias) throws KeyStoreException { throw new RuntimeException("Stub!"); } 
/* 69 */   public final Certificate getCertificate(String alias) throws KeyStoreException { throw new RuntimeException("Stub!"); } 
/* 70 */   public final Date getCreationDate(String alias) throws KeyStoreException { throw new RuntimeException("Stub!"); } 
/* 71 */   public final void setKeyEntry(String alias, Key key, char[] password, Certificate[] chain) throws KeyStoreException { throw new RuntimeException("Stub!"); } 
/* 72 */   public final void setKeyEntry(String alias, byte[] key, Certificate[] chain) throws KeyStoreException { throw new RuntimeException("Stub!"); } 
/* 73 */   public final void setCertificateEntry(String alias, Certificate cert) throws KeyStoreException { throw new RuntimeException("Stub!"); } 
/* 74 */   public final void deleteEntry(String alias) throws KeyStoreException { throw new RuntimeException("Stub!"); } 
/* 75 */   public final Enumeration<String> aliases() throws KeyStoreException { throw new RuntimeException("Stub!"); } 
/* 76 */   public final boolean containsAlias(String alias) throws KeyStoreException { throw new RuntimeException("Stub!"); } 
/* 77 */   public final int size() throws KeyStoreException { throw new RuntimeException("Stub!"); } 
/* 78 */   public final boolean isKeyEntry(String alias) throws KeyStoreException { throw new RuntimeException("Stub!"); } 
/* 79 */   public final boolean isCertificateEntry(String alias) throws KeyStoreException { throw new RuntimeException("Stub!"); } 
/* 80 */   public final String getCertificateAlias(Certificate cert) throws KeyStoreException { throw new RuntimeException("Stub!"); } 
/* 81 */   public final void store(OutputStream stream, char[] password) throws KeyStoreException, IOException, NoSuchAlgorithmException, CertificateException { throw new RuntimeException("Stub!"); } 
/* 82 */   public final void store(LoadStoreParameter param) throws KeyStoreException, IOException, NoSuchAlgorithmException, CertificateException { throw new RuntimeException("Stub!"); } 
/* 83 */   public final void load(InputStream stream, char[] password) throws IOException, NoSuchAlgorithmException, CertificateException { throw new RuntimeException("Stub!"); } 
/* 84 */   public final void load(LoadStoreParameter param) throws IOException, NoSuchAlgorithmException, CertificateException { throw new RuntimeException("Stub!"); } 
/* 85 */   public final Entry getEntry(String alias, ProtectionParameter param) throws NoSuchAlgorithmException, UnrecoverableEntryException, KeyStoreException { throw new RuntimeException("Stub!"); } 
/* 86 */   public final void setEntry(String alias, Entry entry, ProtectionParameter param) throws KeyStoreException { throw new RuntimeException("Stub!"); } 
/* 87 */   public final boolean entryInstanceOf(String alias, Class<? extends Entry> entryClass) throws KeyStoreException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static final class TrustedCertificateEntry
/*    */     implements KeyStore.Entry
/*    */   {
/*    */     public TrustedCertificateEntry(Certificate trustCertificate)
/*    */     {
/* 56 */       throw new RuntimeException("Stub!"); } 
/* 57 */     public Certificate getTrustedCertificate() { throw new RuntimeException("Stub!"); } 
/* 58 */     public String toString() { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static final class SecretKeyEntry
/*    */     implements KeyStore.Entry
/*    */   {
/*    */     public SecretKeyEntry(SecretKey secretKey)
/*    */     {
/* 49 */       throw new RuntimeException("Stub!"); } 
/* 50 */     public SecretKey getSecretKey() { throw new RuntimeException("Stub!"); } 
/* 51 */     public String toString() { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static final class PrivateKeyEntry
/*    */     implements KeyStore.Entry
/*    */   {
/*    */     public PrivateKeyEntry(PrivateKey privateKey, Certificate[] chain)
/*    */     {
/* 40 */       throw new RuntimeException("Stub!"); } 
/* 41 */     public PrivateKey getPrivateKey() { throw new RuntimeException("Stub!"); } 
/* 42 */     public Certificate[] getCertificateChain() { throw new RuntimeException("Stub!"); } 
/* 43 */     public Certificate getCertificate() { throw new RuntimeException("Stub!"); } 
/* 44 */     public String toString() { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static abstract interface ProtectionParameter
/*    */   {
/*    */   }
/*    */ 
/*    */   public static class PasswordProtection
/*    */     implements KeyStore.ProtectionParameter, Destroyable
/*    */   {
/*    */     public PasswordProtection(char[] password)
/*    */     {
/* 29 */       throw new RuntimeException("Stub!"); } 
/* 30 */     public synchronized char[] getPassword() { throw new RuntimeException("Stub!"); } 
/* 31 */     public synchronized void destroy() throws DestroyFailedException { throw new RuntimeException("Stub!"); } 
/* 32 */     public synchronized boolean isDestroyed() { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static abstract interface LoadStoreParameter
/*    */   {
/*    */     public abstract KeyStore.ProtectionParameter getProtectionParameter();
/*    */   }
/*    */ 
/*    */   public static abstract interface Entry
/*    */   {
/*    */   }
/*    */ 
/*    */   public static class CallbackHandlerProtection
/*    */     implements KeyStore.ProtectionParameter
/*    */   {
/*    */     public CallbackHandlerProtection(CallbackHandler handler)
/*    */     {
/* 16 */       throw new RuntimeException("Stub!"); } 
/* 17 */     public CallbackHandler getCallbackHandler() { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static abstract class Builder
/*    */   {
/*    */     protected Builder()
/*    */     {
/*  6 */       throw new RuntimeException("Stub!"); } 
/*    */     public abstract KeyStore getKeyStore() throws KeyStoreException;
/*    */ 
/*    */     public abstract KeyStore.ProtectionParameter getProtectionParameter(String paramString) throws KeyStoreException;
/*    */ 
/*  9 */     public static Builder newInstance(KeyStore keyStore, KeyStore.ProtectionParameter protectionParameter) { throw new RuntimeException("Stub!"); } 
/* 10 */     public static Builder newInstance(String type, Provider provider, File file, KeyStore.ProtectionParameter protectionParameter) { throw new RuntimeException("Stub!"); } 
/* 11 */     public static Builder newInstance(String type, Provider provider, KeyStore.ProtectionParameter protectionParameter) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.KeyStore
 * JD-Core Version:    0.6.0
 */