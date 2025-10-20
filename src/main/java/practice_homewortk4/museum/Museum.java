package practice_homewortk4.museum;

public class Museum {
    private Exhibit exhibit;

    protected void addExhibit(Exhibit exhibit) {
        this.exhibit = exhibit;
        System.out.println("Лог: экспонат добавлен");
    }
    protected void handleExhibit(){
        exhibit.handle();
    }
    protected void showInfo(){
        exhibit.info();
    }
}
