/*   */ package android.nfc.tech;
/*   */ 
/*   */ import android.nfc.FormatException;
/*   */ import android.nfc.NdefMessage;
/*   */ import android.nfc.Tag;
/*   */ import java.io.IOException;
/*   */ 
/*   */ public final class NdefFormatable extends BasicTagTechnology
/*   */ {
/*   */   NdefFormatable()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public static NdefFormatable get(Tag tag) { throw new RuntimeException("Stub!"); } 
/* 7 */   public void format(NdefMessage firstMessage) throws IOException, FormatException { throw new RuntimeException("Stub!"); } 
/* 8 */   public void formatReadOnly(NdefMessage firstMessage) throws IOException, FormatException { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.nfc.tech.NdefFormatable
 * JD-Core Version:    0.6.0
 */