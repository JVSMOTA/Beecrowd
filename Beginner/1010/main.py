input1 = input().split()
itemId1 = int(input1[0])
qtdItem1 = int(input1[1])
valorItem1 = float(input1[2])

input2 = input().split()
itemId2 = int(input2[0])
qtdItem2 = int(input2[1])
valorItem2 = float(input2[2])

total = qtdItem1*valorItem1 + qtdItem2*valorItem2

print(f"VALOR A PAGAR: R$ {total:.2f}")

