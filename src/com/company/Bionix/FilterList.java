package com.company.Bionix;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterList {

    public static List<Message> filterMessageByContains(String text, List<Message> messages) {

        Predicate<String> filterText = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains(text);
            }
        };
        return filter1(messages, filterText);
    }

    public static List<Message> filter1(List<Message> messages, Predicate<String> predicate) {
        List<Message> result = new ArrayList<Message>();
        for (Message element : messages) {
            if (predicate.test(element.massageText) || predicate.test(element.phoneNumber)) {
                result.add(element);
            }
        }
        return result;
    }

    public static List<Contact> filterContactsByContains(String text1, List<Contact> contacts) {

        Predicate<String> filterText = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains(text1);
            }
        };
        return filter2(contacts, filterText);
    }

    public static List<Contact> filter2(List<Contact> contacts, Predicate<String> predicate) {
        List<Contact> result = new ArrayList<Contact>();
        for (Contact element : contacts) {
            if (predicate.test(element.name) || predicate.test(element.phoneNumber)) {
                result.add(element);
            }
        }
        return result;
    }
}