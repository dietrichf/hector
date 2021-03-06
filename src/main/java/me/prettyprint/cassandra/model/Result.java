package me.prettyprint.cassandra.model;

/**
 * 
 * @author Ran Tavory
 *
 * @param <T> The type of the result. May be for example Column of SuperColumn
 */
public class Result<T> extends ExecutionResult<T> {

  private final Query<T> query;
  
  /*package*/ Result(ExecutionResult<T> res, Query<T> query) {
    super(res.get(), res.isSuccess(), res.getExecutionTimeMicro());
    this.query = query;
  }

  /**
   * @return the query used to create this result
   */
  public Query<T> getQuery() {
    return query;
  }


  @Override
  public String toString() {
    return  "Result(" + get() + "," + toStringInternal() + "," + query + ")";
  }
}
