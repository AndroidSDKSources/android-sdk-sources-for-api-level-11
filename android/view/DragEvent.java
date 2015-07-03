/*    */ package android.view;
/*    */ 
/*    */ import android.content.ClipData;
/*    */ import android.content.ClipDescription;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public class DragEvent
/*    */   implements Parcelable
/*    */ {
/*    */   public static final int ACTION_DRAG_STARTED = 1;
/*    */   public static final int ACTION_DRAG_LOCATION = 2;
/*    */   public static final int ACTION_DROP = 3;
/*    */   public static final int ACTION_DRAG_ENDED = 4;
/*    */   public static final int ACTION_DRAG_ENTERED = 5;
/*    */   public static final int ACTION_DRAG_EXITED = 6;
/* 23 */   public static final Parcelable.Creator<DragEvent> CREATOR = null;
/*    */ 
/*    */   DragEvent()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public int getAction() { throw new RuntimeException("Stub!"); } 
/*  7 */   public float getX() { throw new RuntimeException("Stub!"); } 
/*  8 */   public float getY() { throw new RuntimeException("Stub!"); } 
/*  9 */   public ClipData getClipData() { throw new RuntimeException("Stub!"); } 
/* 10 */   public ClipDescription getClipDescription() { throw new RuntimeException("Stub!"); } 
/* 11 */   public Object getLocalState() { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean getResult() { throw new RuntimeException("Stub!"); } 
/* 13 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 14 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.view.DragEvent
 * JD-Core Version:    0.6.0
 */