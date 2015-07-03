/*    */ package android.renderscript;
/*    */ 
/*    */ public class ProgramFragmentFixedFunction extends ProgramFragment
/*    */ {
/*    */   ProgramFragmentFixedFunction()
/*    */   {
/* 27 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class Builder
/*    */   {
/*    */     public static final int MAX_TEXTURE = 2;
/*    */ 
/*    */     public Builder(RenderScript rs)
/*    */     {
/* 20 */       throw new RuntimeException("Stub!"); } 
/* 21 */     public Builder setTexture(EnvMode env, Format fmt, int slot) throws IllegalArgumentException { throw new RuntimeException("Stub!"); } 
/* 22 */     public Builder setPointSpriteTexCoordinateReplacement(boolean enable) { throw new RuntimeException("Stub!"); } 
/* 23 */     public Builder setVaryingColor(boolean enable) { throw new RuntimeException("Stub!"); } 
/* 24 */     public ProgramFragmentFixedFunction create() { throw new RuntimeException("Stub!");
/*    */     }
/*    */ 
/*    */     public static enum Format
/*    */     {
/* 15 */       ALPHA, 
/* 16 */       LUMINANCE_ALPHA, 
/* 17 */       RGB, 
/* 18 */       RGBA;
/*    */     }
/*    */ 
/*    */     public static enum EnvMode
/*    */     {
/*  9 */       DECAL, 
/* 10 */       MODULATE, 
/* 11 */       REPLACE;
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.renderscript.ProgramFragmentFixedFunction
 * JD-Core Version:    0.6.0
 */