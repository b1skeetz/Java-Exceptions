package Task2;

public class Main {
    public static void main(String[] args) {
        for (Event event: getMovies()) {
            validEvent(event);
        }
        for (Event event: getTheatres()) {
            validEvent(event);
        }
        System.out.println("Все события корректны");
    }
    public static Movie[] getMovies() {
        return new Movie[]{
                new Movie("Начало", 2010, 16),
                new Movie(null, 2015, 6),
                new Movie("Джон Уик 4", 2023, 18),
                new Movie("Человек паук", 2005, 12),
                new Movie("Мстители", 2008, 12),
        };
    }
    public static Theatre[] getTheatres() {
        return new Theatre[]{
                new Theatre("Анна Каренина", 2017, 16),
                new Theatre("Щелкунчик", 2003, 6),
                new Theatre("Мастер и Маргарита", 20013, 18),
                new Theatre("Горе от ума", 2020, 14),
                new Theatre("Шекспир", 2022, 21),
        };
    }
    public static void validEvent(Event event){
        if(event.getAge() == 0 || event.getReleaseYear() == 0 || event.getTitle() == null){
            throw new RuntimeException("Событие некорректно! Убедитесь, что все поля заполнены");
        }
    }
}