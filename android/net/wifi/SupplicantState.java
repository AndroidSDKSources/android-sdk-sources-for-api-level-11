/*    */ package android.net.wifi;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ 
/*    */ public enum SupplicantState
/*    */   implements Parcelable
/*    */ {
/*  5 */   ASSOCIATED, 
/*  6 */   ASSOCIATING, 
/*  7 */   COMPLETED, 
/*  8 */   DISCONNECTED, 
/*  9 */   DORMANT, 
/* 10 */   FOUR_WAY_HANDSHAKE, 
/* 11 */   GROUP_HANDSHAKE, 
/* 12 */   INACTIVE, 
/* 13 */   INVALID, 
/* 14 */   SCANNING, 
/* 15 */   UNINITIALIZED;
/*    */ 
/* 16 */   public static boolean isValidState(SupplicantState state) { throw new RuntimeException("Stub!"); } 
/* 17 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 18 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.net.wifi.SupplicantState
 * JD-Core Version:    0.6.0
 */