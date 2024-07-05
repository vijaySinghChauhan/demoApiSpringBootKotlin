package com.vj.api.demoApi.service

import com.vj.api.demoApi.Demo

interface DemoService {
    fun create(demo:Demo):Demo
    fun updateDemo(demoId:String, demo:Demo):Demo
    fun deleteDemo(demoId:String)
    fun getDemo(demoId:String,):Demo
    fun getAllItems():List<Demo>
}