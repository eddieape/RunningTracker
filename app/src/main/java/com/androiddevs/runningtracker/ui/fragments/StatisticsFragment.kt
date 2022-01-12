package com.androiddevs.runningtracker.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.androiddevs.runningtracker.R
import com.androiddevs.runningtracker.ui.viewmodels.MainViewModel
import com.androiddevs.runningtracker.ui.viewmodels.StatisticViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StatisticsFragment: Fragment(R.layout.fragment_statistics) {

    private val viewModel: StatisticViewModel by viewModels()
}