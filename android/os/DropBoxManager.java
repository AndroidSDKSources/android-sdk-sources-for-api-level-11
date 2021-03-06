/*    */ package android.os;
/*    */ 
/*    */ import java.io.Closeable;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ 
/*    */ public class DropBoxManager
/*    */ {
/*    */   public static final int IS_EMPTY = 1;
/*    */   public static final int IS_TEXT = 2;
/*    */   public static final int IS_GZIPPED = 4;
/*    */   public static final String ACTION_DROPBOX_ENTRY_ADDED = "android.intent.action.DROPBOX_ENTRY_ADDED";
/*    */   public static final String EXTRA_TAG = "tag";
/*    */   public static final String EXTRA_TIME = "time";
/*    */ 
/*    */   protected DropBoxManager()
/*    */   {
/* 23 */     throw new RuntimeException("Stub!"); } 
/* 24 */   public void addText(String tag, String data) { throw new RuntimeException("Stub!"); } 
/* 25 */   public void addData(String tag, byte[] data, int flags) { throw new RuntimeException("Stub!"); } 
/* 26 */   public void addFile(String tag, File file, int flags) throws IOException { throw new RuntimeException("Stub!"); } 
/* 27 */   public boolean isTagEnabled(String tag) { throw new RuntimeException("Stub!"); } 
/* 28 */   public Entry getNextEntry(String tag, long msec) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class Entry
/*    */     implements Parcelable, Closeable
/*    */   {
/* 21 */     public static final Parcelable.Creator<Entry> CREATOR = null;
/*    */ 
/*    */     public Entry(String tag, long millis)
/*    */     {
/*  7 */       throw new RuntimeException("Stub!"); } 
/*  8 */     public Entry(String tag, long millis, String text) { throw new RuntimeException("Stub!"); } 
/*  9 */     public Entry(String tag, long millis, byte[] data, int flags) { throw new RuntimeException("Stub!"); } 
/* 10 */     public Entry(String tag, long millis, ParcelFileDescriptor data, int flags) { throw new RuntimeException("Stub!"); } 
/* 11 */     public Entry(String tag, long millis, File data, int flags) throws IOException { throw new RuntimeException("Stub!"); } 
/* 12 */     public void close() { throw new RuntimeException("Stub!"); } 
/* 13 */     public String getTag() { throw new RuntimeException("Stub!"); } 
/* 14 */     public long getTimeMillis() { throw new RuntimeException("Stub!"); } 
/* 15 */     public int getFlags() { throw new RuntimeException("Stub!"); } 
/* 16 */     public String getText(int maxBytes) { throw new RuntimeException("Stub!"); } 
/* 17 */     public InputStream getInputStream() throws IOException { throw new RuntimeException("Stub!"); } 
/* 18 */     public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 19 */     public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.os.DropBoxManager
 * JD-Core Version:    0.6.0
 */