package kakina.woranas.gamepaper;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private ImageView paperImageView, scissorImageView, rockimageView ,playImageView, androidImageView;
    private TextView showTextView;
    private String intNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

        //Bind vidget
        bindwidger();
        //paper Controller
        paperController();
        //Rock Controller
        rockController();
        //scissor Controller
        scissorController();
    } // main Metthod

    private void scissorController() {
        scissorImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                changePlay(3);
            }
        });
    }

    private void changePlay(int i) {

    }

    private void rockController() {
        rockimageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                changePlay(2);
            }
        });
    }

    private void paperController() {
    paperImageView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            ChangePlay(1);
        }
    });

    }//paperController

    private void ChangePlay(int intNumber) {
        Log.d("test","คำสั่งที่รับได้ = " + intNumber);
        int intSound = R.raw.mosquito;
        switch (intNumber) {
            case 1:
                playImageView.setImageResource(R.drawable.paper);
                break;
            case 2:
                playImageView.setImageResource(R.drawable.rock);
                break;
            case 3:
                paperImageView.setImageResource(R.drawable.scissors);
                break;
        }
        MediaPlayer imageMediaPlay = MediaPlayer.create(getBaseContext(), intSound);
        imageMediaPlay.start();
    }   //ChangePlay


    private void bindwidger() {
        paperImageView = (ImageView) findViewById(R.id.imvpaper);
        rockimageView = (ImageView) findViewById(R.id.imvrock);
        scissorImageView = (ImageView) findViewById(R.id.imvScissro);
        playImageView = (ImageView) findViewById(R.id.imageView5);
        androidImageView = (ImageView) findViewById(R.id.imvandroid);
        showTextView = (TextView) findViewById(R.id.txtshow);



    }
}   // Main Class นี้คือคลาสหลัก
