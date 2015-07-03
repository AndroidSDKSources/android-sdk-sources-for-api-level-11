package javax.xml.transform;

import java.util.Properties;

public abstract interface Templates
{
  public abstract Transformer newTransformer()
    throws TransformerConfigurationException;

  public abstract Properties getOutputProperties();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.xml.transform.Templates
 * JD-Core Version:    0.6.0
 */