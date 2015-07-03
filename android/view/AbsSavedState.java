/*    */ package android.view;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public abstract class AbsSavedState
/*    */   implements Parcelable
/*    */ {
/* 12 */   public static final AbsSavedState EMPTY_STATE = null; public static final Parcelable.Creator<AbsSavedState> CREATOR = null;
/*    */ 
/*    */   protected AbsSavedState(Parcelable superState)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   protected AbsSavedState(Parcel source) { throw new RuntimeException("Stub!"); } 
/*  7 */   public final Parcelable getSuperState() { throw new RuntimeException("Stub!"); } 
/*  8 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/*  9 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.view.AbsSavedState
 * JD-Core Version:    0.6.0
 */