/*    */ package android.nfc.tech;
/*    */ 
/*    */ import android.nfc.FormatException;
/*    */ import android.nfc.NdefMessage;
/*    */ import android.nfc.Tag;
/*    */ import java.io.IOException;
/*    */ 
/*    */ public final class Ndef extends BasicTagTechnology
/*    */ {
/*    */   public static final String NFC_FORUM_TYPE_1 = "org.nfcforum.ndef.type1";
/*    */   public static final String NFC_FORUM_TYPE_2 = "org.nfcforum.ndef.type2";
/*    */   public static final String NFC_FORUM_TYPE_3 = "org.nfcforum.ndef.type3";
/*    */   public static final String NFC_FORUM_TYPE_4 = "org.nfcforum.ndef.type4";
/*    */   public static final String MIFARE_CLASSIC = "com.nxp.ndef.mifareclassic";
/*    */ 
/*    */   Ndef()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public static Ndef get(Tag tag) { throw new RuntimeException("Stub!"); } 
/*  7 */   public NdefMessage getCachedNdefMessage() { throw new RuntimeException("Stub!"); } 
/*  8 */   public String getType() { throw new RuntimeException("Stub!"); } 
/*  9 */   public int getMaxSize() { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean isWritable() { throw new RuntimeException("Stub!"); } 
/* 11 */   public NdefMessage getNdefMessage() throws IOException, FormatException { throw new RuntimeException("Stub!"); } 
/* 12 */   public void writeNdefMessage(NdefMessage msg) throws IOException, FormatException { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean canMakeReadOnly() { throw new RuntimeException("Stub!"); } 
/* 14 */   public boolean makeReadOnly() throws IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.nfc.tech.Ndef
 * JD-Core Version:    0.6.0
 */