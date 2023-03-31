package day13;

import java.util.ArrayList;

public class Task1 {
        public static void main(String[] args) {
                User u1 = new User("Kira");
                User u2 = new User("Nastya");
                User u3 = new User("Olga");


                u1.sendMessage(u2, "HI, " + u1.getUsername() + "!" + " How are you?");
                u1.sendMessage(u2, "Any plans tonight?");
                u2.sendMessage(u1, "Hi there!");
                u2.sendMessage(u1, "I'm OK");
                u2.sendMessage(u1, "No plans,let's go out");

                u3.sendMessage(u1, "Hello," + u1.getUsername());
                u3.sendMessage(u1, "How are you");
                u3.sendMessage(u1, "Nice to meet you");

                u1.sendMessage(u3, "HI");
                u1.sendMessage(u3, "I'm great");
                u1.sendMessage(u3, "me too");

                MessageDatabase.showDialog(u1, u2);

                MessageDatabase.showDialog(u1, u3);
                MessageDatabase.showDialog(u1, u2);
        }
}


