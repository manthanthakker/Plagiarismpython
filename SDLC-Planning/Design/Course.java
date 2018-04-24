import java.util.List;

/**
 * This interface represents a single Course.
 */
public interface Course {

  /**
   * Add new homework to a course.
   */
  void addHomework();

  /**
   * Delete a homework from a course.
   */
  void deleteHomework();

  /**
   * Returns the list of homework's for a course.
   */
  List<Homework> getHomeworks();
}
