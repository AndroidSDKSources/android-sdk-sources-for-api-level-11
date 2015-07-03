/*    */ package android.renderscript;
/*    */ 
/*    */ import android.content.res.Resources;
/*    */ 
/*    */ public class Program extends BaseObj
/*    */ {
/*    */   Program()
/*    */   {
/* 21 */     throw new RuntimeException("Stub!"); } 
/* 22 */   public void bindConstants(Allocation a, int slot) { throw new RuntimeException("Stub!"); } 
/* 23 */   public void bindTexture(Allocation va, int slot) throws IllegalArgumentException { throw new RuntimeException("Stub!"); } 
/* 24 */   public void bindSampler(Sampler vs, int slot) throws IllegalArgumentException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class BaseProgramBuilder
/*    */   {
/*    */     protected BaseProgramBuilder(RenderScript rs)
/*    */     {
/* 12 */       throw new RuntimeException("Stub!"); } 
/* 13 */     public BaseProgramBuilder setShader(String s) { throw new RuntimeException("Stub!"); } 
/* 14 */     public BaseProgramBuilder setShader(Resources resources, int resourceID) { throw new RuntimeException("Stub!"); } 
/* 15 */     public int getCurrentConstantIndex() { throw new RuntimeException("Stub!"); } 
/* 16 */     public int getCurrentTextureIndex() { throw new RuntimeException("Stub!"); } 
/* 17 */     public BaseProgramBuilder addConstant(Type t) throws IllegalStateException { throw new RuntimeException("Stub!"); } 
/* 18 */     public BaseProgramBuilder addTexture(Program.TextureType texType) throws IllegalArgumentException { throw new RuntimeException("Stub!"); } 
/* 19 */     protected void initProgram(Program p) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static enum TextureType
/*    */   {
/*  7 */     TEXTURE_2D, 
/*  8 */     TEXTURE_CUBE;
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.renderscript.Program
 * JD-Core Version:    0.6.0
 */