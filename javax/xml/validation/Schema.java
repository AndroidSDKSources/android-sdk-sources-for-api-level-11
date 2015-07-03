/*   */ package javax.xml.validation;
/*   */ 
/*   */ public abstract class Schema
/*   */ {
/*   */   protected Schema()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract Validator newValidator();
/*   */ 
/*   */   public abstract ValidatorHandler newValidatorHandler();
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.xml.validation.Schema
 * JD-Core Version:    0.6.0
 */