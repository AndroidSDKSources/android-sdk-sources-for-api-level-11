/*    */ package android.view.inputmethod;
/*    */ 
/*    */ import android.os.IBinder;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public final class InputBinding
/*    */   implements Parcelable
/*    */ {
/* 15 */   public static final Parcelable.Creator<InputBinding> CREATOR = null;
/*    */ 
/*    */   public InputBinding(InputConnection conn, IBinder connToken, int uid, int pid)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public InputBinding(InputConnection conn, InputBinding binding) { throw new RuntimeException("Stub!"); } 
/*  7 */   public InputConnection getConnection() { throw new RuntimeException("Stub!"); } 
/*  8 */   public IBinder getConnectionToken() { throw new RuntimeException("Stub!"); } 
/*  9 */   public int getUid() { throw new RuntimeException("Stub!"); } 
/* 10 */   public int getPid() { throw new RuntimeException("Stub!"); } 
/* 11 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 12 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); } 
/* 13 */   public int describeContents() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.view.inputmethod.InputBinding
 * JD-Core Version:    0.6.0
 */