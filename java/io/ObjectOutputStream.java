/*    */ package java.io;
/*    */ 
/*    */ public class ObjectOutputStream extends OutputStream
/*    */   implements ObjectOutput, ObjectStreamConstants
/*    */ {
/*    */   protected ObjectOutputStream()
/*    */     throws IOException, SecurityException
/*    */   {
/* 20 */     throw new RuntimeException("Stub!"); } 
/* 21 */   public ObjectOutputStream(OutputStream output) throws IOException { throw new RuntimeException("Stub!"); } 
/* 22 */   protected void annotateClass(Class<?> aClass) throws IOException { throw new RuntimeException("Stub!"); } 
/* 23 */   protected void annotateProxyClass(Class<?> aClass) throws IOException { throw new RuntimeException("Stub!"); } 
/* 24 */   public void close() throws IOException { throw new RuntimeException("Stub!"); } 
/* 25 */   public void defaultWriteObject() throws IOException { throw new RuntimeException("Stub!"); } 
/* 26 */   protected void drain() throws IOException { throw new RuntimeException("Stub!"); } 
/* 27 */   protected boolean enableReplaceObject(boolean enable) throws SecurityException { throw new RuntimeException("Stub!"); } 
/* 28 */   public void flush() throws IOException { throw new RuntimeException("Stub!"); } 
/* 29 */   public PutField putFields() throws IOException { throw new RuntimeException("Stub!"); } 
/* 30 */   protected Object replaceObject(Object object) throws IOException { throw new RuntimeException("Stub!"); } 
/* 31 */   public void reset() throws IOException { throw new RuntimeException("Stub!"); } 
/* 32 */   public void useProtocolVersion(int version) throws IOException { throw new RuntimeException("Stub!"); } 
/* 33 */   public void write(byte[] buffer) throws IOException { throw new RuntimeException("Stub!"); } 
/* 34 */   public void write(byte[] buffer, int offset, int length) throws IOException { throw new RuntimeException("Stub!"); } 
/* 35 */   public void write(int value) throws IOException { throw new RuntimeException("Stub!"); } 
/* 36 */   public void writeBoolean(boolean value) throws IOException { throw new RuntimeException("Stub!"); } 
/* 37 */   public void writeByte(int value) throws IOException { throw new RuntimeException("Stub!"); } 
/* 38 */   public void writeBytes(String value) throws IOException { throw new RuntimeException("Stub!"); } 
/* 39 */   public void writeChar(int value) throws IOException { throw new RuntimeException("Stub!"); } 
/* 40 */   public void writeChars(String value) throws IOException { throw new RuntimeException("Stub!"); } 
/* 41 */   public void writeDouble(double value) throws IOException { throw new RuntimeException("Stub!"); } 
/* 42 */   public void writeFields() throws IOException { throw new RuntimeException("Stub!"); } 
/* 43 */   public void writeFloat(float value) throws IOException { throw new RuntimeException("Stub!"); } 
/* 44 */   public void writeInt(int value) throws IOException { throw new RuntimeException("Stub!"); } 
/* 45 */   public void writeLong(long value) throws IOException { throw new RuntimeException("Stub!"); } 
/* 46 */   protected void writeClassDescriptor(ObjectStreamClass classDesc) throws IOException { throw new RuntimeException("Stub!"); } 
/* 47 */   public final void writeObject(Object object) throws IOException { throw new RuntimeException("Stub!"); } 
/* 48 */   public void writeUnshared(Object object) throws IOException { throw new RuntimeException("Stub!"); } 
/* 49 */   protected void writeObjectOverride(Object object) throws IOException { throw new RuntimeException("Stub!"); } 
/* 50 */   public void writeShort(int value) throws IOException { throw new RuntimeException("Stub!"); } 
/* 51 */   protected void writeStreamHeader() throws IOException { throw new RuntimeException("Stub!"); } 
/* 52 */   public void writeUTF(String value) throws IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static abstract class PutField
/*    */   {
/*    */     public PutField()
/*    */     {
/*  8 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */ 
/*    */     public abstract void put(String paramString, boolean paramBoolean);
/*    */ 
/*    */     public abstract void put(String paramString, char paramChar);
/*    */ 
/*    */     public abstract void put(String paramString, byte paramByte);
/*    */ 
/*    */     public abstract void put(String paramString, short paramShort);
/*    */ 
/*    */     public abstract void put(String paramString, int paramInt);
/*    */ 
/*    */     public abstract void put(String paramString, long paramLong);
/*    */ 
/*    */     public abstract void put(String paramString, float paramFloat);
/*    */ 
/*    */     public abstract void put(String paramString, double paramDouble);
/*    */ 
/*    */     public abstract void put(String paramString, Object paramObject);
/*    */ 
/*    */     public abstract void write(ObjectOutput paramObjectOutput)
/*    */       throws IOException;
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.io.ObjectOutputStream
 * JD-Core Version:    0.6.0
 */