package Phone;

public class Contacts {

    private String Name;

    private String PhoneNumber;

    public Contacts (String name, String phoneNumber){
        this.Name=name;
        this.PhoneNumber=phoneNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public static  Contacts createContact (String name, String phoneNumber){
        return new Contacts(name, phoneNumber);
    }
}
