from django.shortcuts import render
from django.http import HttpResponseRedirect
from .models import Produk, Akun

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

def register(request):
    if request.method == 'POST':
        Akun.objects.create(
        email = request.POST.get('email'),
        password = request.POST.get('password'),
        role = 0)
        return HttpResponseRedirect("/shop")

    context ={}
    return render(request, 'registration.html',context)
