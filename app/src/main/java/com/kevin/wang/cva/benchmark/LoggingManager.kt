package com.kevin.wang.cva.benchmark

object LoggingManager {

    private val list = ArrayList<Double>()

    fun add(timestamp: Double){
        list += timestamp

        if (list.size >= Adapter.NUM_ITEMS){
            print()
        }
    }

    fun print(){
        println(list)
        list.clear()
    }
}