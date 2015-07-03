/*    */ package android.drm;
/*    */ 
/*    */ import java.util.Iterator;
/*    */ 
/*    */ public class DrmInfoRequest
/*    */ {
/*    */   public static final int TYPE_REGISTRATION_INFO = 1;
/*    */   public static final int TYPE_UNREGISTRATION_INFO = 2;
/*    */   public static final int TYPE_RIGHTS_ACQUISITION_INFO = 3;
/*    */   public static final int TYPE_RIGHTS_ACQUISITION_PROGRESS_INFO = 4;
/*    */   public static final String ACCOUNT_ID = "account_id";
/*    */   public static final String SUBSCRIPTION_ID = "subscription_id";
/*    */ 
/*    */   public DrmInfoRequest(int infoType, String mimeType)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public String getMimeType() { throw new RuntimeException("Stub!"); } 
/*  6 */   public int getInfoType() { throw new RuntimeException("Stub!"); } 
/*  7 */   public void put(String key, Object value) { throw new RuntimeException("Stub!"); } 
/*  8 */   public Object get(String key) { throw new RuntimeException("Stub!"); } 
/*  9 */   public Iterator<String> keyIterator() { throw new RuntimeException("Stub!"); } 
/* 10 */   public Iterator<Object> iterator() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.drm.DrmInfoRequest
 * JD-Core Version:    0.6.0
 */