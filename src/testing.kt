

fun main(args: Array<String>){
    val path = "/storage/0000-0000"
    val es = "0000-0000"


    if(path.matches(es.toRegex())){
        println("좋고")
    }
    else{
        println("못찾고")
    }

}

