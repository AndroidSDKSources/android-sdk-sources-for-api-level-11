package javax.sql;

import java.util.EventListener;

public abstract interface StatementEventListener extends EventListener
{
  public abstract void statementClosed(StatementEvent paramStatementEvent);

  public abstract void statementErrorOccurred(StatementEvent paramStatementEvent);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.sql.StatementEventListener
 * JD-Core Version:    0.6.0
 */