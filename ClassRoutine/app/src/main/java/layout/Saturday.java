package layout;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mishu.classroutine.CircleFillView;
import com.mishu.classroutine.R;

import java.util.Date;

public class Saturday extends Fragment {

    CircleFillView circleFill, circleFill2;
    public Saturday() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        circleFill = (CircleFillView) getView().findViewById(R.id.circleFillView);
        circleFill2 = (CircleFillView) getView().findViewById(R.id.circleFillView2);

        String hour = DateFormat.format("HH.MM", new Date()).toString().toUpperCase();
        Double classTime = Double.parseDouble(hour);

        timeFill(classTime);

        return inflater.inflate(R.layout.fragment_saturday, container, false);

    }

    private void timeFill(Double m) {
        Double f = m;
        if (f > 18.00 && f < 18.10){
            circleFill.setValue(1);
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
        }
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

}
