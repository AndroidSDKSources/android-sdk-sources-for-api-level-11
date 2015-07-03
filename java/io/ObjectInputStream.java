/*    */ package java.io;
/*    */ 
/*    */ public class ObjectInputStream extends InputStream
/*    */   implements ObjectInput, ObjectStreamConstants
/*    */ {
/*    */   protected ObjectInputStream()
/*    */     throws IOException, SecurityException
/*    */   {
/* 21 */     throw new RuntimeException("Stub!"); } 
/* 22 */   public ObjectInputStream(InputStream input) throws StreamCorruptedException, IOException { throw new RuntimeException("Stub!"); } 
/* 23 */   public int available() throws IOException { throw new RuntimeException("Stub!"); } 
/* 24 */   public void close() throws IOException { throw new RuntimeException("Stub!"); } 
/* 25 */   public void defaultReadObject() throws IOException, ClassNotFoundException, NotActiveException { throw new RuntimeException("Stub!"); } 
/* 26 */   protected boolean enableResolveObject(boolean enable) throws SecurityException { throw new RuntimeException("Stub!"); } 
/* 27 */   public int read() throws IOException { throw new RuntimeException("Stub!"); } 
/* 28 */   public int read(byte[] buffer, int offset, int length) throws IOException { throw new RuntimeException("Stub!"); } 
/* 29 */   public boolean readBoolean() throws IOException { throw new RuntimeException("Stub!"); } 
/* 30 */   public byte readByte() throws IOException { throw new RuntimeException("Stub!"); } 
/* 31 */   public char readChar() throws IOException { throw new RuntimeException("Stub!"); } 
/* 32 */   public double readDouble() throws IOException { throw new RuntimeException("Stub!"); } 
/* 33 */   public GetField readFields() throws IOException, ClassNotFoundException, NotActiveException { throw new RuntimeException("Stub!"); } 
/* 34 */   public float readFloat() throws IOException { throw new RuntimeException("Stub!"); } 
/* 35 */   public void readFully(byte[] dst) throws IOException { throw new RuntimeException("Stub!"); } 
/* 36 */   public void readFully(byte[] dst, int offset, int byteCount) throws IOException { throw new RuntimeException("Stub!"); } 
/* 37 */   public int readInt() throws IOException { throw new RuntimeException("Stub!"); } 
/* 38 */   public String readLine() throws IOException { throw new RuntimeException("Stub!"); } 
/* 39 */   public long readLong() throws IOException { throw new RuntimeException("Stub!"); } 
/* 40 */   protected ObjectStreamClass readClassDescriptor() throws IOException, ClassNotFoundException { throw new RuntimeException("Stub!"); } 
/* 41 */   protected Class<?> resolveProxyClass(String[] interfaceNames) throws IOException, ClassNotFoundException { throw new RuntimeException("Stub!"); } 
/* 42 */   public final Object readObject() throws OptionalDataException, ClassNotFoundException, IOException { throw new RuntimeException("Stub!"); } 
/* 43 */   public Object readUnshared() throws IOException, ClassNotFoundException { throw new RuntimeException("Stub!"); } 
/* 44 */   protected Object readObjectOverride() throws OptionalDataException, ClassNotFoundException, IOException { throw new RuntimeException("Stub!"); } 
/* 45 */   public short readShort() throws IOException { throw new RuntimeException("Stub!"); } 
/* 46 */   protected void readStreamHeader() throws IOException, StreamCorruptedException { throw new RuntimeException("Stub!"); } 
/* 47 */   public int readUnsignedByte() throws IOException { throw new RuntimeException("Stub!"); } 
/* 48 */   public int readUnsignedShort() throws IOException { throw new RuntimeException("Stub!"); } 
/* 49 */   public String readUTF() throws IOException { throw new RuntimeException("Stub!"); } 
/* 50 */   public synchronized void registerValidation(ObjectInputValidation object, int priority) throws NotActiveException, InvalidObjectException { throw new RuntimeException("Stub!"); } 
/* 51 */   protected Class<?> resolveClass(ObjectStreamClass osClass) throws IOException, ClassNotFoundException { throw new RuntimeException("Stub!"); } 
/* 52 */   protected Object resolveObject(Object object) throws IOException { throw new RuntimeException("Stub!"); } 
/* 53 */   public int skipBytes(int length) throws IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static abstract class GetField
/*    */   {
/*    */     public GetField()
/*    */     {
/*  8 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */ 
/*    */     public abstract ObjectStreamClass getObjectStreamClass();
/*    */ 
/*    */     public abstract boolean defaulted(String paramString)
/*    */       throws IOException, IllegalArgumentException;
/*    */ 
/*    */     public abstract boolean get(String paramString, boolean paramBoolean)
/*    */       throws IOException, IllegalArgumentException;
/*    */ 
/*    */     public abstract char get(String paramString, char paramChar)
/*    */       throws IOException, IllegalArgumentException;
/*    */ 
/*    */     public abstract byte get(String paramString, byte paramByte)
/*    */       throws IOException, IllegalArgumentException;
/*    */ 
/*    */     public abstract short get(String paramString, short paramShort)
/*    */       throws IOException, IllegalArgumentException;
/*    */ 
/*    */     public abstract int get(String paramString, int paramInt)
/*    */       throws IOException, IllegalArgumentException;
/*    */ 
/*    */     public abstract long get(String paramString, long paramLong)
/*    */       throws IOException, IllegalArgumentException;
/*    */ 
/*    */     public abstract float get(String paramString, float paramFloat)
/*    */       throws IOException, IllegalArgumentException;
/*    */ 
/*    */     public abstract double get(String paramString, double paramDouble)
/*    */       throws IOException, IllegalArgumentException;
/*    */ 
/*    */     public abstract Object get(String paramString, Object paramObject)
/*    */       throws IOException, IllegalArgumentException;
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.io.ObjectInputStream
 * JD-Core Version:    0.6.0
 */