package homeworks.education.storage;

import homeworks.education.model.User;

public class UserStorage {

    private User[] users = new User[10];
    int size = 0;

    public void addUser(User user) {
        if (size == users.length) {
            extend();
        }
        users[size++] = user;
    }

    public User getUserByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (users[i].getEmail().equals(email)) {
                return users[i];
            }
        }
        return null;
    }

    public boolean usersFound() {
        return size != 0;
    }

    private void extend() {
        User[] temp = new User[users.length + 10];
        if (size >= 0) System.arraycopy(users, 0, temp, 0, size);
        users = temp;
    }
}
