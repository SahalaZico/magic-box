from django.urls import path
from . import views

urlpatterns = [
    path('', views.index),
    path('produk', views.produk),
    path('test', views.test_page),
    path('register', views.register),
    path('login', views.login),
    path('logout', views.logout),
]
