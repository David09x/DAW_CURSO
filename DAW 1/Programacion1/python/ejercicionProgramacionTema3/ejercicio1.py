"Haz un programa que, dadas 2 variables enteras, muestre cuál es el número más grande y cuál el más pequeño."

def grandeYpequeño(num1,num2):
    if(num1 == num2):
        return "son iguales"
    elif(num1 > num2):
        return str(num1) + "es mayor que " + str(num2)
    else:
        return str(num2) + "es mayor que " + str(num1)

numero1 = int(input("dame un numero"))
numero2 = int(input("dame un numero"))

print(grandeYpequeño(numero1,numero2))