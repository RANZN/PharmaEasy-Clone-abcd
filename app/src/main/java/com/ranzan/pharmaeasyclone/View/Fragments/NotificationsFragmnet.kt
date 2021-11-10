package com.ranzan.pharmaeasyclone.View.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ranzan.pharmaeasyclone.R


class NotificationsFragmnet : Fragment(R.layout.fragment_notifications_fragmnet) {


    companion object {

        fun newInstance() =
            NotificationsFragmnet().apply {
                arguments = Bundle().apply {

                }
            }
    }
}