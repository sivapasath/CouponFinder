package com.app.couponfinder.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.couponfinder.R
import com.app.couponfinder.adapter.ProductAdapter
import com.app.couponfinder.databinding.FragmentHomeBinding
import com.app.couponfinder.model.Product

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val recyclerView: RecyclerView = binding.recyclerView
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this.context)

        var productList = arrayListOf<Product>()

        productList.add(Product(1,"Zulily","70% OFF",4.7,2.2,R.drawable.zulily))
        productList.add(Product(2,"Crocs","50% OFF",4.5,2.2,R.drawable.crocs))
        productList.add(Product(3,"Puma","40% OFF",4.9,2.2,R.drawable.puma))

        var adapter = ProductAdapter(this.context,productList)
        recyclerView.adapter = adapter

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}