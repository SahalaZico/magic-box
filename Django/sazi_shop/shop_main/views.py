from django.shortcuts import render
from .models import Produk

def index(request):
    return render(request, 'index.html')

def produk(request):
    prod = Produk.objects.all()
    context = {
        'Produk':prod,
    }
    return render(request, 'produk.html',context)

def test_page(request):
    return render(request, 'test.html')