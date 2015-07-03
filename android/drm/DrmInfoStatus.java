/*   */ package android.drm;
/*   */ 
/*   */ public class DrmInfoStatus
/*   */ {
/*   */   public static final int STATUS_OK = 1;
/*   */   public static final int STATUS_ERROR = 2;
/*   */   public final int statusCode;
/*   */   public final int infoType;
/*   */   public final String mimeType;
/*   */   public final ProcessedData data;
/*   */ 
/*   */   public DrmInfoStatus(int _statusCode, int _infoType, ProcessedData _data, String _mimeType)
/*   */   {
/* 4 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.drm.DrmInfoStatus
 * JD-Core Version:    0.6.0
 */