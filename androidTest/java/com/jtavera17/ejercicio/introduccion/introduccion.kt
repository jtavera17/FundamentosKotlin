package com.jtavera17.ejercicio.introduccion

class introduccion {
}

fun main(){
    println("Hello Juan")

    val num:Int=16
    val num1=16

    val num3:Float= 3.1416F
    val num4:Double= 3.147896233

    //constante tipo char
    val caracter1:Char='a'
    //constante tipo string
    val nombre:String="Juan"
    val apellido="arenas"
    //constante tipo boolean
    val estado:Boolean= false
    //constante de tipo alfanumerico
    //constante de tipo char
    val caracter:Char='a'
    //constante de tipo string
    val nombre2:String="Juan"
    val apellido2="arenas"
    //val descripcion:text="jakskaska"
    val text="""    Hola soy Juan
        Arenas
        Aprendiz del SENA"""
    val ename="Esteban \n"
    println("El numero es: $num \n")
    //impresion de cadena de caracteres
    println("La suma entre: $num y $num1 es ${num+num1}")
    print("Usted se llama $nombre y su apellido es $apellido")

    val texto1:String="Baloncesto"
    println("La palabra escrita fue: $texto1")

    val texto2:String="Pedro"
    println("La palabra escrita fue: $texto2")

    val texto3:String="Z"
    print("La letra escrta fue: $texto3")

    val digito:Float=8.1F
    print("El digito escrito fue: $digito")

    val suma:Int=1
    val suma1=5

    print("La suma entre $suma + $suma1 es ${suma+suma1}")

    val num10:Int=110
    println("El numero digitado fue: $num10")
}