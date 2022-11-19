val fx1=(x: Double)=> -math.pow(x,2)+8*x-12
val fx2=(x: Double)=> 3*math.pow(x,2)
val fx3=(x: Double)=> x+(2*math.pow(x,2))-math.pow(x,3)+(5*math.pow(x,4))
val fx4=(x: Double)=> (2*x+1)/(math.pow(x,2)+x)
val fx5=(x: Double)=> math.pow(math.E,x)
val fx6=(x: Double)=> 1/math.sqrt(x-1)
val fx7=(x: Double)=> 1/(1+math.pow(x,2))

// Metodo Simpson 1/3
val simpson1 = (a:Double , b: Double,fn: Double=> Double ) => {
  val x = (a+b)/2
  val resultado = (b-a)*(fn(a)+4*fn(x)+fn(b))/6
  resultado
}

//resultados Simpmson 1/3
val res1=simpson1(3,5,fx1)
val res2=simpson1(0,2,fx2)
val res3=simpson1(-1,1,fx3)
val res4=simpson1(1,2,fx4)
val res5=simpson1(0,1,fx5)
val res6=simpson1(2,3,fx6)
val res7=simpson1(0,1,fx7)

//calculo de Errores
val error1= (res1- 7.33)
val error2= (res2 - 8)
val error3= (res3- 3.333)
val error4 =(res4 - 1.09861)
val error5= (res5 - 1.71828)
val error6 = (res6 - 0.828427)
val error7= (res7 - 0.785398)


@main def proyecto():Unit={
  println("Metodo Simpson 1/3")
  println(res1)
  println(res2)
  println(res3)
  println(res4)
  println(res5)
  println(res6)
  println(res7)
  println()
  println("Calculo de Margen de Error Simpson 1/3")
  println(error1)
  println(error2)
  println(error3)
  println(error4)
  println(error5)
  println(error6)
  println(error7)
}


