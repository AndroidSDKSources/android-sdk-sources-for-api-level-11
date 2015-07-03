/*   */ package android.drm;
/*   */ 
/*   */ public class DrmErrorEvent extends DrmEvent
/*   */ {
/*   */   public static final int TYPE_RIGHTS_NOT_INSTALLED = 2001;
/*   */   public static final int TYPE_RIGHTS_RENEWAL_NOT_ALLOWED = 2002;
/*   */   public static final int TYPE_NOT_SUPPORTED = 2003;
/*   */   public static final int TYPE_OUT_OF_MEMORY = 2004;
/*   */   public static final int TYPE_NO_INTERNET_CONNECTION = 2005;
/*   */   public static final int TYPE_PROCESS_DRM_INFO_FAILED = 2006;
/*   */   public static final int TYPE_REMOVE_ALL_RIGHTS_FAILED = 2007;
/*   */ 
/*   */   public DrmErrorEvent(int uniqueId, int type, String message)
/*   */   {
/* 5 */     super(0, 0, (String)null); throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.drm.DrmErrorEvent
 * JD-Core Version:    0.6.0
 */