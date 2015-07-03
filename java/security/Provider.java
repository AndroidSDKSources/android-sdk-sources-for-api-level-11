/*    */ package java.security;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import java.util.Map.Entry;
/*    */ import java.util.Properties;
/*    */ import java.util.Set;
/*    */ 
/*    */ public abstract class Provider extends Properties
/*    */ {
/*    */   protected Provider(String name, double version, String info)
/*    */   {
/* 17 */     throw new RuntimeException("Stub!"); } 
/* 18 */   public String getName() { throw new RuntimeException("Stub!"); } 
/* 19 */   public double getVersion() { throw new RuntimeException("Stub!"); } 
/* 20 */   public String getInfo() { throw new RuntimeException("Stub!"); } 
/* 21 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 22 */   public synchronized void clear() { throw new RuntimeException("Stub!"); } 
/* 23 */   public synchronized void load(InputStream inStream) throws IOException { throw new RuntimeException("Stub!"); } 
/* 24 */   public synchronized void putAll(Map<?, ?> t) { throw new RuntimeException("Stub!"); } 
/* 25 */   public synchronized Set<Map.Entry<Object, Object>> entrySet() { throw new RuntimeException("Stub!"); } 
/* 26 */   public Set<Object> keySet() { throw new RuntimeException("Stub!"); } 
/* 27 */   public Collection<Object> values() { throw new RuntimeException("Stub!"); } 
/* 28 */   public synchronized Object put(Object key, Object value) { throw new RuntimeException("Stub!"); } 
/* 29 */   public synchronized Object remove(Object key) { throw new RuntimeException("Stub!"); } 
/* 30 */   public synchronized Service getService(String type, String algorithm) { throw new RuntimeException("Stub!"); } 
/* 31 */   public synchronized Set<Service> getServices() { throw new RuntimeException("Stub!"); } 
/* 32 */   protected synchronized void putService(Service s) { throw new RuntimeException("Stub!"); } 
/* 33 */   protected synchronized void removeService(Service s) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class Service
/*    */   {
/*    */     public Service(Provider provider, String type, String algorithm, String className, List<String> aliases, Map<String, String> attributes)
/*    */     {
/*  7 */       throw new RuntimeException("Stub!"); } 
/*  8 */     public final String getType() { throw new RuntimeException("Stub!"); } 
/*  9 */     public final String getAlgorithm() { throw new RuntimeException("Stub!"); } 
/* 10 */     public final Provider getProvider() { throw new RuntimeException("Stub!"); } 
/* 11 */     public final String getClassName() { throw new RuntimeException("Stub!"); } 
/* 12 */     public final String getAttribute(String name) { throw new RuntimeException("Stub!"); } 
/* 13 */     public Object newInstance(Object constructorParameter) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); } 
/* 14 */     public boolean supportsParameter(Object parameter) { throw new RuntimeException("Stub!"); } 
/* 15 */     public String toString() { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.Provider
 * JD-Core Version:    0.6.0
 */