/*    */ package android.renderscript;
/*    */ 
/*    */ public class ProgramStore extends BaseObj
/*    */ {
/*    */   ProgramStore()
/*    */   {
/* 48 */     throw new RuntimeException("Stub!"); } 
/* 49 */   public static ProgramStore BLEND_NONE_DEPTH_TEST(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 50 */   public static ProgramStore BLEND_NONE_DEPTH_NONE(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 51 */   public static ProgramStore BLEND_ALPHA_DEPTH_TEST(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 52 */   public static ProgramStore BLEND_ALPHA_DEPTH_NONE(RenderScript rs) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class Builder
/*    */   {
/*    */     public Builder(RenderScript rs)
/*    */     {
/* 40 */       throw new RuntimeException("Stub!"); } 
/* 41 */     public Builder setDepthFunc(ProgramStore.DepthFunc func) { throw new RuntimeException("Stub!"); } 
/* 42 */     public Builder setDepthMaskEnabled(boolean enable) { throw new RuntimeException("Stub!"); } 
/* 43 */     public Builder setColorMaskEnabled(boolean r, boolean g, boolean b, boolean a) { throw new RuntimeException("Stub!"); } 
/* 44 */     public Builder setBlendFunc(ProgramStore.BlendSrcFunc src, ProgramStore.BlendDstFunc dst) { throw new RuntimeException("Stub!"); } 
/* 45 */     public Builder setDitherEnabled(boolean enable) { throw new RuntimeException("Stub!"); } 
/* 46 */     public ProgramStore create() { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static enum BlendDstFunc
/*    */   {
/* 29 */     DST_ALPHA, 
/* 30 */     ONE, 
/* 31 */     ONE_MINUS_DST_ALPHA, 
/* 32 */     ONE_MINUS_SRC_ALPHA, 
/* 33 */     ONE_MINUS_SRC_COLOR, 
/* 34 */     SRC_ALPHA, 
/* 35 */     SRC_COLOR, 
/* 36 */     ZERO;
/*    */   }
/*    */ 
/*    */   public static enum BlendSrcFunc
/*    */   {
/* 17 */     DST_ALPHA, 
/* 18 */     DST_COLOR, 
/* 19 */     ONE, 
/* 20 */     ONE_MINUS_DST_ALPHA, 
/* 21 */     ONE_MINUS_DST_COLOR, 
/* 22 */     ONE_MINUS_SRC_ALPHA, 
/* 23 */     SRC_ALPHA, 
/* 24 */     SRC_ALPHA_SATURATE, 
/* 25 */     ZERO;
/*    */   }
/*    */ 
/*    */   public static enum DepthFunc
/*    */   {
/*  7 */     ALWAYS, 
/*  8 */     EQUAL, 
/*  9 */     GREATER, 
/* 10 */     GREATER_OR_EQUAL, 
/* 11 */     LESS, 
/* 12 */     LESS_OR_EQUAL, 
/* 13 */     NOT_EQUAL;
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.renderscript.ProgramStore
 * JD-Core Version:    0.6.0
 */