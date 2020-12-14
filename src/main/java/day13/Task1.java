package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Alex");
        User user2 = new User("Bob");
        User user3 = new User("Kelly");

        user1.sendMessage(user2, "Hi Bob");
        user1.sendMessage(user2, "how your doings?");

        user2.sendMessage(user1, "Hi man");
        user2.sendMessage(user1, "no much");
        user2.sendMessage(user1, "all good");

        user3.sendMessage(user1, "Hi Alex");
        user3.sendMessage(user1, "how are you?");
        user3.sendMessage(user1, "you here?");

        user1.sendMessage(user3, "Hi beauty");
        user1.sendMessage(user3, "I'm okay");
        user1.sendMessage(user3, "still waiting");

        user3.sendMessage(user1, "that's fine, gonna be soon");

        MessageDatabase.showDialog(user1, user3);
    }
}
