/*    */ package android.renderscript;
/*    */ 
/*    */ import android.graphics.Bitmap;
/*    */ 
/*    */ public class AllocationAdapter extends Allocation
/*    */ {
/*    */   AllocationAdapter()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public void copyFrom(BaseObj[] d) { throw new RuntimeException("Stub!"); } 
/*  7 */   public void copyFrom(int[] d) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void copyFrom(short[] d) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void copyFrom(byte[] d) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void copyFrom(float[] d) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void copyFrom(Bitmap b) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void copyTo(Bitmap b) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void subData(int xoff, FieldPacker fp) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void subElementData(int xoff, int component_number, FieldPacker fp) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void subData1D(int off, int count, int[] d) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void subData1D(int off, int count, short[] d) { throw new RuntimeException("Stub!"); } 
/* 17 */   public void subData1D(int off, int count, byte[] d) { throw new RuntimeException("Stub!"); } 
/* 18 */   public void subData1D(int off, int count, float[] d) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void subData2D(int xoff, int yoff, int w, int h, int[] d) { throw new RuntimeException("Stub!"); } 
/* 20 */   public void subData2D(int xoff, int yoff, int w, int h, float[] d) { throw new RuntimeException("Stub!"); } 
/* 21 */   public void readData(int[] d) { throw new RuntimeException("Stub!"); } 
/* 22 */   public void readData(float[] d) { throw new RuntimeException("Stub!"); } 
/* 23 */   public void setLOD(int lod) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void setFace(Type.CubemapFace cf) { throw new RuntimeException("Stub!"); } 
/* 25 */   public void setY(int y) { throw new RuntimeException("Stub!"); } 
/* 26 */   public void setZ(int z) { throw new RuntimeException("Stub!"); } 
/* 27 */   public static AllocationAdapter create2D(RenderScript rs, Allocation a) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.renderscript.AllocationAdapter
 * JD-Core Version:    0.6.0
 */