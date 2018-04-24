import java.util.List;

/**
 * This interface represents a single homework assignment.
 */
public interface Homework {

  /**
   * Generate results for a homework.
   */
  void generateResults();

  /**
   * Returns the list of results for a homework.
   */
  List<Result> getResults();
}
