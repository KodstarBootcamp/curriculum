def miladi_to_hicri(miladi_yil, miladi_ay):

    toplam_ay = miladi_yil * 12 + miladi_ay

    return  int((toplam_ay - 621 * 12)/12 + (toplam_ay - 621 * 12)/33/12)


