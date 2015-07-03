/*    */ package android.accessibilityservice;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public class AccessibilityServiceInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public static final int FEEDBACK_SPOKEN = 1;
/*    */   public static final int FEEDBACK_HAPTIC = 2;
/*    */   public static final int FEEDBACK_AUDIBLE = 4;
/*    */   public static final int FEEDBACK_VISUAL = 8;
/*    */   public static final int FEEDBACK_GENERIC = 16;
/*    */   public static final int DEFAULT = 1;
/*    */   public int eventTypes;
/* 15 */   public String[] packageNames = null;
/*    */   public int feedbackType;
/*    */   public long notificationTimeout;
/*    */   public int flags;
/* 20 */   public static final Parcelable.Creator<AccessibilityServiceInfo> CREATOR = null;
/*    */ 
/*    */   public AccessibilityServiceInfo()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/*  7 */   public void writeToParcel(Parcel parcel, int flagz) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.accessibilityservice.AccessibilityServiceInfo
 * JD-Core Version:    0.6.0
 */