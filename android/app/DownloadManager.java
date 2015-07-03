/*    */ package android.app;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.database.Cursor;
/*    */ import android.net.Uri;
/*    */ import android.os.ParcelFileDescriptor;
/*    */ import java.io.FileNotFoundException;
/*    */ 
/*    */ public class DownloadManager
/*    */ {
/*    */   public static final String COLUMN_ID = "_id";
/*    */   public static final String COLUMN_TITLE = "title";
/*    */   public static final String COLUMN_DESCRIPTION = "description";
/*    */   public static final String COLUMN_URI = "uri";
/*    */   public static final String COLUMN_MEDIA_TYPE = "media_type";
/*    */   public static final String COLUMN_TOTAL_SIZE_BYTES = "total_size";
/*    */   public static final String COLUMN_LOCAL_URI = "local_uri";
/*    */   public static final String COLUMN_LOCAL_FILENAME = "local_filename";
/*    */   public static final String COLUMN_STATUS = "status";
/*    */   public static final String COLUMN_REASON = "reason";
/*    */   public static final String COLUMN_BYTES_DOWNLOADED_SO_FAR = "bytes_so_far";
/*    */   public static final String COLUMN_LAST_MODIFIED_TIMESTAMP = "last_modified_timestamp";
/*    */   public static final String COLUMN_MEDIAPROVIDER_URI = "mediaprovider_uri";
/*    */   public static final int STATUS_PENDING = 1;
/*    */   public static final int STATUS_RUNNING = 2;
/*    */   public static final int STATUS_PAUSED = 4;
/*    */   public static final int STATUS_SUCCESSFUL = 8;
/*    */   public static final int STATUS_FAILED = 16;
/*    */   public static final int ERROR_UNKNOWN = 1000;
/*    */   public static final int ERROR_FILE_ERROR = 1001;
/*    */   public static final int ERROR_UNHANDLED_HTTP_CODE = 1002;
/*    */   public static final int ERROR_HTTP_DATA_ERROR = 1004;
/*    */   public static final int ERROR_TOO_MANY_REDIRECTS = 1005;
/*    */   public static final int ERROR_INSUFFICIENT_SPACE = 1006;
/*    */   public static final int ERROR_DEVICE_NOT_FOUND = 1007;
/*    */   public static final int ERROR_CANNOT_RESUME = 1008;
/*    */   public static final int ERROR_FILE_ALREADY_EXISTS = 1009;
/*    */   public static final int PAUSED_WAITING_TO_RETRY = 1;
/*    */   public static final int PAUSED_WAITING_FOR_NETWORK = 2;
/*    */   public static final int PAUSED_QUEUED_FOR_WIFI = 3;
/*    */   public static final int PAUSED_UNKNOWN = 4;
/*    */   public static final String ACTION_DOWNLOAD_COMPLETE = "android.intent.action.DOWNLOAD_COMPLETE";
/*    */   public static final String ACTION_NOTIFICATION_CLICKED = "android.intent.action.DOWNLOAD_NOTIFICATION_CLICKED";
/*    */   public static final String ACTION_VIEW_DOWNLOADS = "android.intent.action.VIEW_DOWNLOADS";
/*    */   public static final String EXTRA_DOWNLOAD_ID = "extra_download_id";
/*    */   public static final String EXTRA_NOTIFICATION_CLICK_DOWNLOAD_IDS = "extra_click_download_ids";
/*    */ 
/*    */   DownloadManager()
/*    */   {
/* 32 */     throw new RuntimeException("Stub!"); } 
/* 33 */   public long enqueue(Request request) { throw new RuntimeException("Stub!"); } 
/* 34 */   public int remove(long[] ids) { throw new RuntimeException("Stub!"); } 
/* 35 */   public Cursor query(Query query) { throw new RuntimeException("Stub!"); } 
/* 36 */   public ParcelFileDescriptor openDownloadedFile(long id) throws FileNotFoundException { throw new RuntimeException("Stub!"); } 
/* 37 */   public Uri getUriForDownloadedFile(long id) { throw new RuntimeException("Stub!"); } 
/* 38 */   public String getMimeTypeForDownloadedFile(long id) { throw new RuntimeException("Stub!"); } 
/* 39 */   public static Long getMaxBytesOverMobile(Context context) { throw new RuntimeException("Stub!"); } 
/* 40 */   public static Long getRecommendedMaxBytesOverMobile(Context context) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class Query
/*    */   {
/*    */     public Query()
/*    */     {
/* 28 */       throw new RuntimeException("Stub!"); } 
/* 29 */     public Query setFilterById(long[] ids) { throw new RuntimeException("Stub!"); } 
/* 30 */     public Query setFilterByStatus(int flags) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static class Request
/*    */   {
/*    */     public static final int NETWORK_MOBILE = 1;
/*    */     public static final int NETWORK_WIFI = 2;
/*    */     public static final int VISIBILITY_VISIBLE = 0;
/*    */     public static final int VISIBILITY_VISIBLE_NOTIFY_COMPLETED = 1;
/*    */     public static final int VISIBILITY_HIDDEN = 2;
/*    */ 
/*    */     public Request(Uri uri)
/*    */     {
/*  6 */       throw new RuntimeException("Stub!"); } 
/*  7 */     public Request setDestinationUri(Uri uri) { throw new RuntimeException("Stub!"); } 
/*  8 */     public Request setDestinationInExternalFilesDir(Context context, String dirType, String subPath) { throw new RuntimeException("Stub!"); } 
/*  9 */     public Request setDestinationInExternalPublicDir(String dirType, String subPath) { throw new RuntimeException("Stub!"); } 
/* 10 */     public void allowScanningByMediaScanner() { throw new RuntimeException("Stub!"); } 
/* 11 */     public Request addRequestHeader(String header, String value) { throw new RuntimeException("Stub!"); } 
/* 12 */     public Request setTitle(CharSequence title) { throw new RuntimeException("Stub!"); } 
/* 13 */     public Request setDescription(CharSequence description) { throw new RuntimeException("Stub!"); } 
/* 14 */     public Request setMimeType(String mimeType) { throw new RuntimeException("Stub!"); } 
/* 15 */     public Request setShowRunningNotification(boolean show) { throw new RuntimeException("Stub!"); } 
/* 16 */     public Request setNotificationVisibility(int visibility) { throw new RuntimeException("Stub!"); } 
/* 17 */     public Request setAllowedNetworkTypes(int flags) { throw new RuntimeException("Stub!"); } 
/* 18 */     public Request setAllowedOverRoaming(boolean allowed) { throw new RuntimeException("Stub!"); } 
/* 19 */     public Request setVisibleInDownloadsUi(boolean isVisible) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.app.DownloadManager
 * JD-Core Version:    0.6.0
 */