package com.example.enpit_p33.zetsushinleaning

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class ZetsuImage: RealmObject(){
    @PrimaryKey
    var image_id: Long = 0
    var zetsu_color: String = ""
}