package Task2;

public class Event {
    private String title;
    private int releaseYear;
    private int age;

    protected Event(String title, int releaseYear, int age){
        this.title = title;
        this.releaseYear = releaseYear;
        this.age = age;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return "Title = " + getTitle() + ", release year: " + getReleaseYear() + ", accessible age: " + getAge();
    }
}