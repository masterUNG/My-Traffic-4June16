package appewtc.masterung.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Explicit หรือ การประกาศตัวแปร
    private ListView trafficListView;
    private Button aboutMeButton;
    private String urlYoutubeString = "https://youtu.be/AFmWqLIqDZA";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // นี่คือคำสั่ง หรือ Statement
        setContentView(R.layout.activity_main);

        // Bind Widget
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);

        //Controller button
        controllerButton();


    }   // Main Method หรือ เมธอดหลัก

    private void controllerButton() {

        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Sound Effect
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.cat);
                mediaPlayer.start();

                //Web View
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(urlYoutubeString));
                startActivity(intent);

            }   // onClick
        });

    }   // controllerButton

}   // Main Class นี่คือคลาสหลัก
