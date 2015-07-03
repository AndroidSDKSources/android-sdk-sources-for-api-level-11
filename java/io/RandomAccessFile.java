/*    */ package java.io;
/*    */ 
/*    */ import java.nio.channels.FileChannel;
/*    */ 
/*    */ public class RandomAccessFile
/*    */   implements DataInput, DataOutput, Closeable
/*    */ {
/*    */   public RandomAccessFile(File file, String mode)
/*    */     throws FileNotFoundException
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public RandomAccessFile(String fileName, String mode) throws FileNotFoundException { throw new RuntimeException("Stub!"); } 
/*  7 */   public void close() throws IOException { throw new RuntimeException("Stub!"); } 
/*  8 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); } 
/*  9 */   public final synchronized FileChannel getChannel() { throw new RuntimeException("Stub!"); } 
/* 10 */   public final FileDescriptor getFD() throws IOException { throw new RuntimeException("Stub!"); } 
/* 11 */   public long getFilePointer() throws IOException { throw new RuntimeException("Stub!"); } 
/* 12 */   public long length() throws IOException { throw new RuntimeException("Stub!"); } 
/* 13 */   public int read() throws IOException { throw new RuntimeException("Stub!"); } 
/* 14 */   public int read(byte[] buffer) throws IOException { throw new RuntimeException("Stub!"); } 
/* 15 */   public int read(byte[] buffer, int offset, int count) throws IOException { throw new RuntimeException("Stub!"); } 
/* 16 */   public final boolean readBoolean() throws IOException { throw new RuntimeException("Stub!"); } 
/* 17 */   public final byte readByte() throws IOException { throw new RuntimeException("Stub!"); } 
/* 18 */   public final char readChar() throws IOException { throw new RuntimeException("Stub!"); } 
/* 19 */   public final double readDouble() throws IOException { throw new RuntimeException("Stub!"); } 
/* 20 */   public final float readFloat() throws IOException { throw new RuntimeException("Stub!"); } 
/* 21 */   public final void readFully(byte[] dst) throws IOException { throw new RuntimeException("Stub!"); } 
/* 22 */   public final void readFully(byte[] dst, int offset, int byteCount) throws IOException { throw new RuntimeException("Stub!"); } 
/* 23 */   public final int readInt() throws IOException { throw new RuntimeException("Stub!"); } 
/* 24 */   public final String readLine() throws IOException { throw new RuntimeException("Stub!"); } 
/* 25 */   public final long readLong() throws IOException { throw new RuntimeException("Stub!"); } 
/* 26 */   public final short readShort() throws IOException { throw new RuntimeException("Stub!"); } 
/* 27 */   public final int readUnsignedByte() throws IOException { throw new RuntimeException("Stub!"); } 
/* 28 */   public final int readUnsignedShort() throws IOException { throw new RuntimeException("Stub!"); } 
/* 29 */   public final String readUTF() throws IOException { throw new RuntimeException("Stub!"); } 
/* 30 */   public void seek(long offset) throws IOException { throw new RuntimeException("Stub!"); } 
/* 31 */   public void setLength(long newLength) throws IOException { throw new RuntimeException("Stub!"); } 
/* 32 */   public int skipBytes(int count) throws IOException { throw new RuntimeException("Stub!"); } 
/* 33 */   public void write(byte[] buffer) throws IOException { throw new RuntimeException("Stub!"); } 
/* 34 */   public void write(byte[] buffer, int offset, int count) throws IOException { throw new RuntimeException("Stub!"); } 
/* 35 */   public void write(int oneByte) throws IOException { throw new RuntimeException("Stub!"); } 
/* 36 */   public final void writeBoolean(boolean val) throws IOException { throw new RuntimeException("Stub!"); } 
/* 37 */   public final void writeByte(int val) throws IOException { throw new RuntimeException("Stub!"); } 
/* 38 */   public final void writeBytes(String str) throws IOException { throw new RuntimeException("Stub!"); } 
/* 39 */   public final void writeChar(int val) throws IOException { throw new RuntimeException("Stub!"); } 
/* 40 */   public final void writeChars(String str) throws IOException { throw new RuntimeException("Stub!"); } 
/* 41 */   public final void writeDouble(double val) throws IOException { throw new RuntimeException("Stub!"); } 
/* 42 */   public final void writeFloat(float val) throws IOException { throw new RuntimeException("Stub!"); } 
/* 43 */   public final void writeInt(int val) throws IOException { throw new RuntimeException("Stub!"); } 
/* 44 */   public final void writeLong(long val) throws IOException { throw new RuntimeException("Stub!"); } 
/* 45 */   public final void writeShort(int val) throws IOException { throw new RuntimeException("Stub!"); } 
/* 46 */   public final void writeUTF(String str) throws IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.io.RandomAccessFile
 * JD-Core Version:    0.6.0
 */