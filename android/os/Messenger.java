/*    */ package android.os;
/*    */ 
/*    */ public final class Messenger
/*    */   implements Parcelable
/*    */ {
/* 16 */   public static final Parcelable.Creator<Messenger> CREATOR = null;
/*    */ 
/*    */   public Messenger(Handler target)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public Messenger(IBinder target) { throw new RuntimeException("Stub!"); } 
/*  7 */   public void send(Message message) throws RemoteException { throw new RuntimeException("Stub!"); } 
/*  8 */   public IBinder getBinder() { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean equals(Object otherObj) { throw new RuntimeException("Stub!"); } 
/* 10 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 11 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 12 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); } 
/* 13 */   public static void writeMessengerOrNullToParcel(Messenger messenger, Parcel out) { throw new RuntimeException("Stub!"); } 
/* 14 */   public static Messenger readMessengerOrNullFromParcel(Parcel in) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.os.Messenger
 * JD-Core Version:    0.6.0
 */