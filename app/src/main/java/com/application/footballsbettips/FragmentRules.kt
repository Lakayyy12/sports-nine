package com.application.footballsbettips

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import com.application.footballsbettips.utils.Navigator

class  FragmentRules : Fragment(), View.OnClickListener {


    private var rulesView: View? = null
    private var ruleone: ImageButton? = null
    private var ruletwo: ImageButton? = null
    private var rulethree: ImageButton? = null
    private var rulefour: ImageButton? = null
    private var rulefive: ImageButton? = null
    private var rulesix: ImageButton? = null
    private var ruleseven: ImageButton? = null
    private var ruleeight: ImageButton? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        rulesView = inflater.inflate(R.layout.fragment_rules, container, false)
        initComponents()
        initListener()
        return rulesView
    }

    private fun initComponents(){
        ruleone = rulesView?.findViewById(R.id.ruleone)
        ruletwo = rulesView?.findViewById(R.id.ruletwo)
        rulethree = rulesView?.findViewById(R.id.rulethree)
        rulefour = rulesView?.findViewById(R.id.rulefour)
        rulefive = rulesView?.findViewById(R.id.rulefive)
        rulesix = rulesView?.findViewById(R.id.rulesix)
        ruleseven = rulesView?.findViewById(R.id.ruleseven)
        ruleeight = rulesView?.findViewById(R.id.ruleeight)
    }

    private fun initListener(){
        ruleone?.setOnClickListener(this)
        ruletwo?.setOnClickListener(this)
        rulethree?.setOnClickListener(this)
        rulefour?.setOnClickListener(this)
        rulefive?.setOnClickListener(this)
        rulesix?.setOnClickListener(this)
        ruleseven?.setOnClickListener(this)
        ruleeight?.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when(view?.id) {
            R.id.ruleone -> Navigator.showContent(context, getString(R.string.r1))
            R.id.ruletwo -> Navigator.showContent(context, getString(R.string.r2))
            R.id.rulethree -> Navigator.showContent(context, getString(R.string.r3))
            R.id.rulefour -> Navigator.showContent(context, getString(R.string.r4))
            R.id.rulefive -> Navigator.showContent(context, getString(R.string.r5))
            R.id.rulesix -> Navigator.showContent(context, getString(R.string.r6))
            R.id.ruleseven -> Navigator.showContent(context, getString(R.string.r7))
            R.id.ruleeight -> Navigator.showContent(context, getString(R.string.r8))
        }
    }
}