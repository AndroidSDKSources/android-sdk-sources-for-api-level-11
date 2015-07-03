/*    */ package java.util.jar;
/*    */ 
/*    */ import java.beans.PropertyChangeListener;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ import java.util.SortedMap;
/*    */ 
/*    */ public abstract class Pack200
/*    */ {
/*    */   Pack200()
/*    */   {
/* 44 */     throw new RuntimeException("Stub!"); } 
/* 45 */   public static Packer newPacker() { throw new RuntimeException("Stub!"); } 
/* 46 */   public static Unpacker newUnpacker() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static abstract interface Unpacker
/*    */   {
/*    */     public static final String DEFLATE_HINT = "unpack.deflate.hint";
/*    */     public static final String FALSE = "false";
/*    */     public static final String KEEP = "keep";
/*    */     public static final String PROGRESS = "unpack.progress";
/*    */     public static final String TRUE = "true";
/*    */ 
/*    */     public abstract SortedMap<String, String> properties();
/*    */ 
/*    */     public abstract void unpack(InputStream paramInputStream, JarOutputStream paramJarOutputStream)
/*    */       throws IOException;
/*    */ 
/*    */     public abstract void unpack(File paramFile, JarOutputStream paramJarOutputStream)
/*    */       throws IOException;
/*    */ 
/*    */     public abstract void addPropertyChangeListener(PropertyChangeListener paramPropertyChangeListener);
/*    */ 
/*    */     public abstract void removePropertyChangeListener(PropertyChangeListener paramPropertyChangeListener);
/*    */   }
/*    */ 
/*    */   public static abstract interface Packer
/*    */   {
/*    */     public static final String CLASS_ATTRIBUTE_PFX = "pack.class.attribute.";
/*    */     public static final String CODE_ATTRIBUTE_PFX = "pack.code.attribute.";
/*    */     public static final String DEFLATE_HINT = "pack.deflate.hint";
/*    */     public static final String EFFORT = "pack.effort";
/*    */     public static final String ERROR = "error";
/*    */     public static final String FALSE = "false";
/*    */     public static final String FIELD_ATTRIBUTE_PFX = "pack.field.attribute.";
/*    */     public static final String KEEP = "keep";
/*    */     public static final String KEEP_FILE_ORDER = "pack.keep.file.order";
/*    */     public static final String LATEST = "latest";
/*    */     public static final String METHOD_ATTRIBUTE_PFX = "pack.method.attribute.";
/*    */     public static final String MODIFICATION_TIME = "pack.modification.time";
/*    */     public static final String PASS = "pass";
/*    */     public static final String PASS_FILE_PFX = "pack.pass.file.";
/*    */     public static final String PROGRESS = "pack.progress";
/*    */     public static final String SEGMENT_LIMIT = "pack.segment.limit";
/*    */     public static final String STRIP = "strip";
/*    */     public static final String TRUE = "true";
/*    */     public static final String UNKNOWN_ATTRIBUTE = "pack.unknown.attribute";
/*    */ 
/*    */     public abstract SortedMap<String, String> properties();
/*    */ 
/*    */     public abstract void pack(JarFile paramJarFile, OutputStream paramOutputStream)
/*    */       throws IOException;
/*    */ 
/*    */     public abstract void pack(JarInputStream paramJarInputStream, OutputStream paramOutputStream)
/*    */       throws IOException;
/*    */ 
/*    */     public abstract void addPropertyChangeListener(PropertyChangeListener paramPropertyChangeListener);
/*    */ 
/*    */     public abstract void removePropertyChangeListener(PropertyChangeListener paramPropertyChangeListener);
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.jar.Pack200
 * JD-Core Version:    0.6.0
 */