from django.urls import path
from . import views

urlpatterns = [
    path('', views.index),
    path('produk', views.produk),
    path('search_produk', views.produk_search),
    path('produk/<q>', views.produk_detail),
    path('add_cart', views.add_to_cart),
    path('cart', views.cart),
    path('register', views.register),
    path('login', views.login),
    path('logout', views.logout),
]
