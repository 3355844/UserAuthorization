public class UserDAO {

    public User[] create(User[] usersArr, User user) {

        for (int i = 0; i < usersArr.length; i++) {
            if (usersArr[i] == null) {
                usersArr[i] = user;
                break;
            }
        }
        return usersArr;
    }

    public User read(User[] usersArr, String login) {

        for (int i = 0; i < usersArr.length; i++) {
            if (usersArr[i] != null && usersArr[i].getLogin().equals(login)) return usersArr[i];
        }
        return null;
    }

    public int read(User[] usersArr, int id) {

        for (int i = 0; i < usersArr.length; i++) {
            if (usersArr[i] != null && usersArr[i].getId() == id) return i;
        }
        return -1;
    }

    public User[] update(User[] usersArr, User user) {

        int index = read(usersArr, user.getId());
        if (index != -1) {
            usersArr[index] = user;
        }
        return usersArr;
    }

    public User [] delete(User[] usersArr, User user){
        int index = read(usersArr, user.getId());
        if (index != -1){
            usersArr[index] = null;
        }
        return usersArr;
    }

}
