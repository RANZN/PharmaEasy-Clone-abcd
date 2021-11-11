package com.ranzan.pharmaeasyclone.View.Fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.ranzan.pharmaeasyclone.Model.retrofit.MedicalItem
import com.ranzan.pharmaeasyclone.Model.retrofit.Network
import com.ranzan.pharmaeasyclone.Model.retrofit.Response
import com.ranzan.pharmaeasyclone.Model.retrofit.getAPI
import com.ranzan.pharmaeasyclone.R
import com.ranzan.pharmaeasyclone.View.MainActivity
import com.ranzan.pharmaeasyclone.ViewModel.Repo
import retrofit2.Call
import retrofit2.Callback


class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fetchApi()
    }

    fun fetchApi(){
        var list: List<MedicalItem?>?=null
        val fetchAPI = Network.getRetrofitInstance().create(getAPI::class.java)
        fetchAPI.getData().enqueue(object : Callback<Response> {
            override fun onResponse(call: Call<Response>, response: retrofit2.Response<Response>) {
                if (response.body() != null) {
                    list = response.body()!!.medical!!
                }
            }

            override fun onFailure(call: Call<Response>, t: Throwable) {
                list= mutableListOf()
            }

        })
    }
}