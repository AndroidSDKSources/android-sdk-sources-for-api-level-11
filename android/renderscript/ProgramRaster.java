/*    */ package android.renderscript;
/*    */ 
/*    */ public class ProgramRaster extends BaseObj
/*    */ {
/*    */   ProgramRaster()
/*    */   {
/* 18 */     throw new RuntimeException("Stub!"); } 
/* 19 */   public static ProgramRaster CULL_BACK(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 20 */   public static ProgramRaster CULL_FRONT(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 21 */   public static ProgramRaster CULL_NONE(RenderScript rs) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class Builder
/*    */   {
/*    */     public Builder(RenderScript rs)
/*    */     {
/* 13 */       throw new RuntimeException("Stub!"); } 
/* 14 */     public Builder setPointSpriteEnabled(boolean enable) { throw new RuntimeException("Stub!"); } 
/* 15 */     public Builder setCullMode(ProgramRaster.CullMode m) { throw new RuntimeException("Stub!"); } 
/* 16 */     public ProgramRaster create() { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static enum CullMode
/*    */   {
/*  7 */     BACK, 
/*  8 */     FRONT, 
/*  9 */     NONE;
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.renderscript.ProgramRaster
 * JD-Core Version:    0.6.0
 */