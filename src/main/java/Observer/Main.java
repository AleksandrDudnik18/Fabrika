package Observer;

public class Main {

    public static void main(String[] args) {

        Publisher publisher = new Publisher();
        TvProgramSubscriber tvProgramSubscriber = new TvProgramSubscriber();

        publisher.subscribe(tvProgramSubscriber);
        publisher.receivedNewMagazine("TV program for week");


    }



}
