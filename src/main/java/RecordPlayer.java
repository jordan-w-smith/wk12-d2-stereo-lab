public class RecordPlayer extends Component implements IPlay {

    int playSpeed;

    public RecordPlayer(String make, String model, int playSpeed){
        super(make,model);
        this.playSpeed = playSpeed;
    }

    public String play() {
        return "Record Playing";
    }

    public int getPlaySpeed() {
        return this.playSpeed;
    }


}
