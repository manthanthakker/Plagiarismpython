/**
 * This interface represents a single result comparing two students for a single homework.
 */
public interface Result {

  /**
   * Export the results to PDF.
   */
  void export();

  /**
   * View Result
   */
  Result getResult();
}
