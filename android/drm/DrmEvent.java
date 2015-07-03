/*   */ package android.drm;
/*   */ 
/*   */ public class DrmEvent
/*   */ {
/*   */   public static final int TYPE_ALL_RIGHTS_REMOVED = 1001;
/*   */   public static final int TYPE_DRM_INFO_PROCESSED = 1002;
/*   */   public static final String DRM_INFO_STATUS_OBJECT = "drm_info_status_object";
/*   */ 
/*   */   protected DrmEvent(int uniqueId, int type, String message)
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public int getUniqueId() { throw new RuntimeException("Stub!"); } 
/* 6 */   public int getType() { throw new RuntimeException("Stub!"); } 
/* 7 */   public String getMessage() { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.drm.DrmEvent
 * JD-Core Version:    0.6.0
 */