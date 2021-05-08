package com.company.Bionix;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws NullPointerException {
        new Main().run();
    }

    public void run() {

        List<CallLog> callLogs = Arrays.asList(
                new CallLog("+380985869432", 0, 10, CallLog.Status.Incoming),
                new CallLog("+380985869432", 0, 0, CallLog.Status.Missed),
                new CallLog("+380985869432", 0, 36, CallLog.Status.Outgoing),
                new CallLog("+380987676788", 0, 232, CallLog.Status.Incoming),
                new CallLog("+380578788888", 0, 3, CallLog.Status.Outgoing),
                new CallLog("+380668866888", 0, 46, CallLog.Status.Incoming),
                new CallLog("+380668866888", 0, 46, CallLog.Status.Incoming),
                new CallLog("+380668866888", 0, 46, CallLog.Status.Incoming),
                new CallLog("+380668866888", 0, 46, CallLog.Status.Incoming),
                new CallLog("+380668866888", 0, 46, CallLog.Status.Incoming),
                new CallLog("+380657878895", 0, 345, CallLog.Status.Incoming),
                new CallLog("+380987676788", 0, 45, CallLog.Status.Incoming),
                new CallLog("+380568787876", 0, 370, CallLog.Status.Missed),
                new CallLog("+380657889885", 0, 212, CallLog.Status.Outgoing),
                new CallLog("+380858785656", 0, 3, CallLog.Status.Incoming),
                new CallLog("+380987676788", 0, 34, CallLog.Status.Incoming),
                new CallLog("+08005675675676", 0, 45, CallLog.Status.Outgoing),
                new CallLog("+380987676788", 0, 234, CallLog.Status.Outgoing),
                new CallLog("+380978654675", 0, 166, CallLog.Status.Incoming));


        System.out.println("................................First variant to transform..........................................");
        CallLog[] callLogsInArray = new CallLog[19];
        callLogsInArray[0] = new CallLog("+380985869432", 0, 10, CallLog.Status.Incoming);
        callLogsInArray[1] = new CallLog("+380985869432", 0, 0, CallLog.Status.Missed);
        callLogsInArray[2] = new CallLog("+380985869432", 0, 36, CallLog.Status.Outgoing);
        callLogsInArray[3] = new CallLog("+380987676788", 0, 232, CallLog.Status.Incoming);
        callLogsInArray[4] = new CallLog("+380578788888", 0, 3, CallLog.Status.Outgoing);
        callLogsInArray[5] = new CallLog("+380668866888", 0, 46, CallLog.Status.Incoming);
        callLogsInArray[6] = new CallLog("+380668866888", 0, 46, CallLog.Status.Incoming);
        callLogsInArray[7] = new CallLog("+380668866888", 0, 46, CallLog.Status.Incoming);
        callLogsInArray[8] = new CallLog("+380668866888", 0, 46, CallLog.Status.Incoming);
        callLogsInArray[9] = new CallLog("+380668866888", 0, 46, CallLog.Status.Incoming);
        callLogsInArray[10] = new CallLog("+380657878895", 0, 345, CallLog.Status.Incoming);
        callLogsInArray[11] = new CallLog("+380987676788", 0, 45, CallLog.Status.Incoming);
        callLogsInArray[12] = new CallLog("+380568787876", 0, 370, CallLog.Status.Missed);
        callLogsInArray[13] = new CallLog("+380657889885", 0, 212, CallLog.Status.Outgoing);
        callLogsInArray[14] = new CallLog("+380858785656", 0, 3, CallLog.Status.Incoming);
        callLogsInArray[15] = new CallLog("+380987676788", 0, 34, CallLog.Status.Incoming);
        callLogsInArray[16] = new CallLog("+08005675675676", 0, 45, CallLog.Status.Outgoing);
        callLogsInArray[17] = new CallLog("+380987676788", 0, 234, CallLog.Status.Outgoing);
        callLogsInArray[18] = new CallLog("+380978654675", 0, 166, CallLog.Status.Incoming);
        System.out.println("Test  :  " + callLogsInArray[1].phoneNumber + ", " + callLogsInArray[5].duration + "..........................................");

        List<Contact> contacts = Arrays.asList(
                new Contact("+380985869432", "John"),
                new Contact("+380987676788", "Anton"),
                new Contact("+380578788888", "Mark"),
                new Contact("+380668866888", "Ioan"),
                new Contact("+380657878895", "Rob"),
                new Contact("+380568787876", "Mihael"),
                new Contact("+380657889885", "Sandra"),
                new Contact("+380858785656", "Olly"),
                new Contact("+08005675675676", "Bob"),
                new Contact("+380978654675", "Peter"),
                new Contact("+380858785656", "Olly"),
                new Contact("+08005675675676", "Bob"),
                new Contact("+380978654675", "Peter"));

        System.out.println("................................Second variant to transform..........................................");
        Contact[] contactsInArray = contacts.toArray(contacts.toArray(new Contact[0]));
        for (Contact contact : contactsInArray) {
            System.out.println(contact);
        }
        System.out.println("................................Second + variant to transform..........................................");
        Object[] objects = contacts.toArray(contacts.toArray());
        for (Object object : objects) {
            System.out.println(object);
        }

        List<Message> messages = Arrays.asList(
                new Message("+380985869432", " \"there was a cat\"", Message.Status.Incoming),
                new Message("+380987676788", " \"there was a dog\"", Message.Status.Outgoing),
                new Message("+380578788888", " \"there was a big \"", Message.Status.Incoming),
                new Message("+380668866888", " \"there was a small cat\"", Message.Status.Incoming),
                new Message("+380657878895", " \"there was a big dog\"", Message.Status.Outgoing),
                new Message("+380858785656", " \"there was a sweet cat\"", Message.Status.Incoming),
                new Message("+380985869432", " \"there was a ugly dog\"", Message.Status.Incoming),
                new Message("+380985869432", " \"there was a fast cat\"", Message.Status.Incoming),
                new Message("+380657878895", " \"there was a big dog\"", Message.Status.Outgoing),
                new Message("+380858785656", " \"there was a sweet cat\"", Message.Status.Incoming),
                new Message("+380985869432", " \"there was a ugly dog\"", Message.Status.Incoming),
                new Message("+380985869432", " \"there was a fast cat\"", Message.Status.Incoming),
                new Message("+380985869432", " \"there was a slowly dog\"", Message.Status.Outgoing),
                new Message("+380985869432", " \"there was a slowly dog\"", Message.Status.Outgoing));

        System.out.println("................................Third variant to transform..........................................");
        Message[] messageArray = messages.stream().toArray(i -> new Message[i]);
        System.out.println(messageArray.length);
        for (Message message : messageArray) {
            System.out.println(message.massageText + "," + message.phoneNumber);
        }

        System.out.println("................................Some practice with .Collection.toArray(T[])..........................");
        var printArray = new TransformerCollectionInArray();
        printArray.transform(messages);

        System.out.println("................................Filter..........................");
        List<Message> filterResult = messages.stream()
                .filter(p -> p.phoneNumber.contains("+380985869432")).collect(Collectors.toList());
        System.out.println(filterResult);
        System.out.println("................................Filter. CallLogs.........................");
        List<CallLog> filterCallLogsResult = callLogs.stream()
                .filter(p -> p.phoneNumber.contains("+380985869432")).collect(Collectors.toList());
        filterCallLogsResult.forEach(System.out::println);

        System.out.println(".........................Filter (Predicate)............................");

        Collection<Message> filterMessageCollection = FilterList.filterMessageByContains("dog", messages);
        System.out.println("...IN MESSAGES...");
        filterMessageCollection.forEach(System.out::println);
        System.out.println();

        Collection<Contact> filterContactCollection = FilterList.filterContactsByContains("9432", contacts);
        System.out.println("...IN CONTACTS...");
        filterContactCollection.forEach(System.out::println);
        System.out.println();

        System.out.println("..........................QUEUE.................................");

        Queue<Contact> contactQueue = new LinkedList<>();
        contactQueue.add(new Contact("+3809879898493", "Fedor"));
        contactQueue.offer(new Contact("+380657878895", "Rob"));
        contactQueue.offer(new Contact("+380568787876", "Mihael"));
        contactQueue.offer(new Contact("+380657889885", "Sandra"));
        contactQueue.offer(new Contact("+380858785656", "Olly"));

        QueueDemo<Contact> toPrintFirst = new QueueDemo<>();
        toPrintFirst.matchingContactElement(contactQueue, "Fedor");
        System.out.println("...FIFO......Can be successfully used to replace the oldest member of the league with the youngest follower .........\n");
        toPrintFirst.addNewContactIfPresentAndDeleteFoundFirst(contactQueue, "Rob", "+3098765456789", "Boris");
        System.out.println("First in our list is : " + contactQueue.peek().name + ". Functions - " +
                "\'matchingContactElement and addNewContactIfPresentAndDeleteFoundFirst\' have deleted the first 2 contacts. ");

        Queue<Message> messageQueue = new LinkedList<>();
        messageQueue.add(new Message("+380578788888", " \"there was a big \"", Message.Status.Incoming));
        messageQueue.offer(new Message("+380668866888", " \"there was a small cat\"", Message.Status.Incoming));
        messageQueue.offer(new Message("+380657878895", " \"there was a big dog\"", Message.Status.Outgoing));
        messageQueue.offer(new Message("+380858785656", " \"there was a sweet cat\"", Message.Status.Incoming));
        messageQueue.offer(new Message("+380985869432", " \"there was a ugly dog\"", Message.Status.Incoming));
        messageQueue.offer(new Message("+380985869432", " \"there was a fast cat\"", Message.Status.Incoming));
        messageQueue.offer(new Message("+380657878895", " \"there was a big dog\"", Message.Status.Outgoing));
        messageQueue.offer(new Message("+380858785656", " \"there was a sweet cat\"", Message.Status.Incoming));
        messageQueue.offer(new Message("+380985869432", " \"there was a ugly dog\"", Message.Status.Incoming));
        messageQueue.offer(new Message("+380985869432", " \"there was a fast cat\"", Message.Status.Incoming));
        messageQueue.offer(new Message("+380985869432", " \"there was a slowly dog\"", Message.Status.Outgoing));
        QueueDemo<Message> toPrintFirstMassage = new QueueDemo<>();
        toPrintFirstMassage.matchingMessageElement(messageQueue, "08587856");


        System.out.println("...FIFO...LIFO...Deque .........\n");
        Deque<CallLog> callLogDeque = new LinkedList<>(callLogs);
//        callLogDeque.forEach(System.out::println);
        callLogDeque.addFirst(new CallLog("+3098794878574", 0, 234, CallLog.Status.Incoming));
        callLogDeque.addLast(new CallLog("+30987954334", 0, 543, CallLog.Status.Outgoing));
        System.out.println("The first element in callLogDeque is: " + callLogDeque.getFirst().toString() + "\n");
        if (callLogDeque.descendingIterator().next().equals(callLogDeque.getLast())) {
            System.out.println(" The last element in callLogDeque is: " + callLogDeque.descendingIterator().next() + "\n");
        } else System.out.println(" o-o-yoy");
        System.out.println("The size of the deque is: " + callLogDeque.size() + " callLogs, we added to the initial list " + (callLogDeque.size() - callLogs.size()) + " elements.");

    }
}