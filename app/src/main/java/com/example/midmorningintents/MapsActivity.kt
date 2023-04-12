package com.example.midmorningintents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.example.midmorningintents.databinding.ActivityMapsBinding

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        val Nairobi = LatLng(-1.2920659, 36.8219462)
        mMap.addMarker(MarkerOptions().position(Nairobi).title("Marker in Nairobi"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Nairobi))

        val Mombasa = LatLng(-4.0351767, 39.656719)
        mMap.addMarker(MarkerOptions().position(Mombasa).title("Marker in Mombasa"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Mombasa))


        val Kwale = LatLng(-4.1786483, 39.4399736)
        mMap.addMarker(MarkerOptions().position(Kwale).title("Marker in Kwale"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Kwale))

    }
}
