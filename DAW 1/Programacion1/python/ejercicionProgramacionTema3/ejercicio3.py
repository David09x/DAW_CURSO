"3 Haz un programa que pregunte cuántos años tiene alguien y que muestre por pantalla la cantidad de años que falten para la mayoría de edad y para jubilarse."


def repipiOno(num):
    while num > 0  and num <120:
        if(num < 18):
            return "eres 1 enano"
        elif (num > 18 and num < 65):
            return "estas jodido a currar"
        elif(num > 65):
            return "a cobrar la pension de pedrito"
    else:
        return int(input("dime de nuevo tu edad ejemplo: 88,20,30. "))

num = int(input("dime tu edad"))

print(repipiOno(num))
