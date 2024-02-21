fun <T> reverse(lista: List<T>): List<T>{
    val pila = Pila<T>()
    for (elemento in lista){
        pila.push(elemento)
    }
    val reversedList = mutableListOf<T>()
    while (!pila.vacia()){
        reversedList.add(pila.pop()!!)
    }
    return reversedList
}