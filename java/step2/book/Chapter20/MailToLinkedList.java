package Chapter20;

import java.util.LinkedList;

class Address {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    Address(String name, String street, String city, String state, String code) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.code = code;
    }

    public String toString() {
        return this.name + "\n" + this.street + "\n" +
               this.city + " " + this.state + " " + this.code;
    }
}

public class MailToLinkedList {
    public static void main(String[] args) {
        LinkedList<Address> mailList = new LinkedList<Address>();

        mailList.add(new Address("J.W. West", "11 Oak Ave", "Urbana", "IL", "61801"));
        mailList.add(new Address("Ralph Baker", "1142 Maple Lane","Mahomet", "IL", "61853"));
        mailList.add(new Address("Tom Carlton", "867 Elm St","Champaign", "IL", "61820"));


        for (Address element : mailList) {
            System.out.println(element + "\n");
        }
        System.out.println();
    }
}