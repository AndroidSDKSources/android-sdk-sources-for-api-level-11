/*    */ package android.os;
/*    */ 
/*    */ public class ResultReceiver
/*    */   implements Parcelable
/*    */ {
/* 11 */   public static final Parcelable.Creator<ResultReceiver> CREATOR = null;
/*    */ 
/*    */   public ResultReceiver(Handler handler)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public void send(int resultCode, Bundle resultData) { throw new RuntimeException("Stub!"); } 
/*  7 */   protected void onReceiveResult(int resultCode, Bundle resultData) { throw new RuntimeException("Stub!"); } 
/*  8 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/*  9 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.os.ResultReceiver
 * JD-Core Version:    0.6.0
 */