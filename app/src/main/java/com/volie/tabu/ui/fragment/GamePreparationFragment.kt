package com.volie.tabu.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.volie.tabu.databinding.FragmentGamePreparationBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class GamePreparationFragment : Fragment() {
    private var _mBinding: FragmentGamePreparationBinding? = null
    private val mBinding get() = _mBinding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _mBinding = FragmentGamePreparationBinding.inflate(inflater, container, false)
        return mBinding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _mBinding = null
    }
}