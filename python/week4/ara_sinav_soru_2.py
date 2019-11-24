dogum_tarihi = int(input("Dogum tarihinizi girin: "))
yas = 2019 - dogum_tarihi
if yas < 15:
    print("cocuk")
elif yas < 40:
    print("genc")
elif yas < 60:
    print("orta yas")
else:
    print("ihtiyar")
