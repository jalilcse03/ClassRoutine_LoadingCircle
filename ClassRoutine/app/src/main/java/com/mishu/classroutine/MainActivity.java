package com.mishu.classroutine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    ImageButton btnFullRtn;
    TextView toDay, sub1, sub2, room1, room2,time1,time2;
    String today;
    int i = 1;
    CircleFillView circleFill, circleFill2;

    private enum days {SATURDAY, SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY}

    ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            System.out.print("ok");


        circleFill = (CircleFillView) findViewById(R.id.circleFillView);
        circleFill2 = (CircleFillView) findViewById(R.id.circleFillView2);
        String hour = DateFormat.format("HH.MM", new Date()).toString().toUpperCase();
        Double classTime = Double.parseDouble(hour);
        timeFill(classTime);
        String stMin = String.valueOf(classTime);
        Toast.makeText(MainActivity.this, stMin, Toast.LENGTH_LONG).show();



        initialize();
        routine(today);
    }

    private void routine(String today) {
        toDay.setText(today);
        try {
            days days = MainActivity.days.valueOf(today);
            switch (days) {
                case SATURDAY:
                    room1.setText(R.string.room602);
                    time1.setText("06:00pm");
                    sub1.setText(R.string.CAO);
                    room2.setText(R.string.room106);
                    time2.setText("07:30pm");
                    sub2.setText(R.string.NmrclMthd);
                    break;
                case SUNDAY:
                    room1.setText(R.string.room115);
                    time1.setText("06:00pm");
                    sub1.setText(R.string.CAO);
                    room2.setText(R.string.room102);
                    time2.setText("07:30pm");
                    sub2.setText(R.string.CNet);
                    break;
                case MONDAY:
                    room1.setText(R.string.room901);
                    time1.setText("06:00pm");
                    sub1.setText(R.string.DB);
                    room2.setText(R.string.room106);
                    time2.setText("07:30pm");
                    sub2.setText(R.string.NmrclMthd);
                    break;
                case TUESDAY:
                    room1.setText(R.string.room702);
                    time1.setText("06:00pm");
                    sub1.setText(R.string.CNet_L);
                    room2.setText(R.string.room702);
                    time2.setText("07:30pm");
                    sub2.setText(R.string.CNet_L);
                    break;
                case WEDNESDAY:
                    room1.setText(R.string.room102);
                    time1.setText("06:00pm");
                    sub1.setText(R.string.CNet);
                    room2.setText(R.string.room101);
                    time2.setText("07:30pm");
                    sub2.setText(R.string.DB);
                    break;
                case THURSDAY:
                    room1.setText(R.string.room601);
                    time1.setText("06:00pm");
                    sub1.setText(R.string.DB_L);
                    room2.setText(R.string.room601);
                    time2.setText("07:30pm");
                    sub2.setText(R.string.DB_L);
                    break;
                case FRIDAY:
                    room1.setText("MOSQUE");
                    time1.setText("DON'T THINK, GO NOW");
                    sub1.setText("NAMAZ");
                    room2.setText("MOSQUE");
                    time2.setText("YOU ARE LATE");
                    sub2.setText("NAMAZ");
                    break;

            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void initialize() {
        btnFullRtn = (ImageButton) findViewById(R.id.btnShowFull);
        toDay = (TextView) findViewById(R.id.txtViwDay);
        sub1 = (TextView) findViewById(R.id.txtViwSub1);
        sub2 = (TextView) findViewById(R.id.txtViwSub2);
        room1 = (TextView) findViewById(R.id.txtViwRoom1);
        room2 = (TextView) findViewById(R.id.txtViwRoom2);
        time1 = (TextView) findViewById(R.id.txtViwTime1);
        time2 = (TextView) findViewById(R.id.txtViwTime2);
        today = android.text.format.DateFormat.format("EEEE", new Date()).toString().toUpperCase();


        btnFullRtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] allDay = {"SATURDAY", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY"};
                switch (i) {
                    case 1:
                        routine(allDay[0]);
                        i = 2;
                        break;
                    case 2:
                        routine(allDay[1]);
                        i = 3;
                        break;
                    case 3:
                        routine(allDay[2]);
                        i = 4;
                        break;
                    case 4:
                        routine(allDay[3]);
                        i = 5;
                        break;
                    case 5:
                        routine(allDay[4]);
                        i = 6;
                        break;
                    case 6:
                        routine(allDay[5]);
                        i = 7;
                        break;
                    case 7:
                        routine(allDay[6]);
                        i = 1;
                        break;
                }
            }
        });
    }




    private void timeFill(Double m) {
        Double f = m;
        if (f > 18.00 && f < 18.10){
            circleFill.setValue(7);
        }else if (f > 18.10 && f < 18.20) {
            circleFill.setValue(15);
        } else if (f > 18.20 && f < 18.30) {
            circleFill.setValue(25);
        } else if (f > 18.30 && f <18.40 ) {
            circleFill.setValue(35);
        } else if (f > 18.40 && f <18.50 ) {
            circleFill.setValue(45);
        } else if (f > 18.50 && f < 18.59) {
            circleFill.setValue(55);
        } else if (f > 18.59 && f < 19.10) {
            circleFill.setValue(65);
        } else if (f > 19.10 && f < 19.20) {
            circleFill.setValue(85);
        } else if (f > 19.20 && f < 19.30) {
            circleFill.setValue(92);
        } else if (f > 19.30 && f < 19.40) {
            circleFill.setValue(100);
            circleFill2.setValue(1);
//========================complete of circle one===========================
        } else if (f > 19.40 && f < 19.50) {
            circleFill.setValue(100);
            circleFill2.setValue(15);
        } else if (f > 19.50 && f < 19.59) {
            circleFill.setValue(100);
            circleFill2.setValue(27);
        } else if (f > 19.59 && f < 20.10) {
            circleFill.setValue(100);
            circleFill2.setValue(38);
        } else if (f > 20.10 && f < 20.20) {
            circleFill.setValue(100);
            circleFill2.setValue(45);
        } else if (f > 20.20 && f < 20.30) {
            circleFill.setValue(100);
            circleFill2.setValue(50);
        } else if (f > 20.30 && f < 20.40) {
            circleFill.setValue(100);
            circleFill2.setValue(60);
        } else if (f > 20.40 && f < 20.50) {
            circleFill.setValue(100);
            circleFill2.setValue(70);
        } else if (f > 20.50 && f < 20.59) {
            circleFill.setValue(100);
            circleFill2.setValue(60);
        } else if (f > 20.59 && f < 21.00) {
            circleFill.setValue(100);
            circleFill2.setValue(90);
        } else if (f > 21.00) {
            circleFill.setValue(100);
            circleFill2.setValue(100);
        } else {
            circleFill.setValue(0);
            circleFill2.setValue(0);
        }
    }




    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
