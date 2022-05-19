package entity;

import java.util.List;
import java.util.Scanner;

public class Interviewee{
    private String language;
    private String level;

    public Interviewee() {
    }

    public Interviewee(String language, String level) {
        this.language = language;
        this.level = level;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter language (Java , ReactJS) :" );
        language = sc.nextLine();
        System.out.println("Enter level :");
        level = sc.nextLine();
    }
}
