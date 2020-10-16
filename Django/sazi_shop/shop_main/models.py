from django.db import models


class Akun(models.Model):
    email = models.CharField(primary_key=True, max_length=50)
    password = models.CharField(max_length=20, blank=True, null=True)
    role = models.IntegerField(blank=True, null=True)

    class Meta:
        db_table = 'akun'


class Kategori(models.Model):
    nama_kategori = models.CharField(max_length=50, blank=True, null=True)

    class Meta:
        db_table = 'kategori'


class Produk(models.Model):
    id = models.CharField(primary_key=True, max_length=20)
    nama = models.CharField(max_length=50, blank=True, null=True)
    harga_per_unit = models.IntegerField(blank=True, null=True)
    stok = models.IntegerField(blank=True, null=True)
    deskripsi = models.CharField(max_length=1000, blank=True, null=True)
    gambar = models.CharField(max_length=250, blank=True, null=True)
    id_kategori = models.ForeignKey(Kategori, models.DO_NOTHING, db_column='id_kategori', blank=True, null=True)

    class Meta:
        db_table = 'produk'
