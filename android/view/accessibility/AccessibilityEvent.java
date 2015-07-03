/*    */ package android.view.accessibility;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import java.util.List;
/*    */ 
/*    */ public final class AccessibilityEvent
/*    */   implements Parcelable
/*    */ {
/*    */   public static final int INVALID_POSITION = -1;
/*    */   public static final int MAX_TEXT_LENGTH = 500;
/*    */   public static final int TYPE_VIEW_CLICKED = 1;
/*    */   public static final int TYPE_VIEW_LONG_CLICKED = 2;
/*    */   public static final int TYPE_VIEW_SELECTED = 4;
/*    */   public static final int TYPE_VIEW_FOCUSED = 8;
/*    */   public static final int TYPE_VIEW_TEXT_CHANGED = 16;
/*    */   public static final int TYPE_WINDOW_STATE_CHANGED = 32;
/*    */   public static final int TYPE_NOTIFICATION_STATE_CHANGED = 64;
/*    */   public static final int TYPES_ALL_MASK = -1;
/* 57 */   public static final Parcelable.Creator<AccessibilityEvent> CREATOR = null;
/*    */ 
/*    */   AccessibilityEvent()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public boolean isChecked() { throw new RuntimeException("Stub!"); } 
/*  7 */   public void setChecked(boolean isChecked) { throw new RuntimeException("Stub!"); } 
/*  8 */   public boolean isEnabled() { throw new RuntimeException("Stub!"); } 
/*  9 */   public void setEnabled(boolean isEnabled) { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean isPassword() { throw new RuntimeException("Stub!"); } 
/* 11 */   public void setPassword(boolean isPassword) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void setFullScreen(boolean isFullScreen) { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean isFullScreen() { throw new RuntimeException("Stub!"); } 
/* 14 */   public int getEventType() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void setEventType(int eventType) { throw new RuntimeException("Stub!"); } 
/* 16 */   public int getItemCount() { throw new RuntimeException("Stub!"); } 
/* 17 */   public void setItemCount(int itemCount) { throw new RuntimeException("Stub!"); } 
/* 18 */   public int getCurrentItemIndex() { throw new RuntimeException("Stub!"); } 
/* 19 */   public void setCurrentItemIndex(int currentItemIndex) { throw new RuntimeException("Stub!"); } 
/* 20 */   public int getFromIndex() { throw new RuntimeException("Stub!"); } 
/* 21 */   public void setFromIndex(int fromIndex) { throw new RuntimeException("Stub!"); } 
/* 22 */   public int getAddedCount() { throw new RuntimeException("Stub!"); } 
/* 23 */   public void setAddedCount(int addedCount) { throw new RuntimeException("Stub!"); } 
/* 24 */   public int getRemovedCount() { throw new RuntimeException("Stub!"); } 
/* 25 */   public void setRemovedCount(int removedCount) { throw new RuntimeException("Stub!"); } 
/* 26 */   public long getEventTime() { throw new RuntimeException("Stub!"); } 
/* 27 */   public void setEventTime(long eventTime) { throw new RuntimeException("Stub!"); } 
/* 28 */   public CharSequence getClassName() { throw new RuntimeException("Stub!"); } 
/* 29 */   public void setClassName(CharSequence className) { throw new RuntimeException("Stub!"); } 
/* 30 */   public CharSequence getPackageName() { throw new RuntimeException("Stub!"); } 
/* 31 */   public void setPackageName(CharSequence packageName) { throw new RuntimeException("Stub!"); } 
/* 32 */   public List<CharSequence> getText() { throw new RuntimeException("Stub!"); } 
/* 33 */   public CharSequence getBeforeText() { throw new RuntimeException("Stub!"); } 
/* 34 */   public void setBeforeText(CharSequence beforeText) { throw new RuntimeException("Stub!"); } 
/* 35 */   public CharSequence getContentDescription() { throw new RuntimeException("Stub!"); } 
/* 36 */   public void setContentDescription(CharSequence contentDescription) { throw new RuntimeException("Stub!"); } 
/* 37 */   public Parcelable getParcelableData() { throw new RuntimeException("Stub!"); } 
/* 38 */   public void setParcelableData(Parcelable parcelableData) { throw new RuntimeException("Stub!"); } 
/* 39 */   public static AccessibilityEvent obtain(int eventType) { throw new RuntimeException("Stub!"); } 
/* 40 */   public static AccessibilityEvent obtain() { throw new RuntimeException("Stub!"); } 
/* 41 */   public void recycle() { throw new RuntimeException("Stub!"); } 
/* 42 */   public void initFromParcel(Parcel parcel) { throw new RuntimeException("Stub!"); } 
/* 43 */   public void writeToParcel(Parcel parcel, int flags) { throw new RuntimeException("Stub!"); } 
/* 44 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 45 */   public String toString() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.view.accessibility.AccessibilityEvent
 * JD-Core Version:    0.6.0
 */