/*    */ package android.renderscript;
/*    */ 
/*    */ public class Script extends BaseObj
/*    */ {
/*    */   Script()
/*    */   {
/* 21 */     throw new RuntimeException("Stub!"); } 
/* 22 */   protected void invoke(int slot) { throw new RuntimeException("Stub!"); } 
/* 23 */   protected void invoke(int slot, FieldPacker v) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void bindAllocation(Allocation va, int slot) { throw new RuntimeException("Stub!"); } 
/* 25 */   public void setVar(int index, float v) { throw new RuntimeException("Stub!"); } 
/* 26 */   public void setVar(int index, double v) { throw new RuntimeException("Stub!"); } 
/* 27 */   public void setVar(int index, int v) { throw new RuntimeException("Stub!"); } 
/* 28 */   public void setVar(int index, long v) { throw new RuntimeException("Stub!"); } 
/* 29 */   public void setVar(int index, boolean v) { throw new RuntimeException("Stub!"); } 
/* 30 */   public void setVar(int index, BaseObj o) { throw new RuntimeException("Stub!"); } 
/* 31 */   public void setVar(int index, FieldPacker v) { throw new RuntimeException("Stub!"); } 
/* 32 */   public void setTimeZone(String timeZone) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class FieldBase
/*    */   {
/*    */     protected Element mElement;
/*    */     protected Allocation mAllocation;
/*    */ 
/*    */     protected FieldBase()
/*    */     {
/* 11 */       throw new RuntimeException("Stub!"); } 
/* 12 */     protected void init(RenderScript rs, int dimx) { throw new RuntimeException("Stub!"); } 
/* 13 */     protected void init(RenderScript rs, int dimx, int usages) { throw new RuntimeException("Stub!"); } 
/* 14 */     public Element getElement() { throw new RuntimeException("Stub!"); } 
/* 15 */     public Type getType() { throw new RuntimeException("Stub!"); } 
/* 16 */     public Allocation getAllocation() { throw new RuntimeException("Stub!"); } 
/* 17 */     public void updateAllocation() { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static class Builder
/*    */   {
/*    */     Builder()
/*    */     {
/*  7 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.renderscript.Script
 * JD-Core Version:    0.6.0
 */