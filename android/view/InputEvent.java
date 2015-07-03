/*    */ package android.view;
/*    */ 
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public abstract class InputEvent
/*    */   implements Parcelable
/*    */ {
/* 11 */   public static final Parcelable.Creator<InputEvent> CREATOR = null;
/*    */ 
/*    */   InputEvent()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public final int getDeviceId() { throw new RuntimeException("Stub!"); } 
/*  7 */   public final InputDevice getDevice() { throw new RuntimeException("Stub!"); } 
/*  8 */   public final int getSource() { throw new RuntimeException("Stub!"); } 
/*  9 */   public int describeContents() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.view.InputEvent
 * JD-Core Version:    0.6.0
 */