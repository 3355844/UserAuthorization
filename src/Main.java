public class Main {
    public static void main(String[] args) {

//        READ about Class LOGGER (log4j tools)

        int lengthArr = 10;
        User[] usersArr = new User[lengthArr];
        Authorization authorization = new Authorization();
        User tmpUser;
        User tmpUserWrong;

        createUsers(usersArr);
        tmpUser =  authorization.authorization(usersArr, "user1", "pass1");
        tmpUserWrong =  authorization.authorization(usersArr, "user10", "pass10");
        System.out.println(tmpUser);
        System.out.println(tmpUserWrong);


//        printUsers(usersArr);


    }

    private static void createUsers(User[] usersArr) {
        for (int i = 0; i < usersArr.length; i++) {
            usersArr[i] = new User("user" + i, "pass" + i);
        }
    }

    private static void printUsers(User[] usersArr) {
        for (User user : usersArr) {
            System.out.println(user.toString());
        }
    }
}
