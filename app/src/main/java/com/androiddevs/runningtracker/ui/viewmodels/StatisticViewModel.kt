package com.androiddevs.runningtracker.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.androiddevs.runningtracker.repositories.MainRepository
import javax.inject.Inject

class StatisticViewModel @ViewModelInject constructor(
    val mainRepository: MainRepository
): ViewModel(){
}