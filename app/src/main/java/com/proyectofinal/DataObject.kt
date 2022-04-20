package com.proyectofinal

object DataObject {
    var listdata = mutableListOf<CardInfo>()

    fun setData(title: String, priority: String, hora: String) {
        listdata.add(CardInfo(title, priority, hora))
    }

    fun getAllData(): List<CardInfo> {
        return listdata
    }

    fun deleteAll(){
        listdata.clear()
    }

    fun getData(pos:Int): CardInfo {
        return listdata[pos]
    }

    fun deleteData(pos:Int){
        listdata.removeAt(pos)
    }

    fun updateData(pos:Int,title:String,priority:String, hora: String)
    {
        listdata[pos].title=title
        listdata[pos].priority=priority
        listdata[pos].hora=hora
    }

}