#decir si un numero es primo entre 1 Y EL numero que le das


num = int(input("dime un numero "))
Primo=True;

for i in range(1, num+1):
    for e in range(2,i):
        if(i%e == 0):
            Primo=False;
    
    if Primo:
        print( str(i) + "es primo")
    else:
        print(str(i) + "no es primo")
    Primo=True;
        
                

    