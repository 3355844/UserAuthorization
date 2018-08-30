public class Authorization {

    public User authorization(User[] usersArr, String login, String pass) {
        User user = null;
        for (User user1 : usersArr) {
            if (user1 != null && user1.getLogin() == login && user1.getPass() == pass) {
                user = user1;
            }
        }
        return user;
    }

}
