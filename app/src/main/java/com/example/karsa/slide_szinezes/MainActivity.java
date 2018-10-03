package com.example.karsa.slide_szinezes;

import android.graphics.ColorSpace;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.SeekBar.OnSeekBarChangeListener;

import static android.graphics.Color.rgb;

public class MainActivity extends AppCompatActivity {

    SeekBar Red_Seek_Bar;
    SeekBar Green_Seek_Bar;
    SeekBar Blue_Seek_Bar;

    TextView Red_TextView;
    TextView Green_TextView;
    TextView Blue_TextView;
    TextView Szin_Mutat_Text_View;
    private int piros ;
    private int zold ;
    private int kek;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Red_Seek_Bar=(SeekBar)findViewById(R.id.Red_Seek_Bar);
        Green_Seek_Bar=(SeekBar)findViewById(R.id.Green_Seek_Bar);
        Blue_Seek_Bar=(SeekBar)findViewById(R.id.Blue_Seek_Bar);
        Red_TextView=(TextView)findViewById(R.id.Red_TextView);
        Green_TextView=(TextView)findViewById(R.id.Green_TextView);
        Blue_TextView=(TextView)findViewById(R.id.Blue_TextView);
        Szin_Mutat_Text_View=(TextView)findViewById(R.id.Szin_Mutat_Text_View);

        Red_Seek_Bar.setMax(255);
        Green_Seek_Bar.setMax(255);
        Blue_Seek_Bar.setMax(255);

        piros=Red_Seek_Bar.getProgress();
        zold=Green_Seek_Bar.getProgress();
        kek=Blue_Seek_Bar.getProgress();
        Szin_Mutat_Text_View.setBackgroundColor(rgb(piros,zold,kek));
        Szin_Mutat_Text_View.setTextColor(rgb(255,255,255));
        Szin_Mutat_Text_View.setText("("+piros+","+zold+","+kek+")");
        Red_TextView.setText("Red: 0");
        Green_TextView.setText("Green: 0");
        Blue_TextView.setText("Blue: 0");
        Red_Seek_Bar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                piros=Red_Seek_Bar.getProgress();
                Szin_Mutat_Text_View.setBackgroundColor(rgb(piros,zold,kek));
                Szin_Mutat_Text_View.setText("("+piros+","+zold+","+kek+")");
                Red_TextView.setText("Red :"+piros);
                if (Blue_Seek_Bar.getProgress()>230 || Green_Seek_Bar.getProgress()>230 || Red_Seek_Bar.getProgress()>230) {
                    Szin_Mutat_Text_View.setTextColor(rgb(0, 0, 0));
                }else{
                    Szin_Mutat_Text_View.setTextColor(rgb(255,255,255));
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        Green_Seek_Bar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                zold=Green_Seek_Bar.getProgress();
                Szin_Mutat_Text_View.setBackgroundColor(rgb(piros,zold,kek));
                Szin_Mutat_Text_View.setText("("+piros+","+zold+","+kek+")");
                zold=Green_Seek_Bar.getProgress();
                Green_TextView.setText("Green :"+zold);
                if (Blue_Seek_Bar.getProgress()>230 || Green_Seek_Bar.getProgress()>230 || Red_Seek_Bar.getProgress()>230) {
                    Szin_Mutat_Text_View.setTextColor(rgb(0, 0, 0));
                }else{
                    Szin_Mutat_Text_View.setTextColor(rgb(255,255,255));
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        Blue_Seek_Bar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                kek=Blue_Seek_Bar.getProgress();
                Szin_Mutat_Text_View.setBackgroundColor(rgb(piros,zold,kek));
                Szin_Mutat_Text_View.setText("("+piros+","+zold+","+kek+")");
                kek=Blue_Seek_Bar.getProgress();
                Blue_TextView.setText("Blue :"+kek);
               if (Blue_Seek_Bar.getProgress()>230 || Green_Seek_Bar.getProgress()>230 || Red_Seek_Bar.getProgress()>230) {
                   Szin_Mutat_Text_View.setTextColor(rgb(0, 0, 0));
               }else{
                   Szin_Mutat_Text_View.setTextColor(rgb(255,255,255));
               }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


















    }
}
