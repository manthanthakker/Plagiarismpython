/**
 * This interface represents a User.
 */
public interface User {

    /**
     * Update the credentials of the user.
     *
     * @param name           the users name.
     * @param email          the users email address.
     * @param password       a given password to change.
     * @param verifyPassword given password to verify.
     */
    void updateUser(String name, String email, String password, String verifyPassword);

    /**
     * This method ends the current session and the user is logged out.
     */
    void logout();


}
