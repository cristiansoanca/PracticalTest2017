package practicaltest2017.eim.systems.cs.pub.ro.practicaltest2017.general;

/**
 * Created by Peste on 4/1/2018.
 */

public interface Constants {
    String LEFT_COUNT = "leftCount";
    String RIGHT_COUNT = "rightCount";

    String NUMBER_OF_CLICKS = "numberOfClicks";
    int SECONDARY_ACTIVITY_REQUEST_CODE = 1;

    String FIRST_NUMBER = "firstNumber";
    String SECOND_NUMBER = "secondNumber";

    String[] actionTypes = {
            "ro.pub.cs.systems.eim.practicaltest2017.arithmeticmean",
            "ro.pub.cs.systems.eim.practicaltest2017.geometricmean"
    };

    int NUMBER_OF_CLICKS_THRESHOLD = 5;
    int SERVICE_STOPPED = 0;
    int SERVICE_STARTED = 1;

    String PROCESSING_THREAD_TAG = "[Processing Thread]";
    String BROADCAST_RECEIVER_EXTRA = "message";
    String BROADCAST_RECEIVER_TAG = "[Message]";
}
