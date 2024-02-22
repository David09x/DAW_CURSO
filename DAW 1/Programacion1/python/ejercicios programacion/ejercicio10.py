#introduce 2 valores A y B(A<B). Incrementa A de 2 en 2 y derementa B de 3 en 3 hasta que A > B

from operator import truediv


num = int(input("numero A "))
num2 = int(input("numero B "))

while (num<num2):
    
        num = num + 2;
        
        num2 = num2 - 3;
else:
        print("El numero A " + str(num) + "y el numero b es " + str(num2) )    