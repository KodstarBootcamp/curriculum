varA = 6
varB = 6

if type(varA)==str or type(varB)==str:
    print("Degiskenlerden en az biri string")
elif varA > varB:
    print("varA buyuktur varB")
elif varA==varB:
    print("varA varB'ye esittir")
else :
    print ("varA varB'den kucuktur")

print("elif blogunun disi")