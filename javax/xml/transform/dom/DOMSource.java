/*    */ package javax.xml.transform.dom;
/*    */ 
/*    */ import javax.xml.transform.Source;
/*    */ import org.w3c.dom.Node;
/*    */ 
/*    */ public class DOMSource
/*    */   implements Source
/*    */ {
/*    */   public static final String FEATURE = "http://javax.xml.transform.dom.DOMSource/feature";
/*    */ 
/*    */   public DOMSource()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public DOMSource(Node n) { throw new RuntimeException("Stub!"); } 
/*  7 */   public DOMSource(Node node, String systemID) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void setNode(Node node) { throw new RuntimeException("Stub!"); } 
/*  9 */   public Node getNode() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void setSystemId(String systemID) { throw new RuntimeException("Stub!"); } 
/* 11 */   public String getSystemId() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.xml.transform.dom.DOMSource
 * JD-Core Version:    0.6.0
 */