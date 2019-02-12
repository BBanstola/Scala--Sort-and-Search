///**
//  * Created by Own on 1/19/2019.
//  */
//
//import scalafx.application.Platform
//import scalafx.Includes._
//import scalafx.application.JFXApp
//import scalafx.scene.Scene
//import scalafx.scene.control._
//import scalafx.scene.shape._
//import scalafx.scene.layout._
//import scalafx.event.ActionEvent
//import scalafx.scene.paint._
//import scalafx.scene.canvas._
//import scala.concurrent.Future
//import scala.concurrent.ExecutionContext.Implicits.global
//import scala.language.postfixOps
//
//val width = 300
//val height = 600
//val delay = 5
//
//def render(a:Array[Double], j:Int, gc:GraphicsContext):Unit = {
//  gc.clearRect(0,0,width,height)
//  gc.stroke = Color.Black
//  for (i <- a.indices){
//    gc.strokeLine(i, height, i, 1-a(i)*height)
//  }
//  gc.stroke = Color.Red
//  gc.strokeLine(j,0,j,100)
//
//}
//
//def bubbles(a:Array[Double],gc: GraphicsContext): Unit ={
//  val len = a.length
//  for (i<- 0 until len -1){
//    for (j <- 0 until len -1){
//      if (a(j)> a(j+1)){
//        var tmp = a(j)
//        a(j) = a(j+1)
//        a(j+1) = tmp
//        }
//      Platform.runLater(render(a,j,gc))
//      Thread.sleep(delay)
//
//    }
//  }
//}
//
//def selection(a:Array[Double],gc:GraphicsContext):Unit = {
//  val len = a.length
//  for (i <- 0 until len-1){
//      var min = i
//    for (j <- i+1 until len) {
//      if (a(j) < a(min))
//      {min = j}
//      Platform.runLater(render(a,j,gc))
//      Thread.sleep(delay)
//    }
//    var tmp = a(i)
//    a(i) = a(min)
//    a(min) = tmp
//  }
//}
//
//def insertion(a:Array[Double], gc:GraphicsContext):Unit = {
//  val len = a.length
//  for (i <- 1 until len){
//    var j = i-1
//    var tmp = a(i)
//    while (j >=0 && tmp < a(j)){
//      a(j+1) = a(j)
//      j -= 1
//      Platform.runLater(render(a,j,gc))
//      Thread.sleep(delay)
//    }
//    a(j+1)=tmp
//  }
//}
//
//def isSorted(a:Array[Double]):Boolean ={
//  a.zip(a.tail).forall(t => t._1 <= t._2)
//}
//
//val app = new JFXApp{
//  stage = new JFXApp.PrimaryStage{
//    title = "Sorts"
//    scene = new Scene(300,600){
//      val canvas = new Canvas(300,600)
//
//      val gc =canvas.graphicsContext2D
//
//      val bubbleButton = new Button("Bubble Sort")
//      val minButton = new Button("Min Selection Sort")
//      val insertButton = new Button("Insertion Sort")
//
//      content = List (canvas, new HBox(5,bubbleButton,minButton,insertButton))
//
//      bubbleButton.onAction =(e:ActionEvent)=>{
//        Future {bubbles(Array.fill(300)(math.random),gc)}
//      }
//
//      minButton.onAction =(e:ActionEvent)=>{
//        Future {selection(Array.fill(300)(math.random),gc)}
//      }
//
//      insertButton.onAction =(e:ActionEvent)=>{
//        Future {insertion(Array.fill(300)(math.random),gc)}
//      }
//
//    }
//  }
//}
//
//app.main(args)
