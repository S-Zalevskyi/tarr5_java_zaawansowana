package anonymousClasses;

public class Main {

    public static void main(String[] args) {
        Object object = new EventController() {
            @Override
            public void printEvent() {
                System.out.println(" -- nowe wydarzenie -- ");
                EventController.formattedEventDate();
            }
        };
        ((EventController)object).printEvent();

    }
}
