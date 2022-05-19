package entity;

import java.util.ArrayList;
import java.util.List;

public class InterviewData {
    private static List<Question> lstQuestions = new ArrayList<Question>();

    public static List<Question> getListQuestion() {
        if (lstQuestions.size() == 0) {
            addQuestion();
        }
        return lstQuestions;
    }

    static ProgramLanguage java = new ProgramLanguage("L01","Java");
    static ProgramLanguage reactJS = new ProgramLanguage("L02","ReactJS");

    private static void addQuestion(){
       lstQuestions.add(new Question("J01","Cac dac tinh OOP",Level.JUNIOR,java));
       lstQuestions.add(new Question("J02","Private variable la gi",Level.JUNIOR,java));
       lstQuestions.add(new Question("J03","Neu diem khac nhau giua List va Set",Level.JUNIOR,java));
       lstQuestions.add(new Question("J04","Overload va Override",Level.JUNIOR,java));
       lstQuestions.add(new Question("J05","TInh ke thua",Level.JUNIOR,java));
       lstQuestions.add(new Question("J06","Neu diem khac nhau giua List va Set",Level.SENIOR,java));
       lstQuestions.add(new Question("J07","Tinh da hinh",Level.SENIOR,java));
       lstQuestions.add(new Question("J08","Tinh bao dong",Level.SENIOR,java));
       lstQuestions.add(new Question("J09","Tinh da hinh",Level.SENIOR,java));
       lstQuestions.add(new Question("J010","Interface",Level.SENIOR,java));

       lstQuestions.add(new Question("R01","Chi ra nhung diem moi cua ES6",Level.JUNIOR,reactJS));
       lstQuestions.add(new Question("R02","Liet ke ra cac component life cycle",Level.JUNIOR,reactJS));
       lstQuestions.add(new Question("R03","Neu diem khac nhau giua List va Set reactJS",Level.JUNIOR,reactJS));
       lstQuestions.add(new Question("R04","Overload va Override reactJS",Level.JUNIOR,reactJS));
       lstQuestions.add(new Question("R05","TInh ke thua reactJS",Level.JUNIOR,reactJS));
       lstQuestions.add(new Question("R06","Neu diem khac nhau reactJS",Level.SENIOR,reactJS));
       lstQuestions.add(new Question("R07","reactJS 07",Level.SENIOR,reactJS));
       lstQuestions.add(new Question("R08","reactJS 08",Level.SENIOR,reactJS));
       lstQuestions.add(new Question("R09","reactJS 09",Level.SENIOR,reactJS));
       lstQuestions.add(new Question("R010","reactJS 10",Level.SENIOR,reactJS));
    }
}
