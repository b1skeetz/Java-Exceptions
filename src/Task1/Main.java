package Exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логин");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();

        User checkedUser = getUserByLoginAndPassword(login, password);

        validateUser(checkedUser);

        System.out.println("Доступ предоставлен");
    }
    public static User[] getUsers(){
        User user1 = new User("jhon", "pass", "jhon@gmail.com", 24);
        User user2 = new User("david", "test", "david@gmail.com", 15);
        User user3 = new User("lucie", "querty", "lucie@gmail.com", 19);
        User user4 = new User("clare", "123456", "clare@gmail.com", 13);
        User user5 = new User("shon", "hello", "shon@gmail.com", 35);
        return new User[]{user1, user2, user3, user4, user5};
    }
    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException{
        User[] users = getUsers();
        for (User user : users) {
            if (user.getLogin().equals(login.trim()) && user.getPassword().equals(password.trim())) {
                return user;
            }
        }
        throw new UserNotFoundException("User not found");
    }
    public static void validateUser(User user) throws AccessDeniedException{
        if(user.getAge() < 18){
            throw new AccessDeniedException("You are too young");
        }
    }
}
