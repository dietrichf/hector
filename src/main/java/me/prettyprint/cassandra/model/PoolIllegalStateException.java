package me.prettyprint.cassandra.model;

/**
 * Happens when the pool has been closed, but new borrow request come to it.
 * @author Ran Tavory (rantav@gmail.com)
 *
 */
public class PoolIllegalStateException extends HectorException {

  private static final long serialVersionUID = -144302975594095361L;

  public PoolIllegalStateException(Throwable t) {
    super(t);
  }
}
