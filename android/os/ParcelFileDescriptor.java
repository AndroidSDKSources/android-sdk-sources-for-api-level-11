/*    */ package android.os;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.FileInputStream;
/*    */ import java.io.FileNotFoundException;
/*    */ import java.io.FileOutputStream;
/*    */ import java.io.IOException;
/*    */ import java.net.Socket;
/*    */ 
/*    */ public class ParcelFileDescriptor
/*    */   implements Parcelable
/*    */ {
/*    */   public static final int MODE_WORLD_READABLE = 1;
/*    */   public static final int MODE_WORLD_WRITEABLE = 2;
/*    */   public static final int MODE_READ_ONLY = 268435456;
/*    */   public static final int MODE_WRITE_ONLY = 536870912;
/*    */   public static final int MODE_READ_WRITE = 805306368;
/*    */   public static final int MODE_CREATE = 134217728;
/*    */   public static final int MODE_TRUNCATE = 67108864;
/*    */   public static final int MODE_APPEND = 33554432;
/* 37 */   public static final Parcelable.Creator<ParcelFileDescriptor> CREATOR = null;
/*    */ 
/*    */   public ParcelFileDescriptor(ParcelFileDescriptor descriptor)
/*    */   {
/* 17 */     throw new RuntimeException("Stub!"); } 
/* 18 */   public static ParcelFileDescriptor open(File file, int mode) throws FileNotFoundException { throw new RuntimeException("Stub!"); } 
/* 19 */   public static ParcelFileDescriptor fromSocket(Socket socket) { throw new RuntimeException("Stub!"); } 
/* 20 */   public static ParcelFileDescriptor[] createPipe() throws IOException { throw new RuntimeException("Stub!"); } 
/* 21 */   public FileDescriptor getFileDescriptor() { throw new RuntimeException("Stub!"); } 
/*    */   public native long getStatSize();
/*    */ 
/* 23 */   public void close() throws IOException { throw new RuntimeException("Stub!"); } 
/* 24 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 25 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); } 
/* 26 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 27 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class AutoCloseOutputStream extends FileOutputStream
/*    */   {
/*    */     public AutoCloseOutputStream(ParcelFileDescriptor fd)
/*    */     {
/* 14 */       super(); throw new RuntimeException("Stub!"); } 
/* 15 */     public void close() throws IOException { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static class AutoCloseInputStream extends FileInputStream
/*    */   {
/*    */     public AutoCloseInputStream(ParcelFileDescriptor fd)
/*    */     {
/*  8 */       super(); throw new RuntimeException("Stub!"); } 
/*  9 */     public void close() throws IOException { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.os.ParcelFileDescriptor
 * JD-Core Version:    0.6.0
 */