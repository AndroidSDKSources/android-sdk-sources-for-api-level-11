/*   */ package android.drm;
/*   */ 
/*   */ public class DrmConvertedStatus
/*   */ {
/*   */   public static final int STATUS_OK = 1;
/*   */   public static final int STATUS_INPUTDATA_ERROR = 2;
/*   */   public static final int STATUS_ERROR = 3;
/*   */   public final int statusCode;
/* 9 */   public final byte[] convertedData = null;
/*   */   public final int offset;
/*   */ 
/*   */   public DrmConvertedStatus(int _statusCode, byte[] _convertedData, int _offset)
/*   */   {
/* 4 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.drm.DrmConvertedStatus
 * JD-Core Version:    0.6.0
 */