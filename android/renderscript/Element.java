/*    */ package android.renderscript;
/*    */ 
/*    */ public class Element extends BaseObj
/*    */ {
/*    */   Element()
/*    */   {
/* 51 */     throw new RuntimeException("Stub!"); } 
/* 52 */   public boolean isComplex() { throw new RuntimeException("Stub!"); } 
/* 53 */   public static Element BOOLEAN(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 54 */   public static Element U8(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 55 */   public static Element I8(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 56 */   public static Element U16(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 57 */   public static Element I16(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 58 */   public static Element U32(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 59 */   public static Element I32(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 60 */   public static Element U64(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 61 */   public static Element I64(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 62 */   public static Element F32(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 63 */   public static Element F64(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 64 */   public static Element ELEMENT(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 65 */   public static Element TYPE(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 66 */   public static Element ALLOCATION(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 67 */   public static Element SAMPLER(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 68 */   public static Element SCRIPT(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 69 */   public static Element MESH(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 70 */   public static Element PROGRAM_FRAGMENT(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 71 */   public static Element PROGRAM_VERTEX(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 72 */   public static Element PROGRAM_RASTER(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 73 */   public static Element PROGRAM_STORE(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 74 */   public static Element A_8(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 75 */   public static Element RGB_565(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 76 */   public static Element RGB_888(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 77 */   public static Element RGBA_5551(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 78 */   public static Element RGBA_4444(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 79 */   public static Element RGBA_8888(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 80 */   public static Element F32_2(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 81 */   public static Element F32_3(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 82 */   public static Element F32_4(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 83 */   public static Element U8_4(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 84 */   public static Element MATRIX_4X4(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 85 */   public static Element MATRIX4X4(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 86 */   public static Element MATRIX_3X3(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 87 */   public static Element MATRIX_2X2(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 88 */   public static Element createVector(RenderScript rs, DataType dt, int size) { throw new RuntimeException("Stub!"); } 
/* 89 */   public static Element createPixel(RenderScript rs, DataType dt, DataKind dk) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class Builder
/*    */   {
/*    */     public Builder(RenderScript rs)
/*    */     {
/* 46 */       throw new RuntimeException("Stub!"); } 
/* 47 */     public Builder add(Element element, String name, int arraySize) { throw new RuntimeException("Stub!"); } 
/* 48 */     public Builder add(Element element, String name) { throw new RuntimeException("Stub!"); } 
/* 49 */     public Element create() { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static enum DataKind
/*    */   {
/* 37 */     PIXEL_A, 
/* 38 */     PIXEL_L, 
/* 39 */     PIXEL_LA, 
/* 40 */     PIXEL_RGB, 
/* 41 */     PIXEL_RGBA, 
/* 42 */     USER;
/*    */   }
/*    */ 
/*    */   public static enum DataType
/*    */   {
/*  7 */     BOOLEAN, 
/*  8 */     FLOAT_32, 
/*  9 */     FLOAT_64, 
/* 10 */     MATRIX_2X2, 
/* 11 */     MATRIX_3X3, 
/* 12 */     MATRIX_4X4, 
/* 13 */     RS_ALLOCATION, 
/* 14 */     RS_ELEMENT, 
/* 15 */     RS_MESH, 
/* 16 */     RS_PROGRAM_FRAGMENT, 
/* 17 */     RS_PROGRAM_RASTER, 
/* 18 */     RS_PROGRAM_STORE, 
/* 19 */     RS_PROGRAM_VERTEX, 
/* 20 */     RS_SAMPLER, 
/* 21 */     RS_SCRIPT, 
/* 22 */     RS_TYPE, 
/* 23 */     SIGNED_16, 
/* 24 */     SIGNED_32, 
/* 25 */     SIGNED_64, 
/* 26 */     SIGNED_8, 
/* 27 */     UNSIGNED_16, 
/* 28 */     UNSIGNED_32, 
/* 29 */     UNSIGNED_4_4_4_4, 
/* 30 */     UNSIGNED_5_5_5_1, 
/* 31 */     UNSIGNED_5_6_5, 
/* 32 */     UNSIGNED_64, 
/* 33 */     UNSIGNED_8;
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.renderscript.Element
 * JD-Core Version:    0.6.0
 */