def asal_mi(sayi):
    isAsal = True
    bolen = 2
    if sayi == 1:
        isAsal = False
    else:
        while isAsal and bolen < sayi:
            if sayi % bolen == 0:
                isAsal = False
            bolen = bolen + 1

    return isAsal

def selamla():
    print("hello")

def miladi_to_hicri(miladi_yil, miladi_ay):

    toplam_ay = miladi_yil * 12 + miladi_ay

    return  int((toplam_ay - 621 * 12)/12 + (toplam_ay - 621 * 12)/33/12)

def obeb(a, b):
    en_buyuk_ortak_bolen = 1
    if a == b:
        return a
    elif a > b:
        for bolen in range(2, b + 1):
            if b % bolen == 0 and a % bolen == 0:
                en_buyuk_ortak_bolen = bolen
    else:
        for bolen in range(2, a + 1):
            if b % bolen == 0 and a % bolen == 0:
                en_buyuk_ortak_bolen = bolen




    return en_buyuk_ortak_bolen