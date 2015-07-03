/*   */ package java.beans;
/*   */ 
/*   */ import java.util.EventListener;
/*   */ import java.util.EventListenerProxy;
/*   */ 
/*   */ public class PropertyChangeListenerProxy extends EventListenerProxy
/*   */   implements PropertyChangeListener
/*   */ {
/*   */   public PropertyChangeListenerProxy(String propertyName, PropertyChangeListener listener)
/*   */   {
/* 6 */     super((EventListener)null); throw new RuntimeException("Stub!"); } 
/* 7 */   public String getPropertyName() { throw new RuntimeException("Stub!"); } 
/* 8 */   public void propertyChange(PropertyChangeEvent event) { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.beans.PropertyChangeListenerProxy
 * JD-Core Version:    0.6.0
 */