/*   */ package java.util.prefs;
/*   */ 
/*   */ import java.io.Serializable;
/*   */ import java.util.EventObject;
/*   */ 
/*   */ public class NodeChangeEvent extends EventObject
/*   */   implements Serializable
/*   */ {
/*   */   public NodeChangeEvent(Preferences p, Preferences c)
/*   */   {
/* 6 */     super((Object)null); throw new RuntimeException("Stub!"); } 
/* 7 */   public Preferences getParent() { throw new RuntimeException("Stub!"); } 
/* 8 */   public Preferences getChild() { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.prefs.NodeChangeEvent
 * JD-Core Version:    0.6.0
 */