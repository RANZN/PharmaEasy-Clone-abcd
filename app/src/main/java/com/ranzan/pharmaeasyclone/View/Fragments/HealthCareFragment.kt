package com.ranzan.pharmaeasyclone.View.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ranzan.pharmaeasyclone.R

class HealthCareFragment : Fragment(R.layout.fragment_health_care) {


    companion object {


        fun newInstance() =
            HealthCareFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }
}