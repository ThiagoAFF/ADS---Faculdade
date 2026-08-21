nome = str(input('Informe seu nome: '))
altura = float(input('Informe sua altura: '))
peso = float(input('Informe seu peso: '))

print("-" * 10, ' Resultado do IMC ', "-" * 10)

print('Olá ' + nome)
print('Sua altura é de: ' + str(altura), 'seu peso é: ' + str(peso))
IMC = peso / (altura * altura)
print('IMC: ' + str(IMC))