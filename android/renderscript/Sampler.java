/*    */ package android.renderscript;
/*    */ 
/*    */ public class Sampler extends BaseObj
/*    */ {
/*    */   Sampler()
/*    */   {
/* 24 */     throw new RuntimeException("Stub!"); } 
/* 25 */   public static Sampler CLAMP_NEAREST(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 26 */   public static Sampler CLAMP_LINEAR(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 27 */   public static Sampler CLAMP_LINEAR_MIP_LINEAR(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 28 */   public static Sampler WRAP_NEAREST(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 29 */   public static Sampler WRAP_LINEAR(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 30 */   public static Sampler WRAP_LINEAR_MIP_LINEAR(RenderScript rs) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class Builder
/*    */   {
/*    */     public Builder(RenderScript rs)
/*    */     {
/* 16 */       throw new RuntimeException("Stub!"); } 
/* 17 */     public void setMinification(Sampler.Value v) { throw new RuntimeException("Stub!"); } 
/* 18 */     public void setMagnification(Sampler.Value v) { throw new RuntimeException("Stub!"); } 
/* 19 */     public void setWrapS(Sampler.Value v) { throw new RuntimeException("Stub!"); } 
/* 20 */     public void setWrapT(Sampler.Value v) { throw new RuntimeException("Stub!"); } 
/* 21 */     public void setAnisotropy(float v) { throw new RuntimeException("Stub!"); } 
/* 22 */     public Sampler create() { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static enum Value
/*    */   {
/*  7 */     CLAMP, 
/*  8 */     LINEAR, 
/*  9 */     LINEAR_MIP_LINEAR, 
/* 10 */     LINEAR_MIP_NEAREST, 
/* 11 */     NEAREST, 
/* 12 */     WRAP;
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.renderscript.Sampler
 * JD-Core Version:    0.6.0
 */