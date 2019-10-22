package Phone;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList <Contacts> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contacts>();
    }

    //add new contact
    public boolean addNewContact (Contacts contacts){
        if (findContact(contacts.getName()) >=0){
            System.out.println("Contact already on file");
            return false;
        } else {
            myContacts.add(contacts);
            return true;
        }
    }

    //update contact
    public boolean updateContact (Contacts old, Contacts neww){
        int found = findContact(old);
        if (found<0){
            System.out.println(old.getName() + ", was not found");
            return false;
        }
        this.myContacts.set(found, neww);
        System.out.println(old.getName() + " has been replaced with " + neww.getName());
        return true;
    }

    //two overload methods, first of which will return index position
    private int findContact (Contacts contacts){
       return this.myContacts.indexOf(contacts);
    }

    //overload to find name
    private int findContact (String contactName){
        for (int i=0; i<this.myContacts.size(); i++){
            Contacts contacts = this.myContacts.get(i);
            if(contacts.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }
}