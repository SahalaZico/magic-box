from rest_framework import serializers
from .models import Produk

class ProdukSerializer(serializers.ModelSerializer):
    #id = serializers.Field()
    class Meta:
        model = Produk
        fields = '__all__'