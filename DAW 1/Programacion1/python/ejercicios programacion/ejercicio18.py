#tablas de multiplicar del 1 al 10


resultado = 0;

for i in range(1,11): #la tablas de multiplicar
    print("tabla de multiplicar del " + str(i))
    for j in range (1,11):#lo que multiplica
        resultado = j * i;
        print( str(j) + " x " + str(i) + " = " + str(resultado))
        
    
