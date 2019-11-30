from fonsiyonlarim import miladi_to_hicri

dogum_yili = int(input("Dogum yiliniz giriniz "))
dogum_ayi  = int(input("Dogdunuz ayi 1-12 arasi bir rakam olarak giriniz"))

print("miladi yasiniz = " + str(2019 - dogum_yili))
hicri_yas = miladi_to_hicri(2019, 11) - miladi_to_hicri(dogum_yili, dogum_ayi)

print("hicri yasiniz = " + str(hicri_yas))