/*    */ package android.renderscript;
/*    */ 
/*    */ import android.content.res.AssetManager;
/*    */ import android.content.res.Resources;
/*    */ import java.io.File;
/*    */ 
/*    */ public class FileA3D extends BaseObj
/*    */ {
/*    */   FileA3D()
/*    */   {
/* 18 */     throw new RuntimeException("Stub!"); } 
/* 19 */   public int getIndexEntryCount() { throw new RuntimeException("Stub!"); } 
/* 20 */   public IndexEntry getIndexEntry(int index) { throw new RuntimeException("Stub!"); } 
/* 21 */   public static FileA3D createFromAsset(RenderScript rs, AssetManager mgr, String path) { throw new RuntimeException("Stub!"); } 
/* 22 */   public static FileA3D createFromFile(RenderScript rs, String path) { throw new RuntimeException("Stub!"); } 
/* 23 */   public static FileA3D createFromFile(RenderScript rs, File path) { throw new RuntimeException("Stub!"); } 
/* 24 */   public static FileA3D createFromResource(RenderScript rs, Resources res, int id) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class IndexEntry
/*    */   {
/*    */     IndexEntry()
/*    */     {
/* 12 */       throw new RuntimeException("Stub!"); } 
/* 13 */     public String getName() { throw new RuntimeException("Stub!"); } 
/* 14 */     public FileA3D.EntryType getEntryType() { throw new RuntimeException("Stub!"); } 
/* 15 */     public BaseObj getObject() { throw new RuntimeException("Stub!"); } 
/* 16 */     public Mesh getMesh() { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static enum EntryType
/*    */   {
/*  7 */     MESH, 
/*  8 */     UNKNOWN;
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.renderscript.FileA3D
 * JD-Core Version:    0.6.0
 */