package com.ranzan.pharmaeasyclone.View.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ranzan.pharmaeasyclone.R

class LabTestsFragment : Fragment(R.layout.fragment_lab_tests) {


    companion object {

        fun newInstance() =
            LabTestsFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}