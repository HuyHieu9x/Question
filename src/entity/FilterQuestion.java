package entity;

import java.util.List;
import java.util.stream.Collectors;

public class FilterQuestion implements IListLevel,IListLanguge{
    @Override
    public List<Question> listLanguageFilter(Interviewee interviewee) {

        List<Question> listLanguageFilter = InterviewData.getListQuestion().stream()
                .filter(question -> question.getProgramLanguage().getName().equals(interviewee.getLanguage()))
                .collect(Collectors.toList());

        return listLanguageFilter;
    }

    @Override
    public List<Question> listLevelFilter(Level level, List<Question> listLanguageFilter) {
        List<Question> listLevelFilter = listLanguageFilter
                .stream()
                .filter(question -> question.getLevel().equals(level))
                .collect(Collectors.toList());

        return listLevelFilter;
    }

}
