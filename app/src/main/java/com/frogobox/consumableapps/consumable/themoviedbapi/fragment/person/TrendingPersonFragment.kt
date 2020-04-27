package com.frogobox.consumableapps.consumable.themoviedbapi.fragment.person

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.frogobox.consumableapps.R
import com.frogobox.consumableapps.base.BaseFragment
import com.frogobox.consumableapps.base.BasePagerAdapter
import kotlinx.android.synthetic.main.fragment_movie_trending.*

/**
 * A simple [Fragment] subclass.
 */
class TrendingPersonFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movie_trending, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewPager()
    }

    private fun setupViewPager() {
        val pagerAdapter = BasePagerAdapter(childFragmentManager)
        pagerAdapter.setupPagerFragment(
            TrendingPersonDayFragment(),
            resources.getString(R.string.title_day)
        )
        pagerAdapter.setupPagerFragment(
            TrendingPersonWeekFragment(),
            resources.getString(R.string.title_week)
        )
        viewpager.adapter = pagerAdapter
        tablayout.setupWithViewPager(viewpager)
    }

}
