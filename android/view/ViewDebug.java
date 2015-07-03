/*    */ package android.view;
/*    */ 
/*    */ import java.lang.annotation.Annotation;
/*    */ import java.lang.annotation.Retention;
/*    */ import java.lang.annotation.RetentionPolicy;
/*    */ import java.lang.annotation.Target;
/*    */ 
/*    */ public class ViewDebug
/*    */ {
/*    */   public static final boolean TRACE_HIERARCHY = false;
/*    */   public static final boolean TRACE_RECYCLER = false;
/*    */ 
/*    */   public ViewDebug()
/*    */   {
/* 58 */     throw new RuntimeException("Stub!"); } 
/* 59 */   public static void trace(View view, RecyclerTraceType type, int[] parameters) { throw new RuntimeException("Stub!"); } 
/* 60 */   public static void startRecyclerTracing(String prefix, View view) { throw new RuntimeException("Stub!"); } 
/* 61 */   public static void stopRecyclerTracing() { throw new RuntimeException("Stub!"); } 
/* 62 */   public static void trace(View view, HierarchyTraceType type) { throw new RuntimeException("Stub!"); } 
/* 63 */   public static void startHierarchyTracing(String prefix, View view) { throw new RuntimeException("Stub!"); } 
/* 64 */   public static void stopHierarchyTracing() { throw new RuntimeException("Stub!"); } 
/* 65 */   public static void dumpCapturedView(String tag, Object view) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static enum RecyclerTraceType
/*    */   {
/* 51 */     BIND_VIEW, 
/* 52 */     MOVE_FROM_ACTIVE_TO_SCRAP_HEAP, 
/* 53 */     MOVE_TO_SCRAP_HEAP, 
/* 54 */     NEW_VIEW, 
/* 55 */     RECYCLE_FROM_ACTIVE_HEAP, 
/* 56 */     RECYCLE_FROM_SCRAP_HEAP;
/*    */   }
/*    */ 
/*    */   public static enum HierarchyTraceType
/*    */   {
/* 40 */     BUILD_CACHE, 
/* 41 */     DRAW, 
/* 42 */     INVALIDATE, 
/* 43 */     INVALIDATE_CHILD, 
/* 44 */     INVALIDATE_CHILD_IN_PARENT, 
/* 45 */     ON_LAYOUT, 
/* 46 */     ON_MEASURE, 
/* 47 */     REQUEST_LAYOUT;
/*    */   }
/*    */ 
/*    */   @Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD})
/*    */   @Retention(RetentionPolicy.RUNTIME)
/*    */   public static @interface CapturedViewProperty
/*    */   {
/*    */     public abstract boolean retrieveReturn();
/*    */   }
/*    */ 
/*    */   @Target({java.lang.annotation.ElementType.TYPE})
/*    */   @Retention(RetentionPolicy.RUNTIME)
/*    */   public static @interface FlagToString
/*    */   {
/*    */     public abstract int mask();
/*    */ 
/*    */     public abstract int equals();
/*    */ 
/*    */     public abstract String name();
/*    */ 
/*    */     public abstract boolean outputIf();
/*    */   }
/*    */ 
/*    */   @Target({java.lang.annotation.ElementType.TYPE})
/*    */   @Retention(RetentionPolicy.RUNTIME)
/*    */   public static @interface IntToString
/*    */   {
/*    */     public abstract int from();
/*    */ 
/*    */     public abstract String to();
/*    */   }
/*    */ 
/*    */   @Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD})
/*    */   @Retention(RetentionPolicy.RUNTIME)
/*    */   public static @interface ExportedProperty
/*    */   {
/*    */     public abstract boolean resolveId();
/*    */ 
/*    */     public abstract ViewDebug.IntToString[] mapping();
/*    */ 
/*    */     public abstract ViewDebug.IntToString[] indexMapping();
/*    */ 
/*    */     public abstract ViewDebug.FlagToString[] flagMapping();
/*    */ 
/*    */     public abstract boolean deepExport();
/*    */ 
/*    */     public abstract String prefix();
/*    */ 
/*    */     public abstract String category();
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.view.ViewDebug
 * JD-Core Version:    0.6.0
 */