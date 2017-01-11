package util;

import java.io.*;
import java.util.ArrayList;

public class Authentication {

    public boolean login(String login, String password) throws Exception {
        File file = new File("D:\\addressbook/clients.dat");
        ArrayList<Contact> contacts = null;

        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                contacts = (ArrayList<Contact>) ois.readObject();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            for (Contact u : contacts) {
                if (u.getPassword().equals(password) && u.getEmail().equals(login)) {
                    return true;
                }
            }
        } else {
            return false;
        }
        return false;
    }
}
