package com.ranzan.pharmaeasyclone.ViewModel

import android.content.Context
import androidx.lifecycle.ViewModel
import com.ranzan.pharmaeasyclone.Model.retrofit.MedicalItem
import com.ranzan.pharmaeasyclone.Model.retrofit.Network
import com.ranzan.pharmaeasyclone.Model.retrofit.Response
import com.ranzan.pharmaeasyclone.Model.retrofit.getAPI
import retrofit2.Call
import retrofit2.Callback

class Repo(var context: Context) : ViewModel() {
//    fun fetchApi(): List<MedicalItem> {
//        var list: List<MedicalItem>?=null
//        val fetchAPI = Network.getRetrofitInstance().create(getAPI::class.java)
//        fetchAPI.getData().enqueue(object : Callback<Response> {
//            override fun onResponse(call: Call<Response>, response: retrofit2.Response<Response>) {
//                if (response.body() != null) {
//                    list = response.body()!!.medical
//                }
//            }
//
//            override fun onFailure(call: Call<Response>, t: Throwable) {
//                list= mutableListOf()
//            }
//
//        })
//        return list!!
//    }
}