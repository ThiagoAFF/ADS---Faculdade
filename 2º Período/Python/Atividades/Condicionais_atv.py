def atv1():
    a = input("Digite o 1º número: ")
    b = input("Digite o 2º número: ")
    c = input("Digite o 3º número: ")

    if ((a + b) < c):
        print("A soma de a + b é menor que c!")
    else:
        print("A soma de a + b não é menor que c!")


def atv2():
    a = int(input("Digite o 1º valor (0 é FALSE, 1 é TRUE): "))
    b = int(input("Digite o 2º valor (0 é FALSE, 1 é TRUE): "))

    if(a == 0):
        v1 = False
    else:
        v1 = True

    if(b == 0):
        v2 = False
    else:
        v2 = True

    if(v1 == False):
        if(v2 == False):
            print("Ambos são FALSOS")
        else:
            print("Apenas um é FALSO")
    else:
        print("Ambos são VERDADEIROS")

def atv3():
    nome = str(input('Informe seu nome: '))
    altura = float(input('Informe sua altura: '))
    peso = float(input('Informe seu peso: '))

    print("-" * 10, ' Resultado do IMC ', "-" * 10)

    print('Olá ' + nome)
    print('Sua altura é de: ' + str(altura), 'seu peso é: ' + str(peso))
    IMC = peso / (altura * altura)
    print('IMC: ' + str(IMC))

    if (IMC > 18.5):
        if (IMC > 25):
            if(IMC > 30):
                print("Obeso")
            else:
                print("Acima do peso")
        else:
            print("Peso normal")
    else:
        print("Abaixo do peso")

def atv4():
    print("Qual a cor do lápis?")
    lapis = str(input())

    if(lapis.lower() == "azul"):
        print("O lápis é azul!")


print("Escolha a Questão:")
print("1 - Ler 3 valores, imprima se a soma de A + B for menor que C")
print("2 - Ler 2 valores Booleanos, determina se ambos são VERDADEIROS ou FALSOS")
print("3 - Mostrar a condição com base no IMC")
print("4 - Imprimir só se o lápis dor azul")

n = int(input())

if(n == 1):
    atv1()
elif(n == 2):
    atv2()
elif(n == 3):
    atv3()
elif(n == 4):
    atv4()
else:
    print("Input inválido!")

