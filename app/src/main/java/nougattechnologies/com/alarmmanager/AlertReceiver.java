package nougattechnologies.com.alarmmanager;


import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;

public class AlertReceiver extends BroadcastReceiver {
//builder.setDefaults(Notification.DEFAULT_SOUND);
    @Override
    public void onReceive(Context context, Intent intent) {
        NotificationHelper notificationHelper = new NotificationHelper(context);
        NotificationCompat.Builder nb = notificationHelper.getChannelNotification();
        nb.setDefaults(Notification.DEFAULT_SOUND);
        
        notificationHelper.getManager().notify(1, nb.build());
    }
}
