/*    */ package android.content.res;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.ParcelFileDescriptor;
/*    */ import android.os.ParcelFileDescriptor.AutoCloseInputStream;
/*    */ import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.FileInputStream;
/*    */ import java.io.FileOutputStream;
/*    */ import java.io.IOException;
/*    */ 
/*    */ public class AssetFileDescriptor
/*    */   implements Parcelable
/*    */ {
/*    */   public static final long UNKNOWN_LENGTH = -1L;
/* 40 */   public static final Parcelable.Creator<AssetFileDescriptor> CREATOR = null;
/*    */ 
/*    */   public AssetFileDescriptor(ParcelFileDescriptor fd, long startOffset, long length)
/*    */   {
/* 26 */     throw new RuntimeException("Stub!"); } 
/* 27 */   public ParcelFileDescriptor getParcelFileDescriptor() { throw new RuntimeException("Stub!"); } 
/* 28 */   public FileDescriptor getFileDescriptor() { throw new RuntimeException("Stub!"); } 
/* 29 */   public long getStartOffset() { throw new RuntimeException("Stub!"); } 
/* 30 */   public long getLength() { throw new RuntimeException("Stub!"); } 
/* 31 */   public long getDeclaredLength() { throw new RuntimeException("Stub!"); } 
/* 32 */   public void close() throws IOException { throw new RuntimeException("Stub!"); } 
/* 33 */   public FileInputStream createInputStream() throws IOException { throw new RuntimeException("Stub!"); } 
/* 34 */   public FileOutputStream createOutputStream() throws IOException { throw new RuntimeException("Stub!"); } 
/* 35 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 36 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 37 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class AutoCloseOutputStream extends ParcelFileDescriptor.AutoCloseOutputStream
/*    */   {
/*    */     public AutoCloseOutputStream(AssetFileDescriptor fd)
/*    */       throws IOException
/*    */     {
/* 21 */       super(); throw new RuntimeException("Stub!"); } 
/* 22 */     public void write(byte[] buffer, int offset, int count) throws IOException { throw new RuntimeException("Stub!"); } 
/* 23 */     public void write(byte[] buffer) throws IOException { throw new RuntimeException("Stub!"); } 
/* 24 */     public void write(int oneByte) throws IOException { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static class AutoCloseInputStream extends ParcelFileDescriptor.AutoCloseInputStream
/*    */   {
/*    */     public AutoCloseInputStream(AssetFileDescriptor fd)
/*    */       throws IOException
/*    */     {
/*  8 */       super(); throw new RuntimeException("Stub!"); } 
/*  9 */     public int available() throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */     public int read() throws IOException { throw new RuntimeException("Stub!"); } 
/* 11 */     public int read(byte[] buffer, int offset, int count) throws IOException { throw new RuntimeException("Stub!"); } 
/* 12 */     public int read(byte[] buffer) throws IOException { throw new RuntimeException("Stub!"); } 
/* 13 */     public long skip(long count) throws IOException { throw new RuntimeException("Stub!"); } 
/* 14 */     public void mark(int readlimit) { throw new RuntimeException("Stub!"); } 
/* 15 */     public boolean markSupported() { throw new RuntimeException("Stub!"); } 
/* 16 */     public synchronized void reset() throws IOException { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.content.res.AssetFileDescriptor
 * JD-Core Version:    0.6.0
 */