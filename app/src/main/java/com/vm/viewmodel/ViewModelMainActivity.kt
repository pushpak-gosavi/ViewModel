package com.vm.viewmodel

import androidx.lifecycle.ViewModel

class ViewModelMainActivity:ViewModel() {
    var number=0
    fun addNumber(){
        number++
    }
}