import java.util.Scanner;

public class MenuProgram {

    private String menu = "c - create \n" +
            "r - read \n" +
            "u - update \n" +
            "d - delete \n" +
            "exit - for finish program";


    public static User authorizationUser(User[] usersArr) {
        User user = null;
        String login;
        String pass;

        LoggerUser.i("", "Enter Data for Authorization");
        LoggerUser.i("", "Enter Login:");
        login = readConsoleValue();
        LoggerUser.i("", "Enter Password:");
        pass = readConsoleValue();
        user = Authorization.authorization(usersArr, login, pass);
        if (user == null) LoggerUser.w("", "WRONG Login or Pass ");
        return user;
    }

    public User[] menuAdmin(User[] usersArr) {

        LoggerUser.d(this.getClass().getName(), "Main User menu");
        LoggerUser.i(this.getClass().getName(), menu);

        return usersArr;
    }

    protected static String readConsoleValue() {
        String value;
        Scanner scanner = new Scanner(System.in);
        value = scanner.nextLine();
        return value;
    }

}
