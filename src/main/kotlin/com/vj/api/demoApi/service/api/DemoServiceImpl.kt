package com.vj.api.demoApi.service.api

import com.vj.api.demoApi.Demo
import com.vj.api.demoApi.service.DemoService
import com.vj.api.demoApirepo.DemoRepo
import org.springframework.stereotype.Service
import java.util.UUID


@Service
class DemoServiceImpl(var demorepo: DemoRepo):DemoService {
    
    override fun create(demo: Demo): Demo {
        demo.id=UUID.randomUUID().toString()
        return  this.demorepo.save(demo)
    }

    override fun updateDemo(demoId: String, demo: Demo): Demo {
      val oldDemo =  demorepo.findById(demoId).orElseThrow { RuntimeException("") }
        oldDemo.name= demo.name
        oldDemo.url= demo.url
        oldDemo.desc= demo.desc
        return demorepo.save(oldDemo)

    }

    override fun deleteDemo(demoId: String) {
        val oldDemo =  demorepo.findById(demoId).orElseThrow { RuntimeException("") }
        this.demorepo.delete(oldDemo)

    }

    override fun getDemo(demoId: String): Demo =demorepo.findById(demoId).orElseThrow { RuntimeException("") }

    override fun getAllItems(): List<Demo> = demorepo.findAll()

}