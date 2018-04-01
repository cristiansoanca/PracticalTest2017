package practicaltest2017.eim.systems.cs.pub.ro.practicaltest2017.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import practicaltest2017.eim.systems.cs.pub.ro.practicaltest2017.general.Constants;

public class PracticalTest2017Service extends Service {
    private ProcessingThread processingThread;

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        int firstNumber = intent.getIntExtra(Constants.FIRST_NUMBER, -1);
        int secondNumber = intent.getIntExtra(Constants.SECOND_NUMBER, -1);
        processingThread = new ProcessingThread(this, firstNumber, secondNumber);
        processingThread.start();

        return Service.START_REDELIVER_INTENT;
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onDestroy() {
        processingThread.stopThread();
    }
}
