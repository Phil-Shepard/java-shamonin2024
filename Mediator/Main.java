package Mediator;

public class Main {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User user1 = new ChatUser(chatRoom, "Иван");
        User user2 = new ChatUser(chatRoom, "Николай");
        User user3 = new ChatUser(chatRoom, "Филипп");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        user1.send("Привет всем!");
        user2.send("Привет, Николай!");
    }
}

