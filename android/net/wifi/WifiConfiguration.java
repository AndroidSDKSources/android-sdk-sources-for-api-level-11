/*    */ package android.net.wifi;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import java.util.BitSet;
/*    */ 
/*    */ public class WifiConfiguration
/*    */   implements Parcelable
/*    */ {
/*    */   public int networkId;
/*    */   public int status;
/*    */   public String SSID;
/*    */   public String BSSID;
/*    */   public String preSharedKey;
/* 68 */   public String[] wepKeys = null;
/*    */   public int wepTxKeyIndex;
/*    */   public int priority;
/*    */   public boolean hiddenSSID;
/*    */   public BitSet allowedKeyManagement;
/*    */   public BitSet allowedProtocols;
/*    */   public BitSet allowedAuthAlgorithms;
/*    */   public BitSet allowedPairwiseCiphers;
/*    */   public BitSet allowedGroupCiphers;
/*    */ 
/*    */   public WifiConfiguration()
/*    */   {
/* 59 */     throw new RuntimeException("Stub!"); } 
/* 60 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 61 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 62 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class Status
/*    */   {
/*    */     public static final int CURRENT = 0;
/*    */     public static final int DISABLED = 1;
/*    */     public static final int ENABLED = 2;
/* 57 */     public static final String[] strings = null;
/*    */ 
/*    */     Status()
/*    */     {
/* 53 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static class GroupCipher
/*    */   {
/*    */     public static final int WEP40 = 0;
/*    */     public static final int WEP104 = 1;
/*    */     public static final int TKIP = 2;
/*    */     public static final int CCMP = 3;
/*    */     public static final String varName = "group";
/* 49 */     public static final String[] strings = null;
/*    */ 
/*    */     GroupCipher()
/*    */     {
/* 43 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static class PairwiseCipher
/*    */   {
/*    */     public static final int NONE = 0;
/*    */     public static final int TKIP = 1;
/*    */     public static final int CCMP = 2;
/*    */     public static final String varName = "pairwise";
/* 39 */     public static final String[] strings = null;
/*    */ 
/*    */     PairwiseCipher()
/*    */     {
/* 34 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static class AuthAlgorithm
/*    */   {
/*    */     public static final int OPEN = 0;
/*    */     public static final int SHARED = 1;
/*    */     public static final int LEAP = 2;
/*    */     public static final String varName = "auth_alg";
/* 30 */     public static final String[] strings = null;
/*    */ 
/*    */     AuthAlgorithm()
/*    */     {
/* 25 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static class Protocol
/*    */   {
/*    */     public static final int WPA = 0;
/*    */     public static final int RSN = 1;
/*    */     public static final String varName = "proto";
/* 21 */     public static final String[] strings = null;
/*    */ 
/*    */     Protocol()
/*    */     {
/* 17 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static class KeyMgmt
/*    */   {
/*    */     public static final int NONE = 0;
/*    */     public static final int WPA_PSK = 1;
/*    */     public static final int WPA_EAP = 2;
/*    */     public static final int IEEE8021X = 3;
/*    */     public static final String varName = "key_mgmt";
/* 13 */     public static final String[] strings = null;
/*    */ 
/*    */     KeyMgmt()
/*    */     {
/*  7 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.net.wifi.WifiConfiguration
 * JD-Core Version:    0.6.0
 */