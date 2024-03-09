package replica;

public class ByzantineRegister implements Register {

    private static final float FAULTY_VALUE = Float.MAX_VALUE;

    private static final int FAULTY_TIMESTAMP = Integer.MAX_VALUE;

    @Override
    public int getTimestamp() {
        return FAULTY_TIMESTAMP;
    }

    @Override
    public float getValue() {
        return FAULTY_VALUE;
    }

    @Override
    public void setTimestamp(int timestamp) {
        // I decide my own timestamp :)
    }

    @Override
    public void setValue(float value) {
        // Uhm, I don't think so...
    }
}