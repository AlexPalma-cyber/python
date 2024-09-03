from django.http import HttpResponse
from django.shortcuts import render
def plantilla_form(request):
    return render(request,'form.html')