# SearchDialogKotlin
This is a simple app that explains how to create a search dialog for android app using kotlin

<H> A SIMPLE SEARCH DIALOG USING KOTLIN </H>
This is a simple application that make use of a custom library to create a fast pop up search dialog
  
  Add this to the application gradle
  implementation 'com.github.mirrajabi:search-dialog:1.1'
  
  btnSearch.setOnClickListener {
            SimpleSearchDialogCompat(this@MainActivity , "Search" , "what are you looking for ", null ,initData()
            , SearchResultListener { baseSearchDialogCompat, item, position ->
                    Toast.makeText(this@MainActivity , item.title , Toast.LENGTH_SHORT).show()
                    baseSearchDialogCompat.dismiss()

                }).show()
                
                btnSearch is already declared in the actvitiy_main
                initdata() is a private fun that takes in the arraylist in which it takes each title
