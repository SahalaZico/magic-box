from django.shortcuts import render
from django.http import HttpResponseRedirect
from .models import Produk, Akun, Cart

def session(request):
    request.session['logIn'] = False
    request.session['user'] = ""

def index(request):
    context ={
        'username' :request.session['user'],
        'logIn': request.session['logIn'],
    }
    return render(request, 'index.html',context)

def produk(request):
    prod = Produk.objects.all()
    context = {
        'Produk':prod,
        'username' :request.session['user'],
        'logIn': request.session['logIn'],
    }
    return render(request, 'produk.html',context)

def produk_search(request):
    search_name = request.GET['search']
    prod = Produk.objects.filter(nama__icontains = search_name)
    context = {
        'Produk':prod,
        'username' :request.session['user'],
        'logIn': request.session['logIn'],
    }
    return render(request, 'produk.html',context)

def produk_detail(request,q):
    search_id = q
    prod = Produk.objects.filter(id = search_id)
    context = {
        'Produk':prod,
        'username' :request.session['user'],
        'logIn': request.session['logIn'],
    }
    return render(request, 'produk_detail.html',context)

def add_to_cart(request):
    user = str(request.session['user'])
    Cart.objects.create(username = user,
    produk_id = request.POST.get('produk_id'),
    quantity = request.POST.get('quantity'))
    return HttpResponseRedirect("/shop/produk")

def cart(request):
    prod = Cart.objects.filter(username=request.session['user'])
    context = {
        'Produk':prod,
        'username' :request.session['user'],
        'logIn': request.session['logIn'],
    }
    print(prod)
    return render(request, 'cart.html',context)

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
            print(request.session['logIn'])
            return HttpResponseRedirect("/shop")
        
    
    context ={}
    return render(request, 'login.html',context)

def logout(request):
    request.session['logIn'] = False
    request.session['user'] = ""
    return HttpResponseRedirect("/shop")