package com.example.a10120127_fidho;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsFragment extends Fragment {

    private OnMapReadyCallback callback = new OnMapReadyCallback() {

        /**
         * Manipulates the map once available.
         * This callback is triggered when the map is ready to be used.
         * This is where we can add markers or lines, add listeners or move the camera.
         * In this case, we just add a marker near Sydney, Australia.
         * If Google Play services is not installed on the device, the user will be prompted to
         * install it inside the SupportMapFragment. This method will only be triggered once the
         * user has installed Google Play services and returned to the app.
         */
        @Override
        public void onMapReady(GoogleMap googleMap) {
            LatLng alamat = new LatLng(-6.888824084190158, 107.61938479209293);
            googleMap.addMarker(new MarkerOptions().position(alamat).title("Alamat saya"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(alamat));

            LatLng makan1 = new LatLng(-6.889670300328173, 107.61851894553878);
            googleMap.addMarker(new MarkerOptions().position(makan1).title("Tempat favorit 1"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(makan1));

            LatLng makan2 = new LatLng(-6.888944494481753, 107.61804727813161);
            googleMap.addMarker(new MarkerOptions().position(makan2).title("Tempat favorit 2"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(makan2));

            LatLng makan3 = new LatLng(-6.889429480076967, 107.61756213453707);
            googleMap.addMarker(new MarkerOptions().position(makan3).title("Tempat favorit 3"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(makan3));

            LatLng makan4 = new LatLng(-6.888954528671497, 107.61802369476243);
            googleMap.addMarker(new MarkerOptions().position(makan4).title("Tempat favorit 4"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(makan4));

            LatLng makan5 = new LatLng(-6.888874255147523, 107.61841787393298);
            googleMap.addMarker(new MarkerOptions().position(makan5).title("Tempat favorit 5"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(makan5));

        }
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_maps, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment mapFragment =
                (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        if (mapFragment != null) {
            mapFragment.getMapAsync(callback);
        }
    }
}