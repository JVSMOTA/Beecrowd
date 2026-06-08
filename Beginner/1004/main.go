package main
import "fmt"

func main() {
	var a, b int
	fmt.Scan(&a)
	fmt.Scan(&b)
	produto := a * b
	fmt.Printf("PROD = %d\n", produto)
}
