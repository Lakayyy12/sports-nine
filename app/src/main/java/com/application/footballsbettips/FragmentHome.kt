package com.application.footballsbettips

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.application.footballsbettips.utils.Navigator

class FragmentHome : Fragment(), View.OnClickListener {

    private var homeView: View? = null
    private var tepone: Button? = null
    private var teptwo: Button? = null
    private var tepthree: Button? = null
    private var tepfour: Button? = null
    private var tepfive: Button? = null
    private var tepsix: Button? = null
    private var tepseven: Button? = null
    private var tepeight: Button? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        homeView = inflater.inflate(R.layout.fragment_home, container, false)
        initComponents()
        initListener()

        return homeView
    }

    private fun initComponents() {
        tepone = homeView?.findViewById(R.id.tepone)
        teptwo = homeView?.findViewById(R.id.teptwo)
        tepthree = homeView?.findViewById(R.id.tepthree)
        tepfour = homeView?.findViewById(R.id.tepfour)
        tepfive = homeView?.findViewById(R.id.tepfive)
        tepsix = homeView?.findViewById(R.id.tepsix)
        tepseven = homeView?.findViewById(R.id.tepseven)
        tepeight = homeView?.findViewById(R.id.tepeight)
    }

    private fun initListener() {
        tepone?.setOnClickListener(this)
        teptwo?.setOnClickListener(this)
        tepthree?.setOnClickListener(this)
        tepfour?.setOnClickListener(this)
        tepfive?.setOnClickListener(this)
        tepsix?.setOnClickListener(this)
        tepseven?.setOnClickListener(this)
        tepeight?.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.tepone -> Navigator.showContent(context, getString(R.string.g1))
            R.id.teptwo -> Navigator.showContent(context, getString(R.string.g2))
            R.id.tepthree -> Navigator.showContent(context, getString(R.string.g3))
            R.id.tepfour -> Navigator.showContent(context, getString(R.string.g4))
            R.id.tepfive -> Navigator.showContent(context, getString(R.string.g5))
            R.id.tepsix -> Navigator.showContent(context, getString(R.string.g6))
            R.id.tepseven -> Navigator.showContent(context, getString(R.string.g7))
            R.id.tepeight -> Navigator.showContent(context, getString(R.string.g8))
        }
    }
}