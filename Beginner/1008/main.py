funcionarioId = int(input())
horasTrabalhadas = int(input())
dolarPorHora = float(input())

salary = horasTrabalhadas * dolarPorHora

print(f"NUMBER = {funcionarioId}")
print(f"SALARY = U$ {salary:.2f}")
