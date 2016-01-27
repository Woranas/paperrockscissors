package kakina.woranas.gamepaper;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.Random;

public class MainActivity extends AppCompatActivity {


    //Explicit
    private ImageView paperImageView, rockImageView,
            scissorImageView, playImageViwe, androidImageView;
    private TextView showtextView;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Bind widget
        bindwidget();

        //Paper Controller
        paperController();
        //Rock Controller
        rockController();
        //ScissorController
        scissorController();
    }// Main Metthod

    private void scissorController() {
        scissorImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changePlay(3);
                myRandomPicture();
            }
        });
    }

    private void rockController() {
        rockImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                changePlay(2);
                myRandomPicture();
            }
        });
    }

    private void paperController() {

        paperImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int intNumber = 1;
                myRandomPicture();
                changePlay(intNumber);


            }
        });

    } // paperController
    private void myRandomPicture() {

        int intMyRandom = 0;
        Random objRandom = new Random();
        intMyRandom = objRandom.nextInt(3) + 1;
        Log.d("Ran", "intRandom==>" + intMyRandom);
        androidChange(intMyRandom);
    }//myRandomPicture

    private void androidChange(int intMyRandom) {
        int[] intSourceImage = new int[4];
        intSourceImage[0] = 0;
        intSourceImage[1] = R.drawable.paper;
        intSourceImage[2] = R.drawable.rock;
        intSourceImage[3] = R.drawable.scissors;

        androidImageView.setImageResource(intSourceImage[intMyRandom]);
    }//androidChange

    private void changePlay(int intNumber) {

        Log.d("test", "ค่าที่รับได้ = " + intNumber);
        int intSound = R.raw.phonton1;
        switch (intNumber) {
            case 1:
                playImageViwe.setImageResource(R.drawable.paper);
                intSound = R.raw.phonton1;
                break;
            case 2:
                playImageViwe.setImageResource(R.drawable.rock);
                intSound = R.raw.phonton1;
                break;
            case 3:
                playImageViwe.setImageResource(R.drawable.scissors);
                intSound = R.raw.phonton1;
                break;
        }// switch
        MediaPlayer imageMediaPlayer = MediaPlayer.create(getBaseContext(), intSound);
        imageMediaPlayer.start();
    }// changePlay


    private void bindwidget() {
        paperImageView = (ImageView) findViewById(R.id.imvpaper);
        rockImageView = (ImageView) findViewById(R.id.imvrock);
        scissorImageView = (ImageView) findViewById(R.id.imvScissro);
        playImageViwe = (ImageView) findViewById(R.id.imvPlayer);
        androidImageView = (ImageView) findViewById(R.id.imvandroid);
        showtextView = (TextView) findViewById(R.id.txtshow);


    }
} // Main Class นี่คือคลาสหลักก
