/*    */ package android.nfc;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public final class NdefRecord
/*    */   implements Parcelable
/*    */ {
/*    */   public static final short TNF_EMPTY = 0;
/*    */   public static final short TNF_WELL_KNOWN = 1;
/*    */   public static final short TNF_MIME_MEDIA = 2;
/*    */   public static final short TNF_ABSOLUTE_URI = 3;
/*    */   public static final short TNF_EXTERNAL_TYPE = 4;
/*    */   public static final short TNF_UNKNOWN = 5;
/*    */   public static final short TNF_UNCHANGED = 6;
/* 21 */   public static final byte[] RTD_TEXT = null;
/* 22 */   public static final byte[] RTD_URI = null;
/* 23 */   public static final byte[] RTD_SMART_POSTER = null;
/* 24 */   public static final byte[] RTD_ALTERNATIVE_CARRIER = null;
/* 25 */   public static final byte[] RTD_HANDOVER_CARRIER = null;
/* 26 */   public static final byte[] RTD_HANDOVER_REQUEST = null;
/* 27 */   public static final byte[] RTD_HANDOVER_SELECT = null;
/*    */ 
/* 29 */   public static final Parcelable.Creator<NdefRecord> CREATOR = null;
/*    */ 
/*    */   public NdefRecord(short tnf, byte[] type, byte[] id, byte[] payload)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public NdefRecord(byte[] data) throws FormatException { throw new RuntimeException("Stub!"); } 
/*  7 */   public short getTnf() { throw new RuntimeException("Stub!"); } 
/*  8 */   public byte[] getType() { throw new RuntimeException("Stub!"); } 
/*  9 */   public byte[] getId() { throw new RuntimeException("Stub!"); } 
/* 10 */   public byte[] getPayload() { throw new RuntimeException("Stub!"); } 
/* 11 */   public byte[] toByteArray() { throw new RuntimeException("Stub!"); } 
/* 12 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 13 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.nfc.NdefRecord
 * JD-Core Version:    0.6.0
 */