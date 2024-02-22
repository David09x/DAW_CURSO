#Hacer un algoritmo que, dado el radio, calcule el área del círculo, pero pidiendo repetidamente el radio hasta que el usuario nos de un radio positivo.


from pickle import FALSE

num = float (input("introduce numero para calcular"))
areaNegativa = True;
area = 0.0;
areaTotal = 0.0;
while areaNegativa:
    if(num < 0):
        area = 3.14 * (num*num);
        areaTotal = areaTotal +  area;
        num = float (input("introduce numero para calcular"))
        
        if num > 0:   
            areaNegativa = False;

else:

            print("el area total calculada es " + str(areaTotal))

 
    