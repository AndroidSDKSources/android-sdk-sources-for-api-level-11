/*    */ package android.renderscript;
/*    */ 
/*    */ public class Mesh extends BaseObj
/*    */ {
/*    */   Mesh()
/*    */   {
/* 50 */     throw new RuntimeException("Stub!"); } 
/* 51 */   public int getVertexAllocationCount() { throw new RuntimeException("Stub!"); } 
/* 52 */   public Allocation getVertexAllocation(int slot) { throw new RuntimeException("Stub!"); } 
/* 53 */   public int getPrimitiveCount() { throw new RuntimeException("Stub!"); } 
/* 54 */   public Allocation getIndexSetAllocation(int slot) { throw new RuntimeException("Stub!"); } 
/* 55 */   public Primitive getPrimitive(int slot) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class TriangleMeshBuilder
/*    */   {
/*    */     public static final int COLOR = 1;
/*    */     public static final int NORMAL = 2;
/*    */     public static final int TEXTURE_0 = 256;
/*    */ 
/*    */     public TriangleMeshBuilder(RenderScript rs, int vtxSize, int flags)
/*    */     {
/* 38 */       throw new RuntimeException("Stub!"); } 
/* 39 */     public TriangleMeshBuilder addVertex(float x, float y) { throw new RuntimeException("Stub!"); } 
/* 40 */     public TriangleMeshBuilder addVertex(float x, float y, float z) { throw new RuntimeException("Stub!"); } 
/* 41 */     public TriangleMeshBuilder setTexture(float s, float t) { throw new RuntimeException("Stub!"); } 
/* 42 */     public TriangleMeshBuilder setNormal(float x, float y, float z) { throw new RuntimeException("Stub!"); } 
/* 43 */     public TriangleMeshBuilder setColor(float r, float g, float b, float a) { throw new RuntimeException("Stub!"); } 
/* 44 */     public TriangleMeshBuilder addTriangle(int idx1, int idx2, int idx3) { throw new RuntimeException("Stub!"); } 
/* 45 */     public Mesh create(boolean uploadToBufferObject) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static class AllocationBuilder
/*    */   {
/*    */     public AllocationBuilder(RenderScript rs)
/*    */     {
/* 28 */       throw new RuntimeException("Stub!"); } 
/* 29 */     public int getCurrentVertexTypeIndex() { throw new RuntimeException("Stub!"); } 
/* 30 */     public int getCurrentIndexSetIndex() { throw new RuntimeException("Stub!"); } 
/* 31 */     public AllocationBuilder addVertexAllocation(Allocation a) throws IllegalStateException { throw new RuntimeException("Stub!"); } 
/* 32 */     public AllocationBuilder addIndexSetAllocation(Allocation a, Mesh.Primitive p) { throw new RuntimeException("Stub!"); } 
/* 33 */     public AllocationBuilder addIndexSetType(Mesh.Primitive p) { throw new RuntimeException("Stub!"); } 
/* 34 */     public Mesh create() { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static class Builder
/*    */   {
/*    */     public Builder(RenderScript rs, int usage)
/*    */     {
/* 16 */       throw new RuntimeException("Stub!"); } 
/* 17 */     public int getCurrentVertexTypeIndex() { throw new RuntimeException("Stub!"); } 
/* 18 */     public int getCurrentIndexSetIndex() { throw new RuntimeException("Stub!"); } 
/* 19 */     public Builder addVertexType(Type t) throws IllegalStateException { throw new RuntimeException("Stub!"); } 
/* 20 */     public Builder addVertexType(Element e, int size) throws IllegalStateException { throw new RuntimeException("Stub!"); } 
/* 21 */     public Builder addIndexSetType(Type t, Mesh.Primitive p) { throw new RuntimeException("Stub!"); } 
/* 22 */     public Builder addIndexSetType(Mesh.Primitive p) { throw new RuntimeException("Stub!"); } 
/* 23 */     public Builder addIndexSetType(Element e, int size, Mesh.Primitive p) { throw new RuntimeException("Stub!"); } 
/* 24 */     public Mesh create() { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static enum Primitive
/*    */   {
/*  7 */     LINE, 
/*  8 */     LINE_STRIP, 
/*  9 */     POINT, 
/* 10 */     TRIANGLE, 
/* 11 */     TRIANGLE_FAN, 
/* 12 */     TRIANGLE_STRIP;
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.renderscript.Mesh
 * JD-Core Version:    0.6.0
 */