package me.prettyprint.cassandra.model;

/**
 * Error while borrowing or returning object to the pool
 *
 * @author Ran Tavory (rantav@gmail.com)
 *
 */
public class HectorPoolException extends HectorException {

  private static final long serialVersionUID = 674846452472399010L;

  public HectorPoolException(String s){
    super(s);
  }
  
  public HectorPoolException(Throwable t){
    super(t);
  }
}
