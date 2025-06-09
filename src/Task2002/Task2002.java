package Task2002;

import java.util.*;

public class Task2002 {

    public static void main(String[] args) {
        Database database = new Database();
        Database.logged_users = new HashMap<>();
        Database.users = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<String[]> commandsList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String command = sc.nextLine();
            String[] commands = command.split(" ");
            commandsList.add(commands);
        }

        for(String[] commandLine: commandsList){
            switch (commandLine[0]) {
                case "register":
                    System.out.println(database.register(commandLine));
                    break;
                case "login":
                    System.out.println(database.login(commandLine));
                    break;
                case "logout":
                    System.out.println(database.logout(commandLine));
                    break;

            }
        }
    }

}

class Database {
    public static HashMap<String, Boolean> logged_users;
    public static HashMap<String, String> users;

    public String login(String[] commands)
    {
        boolean exists = users.containsKey(commands[1]);
        if (!exists) return "fail: no such user";
        boolean logged = logged_users.get(commands[1]);
        boolean correctPassword = users.get(commands[1]).equals(commands[2]);
        if (!correctPassword) return "fail: incorrect password";
        if (logged) return "fail: already logged in";
        logged_users.put(commands[1], true);
        return "success: user logged in";
    }

    public String register(String[] query)
    {
        boolean exists = users.containsKey(query[1]);
        if (exists) return "fail: user already exists";
        users.put(query[1], query[2]);
        logged_users.put(query[1], false);
        return "success: new user added";
    }

    public String logout(String[] query)
    {
        boolean exists = users.containsKey(query[1]);
        if (!exists) return "fail: no such user";
        if (!logged_users.get(query[1])) return "fail: already logged out";
        logged_users.put(query[1], false);
        return "success: user logged out";
    }

}