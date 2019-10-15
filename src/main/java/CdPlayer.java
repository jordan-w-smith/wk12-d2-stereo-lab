public class CdPlayer extends Component implements IPlay {

    String currentTrackName;

    public CdPlayer(String make, String model, String currentTrackName) {
        super(make, model);
        this.currentTrackName = currentTrackName;
    }

    public String play() {
        return "CD Playing";
    }

    public String getCurrentTrackName() {
        return this.currentTrackName;
    }

    public String skip() {
        return "track skipped";
    }


}
