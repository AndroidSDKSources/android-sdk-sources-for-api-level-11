/*    */ package java.beans;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public class PropertyChangeSupport
/*    */   implements Serializable
/*    */ {
/*    */   public PropertyChangeSupport(Object sourceBean)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public void firePropertyChange(String propertyName, Object oldValue, Object newValue) { throw new RuntimeException("Stub!"); } 
/*  7 */   public void fireIndexedPropertyChange(String propertyName, int index, Object oldValue, Object newValue) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void removePropertyChangeListener(String propertyName, PropertyChangeListener listener) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) { throw new RuntimeException("Stub!"); } 
/* 10 */   public PropertyChangeListener[] getPropertyChangeListeners(String propertyName) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void firePropertyChange(String propertyName, boolean oldValue, boolean newValue) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void fireIndexedPropertyChange(String propertyName, int index, boolean oldValue, boolean newValue) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void firePropertyChange(String propertyName, int oldValue, int newValue) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void fireIndexedPropertyChange(String propertyName, int index, int oldValue, int newValue) { throw new RuntimeException("Stub!"); } 
/* 15 */   public boolean hasListeners(String propertyName) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void removePropertyChangeListener(PropertyChangeListener listener) { throw new RuntimeException("Stub!"); } 
/* 17 */   public void addPropertyChangeListener(PropertyChangeListener listener) { throw new RuntimeException("Stub!"); } 
/* 18 */   public PropertyChangeListener[] getPropertyChangeListeners() { throw new RuntimeException("Stub!"); } 
/* 19 */   public void firePropertyChange(PropertyChangeEvent event) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.beans.PropertyChangeSupport
 * JD-Core Version:    0.6.0
 */