/*   */ package java.util.prefs;
/*   */ 
/*   */ import java.io.Serializable;
/*   */ import java.util.EventObject;
/*   */ 
/*   */ public class PreferenceChangeEvent extends EventObject
/*   */   implements Serializable
/*   */ {
/*   */   public PreferenceChangeEvent(Preferences p, String k, String v)
/*   */   {
/* 6 */     super((Object)null); throw new RuntimeException("Stub!"); } 
/* 7 */   public String getKey() { throw new RuntimeException("Stub!"); } 
/* 8 */   public String getNewValue() { throw new RuntimeException("Stub!"); } 
/* 9 */   public Preferences getNode() { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.prefs.PreferenceChangeEvent
 * JD-Core Version:    0.6.0
 */