/*    */ package javax.xml.transform.dom;
/*    */ 
/*    */ import javax.xml.transform.Result;
/*    */ import org.w3c.dom.Node;
/*    */ 
/*    */ public class DOMResult
/*    */   implements Result
/*    */ {
/*    */   public static final String FEATURE = "http://javax.xml.transform.dom.DOMResult/feature";
/*    */ 
/*    */   public DOMResult()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public DOMResult(Node node) { throw new RuntimeException("Stub!"); } 
/*  7 */   public DOMResult(Node node, String systemId) { throw new RuntimeException("Stub!"); } 
/*  8 */   public DOMResult(Node node, Node nextSibling) { throw new RuntimeException("Stub!"); } 
/*  9 */   public DOMResult(Node node, Node nextSibling, String systemId) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void setNode(Node node) { throw new RuntimeException("Stub!"); } 
/* 11 */   public Node getNode() { throw new RuntimeException("Stub!"); } 
/* 12 */   public void setNextSibling(Node nextSibling) { throw new RuntimeException("Stub!"); } 
/* 13 */   public Node getNextSibling() { throw new RuntimeException("Stub!"); } 
/* 14 */   public void setSystemId(String systemId) { throw new RuntimeException("Stub!"); } 
/* 15 */   public String getSystemId() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.xml.transform.dom.DOMResult
 * JD-Core Version:    0.6.0
 */