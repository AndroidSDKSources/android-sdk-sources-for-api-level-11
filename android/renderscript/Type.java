/*    */ package android.renderscript;
/*    */ 
/*    */ public class Type extends BaseObj
/*    */ {
/*    */   Type()
/*    */   {
/* 23 */     throw new RuntimeException("Stub!"); } 
/* 24 */   public Element getElement() { throw new RuntimeException("Stub!"); } 
/* 25 */   public int getX() { throw new RuntimeException("Stub!"); } 
/* 26 */   public int getY() { throw new RuntimeException("Stub!"); } 
/* 27 */   public int getZ() { throw new RuntimeException("Stub!"); } 
/* 28 */   public boolean hasMipmaps() { throw new RuntimeException("Stub!"); } 
/* 29 */   public boolean hasFaces() { throw new RuntimeException("Stub!"); } 
/* 30 */   public int getCount() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class Builder
/*    */   {
/*    */     public Builder(RenderScript rs, Element e)
/*    */     {
/* 16 */       throw new RuntimeException("Stub!"); } 
/* 17 */     public Builder setX(int value) { throw new RuntimeException("Stub!"); } 
/* 18 */     public Builder setY(int value) { throw new RuntimeException("Stub!"); } 
/* 19 */     public Builder setMipmaps(boolean value) { throw new RuntimeException("Stub!"); } 
/* 20 */     public Builder setFaces(boolean value) { throw new RuntimeException("Stub!"); } 
/* 21 */     public Type create() { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static enum CubemapFace
/*    */   {
/*  7 */     NEGATIVE_X, 
/*  8 */     NEGATIVE_Y, 
/*  9 */     NEGATIVE_Z, 
/* 10 */     POSITVE_X, 
/* 11 */     POSITVE_Y, 
/* 12 */     POSITVE_Z;
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.renderscript.Type
 * JD-Core Version:    0.6.0
 */