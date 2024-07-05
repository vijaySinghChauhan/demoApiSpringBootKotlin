package com.vj.api.demoApirepo

import com.vj.api.demoApi.Demo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface DemoRepo : JpaRepository<Demo,String>