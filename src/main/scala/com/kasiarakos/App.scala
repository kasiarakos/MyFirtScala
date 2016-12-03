package com.kasiarakos

import com.mongodb.BasicDBObject

/**
  * @author ${user.name}
  */


object App extends App {

  def client = new MongoClient

  val db = client.db("mydb")
  for (name <- db.collectionNames) println(name)

  val col = db.readOnlyCollection("test")
  println(col.name)

  val adminCol = db.administrableCollection("test")
  adminCol.drop

  val updatableCol = db.updatableCollection("test")

  //  val doc = new BasicDBObject()
  //  doc.put("name", "MongoDB")
  //  doc.put("type", "database")
  //  doc.put("count", 1)
  //
  //  val info = new BasicDBObject()
  //  info.put("x", 203)
  //  info.put("y", 102)
  //  doc.put("info", info)
  //
  //  updatableCol += doc
  //  println("first: "+updatableCol.findOne)
  //
  //  updatableCol -= doc
  //  println("Second: "+updatableCol.findOne)
  //
  //  for(i <- 1 to 100) updatableCol += new BasicDBObject("i", i)
  //  val query = new BasicDBObject
  //  query.put("i", 71);
  //  val cursor = col.find(query)
  //
  //  while(cursor.hasNext()) {
  //    println("last "+cursor.next());
  //  }


  for (i <- 1 to 100) updatableCol += new BasicDBObject("i", i)
  println(updatableCol)
  val rangeQuery = new BasicDBObject("i", new BasicDBObject("$lt", 20))
  val richQuery = Query(rangeQuery).limit(10)
  val cursor = col.find(richQuery)
  while (cursor.hasNext()) {
    println(cursor.next());
  }

}
