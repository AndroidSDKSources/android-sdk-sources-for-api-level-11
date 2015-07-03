/*    */ package java.security;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ import java.security.cert.Certificate;
/*    */ import java.security.cert.CertificateException;
/*    */ import java.util.Date;
/*    */ import java.util.Enumeration;
/*    */ 
/*    */ public abstract class KeyStoreSpi
/*    */ {
/*    */   public KeyStoreSpi()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*    */   public abstract Key engineGetKey(String paramString, char[] paramArrayOfChar) throws NoSuchAlgorithmException, UnrecoverableKeyException;
/*    */ 
/*    */   public abstract Certificate[] engineGetCertificateChain(String paramString);
/*    */ 
/*    */   public abstract Certificate engineGetCertificate(String paramString);
/*    */ 
/*    */   public abstract Date engineGetCreationDate(String paramString);
/*    */ 
/*    */   public abstract void engineSetKeyEntry(String paramString, Key paramKey, char[] paramArrayOfChar, Certificate[] paramArrayOfCertificate) throws KeyStoreException;
/*    */ 
/*    */   public abstract void engineSetKeyEntry(String paramString, byte[] paramArrayOfByte, Certificate[] paramArrayOfCertificate) throws KeyStoreException;
/*    */ 
/*    */   public abstract void engineSetCertificateEntry(String paramString, Certificate paramCertificate) throws KeyStoreException;
/*    */ 
/*    */   public abstract void engineDeleteEntry(String paramString) throws KeyStoreException;
/*    */ 
/*    */   public abstract Enumeration<String> engineAliases();
/*    */ 
/*    */   public abstract boolean engineContainsAlias(String paramString);
/*    */ 
/*    */   public abstract int engineSize();
/*    */ 
/*    */   public abstract boolean engineIsKeyEntry(String paramString);
/*    */ 
/*    */   public abstract boolean engineIsCertificateEntry(String paramString);
/*    */ 
/*    */   public abstract String engineGetCertificateAlias(Certificate paramCertificate);
/*    */ 
/*    */   public abstract void engineStore(OutputStream paramOutputStream, char[] paramArrayOfChar) throws IOException, NoSuchAlgorithmException, CertificateException;
/*    */ 
/* 20 */   public void engineStore(KeyStore.LoadStoreParameter param) throws IOException, NoSuchAlgorithmException, CertificateException { throw new RuntimeException("Stub!"); } 
/*    */   public abstract void engineLoad(InputStream paramInputStream, char[] paramArrayOfChar) throws IOException, NoSuchAlgorithmException, CertificateException;
/*    */ 
/* 22 */   public void engineLoad(KeyStore.LoadStoreParameter param) throws IOException, NoSuchAlgorithmException, CertificateException { throw new RuntimeException("Stub!"); } 
/* 23 */   public KeyStore.Entry engineGetEntry(String alias, KeyStore.ProtectionParameter protParam) throws KeyStoreException, NoSuchAlgorithmException, UnrecoverableEntryException { throw new RuntimeException("Stub!"); } 
/* 24 */   public void engineSetEntry(String alias, KeyStore.Entry entry, KeyStore.ProtectionParameter protParam) throws KeyStoreException { throw new RuntimeException("Stub!"); } 
/* 25 */   public boolean engineEntryInstanceOf(String alias, Class<? extends KeyStore.Entry> entryClass) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.KeyStoreSpi
 * JD-Core Version:    0.6.0
 */