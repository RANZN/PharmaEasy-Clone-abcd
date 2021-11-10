package com.ranzan.pharmaeasyclone.View.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.ranzan.pharmaeasyclone.R

class AccountFragment : Fragment(R.layout.fragment_account) {


    companion object {
        fun newInstance() =
            AccountFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}