/*    */ package android.nfc.tech;
/*    */ 
/*    */ import android.nfc.Tag;
/*    */ import java.io.IOException;
/*    */ 
/*    */ public final class MifareUltralight extends BasicTagTechnology
/*    */ {
/*    */   public static final int TYPE_UNKNOWN = -1;
/*    */   public static final int TYPE_ULTRALIGHT = 1;
/*    */   public static final int TYPE_ULTRALIGHT_C = 2;
/*    */   public static final int PAGE_SIZE = 4;
/*    */ 
/*    */   MifareUltralight()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public static MifareUltralight get(Tag tag) { throw new RuntimeException("Stub!"); } 
/*  7 */   public int getType() { throw new RuntimeException("Stub!"); } 
/*  8 */   public byte[] readPages(int pageOffset) throws IOException { throw new RuntimeException("Stub!"); } 
/*  9 */   public void writePage(int pageOffset, byte[] data) throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public byte[] transceive(byte[] data) throws IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.nfc.tech.MifareUltralight
 * JD-Core Version:    0.6.0
 */