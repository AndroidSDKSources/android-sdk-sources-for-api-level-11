/*    */ package android.os;
/*    */ 
/*    */ import java.io.File;
/*    */ 
/*    */ public class Environment
/*    */ {
/*    */   public static String DIRECTORY_MUSIC;
/*    */   public static String DIRECTORY_PODCASTS;
/*    */   public static String DIRECTORY_RINGTONES;
/*    */   public static String DIRECTORY_ALARMS;
/*    */   public static String DIRECTORY_NOTIFICATIONS;
/*    */   public static String DIRECTORY_PICTURES;
/*    */   public static String DIRECTORY_MOVIES;
/*    */   public static String DIRECTORY_DOWNLOADS;
/*    */   public static String DIRECTORY_DCIM;
/*    */   public static final String MEDIA_REMOVED = "removed";
/*    */   public static final String MEDIA_UNMOUNTED = "unmounted";
/*    */   public static final String MEDIA_CHECKING = "checking";
/*    */   public static final String MEDIA_NOFS = "nofs";
/*    */   public static final String MEDIA_MOUNTED = "mounted";
/*    */   public static final String MEDIA_MOUNTED_READ_ONLY = "mounted_ro";
/*    */   public static final String MEDIA_SHARED = "shared";
/*    */   public static final String MEDIA_BAD_REMOVAL = "bad_removal";
/*    */   public static final String MEDIA_UNMOUNTABLE = "unmountable";
/*    */ 
/*    */   public Environment()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public static File getRootDirectory() { throw new RuntimeException("Stub!"); } 
/*  6 */   public static File getDataDirectory() { throw new RuntimeException("Stub!"); } 
/*  7 */   public static File getExternalStorageDirectory() { throw new RuntimeException("Stub!"); } 
/*  8 */   public static File getExternalStoragePublicDirectory(String type) { throw new RuntimeException("Stub!"); } 
/*  9 */   public static File getDownloadCacheDirectory() { throw new RuntimeException("Stub!"); } 
/* 10 */   public static String getExternalStorageState() { throw new RuntimeException("Stub!"); } 
/* 11 */   public static boolean isExternalStorageRemovable() { throw new RuntimeException("Stub!"); } 
/* 12 */   public static boolean isExternalStorageEmulated() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.os.Environment
 * JD-Core Version:    0.6.0
 */