package entity;

import java.util.List;

@FunctionalInterface
public interface IListLevel {
    List<Question> listLevelFilter(Level level,List<Question> listLanguageFilter);
}
