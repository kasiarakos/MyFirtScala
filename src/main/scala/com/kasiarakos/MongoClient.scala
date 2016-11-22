package com.kasiarakos

import com.mongodb.Mongo

/**
  * Created by kasiarakos on 21/11/2016.
  */
class MongoClient (val host:String, val port:Int){

  require(host != null, "Have to provide host name")
  if(host == "127.0.0.1") println("host = localhost")
  else println("host = " + host)


  def this() = this("localhost", 27017)

  private val underlying = new Mongo(host, port)


  def version = underlying.getVersion

  def dropDB(name:String) = underlying.dropDatabase(name)

  def createDB(name:String) = (DB) (underlying.getDB(name))

  def db(name:String) = (DB) (underlying.getDB(name))

  override def toString: String = s"${host+" "+port}"




}
