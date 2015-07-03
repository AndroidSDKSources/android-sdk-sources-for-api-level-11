/*    */ package android.drm;
/*    */ 
/*    */ import android.content.ContentValues;
/*    */ import android.content.Context;
/*    */ import android.net.Uri;
/*    */ import java.io.IOException;
/*    */ import java.util.HashMap;
/*    */ 
/*    */ public class DrmManagerClient
/*    */ {
/*    */   public static final int ERROR_NONE = 0;
/*    */   public static final int ERROR_UNKNOWN = -2000;
/*    */ 
/*    */   public DrmManagerClient(Context context)
/*    */   {
/* 16 */     throw new RuntimeException("Stub!"); } 
/* 17 */   protected void finalize() { throw new RuntimeException("Stub!"); } 
/* 18 */   public synchronized void setOnInfoListener(OnInfoListener infoListener) { throw new RuntimeException("Stub!"); } 
/* 19 */   public synchronized void setOnEventListener(OnEventListener eventListener) { throw new RuntimeException("Stub!"); } 
/* 20 */   public synchronized void setOnErrorListener(OnErrorListener errorListener) { throw new RuntimeException("Stub!"); } 
/* 21 */   public String[] getAvailableDrmEngines() { throw new RuntimeException("Stub!"); } 
/* 22 */   public ContentValues getConstraints(String path, int action) { throw new RuntimeException("Stub!"); } 
/* 23 */   public ContentValues getMetadata(String path) { throw new RuntimeException("Stub!"); } 
/* 24 */   public ContentValues getConstraints(Uri uri, int action) { throw new RuntimeException("Stub!"); } 
/* 25 */   public ContentValues getMetadata(Uri uri) { throw new RuntimeException("Stub!"); } 
/* 26 */   public int saveRights(DrmRights drmRights, String rightsPath, String contentPath) throws IOException { throw new RuntimeException("Stub!"); } 
/* 27 */   public boolean canHandle(String path, String mimeType) { throw new RuntimeException("Stub!"); } 
/* 28 */   public boolean canHandle(Uri uri, String mimeType) { throw new RuntimeException("Stub!"); } 
/* 29 */   public int processDrmInfo(DrmInfo drmInfo) { throw new RuntimeException("Stub!"); } 
/* 30 */   public DrmInfo acquireDrmInfo(DrmInfoRequest drmInfoRequest) { throw new RuntimeException("Stub!"); } 
/* 31 */   public int acquireRights(DrmInfoRequest drmInfoRequest) { throw new RuntimeException("Stub!"); } 
/* 32 */   public int getDrmObjectType(String path, String mimeType) { throw new RuntimeException("Stub!"); } 
/* 33 */   public int getDrmObjectType(Uri uri, String mimeType) { throw new RuntimeException("Stub!"); } 
/* 34 */   public String getOriginalMimeType(String path) { throw new RuntimeException("Stub!"); } 
/* 35 */   public String getOriginalMimeType(Uri uri) { throw new RuntimeException("Stub!"); } 
/* 36 */   public int checkRightsStatus(String path) { throw new RuntimeException("Stub!"); } 
/* 37 */   public int checkRightsStatus(Uri uri) { throw new RuntimeException("Stub!"); } 
/* 38 */   public int checkRightsStatus(String path, int action) { throw new RuntimeException("Stub!"); } 
/* 39 */   public int checkRightsStatus(Uri uri, int action) { throw new RuntimeException("Stub!"); } 
/* 40 */   public int removeRights(String path) { throw new RuntimeException("Stub!"); } 
/* 41 */   public int removeRights(Uri uri) { throw new RuntimeException("Stub!"); } 
/* 42 */   public int removeAllRights() { throw new RuntimeException("Stub!"); } 
/* 43 */   public int openConvertSession(String mimeType) { throw new RuntimeException("Stub!"); } 
/* 44 */   public DrmConvertedStatus convertData(int convertId, byte[] inputData) { throw new RuntimeException("Stub!"); } 
/* 45 */   public DrmConvertedStatus closeConvertSession(int convertId) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static abstract interface OnErrorListener
/*    */   {
/*    */     public abstract void onError(DrmManagerClient paramDrmManagerClient, DrmErrorEvent paramDrmErrorEvent);
/*    */   }
/*    */ 
/*    */   public static abstract interface OnEventListener
/*    */   {
/*    */     public abstract void onEvent(DrmManagerClient paramDrmManagerClient, DrmEvent paramDrmEvent, HashMap<String, Object> paramHashMap);
/*    */   }
/*    */ 
/*    */   public static abstract interface OnInfoListener
/*    */   {
/*    */     public abstract void onInfo(DrmManagerClient paramDrmManagerClient, DrmInfoEvent paramDrmInfoEvent);
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.drm.DrmManagerClient
 * JD-Core Version:    0.6.0
 */