package Observer;

public class TvProgramSubscriber implements Subscriber {

    @Override
    public void update(Publisher context) {

        if (context.getMagazine().contains("TV")) {

            System.out.println("tv Subscriber received magazine");

        } else {
            System.out.println("Subscriber not interesting this magazine");
        }

    }
}
