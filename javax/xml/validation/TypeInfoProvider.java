/*   */ package javax.xml.validation;
/*   */ 
/*   */ import org.w3c.dom.TypeInfo;
/*   */ 
/*   */ public abstract class TypeInfoProvider
/*   */ {
/*   */   protected TypeInfoProvider()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract TypeInfo getElementTypeInfo();
/*   */ 
/*   */   public abstract TypeInfo getAttributeTypeInfo(int paramInt);
/*   */ 
/*   */   public abstract boolean isIdAttribute(int paramInt);
/*   */ 
/*   */   public abstract boolean isSpecified(int paramInt);
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.xml.validation.TypeInfoProvider
 * JD-Core Version:    0.6.0
 */