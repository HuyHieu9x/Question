package entity;

import java.util.List;

@FunctionalInterface
public interface IListLanguge {
    List<Question> listLanguageFilter(Interviewee interviewee);
}

