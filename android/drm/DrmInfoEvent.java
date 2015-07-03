/*   */ package android.drm;
/*   */ 
/*   */ public class DrmInfoEvent extends DrmEvent
/*   */ {
/*   */   public static final int TYPE_ALREADY_REGISTERED_BY_ANOTHER_ACCOUNT = 1;
/*   */   public static final int TYPE_REMOVE_RIGHTS = 2;
/*   */   public static final int TYPE_RIGHTS_INSTALLED = 3;
/*   */   public static final int TYPE_WAIT_FOR_RIGHTS = 4;
/*   */   public static final int TYPE_ACCOUNT_ALREADY_REGISTERED = 5;
/*   */ 
/*   */   public DrmInfoEvent(int uniqueId, int type, String message)
/*   */   {
/* 5 */     super(0, 0, (String)null); throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.drm.DrmInfoEvent
 * JD-Core Version:    0.6.0
 */