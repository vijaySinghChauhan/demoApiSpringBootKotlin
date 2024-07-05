package com.vj.api.demoApi

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name="demo_table")
data class Demo(

    @Id
    @Column(name = "id")
    var id:String,

    @Column (name="title", length = 500)
    var name:String ="",

    @Column (name="url", length = 500)
    var url:String,

    @Column (name="desc", length = 500)
    var desc:String,
)
{
    constructor():this("","","",""){}
}