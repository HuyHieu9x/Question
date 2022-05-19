package test;

import entity.*;

import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        FilterQuestion filter = new FilterQuestion();
        Interviewee interviewee = new Interviewee("Java","Mid Senior");

        switch (interviewee.getLevel()){
            case "Junior":
                filter.listLevelFilter(Level.JUNIOR,filter.listLanguageFilter(interviewee))
                        .stream()
                        .skip(0)
                        .limit(4)
                        .forEach(question -> System.out.println(question.getName() +" "+question.getLevel()));

                filter.listLevelFilter(Level.SENIOR,filter.listLanguageFilter(interviewee))
                        .stream()
                        .skip(0)
                        .limit(1)
                        .forEach(question -> System.out.println(question.getName() +" "+question.getLevel()));
                break;
            case "Mid Senior":
                filter.listLevelFilter(Level.JUNIOR,filter.listLanguageFilter(interviewee))
                        .stream()
                        .skip(0)
                        .limit(2)
                        .forEach(question -> System.out.println(question.getName() +" "+question.getLevel()));

                filter.listLevelFilter(Level.SENIOR,filter.listLanguageFilter(interviewee))
                        .stream()
                        .skip(0)
                        .limit(3)
                        .forEach(question -> System.out.println(question.getName() +" "+question.getLevel()));
                break;
            case "Senior":
                filter.listLevelFilter(Level.SENIOR,filter.listLanguageFilter(interviewee))
                        .stream()
                        .skip(0)
                        .limit(5)
                        .forEach(question -> System.out.println(question.getName() +" "+question.getLevel()));
                break;
        }
    }
}
