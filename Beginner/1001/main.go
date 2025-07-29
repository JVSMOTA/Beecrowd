package main

import "fmt"

var a int
var b int

func main() {
	fmt.Scan(&a)
	fmt.Scan(&b)
	x := a + b
	fmt.Println("X = ", x)
}
