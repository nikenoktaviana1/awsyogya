package com.example.awsyogya;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class srsFragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener  {
    private View view;
    private SwipeRefreshLayout SwipeRefresh;
    private TextView azimut, alltitude,diffuse,global,nett,reflective,dni,sunshine,battery, time;


    public srsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_srs, container, false);

        azimut = view.findViewById(R.id.azimut);
        alltitude = view.findViewById(R.id.alltitude);
        diffuse = view.findViewById(R.id.diffuse);
        global = view.findViewById(R.id.global);
        nett = view.findViewById(R.id.nett);
        reflective = view.findViewById(R.id.reflective);
        dni = view.findViewById(R.id.dni);
        sunshine = view.findViewById(R.id.sunshine);
        battery = view.findViewById(R.id.battery);
        time = view.findViewById(R.id.waktu_asrs);
        SwipeRefresh = view.findViewById(R.id.simpleSwipeRefreshLayout);
        SwipeRefresh.setOnRefreshListener(this);

//        if(main.dataAsrs != null){
            initData();
//        }else{
//            Toast.makeText(getActivity(), "Not Connected to Network", Toast.LENGTH_LONG).show();
//        }
        return view;
    }

    private void initData(){
        azimut.setText(main.dataAsrs.getAzimuth() + " ̊");
        alltitude.setText(main.dataAsrs.getAlltitude()+" ̊");
        diffuse.setText(main.dataAsrs.getDiffuse_rad()+"  W/m2");
        global.setText(main.dataAsrs.getGlobal_rad()+"  W/m2");
        nett.setText(main.dataAsrs.getNett_rad()+"  W/m2");
        reflective.setText(main.dataAsrs.getReflective_rad()+"  W/m2");
        dni.setText(main.dataAsrs.getDni()+" W/m2");
        sunshine.setText(main.dataAsrs.getSunshine()+"  minutes");
        battery.setText(main.dataAsrs.getBattery()+"  W/m2");
        time.setText(main.dataAsrs.getTanggal()+"  "+main.dataAsrs.getJam());
    }

    @Override
    public void onRefresh() {
        main.getApiAsrs(SwipeRefresh);
        initData();
    }
}
