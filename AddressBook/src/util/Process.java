package util;

import java.io.*;
import java.util.ArrayList;

public class Process implements Serializable {

    // registration
    public String registration(Contact contact, String password, String password2) {
        int email = 0;
        String returnswich = null;
        String fileName = "D:\\addressbook/clients.dat";
        File file = new File(fileName);
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
                if (u.getEmail().equals(contact.getEmail())) {
                    email = 1;
                }
            }
            if (email == 1) {
                return returnswich = "1";
            } else {
                if (password.equals(password2)) {
                    contacts.add(contact);
                    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
                        oos.writeObject(contacts);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return returnswich = "2";
                } else {
                    return returnswich = "3";
                }
            }
        } else {
            contacts = new ArrayList<>();
            if (password.equals(password2)) {
                contacts.add(contact);
                try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
                    oos.writeObject(contacts);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return returnswich = "2";
            } else {
                return returnswich = "3";
            }
        }
    }

    // addUser
    public Contact addUser(Contact contact, String filename) throws Exception {
        String fileName = "D:\\addressbook/" + filename + ".dat";
        File file = new File(fileName);
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
        } else {
            contacts = new ArrayList<>();
        }
        contacts.add(contact);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(contacts);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    // remove
    public void remove(String filename, int index) throws Exception {
        String fileName = "D:\\addressbook/" + filename + ".dat";
        File file = new File(fileName);
        ArrayList<Contact> contacts = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            contacts = (ArrayList<Contact>) ois.readObject();
            contacts.remove(index);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(contacts);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // edit
    public void edit(String filename, Contact contact, int index) throws Exception {
        String fileName = "D:\\addressbook/" + filename + ".dat";
        File file = new File(fileName);
        ArrayList<Contact> contacts = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            contacts = (ArrayList<Contact>) ois.readObject();
            contacts.set(index, contact);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(contacts);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // viweAll
    public ArrayList<Contact> viweAll(String filename) throws Exception {
        String fileName = "D:\\addressbook/" + filename + ".dat";
        File file = new File(fileName);
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
        } else {
            contacts = new ArrayList<>();
        }
        return contacts;
    }

    // Comparator
    public ArrayList<Contact> getCollection(String filename) throws Exception {
        String fileName = "D:\\addressbook/" + filename + ".dat";
        File file = new File(fileName);
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
        } else {
            contacts = new ArrayList<>();
        }
        return contacts;
    }
}
