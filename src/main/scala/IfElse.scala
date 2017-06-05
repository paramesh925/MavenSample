

object IfElse extends App{
  
  val a=10
  var result=""
  if(a<10) result ="less than 10"
  else if (a>10) result ="greater than 10"
  else result ="it is 10"
   println(result)
  
 //#################################################
  
   val a1=10
   val result1 = if(a1<10) "less than 10"
                  else if (a1>10)"greater than 10"
                    else "it is 10"
             println(result1)
                      
                   
     //WHILE -DO-WHILE  #############
             
  var a2=100
  var result2=""
  while(a2>1){
    result2=result2+a2
    a2=a2-1
   
  }
// println(result2)            
}