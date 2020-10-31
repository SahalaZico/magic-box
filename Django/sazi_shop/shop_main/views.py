from django.shortcuts import render
from django.http import HttpResponseRedirect
from .models import Produk, Akun

def session(request):
    request.session['logIn'] = False
    request.session['user'] = ""

def index(request):
    context ={
        'username' :request.session['user'],
    }
    return render(request, 'index.html',context)

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
        password = request.POST.get('psw'),
        role = 0)
        return HttpResponseRedirect("/shop")

    context ={}
    return render(request, 'registration.html',context)

def login(request):
    username = ""
    if request.method == 'POST':
        akun = Akun.objects.filter(email = request.POST.get('email')).filter(password = request.POST.get('password'))
        #check if the result not null
        if(akun):
            username = akun[0].email
            request.session['logIn'] = True
            request.session['user'] = username
            print(request.session['user'])
            return HttpResponseRedirect("/shop")
        
    
    context ={}
    return render(request, 'login.html',context)

def logout(request):
    request.session['logIn'] = False
    request.session['user'] = ""
    return HttpResponseRedirect("/shop")