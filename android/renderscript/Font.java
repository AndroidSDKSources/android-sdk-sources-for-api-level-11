/*    */ package android.renderscript;
/*    */ 
/*    */ import android.content.res.Resources;
/*    */ import java.io.File;
/*    */ 
/*    */ public class Font extends BaseObj
/*    */ {
/*    */   Font()
/*    */   {
/* 12 */     throw new RuntimeException("Stub!"); } 
/* 13 */   public static Font createFromFile(RenderScript rs, Resources res, String path, float pointSize) { throw new RuntimeException("Stub!"); } 
/* 14 */   public static Font createFromFile(RenderScript rs, Resources res, File path, float pointSize) { throw new RuntimeException("Stub!"); } 
/* 15 */   public static Font createFromAsset(RenderScript rs, Resources res, String path, float pointSize) { throw new RuntimeException("Stub!"); } 
/* 16 */   public static Font createFromResource(RenderScript rs, Resources res, int id, float pointSize) { throw new RuntimeException("Stub!"); } 
/* 17 */   public static Font create(RenderScript rs, Resources res, String familyName, Style fontStyle, float pointSize) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static enum Style
/*    */   {
/*  7 */     BOLD, 
/*  8 */     BOLD_ITALIC, 
/*  9 */     ITALIC, 
/* 10 */     NORMAL;
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.renderscript.Font
 * JD-Core Version:    0.6.0
 */