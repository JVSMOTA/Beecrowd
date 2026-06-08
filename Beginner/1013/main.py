input = input().split()

valor1 = int(input[0])
valor2 = int(input[1])
valor3 = int(input[2])

maior = 0

if (valor1 >= valor2 and valor1 >= valor3):
	maior = valor1
elif (valor2 >= valor1 and valor2 >= valor3):
	maior = valor2
elif (valor3 >= valor1 and valor3 >= valor2):
	maior = valor3

print(f"{maior} eh o maior")

