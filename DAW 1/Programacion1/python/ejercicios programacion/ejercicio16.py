#decir si un numero es primo o no.

num = int(input("dame un numero "))
esPrimo = True;

for i in range(2, num-1):
    if(num%i == 0):
        esPrimo = True;        
    else:  
        if not esPrimo:
            print("es primo")
        else:
            print("no es Primo")