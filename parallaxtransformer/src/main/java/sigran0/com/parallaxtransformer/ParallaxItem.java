package sigran0.com.parallaxtransformer;

/**
 * Created by jungsungwoo on 7/13/17.
 */

public class ParallaxItem {

    private static final float DEFAULT_SPEED = 0.3f;

    public static class SPEED {
        public static final float FASTEST = -3.0f;
        public static final float FAST = -2.0f;
        public static final float NORMAL = -1.0f;
        public static final float SLOW = -0.75f;
        public static final float SLOWER = -0.5f;
        public static final float SLOWEST = -0.25f;
        public static final float FIXED = 1.0f;
    }

    public static class DIRECTION {
        public static final int ONGOING = 1;
        public static final int REVERSE = -1;
    }

    private int mItemRes;

    private float mSpeed;
    private int mDirection;

    public ParallaxItem(int res) {
        this(res, DEFAULT_SPEED);
    }

    public ParallaxItem(int res, float speed){
        this(res, speed, DIRECTION.REVERSE);
    }

    public ParallaxItem(int res, float speed, int direction){

        mItemRes = res;
        mSpeed = speed;
        mDirection = direction;
    }

    public float getSpeed(){
        return mSpeed;
    }

    public void setSpeed(float speed){
        mSpeed = speed;
    }

    public int getItemResource(){
        return mItemRes;
    }

    public int getDirection(){
        return mDirection;
    }
}