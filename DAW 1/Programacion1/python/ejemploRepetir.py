
import random

def NumerosRepetidos():
    arrayNmeros= []
    jugar = True;
    contPartida = 0;
    num = random.randint(1,5);
    arrayNmeros.append(num)
    contPartida += 1;
    while  jugar:
        num = random.randint(1,5)
        if contPartida == 5:
            jugar = False
        if contPartida != 5:
            for i in range(0,len(arrayNmeros)):
                if num ==  arrayNmeros[i]: 
                    break
            if num != arrayNmeros[i]:
                arrayNmeros.append(num)
                contPartida += 1;
                    
    return arrayNmeros

print(NumerosRepetidos())