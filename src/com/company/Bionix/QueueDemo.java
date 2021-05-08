package com.company.Bionix;

import java.util.Queue;

public class QueueDemo<C> {

    public void matchingContactElement(Queue<Contact> collection, String textToCheck) {
        assert collection.peek() != null;
        if (collection.peek().name.contains(textToCheck) || collection.peek().phoneNumber.contains(textToCheck)) {
            System.out.println("You Win!!!!    First in List is : " + collection.poll() + "\n");
        } else
            System.out.println(textToCheck + ", is not first, First in this List is : " + collection.peek() + "\n");

    }

    public void matchingMessageElement(Queue<Message> collection, String textToCheck) {
        assert collection.peek() != null;
        if (collection.peek().phoneNumber.contains(textToCheck) || collection.peek().massageText.contains(textToCheck) || collection.peek().status.equals(textToCheck)) {
            System.out.println("You Win!!!!    First message in List is : " + collection.poll() + "\n");
        } else
            System.out.println(textToCheck + ", is not first, First in this List is : " + collection.peek() + "\n");

    }

    public void addNewContactIfPresentAndDeleteFoundFirst(Queue<Contact> collection, String textToCheck, String newPhoneNumber, String newName) {
        assert collection.peek() != null;
        if (collection.peek().name.contains(textToCheck) || collection.peek().phoneNumber.contains(textToCheck)) {
            collection.offer(new Contact(newPhoneNumber, newName));
            System.out.println("New contact is added\n");
            collection.poll();
        } else
            System.out.println(textToCheck + ", this element is not in the head, you cannot add new contact in this list \n");

    }
}