import java.util.ArrayList;

public class AddressBook{

    private final ArrayList<BuddyInfo> buddies;

    public AddressBook(){
        this.buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        this.buddies.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        this.buddies.remove(buddy);
    }

    public String toString(){
        StringBuilder result = new StringBuilder();
        for(BuddyInfo buddy : this.buddies){
            result.append(buddy.toString()).append('\n');
        }
        return result.toString();
    }
    public static void main(String [] args){
        System.out.println("address book");

    }





}