from fonsiyonlarim import asal_mi

sayi = int(input("Bir pozitif tam sayi giriniz "))

for carpan in range(2, sayi):
    if sayi % carpan == 0 and asal_mi(carpan):
        print(carpan, end=" ")