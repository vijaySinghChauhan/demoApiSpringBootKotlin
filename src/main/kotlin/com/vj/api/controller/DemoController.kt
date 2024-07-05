package com.vj.api.controller

import com.vj.api.demoApi.Demo
import com.vj.api.demoApi.service.DemoService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/demo")
class DemoController(val demoService: DemoService) {

    // create
    @PostMapping
    fun create(@RequestBody demo: Demo):Demo=demoService.create(demo)

    @PutMapping("/{demoId}")
    fun update(@PathVariable demoId: String, @RequestBody demo: Demo) = demoService.updateDemo(demoId,demo)

    @GetMapping
    fun getAll()=demoService.getAllItems()

    @GetMapping("/{demoId}")
    fun getDemo(@PathVariable demoId:String)= demoService.getDemo(demoId)

    @DeleteMapping("/{demoId}")
    fun delete(@PathVariable demoId:String)= demoService.deleteDemo(demoId)
}