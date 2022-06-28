package com.app.couponfinder.ui.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.app.couponfinder.R
import com.app.couponfinder.model.Product

class PageViewModel : ViewModel() {

    private val _index = MutableLiveData<Int>()
    private val mutableList = MutableLiveData<ArrayList<Product>>()
    val list: LiveData<ArrayList<Product>> = mutableList

    fun setIndex(index: Int) {
        _index.value = index
        if(index == 1){
            var productList = arrayListOf<Product>()

            productList.add(Product(1,"Zulily","$7 Off for All Product",4.7,2.2, R.drawable.offer))
            productList.add(Product(2,"Crocs","$27 Off for First Time User",4.5,2.2, R.drawable.offer))
            productList.add(Product(3,"Puma","40% Off for all Products",4.9,2.2, R.drawable.offer))
            mutableList.value = productList
        }else {
            var productList = arrayListOf<Product>()

            productList.add(Product(1,"Zulily","$7 Off for All Product",4.7,2.2, R.drawable.offer))
            productList.add(Product(2,"Crocs","$27 Off for First Time User",4.5,2.2, R.drawable.offer))
            productList.add(Product(3,"Puma","40% Off for all Products",4.9,2.2, R.drawable.offer))
            mutableList.value = productList
        }
    }
}