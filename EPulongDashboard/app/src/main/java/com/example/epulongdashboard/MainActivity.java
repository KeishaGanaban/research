package com.example.epulongdashboard;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {
    MapView mapView;
    boolean isPermissionGranted = true;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapView=findViewById(R.id.mapView);

        bottomNavigationView.setSelectedItemId(R.id.home);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){

                }
                return false;
            }
        });

        if(isPermissionGranted) {
            mapView.getMapAsync(this::onMapReady);
            mapView.onCreate(savedInstanceState);
        }
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        int height = 30;
        int width = 30;
        int height2 = 40;
        int width2 = 40;
        Bitmap b = BitmapFactory.decodeResource(getResources(), R.drawable.touristspot);
        Bitmap touristspot = Bitmap.createScaledBitmap(b, width, height, false);
        BitmapDescriptor smallMarkerIcon = BitmapDescriptorFactory.fromBitmap(touristspot);

        Bitmap c = BitmapFactory.decodeResource(getResources(), R.drawable.station);
        Bitmap stations = Bitmap.createScaledBitmap(c, width, height, false);
        BitmapDescriptor smallMarkerIcon2 = BitmapDescriptorFactory.fromBitmap(stations);

        Bitmap d = BitmapFactory.decodeResource(getResources(), R.drawable.roadsign);
        Bitmap roadsign = Bitmap.createScaledBitmap(d, width, height, false);
        BitmapDescriptor smallMarkerIcon3 = BitmapDescriptorFactory.fromBitmap(roadsign);

        Bitmap e = BitmapFactory.decodeResource(getResources(), R.drawable.roadconstruction);
        Bitmap roadconstruction = Bitmap.createScaledBitmap(e, width, height, false);
        BitmapDescriptor smallMarkerIcon4 = BitmapDescriptorFactory.fromBitmap(roadconstruction);

        Bitmap f = BitmapFactory.decodeResource(getResources(), R.drawable.crimehotspot);
        Bitmap crimehotspot = Bitmap.createScaledBitmap(f, width2, height2, false);
        BitmapDescriptor smallMarkerIcon5 = BitmapDescriptorFactory.fromBitmap(crimehotspot);

        //tourist spot markers
        LatLng burnham = new LatLng(16.4124, 120.5930);
        LatLng mvod = new LatLng(16.4196, 120.6279);
        LatLng oloac = new LatLng(16.4126, 120.5986);
        LatLng wp = new LatLng(16.4157, 120.6172);
        LatLng bbp = new LatLng(16.4144, 120.6132);
        LatLng tav = new LatLng(16.4297, 120.5764);
        LatLng bcm = new LatLng(16.4152, 120.5955);
        LatLng gsc = new LatLng(16.4218, 120.6256);
        LatLng becm = new LatLng(16.4107, 120.5504);
        LatLng bc = new LatLng(16.4316, 120.5989);
        LatLng lh = new LatLng(16.3675, 120.6060);
        LatLng cjh = new LatLng(16.3970, 120.6114);
        LatLng bm = new LatLng(16.4070, 120.5984);
        LatLng tta = new LatLng(16.3984, 120.6173);
        LatLng mhaep = new LatLng(16.4101, 120.5798);
        LatLng sf = new LatLng(16.4584, 120.5868);
        LatLng pp = new LatLng(16.4037, 120.6056);
        googleMap.addMarker(new MarkerOptions().position(burnham).title("Burnham").icon(BitmapDescriptorFactory.fromBitmap(touristspot)));
        googleMap.addMarker(new MarkerOptions().position(mvod).title("Mines View Observation Deck").icon(BitmapDescriptorFactory.fromBitmap(touristspot)));
        googleMap.addMarker(new MarkerOptions().position(oloac).title("Our Lady of the Atonement Cathedrall").icon(BitmapDescriptorFactory.fromBitmap(touristspot)));
        googleMap.addMarker(new MarkerOptions().position(wp).title("Write Park").icon(BitmapDescriptorFactory.fromBitmap(touristspot)));
        googleMap.addMarker(new MarkerOptions().position(bbp).title("Baguio Botanical Garden").icon(BitmapDescriptorFactory.fromBitmap(touristspot)));
        googleMap.addMarker(new MarkerOptions().position(tav).title("Tam-awan Village").icon(BitmapDescriptorFactory.fromBitmap(touristspot)));
        googleMap.addMarker(new MarkerOptions().position(bcm).title("Baguio City Market").icon(BitmapDescriptorFactory.fromBitmap(touristspot)));
        googleMap.addMarker(new MarkerOptions().position(gsc).title("Good Shepherd Covent").icon(BitmapDescriptorFactory.fromBitmap(touristspot)));
        googleMap.addMarker(new MarkerOptions().position(becm).title("BenCam Museum").icon(BitmapDescriptorFactory.fromBitmap(touristspot)));
        googleMap.addMarker(new MarkerOptions().position(bc).title("Bell Church").icon(BitmapDescriptorFactory.fromBitmap(touristspot)));
        googleMap.addMarker(new MarkerOptions().position(lh).title("Lion Head").icon(BitmapDescriptorFactory.fromBitmap(touristspot)));
        googleMap.addMarker(new MarkerOptions().position(cjh).title("Camp John Hay").icon(BitmapDescriptorFactory.fromBitmap(touristspot)));
        googleMap.addMarker(new MarkerOptions().position(bm).title("Baguio Museum").icon(BitmapDescriptorFactory.fromBitmap(touristspot)));
        googleMap.addMarker(new MarkerOptions().position(mhaep).title("Mirador Heritage and Eco Park").icon(BitmapDescriptorFactory.fromBitmap(touristspot)));
        googleMap.addMarker(new MarkerOptions().position(tta).title("Tree Top Adventure").icon(BitmapDescriptorFactory.fromBitmap(touristspot)));
        googleMap.addMarker(new MarkerOptions().position(sf).title("Strawberry Farm").icon(BitmapDescriptorFactory.fromBitmap(touristspot)));
        googleMap.addMarker(new MarkerOptions().position(pp).title("Panagbenga Park").icon(BitmapDescriptorFactory.fromBitmap(touristspot)));

        //stations
        LatLng mvjt = new LatLng(16.4197, 120.6269);
        LatLng sljt = new LatLng(16.413961, 120.593468);
        LatLng qhjt = new LatLng( 16.4297,  120.5919);
        LatLng ltjt = new LatLng(16.4175,  120.5958);
        LatLng ljt = new LatLng(16.4127, 120.5960);
        LatLng pppjt = new LatLng(16.414818, 120.593544);
        LatLng qmjt = new LatLng(16.4129926, 120.5940941);
        LatLng ldhjt = new LatLng(16.4146153, 120.5942216);
        LatLng mcojt = new LatLng(16.4027837, 120.6024498);
        LatLng mvgjt = new LatLng(16.4212241, 120.6248027);
        LatLng tjt = new LatLng(16.4135, 120.5935);
        LatLng ijt = new LatLng(16.390106, 120.663294);
        LatLng gfjt = new LatLng(16.4229542, 120.5869487);
        LatLng tajt = new LatLng(16.41524396276654, 120.59359017672696);
        LatLng gsjt = new LatLng(16.39538751042838, 120.60488725439002);

        googleMap.addMarker(new MarkerOptions().position(mvjt).title("Mines View Jeepney Terminal").icon(BitmapDescriptorFactory.fromBitmap(stations)));
        googleMap.addMarker(new MarkerOptions().position(sljt).title("San Luis Jeepney Terminal").icon(BitmapDescriptorFactory.fromBitmap(stations)));
        googleMap.addMarker(new MarkerOptions().position(qhjt).title("Quirino Hill Jeepney Terminal").icon(BitmapDescriptorFactory.fromBitmap(stations)));
        googleMap.addMarker(new MarkerOptions().position(ltjt).title("La Trinidad Jeepney Terminal").icon(BitmapDescriptorFactory.fromBitmap(stations)));
        googleMap.addMarker(new MarkerOptions().position(ljt).title("Loakan Jeepney Terminal").icon(BitmapDescriptorFactory.fromBitmap(stations)));
        googleMap.addMarker(new MarkerOptions().position(pppjt).title("Pinsao Pilot Project Jeepney Terminal").icon(BitmapDescriptorFactory.fromBitmap(stations)));
        googleMap.addMarker(new MarkerOptions().position(qmjt).title("QM Jeepney Terminal").icon(BitmapDescriptorFactory.fromBitmap(stations)));
        googleMap.addMarker(new MarkerOptions().position(ldhjt).title("Lourdes Dominican Hill Jeepney Terminal").icon(BitmapDescriptorFactory.fromBitmap(stations)));
        googleMap.addMarker(new MarkerOptions().position(mcojt).title("Military Cut-off Jeepney Terminal").icon(BitmapDescriptorFactory.fromBitmap(stations)));
        googleMap.addMarker(new MarkerOptions().position(mvgjt).title("Mines View-Gibraltar Jeepney Terminal").icon(BitmapDescriptorFactory.fromBitmap(stations)));
        googleMap.addMarker(new MarkerOptions().position(tjt).title("Tuba Jeepney Terminal").icon(BitmapDescriptorFactory.fromBitmap(stations)));
        googleMap.addMarker(new MarkerOptions().position(ijt).title("Itogon Jeepney Terminal").icon(BitmapDescriptorFactory.fromBitmap(stations)));
        googleMap.addMarker(new MarkerOptions().position(gfjt).title("Guisad/Ferguson Jeepney Terminal").icon(BitmapDescriptorFactory.fromBitmap(stations)));
        googleMap.addMarker(new MarkerOptions().position(tajt).title("Jeepney Terminal to Tam-awan Village").icon(BitmapDescriptorFactory.fromBitmap(stations)));
        googleMap.addMarker(new MarkerOptions().position(gsjt).title("Gabriela Silang Jeepney Terminal").icon(BitmapDescriptorFactory.fromBitmap(stations)));

        //roadsigns
        LatLng rs1 = new LatLng(16.411106239992705, 120.59926356788239);
        LatLng rs2 = new LatLng(16.424596287861334, 120.59433102037994);
        LatLng rs3 = new LatLng(16.422842164316194, 120.59310676973452);
        LatLng rs4 = new LatLng(16.404736246061535, 120.59395253904624);
        LatLng rs5 = new LatLng(16.407214720845595, 120.60139389021816);

        googleMap.addMarker(new MarkerOptions().position(rs1).title("roadsign1").icon(BitmapDescriptorFactory.fromBitmap(roadsign)));
        googleMap.addMarker(new MarkerOptions().position(rs2).title("roadsign2").icon(BitmapDescriptorFactory.fromBitmap(roadsign)));
        googleMap.addMarker(new MarkerOptions().position(rs3).title("roadsign3").icon(BitmapDescriptorFactory.fromBitmap(roadsign)));
        googleMap.addMarker(new MarkerOptions().position(rs4).title("roadsign4").icon(BitmapDescriptorFactory.fromBitmap(roadsign)));
        googleMap.addMarker(new MarkerOptions().position(rs5).title("roadsign5").icon(BitmapDescriptorFactory.fromBitmap(roadsign)));

        //construction
        LatLng cs1 = new LatLng(16.37290963002403, 120.62915107235197);
        googleMap.addMarker(new MarkerOptions().position(cs1).title("construction site 1").icon(BitmapDescriptorFactory.fromBitmap(roadconstruction)));

        //crime hotspot
        LatLng ch1 = new LatLng(16.408409612919648, 120.59434084456761);
        LatLng ch2 = new LatLng(16.413602570531527, 120.59167254089834);
        LatLng ch3 = new LatLng(16.41142441487531, 120.5990414832262);
        LatLng ch4 = new LatLng(16.422510116900536, 120.55915854444366);
        LatLng ch5 = new LatLng(16.415276440545124, 120.59370545465428);
        LatLng ch6 = new LatLng(16.41753785264618, 120.59507684486633);
        LatLng ch7 = new LatLng(16.413477187733466, 120.5980205890463);
        LatLng ch8 = new LatLng(16.415869853529962, 120.59680696206233);
        LatLng ch9 = new LatLng(16.375371172393713, 120.61746108279517);
        LatLng ch10 = new LatLng(16.395204345800607, 120.58087314827795);

        googleMap.addMarker(new MarkerOptions().position(ch1).title("Crime Hotspot").icon(BitmapDescriptorFactory.fromBitmap(crimehotspot)));
        googleMap.addMarker(new MarkerOptions().position(ch2).title("Crime Hotspot").icon(BitmapDescriptorFactory.fromBitmap(crimehotspot)));
        googleMap.addMarker(new MarkerOptions().position(ch3).title("Crime Hotspot").icon(BitmapDescriptorFactory.fromBitmap(crimehotspot)));
        googleMap.addMarker(new MarkerOptions().position(ch4).title("Crime Hotspot").icon(BitmapDescriptorFactory.fromBitmap(crimehotspot)));
        googleMap.addMarker(new MarkerOptions().position(ch5).title("Crime Hotspot").icon(BitmapDescriptorFactory.fromBitmap(crimehotspot)));
        googleMap.addMarker(new MarkerOptions().position(ch6).title("Crime Hotspot").icon(BitmapDescriptorFactory.fromBitmap(crimehotspot)));
        googleMap.addMarker(new MarkerOptions().position(ch7).title("Crime Hotspot").icon(BitmapDescriptorFactory.fromBitmap(crimehotspot)));
        googleMap.addMarker(new MarkerOptions().position(ch8).title("Crime Hotspot").icon(BitmapDescriptorFactory.fromBitmap(crimehotspot)));
        googleMap.addMarker(new MarkerOptions().position(ch9).title("Crime Hotspot").icon(BitmapDescriptorFactory.fromBitmap(crimehotspot)));
        googleMap.addMarker(new MarkerOptions().position(ch10).title("Crime Hotspot").icon(BitmapDescriptorFactory.fromBitmap(crimehotspot)));

        //camera
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(burnham,17f));
    }


    @Override
    protected void onStart() {
        super.onStart();
        mapView.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mapView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mapView.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mapView.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        mapView.onSaveInstanceState(outState);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mapView.onLowMemory();
    }


}