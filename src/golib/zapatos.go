package main

import (
	"fmt"
)

func main() {
	var N int

	fmt.Println("Inicio Zapatos Go")
	fmt.Scanf("%d", &N)
	fmt.Println("N:", N)
	//Map<String,Integer> map1 = new HashMap<String,Integer>();
	//Map <String,Integer>tkeys = new HashMap<String,Integer>();
	var map1 map[string]int
	map1 = make(map[string]int)

	var tkeys map[string]int
	tkeys = make(map[string]int)

	for i := 0; i < N; i++ {
		var tamano string
		var lado string
		fmt.Scanf("%s %s\n", &tamano, &lado)
		//fmt.Println("tamano:",tamano, "   lado:", lado)
		var idx = tamano + "." + lado

		tkeys[tamano] = 1
		var valor = map1[idx]
		if valor == 0 {
			map1[idx] = 1
			//fmt.Println("valor1:",valor)
		} else {
			map1[idx] = map1[idx] + 1
		}
	}
	fmt.Println("tkeys:", tkeys)
	fmt.Println("map1:", map1)
	for key := range tkeys {
		fmt.Println("tamano:", key, "  R:", map1[key+".R"], "L:", map1[key+".L"], "", Min(map1[key+".R"], map1[key+".L"]))
	}
}

func Min(x, y int) int {
	if x > y {
		return y
	}
	return x
}
