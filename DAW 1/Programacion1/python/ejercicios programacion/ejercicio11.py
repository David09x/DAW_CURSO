#: Dado un número N, muestra por pantalla las siguientes líneas:

from stringprep import in_table_c3


num = int(input("numero para empezar "))

contadorSumatorio= ""
contadorTotal=1
print("1+1")

for i in range(2, num+1):
    contadorTotal += i;
    contadorSumatorio += "+" + str(i)
    

    print("1"+contadorSumatorio + "=" + str(contadorTotal))