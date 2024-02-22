#¿Cuál es el resultado de las siguientes expresiones? Indica también si hay pérdida o promoción de información.


from ctypes.wintypes import LONG, SHORT
from pickletools import long1


a = int(3/5 + 0.75/2);
print(a);
b = float(50/2 + 7%3)
print(b)
c= int(1.75E9)
print(c)
d= int(5/2 + 6.5/2)
print(d)
e= float(2.5E-125)
print(e)
f= int(0.5E10)
print(f)
g= LONG(-23)
print(g)