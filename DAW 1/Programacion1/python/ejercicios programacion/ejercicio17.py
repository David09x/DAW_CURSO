#juego de la oca

import random



contador1 = 0
contador2 = 0
contador3 = 0

Ganador = False;

while not Ganador:
    jugador1= random.randint(1,6)
    print(jugador1)
    jugador2 = random.randint(1,6)
    print(jugador2)
    jugador3 = random.randint(1,6)
    print(jugador3)
    contador1 += jugador1;
    print("jugador1 tiene  = " + str(contador1))
    contador2 += jugador2;
    print("jugador2 tiene  = " + str(contador2))
    contador3 += jugador3;
    print("jugador2 tiene  = " + str(contador3))
   

    if contador1 >= 40 and contador2 >= 40 and contador3 >= 40:
        print("ganaron los 3")
        Ganador=True;
    else:
        if contador1 >= 40 and contador2 >= 40:
            print("ganador jugador1 y 2")
            Ganador=True;
        else:
            if contador2 >= 40 and contador3 >= 40:
                print("ganador jugador 2 y 3") 
                Ganador=True;
            else:
                if contador1 >= 40 and contador3 >= 40:
                    print("ganador jugador1 y 3")
                    Ganador=True;
                else:
                    if contador1 >= 40:
                        print("ganador jugador1")
                        Ganador=True;
                    else:
                        if contador2 >= 40:
                            print("ganador jugador2")
                            Ganador=True;
                        else:
                             if contador3 >= 40:
                                print("ganador jugador3")
                                Ganador=True;
             
 
             
       