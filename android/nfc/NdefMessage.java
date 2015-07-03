/*    */ package android.nfc;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public final class NdefMessage
/*    */   implements Parcelable
/*    */ {
/* 12 */   public static final Parcelable.Creator<NdefMessage> CREATOR = null;
/*    */ 
/*    */   public NdefMessage(byte[] data)
/*    */     throws FormatException
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public NdefMessage(NdefRecord[] records) { throw new RuntimeException("Stub!"); } 
/*  7 */   public NdefRecord[] getRecords() { throw new RuntimeException("Stub!"); } 
/*  8 */   public byte[] toByteArray() { throw new RuntimeException("Stub!"); } 
/*  9 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.nfc.NdefMessage
 * JD-Core Version:    0.6.0
 */