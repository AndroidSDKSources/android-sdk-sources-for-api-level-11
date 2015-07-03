/*    */ package android.media;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.graphics.Bitmap;
/*    */ import android.net.Uri;
/*    */ import java.io.FileDescriptor;
/*    */ 
/*    */ public class MediaMetadataRetriever
/*    */ {
/*    */   public static final int OPTION_PREVIOUS_SYNC = 0;
/*    */   public static final int OPTION_NEXT_SYNC = 1;
/*    */   public static final int OPTION_CLOSEST_SYNC = 2;
/*    */   public static final int OPTION_CLOSEST = 3;
/*    */   public static final int METADATA_KEY_CD_TRACK_NUMBER = 0;
/*    */   public static final int METADATA_KEY_ALBUM = 1;
/*    */   public static final int METADATA_KEY_ARTIST = 2;
/*    */   public static final int METADATA_KEY_AUTHOR = 3;
/*    */   public static final int METADATA_KEY_COMPOSER = 4;
/*    */   public static final int METADATA_KEY_DATE = 5;
/*    */   public static final int METADATA_KEY_GENRE = 6;
/*    */   public static final int METADATA_KEY_TITLE = 7;
/*    */   public static final int METADATA_KEY_YEAR = 8;
/*    */   public static final int METADATA_KEY_DURATION = 9;
/*    */   public static final int METADATA_KEY_NUM_TRACKS = 10;
/*    */   public static final int METADATA_KEY_WRITER = 11;
/*    */   public static final int METADATA_KEY_MIMETYPE = 12;
/*    */   public static final int METADATA_KEY_ALBUMARTIST = 13;
/*    */   public static final int METADATA_KEY_DISC_NUMBER = 14;
/*    */   public static final int METADATA_KEY_COMPILATION = 15;
/*    */ 
/*    */   public MediaMetadataRetriever()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*    */   public native void setDataSource(String paramString) throws IllegalArgumentException;
/*    */ 
/*    */   public native void setDataSource(FileDescriptor paramFileDescriptor, long paramLong1, long paramLong2) throws IllegalArgumentException;
/*    */ 
/*  7 */   public void setDataSource(FileDescriptor fd) throws IllegalArgumentException { throw new RuntimeException("Stub!"); } 
/*  8 */   public void setDataSource(Context context, Uri uri) throws IllegalArgumentException, SecurityException { throw new RuntimeException("Stub!"); } 
/*    */   public native String extractMetadata(int paramInt);
/*    */ 
/* 10 */   public Bitmap getFrameAtTime(long timeUs, int option) { throw new RuntimeException("Stub!"); } 
/* 11 */   public Bitmap getFrameAtTime(long timeUs) { throw new RuntimeException("Stub!"); } 
/* 12 */   public Bitmap getFrameAtTime() { throw new RuntimeException("Stub!"); } 
/* 13 */   public byte[] getEmbeddedPicture() { throw new RuntimeException("Stub!"); } 
/*    */   public native void release();
/*    */ 
/* 15 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.media.MediaMetadataRetriever
 * JD-Core Version:    0.6.0
 */