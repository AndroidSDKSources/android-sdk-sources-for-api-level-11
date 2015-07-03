/*    */ package android.text;
/*    */ 
/*    */ import android.graphics.drawable.Drawable;
/*    */ import org.xml.sax.XMLReader;
/*    */ 
/*    */ public class Html
/*    */ {
/*    */   Html()
/*    */   {
/* 12 */     throw new RuntimeException("Stub!"); } 
/* 13 */   public static Spanned fromHtml(String source) { throw new RuntimeException("Stub!"); } 
/* 14 */   public static Spanned fromHtml(String source, ImageGetter imageGetter, TagHandler tagHandler) { throw new RuntimeException("Stub!"); } 
/* 15 */   public static String toHtml(Spanned text) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static abstract interface TagHandler
/*    */   {
/*    */     public abstract void handleTag(boolean paramBoolean, String paramString, Editable paramEditable, XMLReader paramXMLReader);
/*    */   }
/*    */ 
/*    */   public static abstract interface ImageGetter
/*    */   {
/*    */     public abstract Drawable getDrawable(String paramString);
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.text.Html
 * JD-Core Version:    0.6.0
 */