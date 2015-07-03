/*    */ package android.appwidget;
/*    */ 
/*    */ import android.content.ComponentName;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public class AppWidgetProviderInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public ComponentName provider;
/*    */   public int minWidth;
/*    */   public int minHeight;
/*    */   public int updatePeriodMillis;
/*    */   public int initialLayout;
/*    */   public ComponentName configure;
/*    */   public String label;
/*    */   public int icon;
/*    */   public int autoAdvanceViewId;
/*    */   public int previewImage;
/* 21 */   public static final Parcelable.Creator<AppWidgetProviderInfo> CREATOR = null;
/*    */ 
/*    */   public AppWidgetProviderInfo()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public AppWidgetProviderInfo(Parcel in) { throw new RuntimeException("Stub!"); } 
/*  7 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); } 
/*  8 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/*  9 */   public String toString() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.appwidget.AppWidgetProviderInfo
 * JD-Core Version:    0.6.0
 */