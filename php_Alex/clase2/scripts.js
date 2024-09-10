
num1=document.getElementById("n1");
num2=document.getElementById("n2");
res=document.getElementById("r");

function sumar(){
    res.value = parseFloat(num1.value) + parseFloat(num2.value);
}
document.getElementById("sumar").addEventListener('click', sumar);

function restar(){
    res.value = parseFloat(num1.value) - parseFloat(num2.value);
}
document.getElementById("restar").addEventListener('click', restar);

function multiplicar(){
    res.value = parseFloat(num1.value) * parseFloat(num2.value);
}
document.getElementById("multiplicar").addEventListener('click', multiplicar);

function dividir(){
    res.value = parseFloat(num1.value) / parseFloat(num2.value);
}
document.getElementById("dividir").addEventListener('click', dividir);

function elevar(){
    res.value = parseFloat(num1.value) % parseFloat(num2.value);
}
document.getElementById("elevar").addEventListener('click', elevar);