import Foundation

if let inputRaio = readLine(), let raio = Double(inputRaio) {
    let area = Double.pi * raio * raio
    print(String(format: "A=%.4f", area))
} else {
    print("Entrada incorreta! Digite um número válido (use ponto como separador decimal).")
}
