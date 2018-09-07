import java.util.Scanner;

public class MenuProgram {

    private String menuAdmin = "c - create \n" +
            "r - read \n" +
            "u - update \n" +
            "d - delete \n" +
            "exit - for finish program";

    private String menuUser = "Change fields \n" +
            "n - name \n" +
            "l - login.";

    private  String newNameCommand = "Enter new Name: ";

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

    public User[] menuUser(User[] usersArr, User user) {
        String command;
        String value = null;

        LoggerUser.i(this.getClass().getName(), menuUser);
        command = readConsoleValue();
        if (command.equals("n")){
            LoggerUser.i(this.getClass().getName(), newNameCommand);
            value = readConsoleValue();
            user.setName(value);
        }


        return usersArr;
    }

    public User[] menuAdmin(User[] usersArr) {

        LoggerUser.d(this.getClass().getName(), "Main User menuAdmin");
        LoggerUser.i(this.getClass().getName(), menuAdmin);

        return usersArr;
    }

    protected static String readConsoleValue() {
        String value;
        Scanner scanner = new Scanner(System.in);
        value = scanner.nextLine();
        return value;
    }

}
