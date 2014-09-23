package com.arcticgraylingsystems.mywearapp;

/*

Simplest app to send a notification from a phone to a watch
code is run on phone, phone needs to be paired with watch
and notification will be sent from phone to watch
*/

import android.app.Activity;
import android.app.Notification;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;

public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        // create a notification to be displayed on watch
        Notification notification = new NotificationCompat.Builder(this)
                .setContentTitle("Notice")
                .setContentText("Hello World")
                .setSmallIcon(R.drawable.ic_launcher)
                .build();

        //Issue the the notification to the watch
        NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(this);
        notificationManagerCompat.notify(001, notification);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
